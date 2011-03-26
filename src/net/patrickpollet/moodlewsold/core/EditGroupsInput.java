/**
 * EditGroupsInput.java
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

public class EditGroupsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GroupDatum[] groups;

    public EditGroupsInput(String nameSpace) {
        super(nameSpace,"EditGroupsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditGroupsInput ret = new EditGroupsInput(this.namespace);
      List _groups =KSoap2Utils.getList((SoapObject) response.getProperty("groups"),new GroupDatum(this.namespace));
      ret.setGroups((GroupDatum[]) _groups.toArray(new GroupDatum[0]));
      return ret;

    }


    /**
     * Gets the groups value for this EditGroupsInput.
     * 
     * @return groups
     */
    public net.patrickpollet.moodlewsold.core.GroupDatum[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this EditGroupsInput.
     * 
     * @param groups
     */
    public void setGroups(net.patrickpollet.moodlewsold.core.GroupDatum[] groups) {
        this.groups = groups;
       this.addProperty("groups",groups);
    }

}
