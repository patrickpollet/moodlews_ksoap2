/**
 * ForumPostDatum.java
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

public class ForumPostDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String message;

    private java.lang.String subject;

    public ForumPostDatum(String nameSpace) {
        super(nameSpace,"ForumPostDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ForumPostDatum ret = new ForumPostDatum(this.namespace);
      ret.setMessage(KSoap2Utils.getString(response,"message") );
      ret.setSubject(KSoap2Utils.getString(response,"subject") );
      return ret;

    }


    /**
     * Gets the message value for this ForumPostDatum.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ForumPostDatum.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
       this.addProperty("message",message);
    }


    /**
     * Gets the subject value for this ForumPostDatum.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ForumPostDatum.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
       this.addProperty("subject",subject);
    }

}
