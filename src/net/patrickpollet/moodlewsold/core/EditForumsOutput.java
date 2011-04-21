/**
 * EditForumsOutput.java
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

public class EditForumsOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ForumRecord[] forums;

    public EditForumsOutput(String nameSpace) {
        super(nameSpace,"EditForumsOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditForumsOutput ret = new EditForumsOutput(this.namespace);
      List _forums =KSoap2Utils.getList((SoapObject) response.getProperty("forums"),new ForumRecord(this.namespace));
      ret.setForums((ForumRecord[]) _forums.toArray(new ForumRecord[0]));
      return ret;

    }


    /**
     * Gets the forums value for this EditForumsOutput.
     * 
     * @return forums
     */
    public net.patrickpollet.moodlewsold.core.ForumRecord[] getForums() {
        return forums;
    }


    /**
     * Sets the forums value for this EditForumsOutput.
     * 
     * @param forums
     */
    public void setForums(net.patrickpollet.moodlewsold.core.ForumRecord[] forums) {
        this.forums = forums;
       this.addProperty("forums",forums);
    }

}
