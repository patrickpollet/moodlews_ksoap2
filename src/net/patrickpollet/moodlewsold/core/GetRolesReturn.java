/**
 * GetRolesReturn.java
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

public class GetRolesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.RoleRecord[] roles;

    public GetRolesReturn(String nameSpace) {
        super(nameSpace,"GetRolesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetRolesReturn ret = new GetRolesReturn(this.namespace);
      List _roles =KSoap2Utils.getList((SoapObject) response.getProperty("roles"),new RoleRecord(this.namespace));
      ret.setRoles((RoleRecord[]) _roles.toArray(new RoleRecord[0]));
      return ret;

    }


    /**
     * Gets the roles value for this GetRolesReturn.
     * 
     * @return roles
     */
    public net.patrickpollet.moodlewsold.core.RoleRecord[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this GetRolesReturn.
     * 
     * @param roles
     */
    public void setRoles(net.patrickpollet.moodlewsold.core.RoleRecord[] roles) {
        this.roles = roles;
       this.addProperty("roles",roles);
    }

}
