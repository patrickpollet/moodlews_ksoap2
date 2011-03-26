/**
 * EditForumsInput.java
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

public class EditForumsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ForumDatum[] forums;

    public EditForumsInput(String nameSpace) {
        super(nameSpace,"EditForumsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditForumsInput ret = new EditForumsInput(this.namespace);
      List _forums =KSoap2Utils.getList((SoapObject) response.getProperty("forums"),new ForumDatum(this.namespace));
      ret.setForums((ForumDatum[]) _forums.toArray(new ForumDatum[0]));
      return ret;

    }


    /**
     * Gets the forums value for this EditForumsInput.
     * 
     * @return forums
     */
    public net.patrickpollet.moodlewsold.core.ForumDatum[] getForums() {
        return forums;
    }


    /**
     * Sets the forums value for this EditForumsInput.
     * 
     * @param forums
     */
    public void setForums(net.patrickpollet.moodlewsold.core.ForumDatum[] forums) {
        this.forums = forums;
       this.addProperty("forums",forums);
    }

}
