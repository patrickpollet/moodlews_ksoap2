/**
 * EditGroupsOutput.java
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

public class EditGroupsOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GroupRecord[] groups;

    public EditGroupsOutput(String nameSpace) {
        super(nameSpace,"EditGroupsOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditGroupsOutput ret = new EditGroupsOutput(this.namespace);
      List _groups =KSoap2Utils.getList((SoapObject) response.getProperty("groups"),new GroupRecord(this.namespace));
      ret.setGroups((GroupRecord[]) _groups.toArray(new GroupRecord[0]));
      return ret;

    }


    /**
     * Gets the groups value for this EditGroupsOutput.
     * 
     * @return groups
     */
    public net.patrickpollet.moodlewsold.core.GroupRecord[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this EditGroupsOutput.
     * 
     * @param groups
     */
    public void setGroups(net.patrickpollet.moodlewsold.core.GroupRecord[] groups) {
        this.groups = groups;
       this.addProperty("groups",groups);
    }

}
