/**
 * SetUserProfileValuesReturn.java
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

public class SetUserProfileValuesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ProfileitemRecord[] profiles;

    public SetUserProfileValuesReturn(String nameSpace) {
        super(nameSpace,"SetUserProfileValuesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      SetUserProfileValuesReturn ret = new SetUserProfileValuesReturn(this.namespace);
      List _profiles =KSoap2Utils.getList((SoapObject) response.getProperty("profiles"),new ProfileitemRecord(this.namespace));
      ret.setProfiles((ProfileitemRecord[]) _profiles.toArray(new ProfileitemRecord[0]));
      return ret;

    }


    /**
     * Gets the profiles value for this SetUserProfileValuesReturn.
     * 
     * @return profiles
     */
    public net.patrickpollet.moodlewsold.core.ProfileitemRecord[] getProfiles() {
        return profiles;
    }


    /**
     * Sets the profiles value for this SetUserProfileValuesReturn.
     * 
     * @param profiles
     */
    public void setProfiles(net.patrickpollet.moodlewsold.core.ProfileitemRecord[] profiles) {
        this.profiles = profiles;
       this.addProperty("profiles",profiles);
    }

}
