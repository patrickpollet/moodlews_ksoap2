/**
 * EditWikisInput.java
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

public class EditWikisInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.WikiDatum[] wikis;

    public EditWikisInput(String nameSpace) {
        super(nameSpace,"EditWikisInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditWikisInput ret = new EditWikisInput(this.namespace);
      List _wikis =KSoap2Utils.getList((SoapObject) response.getProperty("wikis"),new WikiDatum(this.namespace));
      ret.setWikis((WikiDatum[]) _wikis.toArray(new WikiDatum[0]));
      return ret;

    }


    /**
     * Gets the wikis value for this EditWikisInput.
     * 
     * @return wikis
     */
    public net.patrickpollet.moodlewsold.core.WikiDatum[] getWikis() {
        return wikis;
    }


    /**
     * Sets the wikis value for this EditWikisInput.
     * 
     * @param wikis
     */
    public void setWikis(net.patrickpollet.moodlewsold.core.WikiDatum[] wikis) {
        this.wikis = wikis;
       this.addProperty("wikis",wikis);
    }

}
