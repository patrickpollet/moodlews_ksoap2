/**
 * ProfileitemRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter
 */

package net.patrickpollet.moodlewsold.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class ProfileitemRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String name;

    private java.lang.String value;

    public ProfileitemRecord(String nameSpace) {
        super(nameSpace,"ProfileitemRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ProfileitemRecord ret = new ProfileitemRecord(this.namespace);
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setValue(KSoap2Utils.getString(response,"value") );
      return ret;

    }


    /**
     * Gets the name value for this ProfileitemRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProfileitemRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the value value for this ProfileitemRecord.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProfileitemRecord.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
       this.addProperty("value",value);
    }

}
