/**
 * GetMessageContactsReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net
 */

package net.patrickpollet.moodlewsold.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class GetMessageContactsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ContactRecord[] contacts;

    public GetMessageContactsReturn(String nameSpace) {
        super(nameSpace,"GetMessageContactsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetMessageContactsReturn ret = new GetMessageContactsReturn(this.namespace);
      List _contacts =KSoap2Utils.getList((SoapObject) response.getProperty("contacts"),new ContactRecord(this.namespace));
      ret.setContacts((ContactRecord[]) _contacts.toArray(new ContactRecord[0]));
      return ret;

    }


    /**
     * Gets the contacts value for this GetMessageContactsReturn.
     * 
     * @return contacts
     */
    public net.patrickpollet.moodlewsold.core.ContactRecord[] getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this GetMessageContactsReturn.
     * 
     * @param contacts
     */
    public void setContacts(net.patrickpollet.moodlewsold.core.ContactRecord[] contacts) {
        this.contacts = contacts;
       this.addProperty("contacts",contacts);
    }

}
