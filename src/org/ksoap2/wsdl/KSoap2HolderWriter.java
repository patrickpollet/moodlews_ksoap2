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

import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.JavaHolderWriter;

public class KSoap2HolderWriter extends  JavaHolderWriter{
	
	  /**
     * Constructor.
     * 
     * @param emitter 
     * @param type    
     */
    protected KSoap2HolderWriter(Emitter emitter, TypeEntry type) {
        super(emitter, type);
    }    // ctor
    
    /**nothing new yet 
     */


}
