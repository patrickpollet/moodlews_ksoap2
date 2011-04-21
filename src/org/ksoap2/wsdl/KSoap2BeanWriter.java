package org.ksoap2.wsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.moodlewsold.core.ForumPostRecord;

import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaBeanWriter;
import org.apache.axis.wsdl.toJava.JavaWriter;
import org.apache.axis.wsdl.toJava.Utils;
import org.ksoap2.serialization.SoapObject;
import org.w3c.dom.DOMException;

public class KSoap2BeanWriter extends JavaBeanWriter{
	
	//private TypeEntry type; // needed here but private in superclass
	private String nameSpaceURI="";
	   /**
     * Constructor.
     * 
     * @param emitter    
     * @param type       The type representing this class
     * @param elements   Vector containing the Type and name of each property
     * @param extendType The type representing the extended class (or null)
     * @param attributes Vector containing the attribute types and names
     * @param helper     Helper class writer
     */
    protected KSoap2BeanWriter(Emitter emitter, TypeEntry type, Vector elements,
                             TypeEntry extendType, Vector attributes,
                             JavaWriter helper) {
    	super(emitter,type,elements,extendType,attributes,helper);
    	
    	this.enableEquals=false;
    	this.enableHashCode=false;
    	this.enableToString=true;  
    	//this.type=type;
    	this.nameSpaceURI=type.getQName().getNamespaceURI();
    	//this.
    }
    
    
    /**
     * Returns the appropriate extends text
     * 
     * @return "" or " extends <class> "
     */
    protected String getExtendsText() {

        // See if this class extends another class
        String extendsText = " extends SoapObject ";
/*
        if ((extendType != null) && !isUnion()
                && (!type.isSimpleType() || !extendType.isBaseType())
                && (extendType.getDimensions().length() == 0)) {
            extendsText = " extends " + extendType.getName() + " ";
        }
*/
        return extendsText;
    }
    
    /**
     * Returns the appropriate implements text
     * 
     * @return " implements <classes> "
     */
    protected String getImplementsText() {
    	return " implements Soapeabilisable";
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
        pw.println(" * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter");
        pw.println(" */");
        pw.println();
    }    // writeHeaderComments
    
    /**
     * Write the package declaration statement.
     * add some needed imports
     * @param pw 
     * @throws IOException 
     */
    protected void writePackage(PrintWriter pw) throws IOException {

        super.writePackage(pw);
        pw.println();
        pw.println("import java.util.Arrays;");
        pw.println("import java.util.List;");
        pw.println("import net.patrickpollet.ksoap2.KSoap2Utils;");
        pw.println("import net.patrickpollet.ksoap2.Soapeabilisable;");
        pw.println("import org.ksoap2.serialization.SoapObject;");
        pw.println();
    }    // writePackage
    
    
    
    /**
     * not needed 
     */
    protected void writeMinimalConstructor() {
    	/**
    	 pw.println("    public " + className + "(");
         for (int i = 0; i < names.size(); i += 2) {
             String typeName = (String) names.get(i);
             String variable = (String) names.get(i + 1);
             pw.print("           " + typeName + " "
                     + variable);
             if (i >= names.size() - 2) {
                 pw.println(") {");
             } else {
                 pw.println(",");
             } 
         }
         pw.println ("        super(\""+this.nameSpaceURI+"\",\""+this.className+"\");");
         
         for (int i = 0; i < names.size(); i += 2) {
             String variable = (String) names.get(i + 1);
             pw.println("           this." + variable + " = " + variable + ";");
             if (i >= names.size() - 2) {
                 break;
             }
         }
         pw.println("    }");
         pw.println();
    	**/
    	try {
			this.writeDeserializer(pw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }
    
    
    /**
     * not needed thus nothing todo 
     */
    protected void writeFullConstructor() {
    
    }
    
    
    /**
     * Writes the default constructor.
     */
    protected void writeDefaultConstructor() {
        // Define the default constructor
        pw.println("    public " + className + "(String nameSpace) {");
      //pw.println ("        super(\""+this.nameSpaceURI+"\",\""+this.className+"\");");
        pw.println ("        super(nameSpace,"+"\""+this.className+"\");");
        pw.println("    }");
        pw.println();
    }
    
    
    /**
     * this cannot be done as per axis way in a Ksoap2BeanHelperwriter class
     * since that class do not have access to the names attributes ;-)
     * so I do it here and call this method when writing the minimal constructor 
     * @param pw
     * @throws IOException
     */
    protected void writeDeserializer (PrintWriter pw) throws IOException {
    	
  	  pw.println("    /**");
        pw.println("     * Get Custom Deserializer");
        pw.println("     */");
        pw.println(
                   "    public Soapeabilisable fromSoapResponse (SoapObject response) {");
       pw.println("      "+className+ " ret = new "+ className+"(this.namespace);");
        

       for (int i = 0; i < names.size(); i += 2) {
    	   String typeName = (String) names.get(i);
    	   String name = (String) names.get(i + 1);
    	   String capName = Utils.capitalizeFirstChar(name);
    	  // System.out.println("====>"+typeName+" "+name+" "+capName);
    	   String get=""; 
    	   if (KSoap2Utils.isPrimitiveType(typeName)) {
    		   // emit something like  ret.setDate(KSoap2Utils.getLong(response,"date") );
    		   get="get"+ Utils.capitalizeFirstChar(typeName)+ "(response,"+"\""+name +"\")";
    		   pw.println("      ret.set"+capName+"(KSoap2Utils."+get+" );");
    	   }
    	   else if (KSoap2Utils.isStringType(typeName)) {
    		   // emit something like  ret.setCategory(KSoap2Utils.getString(response,"category") ); 
    		   get="getString(response,"+"\""+name +"\")";
    		   pw.println("      ret.set"+capName+"(KSoap2Utils."+get+" );");
    	   }	
    	   
    	   else if (KSoap2Utils.isWrapperType(typeName)) {  
    		   // in some WSDL xsd:int is associated with minoccurs,maxoccurs, thus forcing Axis to convert it the Integer or BigInteger 
    		   pw.printf ("   // wrapper %s\n",typeName);
    		   //emit   ret.setTimeout((Integer) response.getProperty("timeout"));
    		   pw.printf("       ret.set%s((%s) response.getProperty(\"%s\"));\n",capName,typeName,name );
    	   }
    	   
    	   
    	   else if (KSoap2Utils.isArrayType(typeName)) {
    		   
    		   String baseType=KSoap2Utils.getBaseType(typeName);
    		   System.out.println ("baseType de "+typeName+ " est "+baseType);

    		   if (KSoap2Utils.isPrimitiveType(baseType)) {  // array of primitive type
    			   //emit something like
    			   //int[] _mainActions =KSoap2Utils.getIntegerArray((SoapObject) response.getProperty("mainActions"));
    			   //ret.setMainActions(_mainActions);
    			   String wrapperClass=KSoap2Utils.getWrapperClassName(baseType);
    			   pw.printf("       %s[] _%s =KSoap2Utils.get%sArray((SoapObject) response.getProperty(\"%s\"));\n",baseType,name,wrapperClass,name);
    			   pw.printf("       ret.set%s(_%s);\n",capName,name);
    			   
    		   }
    		   else if (KSoap2Utils.isStringType(baseType)) {  // array of String
    			   //emit something like
    			   //String[] _mainActions =KSoap2Utils.getStringArray((SoapObject) response.getProperty("mainActions"));
    			   //ret.setMainActions(_mainActions);
    			   pw.printf("       String[] _%s =KSoap2Utils.getStringArray((SoapObject) response.getProperty(\"%s\"));\n",name,name);
    			   pw.printf("       ret.set%s(_%s);\n",capName,name);
    		   }
    		   /*****
    		   else if (KSoap2Utils.isEnumType(baseType)) {
   				pw.printf ("       // %s is an array enumType %s   not yet implemented \n",typeName,baseType);				
   				pw.printf("       ret.set%s(null);\n",capName);		
   			   }
   			   ******/
    		   
    		   else { // array of Complex Types  MUST be Soapeablisable   TODO enums
    			   /*
    			    * must emit that chunk of code 
            	   List _profile =KSoap2Utils.getList((SoapObject) response.getProperty("profile"),new ProfileitemRecord(this.namespace));
            	   ret.setProfile((ProfileitemRecord[]) _profile.toArray(new ProfileitemRecord[0]));
    			    */
    			   pw.printf("      List _%s =KSoap2Utils.getList((SoapObject) response.getProperty(\"%s\"),new %s(this.namespace));\n",name,name,baseType);
    			   pw.printf("      ret.set%s((%s[]) _%s.toArray(new %s[0]));\n",capName,baseType,name,baseType);
    		   }
    		   //get="getObject(response,new"+;
    	   }
    	   /***
    	   else if (KSoap2Utils.isEnumType(typeName)) {
				pw.printf ("       //%s is an enumType\n",typeName);
				// must emit something like this calling the static factory of that class from a string 
				//   ret.setType(StatisticStateType.fromString(KSoap2Utils.getString(response,"type")));
				pw.printf("       ret.set%s(%s.fromString(KSoap2Utils.getString(response,\"%s\")));\n",capName,typeName,name);
				
			}
    	    ****/

    	   else {  // case of returned single object of some complextype must be Soapeabilisable 
    		   // TODO use getObject 
    		   //pw.printf("    // déserialisation of %s not yet implemented \n",typeName);
    		   //pw.print("??????\n");
    		   
    		   //should emit something like
    		   //ForumPostRecord _post= (ForumPostRecord) (KSoap2Utils.getObject((SoapObject) response.getProperty("post"), new ForumPostRecord(this.namespace)));
    		   //ret.setPost(_post);
    		   pw.printf("       %s _%s= (%s) (KSoap2Utils.getObject((SoapObject) response.getProperty(\"%s\"), new %s(this.namespace)));\n", typeName,name,typeName,name,typeName);
    		   pw.printf("       ret.set%s(_%s);\n",capName,name);
    		   
    		   //continue ; 
    	   }
            
            
        }    
        
        
        
        pw.println("      return ret;");
        pw.println();
        
       
        pw.println("    }");
        pw.println();   	
  }
    
    
    /**
     * Writes the toString method
     * Currently the toString method is only written for
     * simpleTypes.in axis 1.4
     * so we override it here mostly for debugging purpose
     */
 /** NOT NEEDED if custom classes extends SoapObject they already have a good toString 
    protected void writeToStringMethod() {
    	final int MAX_ATTRIBUTES=10;

    	pw.println("    public java.lang.String toString() {");
    	pw.println("       String ret=\"\";" );
    	for (int i = 0; i < names.size() ; i += 2) {
    		String typeName = (String) names.get(i);
    		String name = (String) names.get(i + 1);
    		String capName = Utils.capitalizeFirstChar(name);
    		// pw.println(typeName+" "+name+" "+capName);

    		String value="\"" +name+"\"  + \" : \"";
    		if (KSoap2Utils.isPrimitiveType(typeName))
    			value +="+"+name;
    		else if (KSoap2Utils.isArrayType(typeName))
    			value+="+Arrays.toString("+name+")";
// generate a test for null value ....    		
// ret += "username"  + " : "+(username !=null?username.toString():"null") +" , " ;
    		else value+="+("+name+"!=null?"+name+".toString():\"null\")";
    		pw.println ("       ret += "+value+" +\" , \" ;");
    		//if (i*2>MAX_ATTRIBUTES) break;

    	}


    	pw.println("       return ret;");
    	pw.println("    }");
        
    }
**/    
    
    /**
     * Writes the setter and getter methods
     */
    protected void writeAccessMethods() {

        int j = 0;

        // Define getters and setters for the bean elements
        for (int i = 0; i < names.size(); i += 2, j++) {
            String typeName = (String) names.get(i);
            String name = (String) names.get(i + 1);
            String capName = Utils.capitalizeFirstChar(name);

            String documentation = "";
/*
            if (elements != null)
            {
                if (elements != null && i < (elements.size()*2))
                {
                    ElementDecl elem = (ElementDecl)elements.get(i/2);
                    documentation = elem.getDocumentation();
                }
            } 
 */           
            String get = "get";

            if (typeName.equals("boolean")) {
                get = "is";
            }

            String comment = getJavadocDescriptionPart(documentation, true);
            if (comment.length() > 3) {
                // remove the " *" at the front of the first line
                comment = comment.substring(2);
            }
            if (enableGetters) {
                try {
                    pw.println();
                    pw.println("    /**");
                    pw.println("     * Gets the " + name + " value for this " + getClassName() + ".");
                    pw.println("     * ");
                    pw.println("     * @return " + name + comment);
                    pw.println("     */");
                } catch (DOMException e) {
                    // no comment
                }                    
                pw.println("    public " + typeName + " " + get + capName
                        + "() {");
/*
                if (isUnion()) {
                    writeSimpleTypeGetter(typeName, name, "return");
                } else {
                    pw.println("        return " + name + ";");
                }
*/
                pw.println("        return " + name + ";");
                pw.println("    }");
                pw.println();
            }

            if (enableSetters) {
                try
                {
                   // String nm = (isUnion()) ? "_value" : name;
                	String nm = name;
                    pw.println();
                    pw.println("    /**");
                    pw.println("     * Sets the " + nm + " value for this " + getClassName() + ".");
                    pw.println("     * ");
                    pw.println("     * @param " + nm + comment);
                    pw.println("     */");
                }
                catch (DOMException e)
                {
                    // no comment
                }  
 /*               
                if (isUnion()) {
                    pw.println("    public void set" + capName + "(" + typeName
                            + " _value) {");
                    writeSimpleTypeSetter(typeName);
                } else {
                    pw.println("    public void set" + capName + "(" + typeName
                            + " " + name + ") {");
                    pw.println("        this." + name + " = " + name + ";");
                }
*/
                pw.println("    public void set" + capName + "(" + typeName
                        + " " + name + ") {");
                pw.println("        this." + name + " = " + name + ";");
                pw.println ("       this.addProperty(\""+name+"\","+name+");");
                pw.println("    }");
                pw.println();
            }

            // If this is a special collection type, insert extra
            // java code so that the serializer/deserializer can recognize
            // the class.  This is not JAX-RPC, and will be replaced with
            // compliant code when JAX-RPC determines how to deal with this case.
            // These signatures comply with Bean Indexed Properties which seems
            // like the reasonable approach to take for collection types.
            // (It may be more efficient to handle this with an ArrayList...but
            // for the initial support it was easier to use an actual array.)

        }
    }
    

}
