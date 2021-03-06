/**
 * EditWikisOutput.java
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

public class EditWikisOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.WikiRecord[] wikis;

    public EditWikisOutput(String nameSpace) {
        super(nameSpace,"EditWikisOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditWikisOutput ret = new EditWikisOutput(this.namespace);
      List _wikis =KSoap2Utils.getList((SoapObject) response.getProperty("wikis"),new WikiRecord(this.namespace));
      ret.setWikis((WikiRecord[]) _wikis.toArray(new WikiRecord[0]));
      return ret;

    }


    /**
     * Gets the wikis value for this EditWikisOutput.
     * 
     * @return wikis
     */
    public net.patrickpollet.moodlewsold.core.WikiRecord[] getWikis() {
        return wikis;
    }


    /**
     * Sets the wikis value for this EditWikisOutput.
     * 
     * @param wikis
     */
    public void setWikis(net.patrickpollet.moodlewsold.core.WikiRecord[] wikis) {
        this.wikis = wikis;
       this.addProperty("wikis",wikis);
    }

}
