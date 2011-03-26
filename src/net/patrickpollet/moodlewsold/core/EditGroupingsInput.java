/**
 * EditGroupingsInput.java
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

public class EditGroupingsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GroupDatum[] groupings;

    public EditGroupingsInput(String nameSpace) {
        super(nameSpace,"EditGroupingsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditGroupingsInput ret = new EditGroupingsInput(this.namespace);
      List _groupings =KSoap2Utils.getList((SoapObject) response.getProperty("groupings"),new GroupDatum(this.namespace));
      ret.setGroupings((GroupDatum[]) _groupings.toArray(new GroupDatum[0]));
      return ret;

    }


    /**
     * Gets the groupings value for this EditGroupingsInput.
     * 
     * @return groupings
     */
    public net.patrickpollet.moodlewsold.core.GroupDatum[] getGroupings() {
        return groupings;
    }


    /**
     * Sets the groupings value for this EditGroupingsInput.
     * 
     * @param groupings
     */
    public void setGroupings(net.patrickpollet.moodlewsold.core.GroupDatum[] groupings) {
        this.groupings = groupings;
       this.addProperty("groupings",groupings);
    }

}
