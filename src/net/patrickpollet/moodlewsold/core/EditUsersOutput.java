/**
 * EditUsersOutput.java
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

public class EditUsersOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.UserRecord[] users;

    public EditUsersOutput(String nameSpace) {
        super(nameSpace,"EditUsersOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditUsersOutput ret = new EditUsersOutput(this.namespace);
      List _users =KSoap2Utils.getList((SoapObject) response.getProperty("users"),new UserRecord(this.namespace));
      ret.setUsers((UserRecord[]) _users.toArray(new UserRecord[0]));
      return ret;

    }


    /**
     * Gets the users value for this EditUsersOutput.
     * 
     * @return users
     */
    public net.patrickpollet.moodlewsold.core.UserRecord[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this EditUsersOutput.
     * 
     * @param users
     */
    public void setUsers(net.patrickpollet.moodlewsold.core.UserRecord[] users) {
        this.users = users;
       this.addProperty("users",users);
    }

}
