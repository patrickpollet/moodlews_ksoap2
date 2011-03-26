package org.ksoap2.wsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.Vector;

import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaBeanHelperWriter;

public class KSoap2BeanHelperWriter extends JavaBeanHelperWriter{

	protected KSoap2BeanHelperWriter(Emitter emitter, TypeEntry type,
			Vector elements, TypeEntry extendType, Vector attributes,
			Set reservedPropNames) {
		super(emitter, type, elements, extendType, attributes, reservedPropNames);
		// TODO Auto-generated constructor stub
	}
	
	
    protected void writeMetaData (PrintWriter pw) throws IOException {
    }
    
    protected void writeSerializer (PrintWriter pw) throws IOException {
    }
    
    protected void writeDeserializer (PrintWriter pw) throws IOException {
    	
    	
    	
    	
        }
    	

}
