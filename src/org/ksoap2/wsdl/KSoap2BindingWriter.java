package org.ksoap2.wsdl;

import javax.wsdl.Binding;

import org.apache.axis.wsdl.gen.Generator;
import org.apache.axis.wsdl.symbolTable.BindingEntry;
import org.apache.axis.wsdl.symbolTable.PortTypeEntry;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaBindingWriter;

public class KSoap2BindingWriter extends JavaBindingWriter{

	public KSoap2BindingWriter(Emitter emitter, Binding binding,
			SymbolTable symbolTable) {
		super(emitter, binding, symbolTable);
		// TODO Auto-generated constructor stub
	}
	
	  /**
     * getJavaInterfaceWriter
     * NO interface in KSoap2
     * @param emitter 
     * @param ptEntry 
     * @param bEntry  
     * @param st      
     * @return 
     */
    protected Generator getJavaInterfaceWriter(Emitter emitter,
                                               PortTypeEntry ptEntry,
                                               BindingEntry bEntry,
                                               SymbolTable st) {
        return null;
    }
	
    /**
     * getJavaStubWriter
     * 
     * @param emitter 
     * @param bEntry  
     * @param st      
     * @return 
     */
    protected Generator getJavaStubWriter(Emitter emitter, BindingEntry bEntry,
                                          SymbolTable st) {
    	 return new KSoap2StubWriter(emitter, bEntry, st);
    }

    /**
     * getJavaSkelWriter
     * 
     * @param emitter 
     * @param bEntry  
     * @param st      
     * @return 
     */
    protected Generator getJavaSkelWriter(Emitter emitter, BindingEntry bEntry,
                                          SymbolTable st) {
        return null;
    }

    /**
     * getJavaImplWriter
     * 
     * @param emitter 
     * @param bEntry  
     * @param st      
     * @return 
     */
    protected Generator getJavaImplWriter(Emitter emitter, BindingEntry bEntry,
                                          SymbolTable st) {
        return null;
    }
	

}
