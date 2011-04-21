/**
 * AffectRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter
 */

package net.patrickpollet.moodlews.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class AffectRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private boolean status;

    public AffectRecord(String nameSpace) {
        super(nameSpace,"AffectRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      AffectRecord ret = new AffectRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setStatus(KSoap2Utils.getBoolean(response,"status") );
      return ret;

    }


    /**
     * Gets the error value for this AffectRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this AffectRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the status value for this AffectRecord.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this AffectRecord.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
       this.addProperty("status",status);
    }

}
