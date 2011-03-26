/**
 * LoginReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net
 */

package net.patrickpollet.moodlews.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class LoginReturn  extends SoapObject  implements Soapeabilisable{
    private int client;

    private java.lang.String sessionkey;

    public LoginReturn(String nameSpace) {
        super(nameSpace,"LoginReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      LoginReturn ret = new LoginReturn(this.namespace);
      ret.setClient(KSoap2Utils.getInt(response,"client") );
      ret.setSessionkey(KSoap2Utils.getString(response,"sessionkey") );
      return ret;

    }


    /**
     * Gets the client value for this LoginReturn.
     * 
     * @return client
     */
    public int getClient() {
        return client;
    }


    /**
     * Sets the client value for this LoginReturn.
     * 
     * @param client
     */
    public void setClient(int client) {
        this.client = client;
       this.addProperty("client",client);
    }


    /**
     * Gets the sessionkey value for this LoginReturn.
     * 
     * @return sessionkey
     */
    public java.lang.String getSessionkey() {
        return sessionkey;
    }


    /**
     * Sets the sessionkey value for this LoginReturn.
     * 
     * @param sessionkey
     */
    public void setSessionkey(java.lang.String sessionkey) {
        this.sessionkey = sessionkey;
       this.addProperty("sessionkey",sessionkey);
    }

}
