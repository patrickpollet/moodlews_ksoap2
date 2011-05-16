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

import javax.wsdl.Binding;
import javax.wsdl.Definition;
import javax.wsdl.Message;
import javax.wsdl.PortType;
import javax.wsdl.Service;

import org.apache.axis.wsdl.gen.Generator;
import org.apache.axis.wsdl.gen.NoopGenerator;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaGeneratorFactory;


public class KSoap2Factory extends JavaGeneratorFactory{
	
	
	 public KSoap2Factory(Emitter emitter) {
		 super (emitter);
	 }
	 
	 
	  /**
	   * Method getGenerator
	   * 
	   * @param message     
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(Message message, SymbolTable symbolTable) {
	    return new NoopGenerator();
	  }    // getGenerator
	  
	  /**
	   * Method getGenerator
	   * 
	   * @param portType    
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(PortType portType, SymbolTable symbolTable) {
	    return new NoopGenerator();
	  }    // getGenerator
	  
	  /**
	   * Method getGenerator
	   * 
	   * @param binding     
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(Binding binding, SymbolTable symbolTable) {
	   
		  if (include(binding.getQName())) {
	            Generator writer = new KSoap2BindingWriter(emitter, binding,
	                    symbolTable);
	            return writer;
		  }      
	            else return new NoopGenerator();
	  }    // getGenerator
	  
	  /**
	   * Method getGenerator
	   * 
	   * @param service     
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(Service service, SymbolTable symbolTable) {
	    return new NoopGenerator();
	  }    // getGenerator
	  
	  /**
	   * Method getGenerator
	   * 
	   * @param type        
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(TypeEntry type, SymbolTable symbolTable) {
		  if (include(type.getQName())) {
	            Generator writer = new KSoap2TypeWriter(emitter, type, symbolTable);
	            return writer;
	        }
	        else {
	            return new NoopGenerator();
	        }

	  }    // getGenerator
	  
	  /**
	   * Method getGenerator
	   * 
	   * @param definition  
	   * @param symbolTable 
	   * @return 
	   */
	  public Generator getGenerator(Definition definition,
	      SymbolTable symbolTable) {
	    return new NoopGenerator();
	  }  


}
