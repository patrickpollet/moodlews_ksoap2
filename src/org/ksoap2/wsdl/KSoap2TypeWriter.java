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

import java.util.Collections;
import java.util.Vector;

import org.apache.axis.wsdl.gen.Generator;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaBeanFaultWriter;
import org.apache.axis.wsdl.toJava.JavaEnumTypeWriter;
import org.apache.axis.wsdl.toJava.JavaHolderWriter;
import org.apache.axis.wsdl.toJava.JavaTypeWriter;
import org.apache.axis.wsdl.toJava.JavaWriter;

/**
 * @author ppollet
 *
 */
public class KSoap2TypeWriter extends JavaTypeWriter{

	/**
	 * 
	 */
	public KSoap2TypeWriter(Emitter emitter, TypeEntry type,
            SymbolTable symbolTable) {
		super(emitter,type,symbolTable);
	}
	
	 /**
     * getBeanWriter
     * 
     * @param emitter    
     * @param type       
     * @param base       
     * @return 
     */
	@Override
    protected JavaWriter getBeanWriter(Emitter emitter, TypeEntry type, TypeEntry base) {   // CONTAINED_ELEM_AND_ATTR
        
		
		JavaWriter tmp=super.getBeanWriter(emitter,type,base);
		if (tmp instanceof JavaBeanFaultWriter)
			return tmp;
		Vector elements = type.getContainedElements();
        Vector attributes = type.getContainedAttributes();
        
        return new KSoap2BeanWriter(emitter, type, elements, base, attributes,
                getBeanHelperWriter(emitter, type, elements, base,
                                    attributes, false));
    }
	
	 /**
     * getHelperWriter
     * 
     * @param emitter    
     * @param type       
     * @param elements   
     * @param base       
     * @param attributes 
     * @return 
     */
    protected JavaWriter getBeanHelperWriter(
            Emitter emitter, TypeEntry type, Vector elements, TypeEntry base,
            Vector attributes, boolean forException) {
        return new KSoap2BeanHelperWriter(
                emitter, type, elements, base, attributes,
                forException  ?  JavaBeanFaultWriter.RESERVED_PROPERTY_NAMES
                              :  Collections.EMPTY_SET);
    }
    
    
    /**
     * getEnumWriter
     * 
     * @param emitter 
     * @param type    
     * @param v       
     * @return 
     */
    protected JavaWriter getEnumTypeWriter(Emitter emitter, TypeEntry type,
                                           Vector v) {
       // return null ; // not yet supported  new JavaEnumTypeWriter(emitter, type, v);
    	return new KSoap2EnumTypeWriter(emitter, type, v);
    }
    
    /**
     * getHolderWriter
     * 
     * @param emitter 
     * @param type    
     * @return 
     */
    protected Generator getHolderWriter(Emitter emitter, TypeEntry type) {
       // return null; // not yet supported new JavaHolderWriter(emitter, type);
        return new KSoap2HolderWriter(emitter, type);
    }
	

}
