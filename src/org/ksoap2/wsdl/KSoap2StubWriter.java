/*
 * Copyright 2011 Patrick Pollet 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ksoap2.wsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.wsdl.Binding;
import javax.wsdl.BindingOperation;
import javax.wsdl.Operation;
import javax.wsdl.OperationType;

import net.patrickpollet.ksoap2.KSoap2Utils;

import org.apache.axis.wsdl.symbolTable.BindingEntry;
import org.apache.axis.wsdl.symbolTable.Parameter;
import org.apache.axis.wsdl.symbolTable.Parameters;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaStubWriter;

public class KSoap2StubWriter extends JavaStubWriter {

	/** Field bEntry */
	private BindingEntry bEntry;

	/** Field binding */
	private Binding binding;

	/** Field symbolTable */
	private SymbolTable symbolTable;

	public KSoap2StubWriter(Emitter emitter, BindingEntry bEntry,
			SymbolTable symbolTable) {
		super(emitter, bEntry, symbolTable);
		// these attributes are private in super class
		// so I store them also here...emitter
		this.bEntry = bEntry;
		this.binding = bEntry.getBinding();
		this.symbolTable = symbolTable;

		// TODO Auto-generated constructor stub
	}
	
	/**
     * Write the header comments.
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writeHeaderComments(PrintWriter pw) throws IOException {
       super.writeHeaderComments(pw);
        pw.println("/**");
        pw.println(" * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2StubWriter");
        pw.println(" */");
        pw.println();
    }    // writeHeaderComments
    
	
	  /**
     * Write the package declaration statement.
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writePackage(PrintWriter pw) throws IOException {
    	super.writePackage(pw);
    	//pw.println("//"+this.className);
    	pw.println("import java.util.List;");
    	pw.println("import org.ksoap2.serialization.SoapObject;");
    	pw.println("import org.ksoap2.transport.HttpTransportSE;");
        pw.println("import net.patrickpollet.ksoap2.*;");
    	pw.println();
    	
    }
	/**
	 * Returns "extends org.apache.axis.client.Stub ".
	 * 
	 * @return
	 */
	protected String getExtendsText() {
		return "extends  KSoap2BindingStubBase";
	} // getExtendsText

	/**
	 * Returns "implements <SEI> ".
	 * 
	 * @return
	 */
	protected String getImplementsText() {
		return "";
		// return "implements " +
		// bEntry.getDynamicVar(JavaBindingWriter.INTERFACE_NAME) + " ";
	} // getImplementsText

	
	
	/**
	 * Write the body of the binding's stub file.
	 * 
	 * @param pw
	 * @throws IOException
	 */
	protected void writeFileBody(PrintWriter pw) throws IOException {
		
		writeConstructor(pw);

		List operations = binding.getBindingOperations();

		for (int i = 0; i < operations.size(); ++i) {
			BindingOperation operation = (BindingOperation) operations.get(i);
			Parameters parameters = bEntry.getParameters(operation
					.getOperation());

			// Get the soapAction from the <soap:operation>
			String soapAction = "";
			String opStyle = null;
			
			Operation ptOperation = operation.getOperation();
			OperationType type = ptOperation.getStyle();

			// These operation types are not supported. The signature
			// will be a string stating that fact.
			if ((OperationType.NOTIFICATION.equals(type))
					|| (OperationType.SOLICIT_RESPONSE.equals(type))) {
				pw.println(parameters.signature);
				pw.println();
			} else {
				writeOperation(pw, operation, parameters, soapAction, opStyle,
						type == OperationType.ONE_WAY, i);
			}
		}
	}
	
	
	public void writeConstructor(PrintWriter pw) throws IOException {
		 
		pw.println ("    public "+this.className+"(String service_url, String nameSpace, boolean debug) {");
		pw.println("         super(service_url,nameSpace,debug);");
		pw.println("     }");
		pw.println();
		
	}


	/**
	 * Write the stub code for the given operation.
	 * 
	 * @param pw
	 * @param operation
	 * @param parms
	 * @param soapAction
	 * @param opStyle
	 * @param oneway
	 * @param opIndex
	 */
	protected void writeOperation(PrintWriter pw, BindingOperation operation,
			Parameters parms, String soapAction, String opStyle,
			boolean oneway, int opIndex) {
		
		
		String operationName=operation.getName();
       System.out.println(operation.getName());
/*
		if (operation.getName().equals("login")
				|| operation.getName().equals("logout")
				|| operation.getName().equals("exception_handler"))
			return;
*/			
		if (operation.getName().equals("exception_handler"))
			return;
		
		
		
		writeComment(pw, operation.getDocumentationElement(), true);
	

		if (parms.signature == null) {
			return;
		}
		//get rid of that junk useless in KSoap2
		String signature= parms.signature.replace("throws java.rmi.RemoteException", "");
		pw.println(signature + " {");
		
		
		pw.println("    final String METH_NAME = \""+operationName+"\";");
		
		//pw.println("    LoginReturn lr=new LoginReturn(client,sesskey);");
		pw.println("	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);");
		
		this.emitParameters (operation,parms,pw);
		pw.println("    HttpTransportSE httpTransport = this.makeHttpTransport();");
		
		
		

       pw.println("     try {");
	   pw.println("       httpTransport.call(METH_NAME, envelope);");
	   
	   pw.println("     "+this.generateFetchValue(operation, parms));

		
	   pw.println ("	  this.logInfo(METH_NAME, response);");
	   pw.println ("      "+this.generateReturnValue(operation, parms, false));
	
        pw.println("    } catch (Exception e) {");
		pw.println("             this.logError(httpTransport, e);");
		pw.println ("           "+this.generateReturnValue(operation, parms, true));
			//return 0;
		pw.println ("        }");

       
		
		pw.println("   }");
		
	}
	
	private void emitParameters(BindingOperation operation, Parameters parms,
			PrintWriter pw) {
		//System.out.println (parms);
		for (int i = 0; i < parms.list.size(); ++i) {
			Parameter p = (Parameter) parms.list.get(i);
			//System.out.println(p);
			if (p.getMode() == Parameter.IN) {
				String javifiedName = p.getName(); //Utils.xmlNameToJava(p.getName());
				String typeName=p.getType().getName();
				System.out.println (javifiedName+":"+typeName);
				if (KSoap2Utils.isPrimitiveType(typeName)|| KSoap2Utils.isStringType(typeName))
					pw.println("      envelope.addProperty(\""+javifiedName+"\","+javifiedName+");");	
				else if (KSoap2Utils.isArrayType(typeName)) {
					String baseType=KSoap2Utils.getBaseType(typeName);
					pw.println("     //generate an arraytype SoapObject for input array ");
					pw.printf("      SoapObject _%s= new SoapObject(this.NAMESPACE,\"%sArray\");\n",javifiedName,baseType);
					pw.printf( "     if (%s !=null)      \n" ,javifiedName);  // rev 1.8.4 some arrays of ids may be empty=null in java
					pw.printf("         for ( Object o : %s) \n",javifiedName);
					pw.printf("            _%s.addProperty(\"item\",o);\n",javifiedName);
					pw.println("     envelope.addProperty(\""+javifiedName+"\",_"+javifiedName+");");
				}
				
				else {
					pw.println("      envelope.addProperty(\""+javifiedName+"\","+javifiedName+");");// sending an object is not yet implemented
				}
			}
		}

	}

	protected String generateFetchValue(BindingOperation operation,
			Parameters parms) {
		Parameter ret = parms.returnParam;
		if (ret != null) {
			String typeName=ret.getType().getName();
			if (KSoap2Utils.isPrimitiveType(typeName))
				return KSoap2Utils.getPrimitiveTypeFetchValue(typeName);
			else 
				if (KSoap2Utils.isStringType(typeName)) 
					return "String response = (String) envelope.getResponse();";
			else return 
			"SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;\n"+
			"      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);";
			
		} else return "// a WS method that's returns nothing. Why not ?\n String response=\"void\";\n";
	}
	
	protected String generateReturnValue(BindingOperation operation,
			Parameters parms,boolean fault) {
		Parameter ret = parms.returnParam;
		if (ret != null) {
			String typeName=ret.getType().getName();
			if (KSoap2Utils.isPrimitiveType(typeName))
				return KSoap2Utils.getPrimitiveTypeReturnValue(typeName,fault);
			else if (KSoap2Utils.isStringType(typeName)) {
				if (fault) return "return null;";
				else return "return response.toString();";
			}
			else if (KSoap2Utils.isArrayType(typeName)) {
				if (fault) return "return null;";
				else {
					String baseType=KSoap2Utils.getBaseType(typeName);

					if (KSoap2Utils.isPrimitiveType(baseType)) {  // array of primitive type
						
						String wrapperClass=KSoap2Utils.getWrapperClassName(baseType);
						//return "       return null;"; 
						return "       return KSoap2Utils.get"+wrapperClass+"Array(response);";
					}
					else if (KSoap2Utils.isStringType(baseType)) {  // array of String
						 return "      return KSoap2Utils.getStringArray(response);";
						
					}	

					else {

						return 
						"List ret=this.getList(response,new "+baseType+"(this.NAMESPACE));\n"+
						"      return ("+baseType+"[]) ret.toArray( new "+baseType+"[0]);";
					}
				}
			}
			/***  enum types are now Soapeabilisable
			else if (KSoap2Utils.isEnumType(typeName)) {
				//return " // typeName est enum";
				// must emit something like this calling the static factory of that class from a string 
				//   return StatisticStateType.fromString(response.toString());
				return " return "+typeName+ ".fromString(response.toString());";
			}
			****/ 
			else { //object that MUST be Soapeabilisable
				//return (ExamenRecordV2)KSoap2Utils.getObject(response, new ExamenRecordV2());
				String baseType=KSoap2Utils.getBaseType(typeName);
				if (fault) return "return null;";
				else	return "return ("+ baseType+")KSoap2Utils.getObject(response,new "+baseType+"(this.NAMESPACE));";
			}
		}
		return "// a WS method that's returns nothing. Why not ?";



	}

}
