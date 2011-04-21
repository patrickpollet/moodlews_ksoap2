/**
 * EditUsersInput.java
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

public class EditUsersInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.UserDatum[] users;

    public EditUsersInput(String nameSpace) {
        super(nameSpace,"EditUsersInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditUsersInput ret = new EditUsersInput(this.namespace);
      List _users =KSoap2Utils.getList((SoapObject) response.getProperty("users"),new UserDatum(this.namespace));
      ret.setUsers((UserDatum[]) _users.toArray(new UserDatum[0]));
      return ret;

    }


    /**
     * Gets the users value for this EditUsersInput.
     * 
     * @return users
     */
    public net.patrickpollet.moodlewsold.core.UserDatum[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this EditUsersInput.
     * 
     * @param users
     */
    public void setUsers(net.patrickpollet.moodlewsold.core.UserDatum[] users) {
        this.users = users;
       this.addProperty("users",users);
    }

}
