/**
 * GetUsersReturn.java
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

public class GetUsersReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.UserRecord[] users;

    public GetUsersReturn(String nameSpace) {
        super(nameSpace,"GetUsersReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetUsersReturn ret = new GetUsersReturn(this.namespace);
      List _users =KSoap2Utils.getList((SoapObject) response.getProperty("users"),new UserRecord(this.namespace));
      ret.setUsers((UserRecord[]) _users.toArray(new UserRecord[0]));
      return ret;

    }


    /**
     * Gets the users value for this GetUsersReturn.
     * 
     * @return users
     */
    public net.patrickpollet.moodlewsold.core.UserRecord[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this GetUsersReturn.
     * 
     * @param users
     */
    public void setUsers(net.patrickpollet.moodlewsold.core.UserRecord[] users) {
        this.users = users;
       this.addProperty("users",users);
    }

}
