/*
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

import org.apache.axis.wsdl.gen.Parser;
import org.apache.axis.wsdl.toJava.Emitter;

/**
 * Class WSDL2Java.  Generates java code for KSoap.
 * 
 */
public class WSDL2ksoap extends org.apache.axis.wsdl.WSDL2Java {

 
    /**
     * createParser
     * Used by extended classes to construct an instance of the Parser
     * 
     * @return 
     */
    protected Parser createParser() {
      Parser p = super.createParser();
      p.setFactory(new KSoap2Factory((Emitter)p));
      return p;
    }    // createParser

 
    /**
     * Main
     * Run the tool with the specified command-line arguments
     * 
     * @param args String[] command-line arguments
     */
    public static void main(String[] args) {

        WSDL2ksoap wsdl2Java = new WSDL2ksoap();

        wsdl2Java.run(args);
    }    // main
}    // class WSDL2
