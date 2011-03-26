/**
 * RoleRecord.java
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

public class RoleRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private java.lang.String name;

    private java.lang.String shortname;

    private java.lang.String description;

    private int sortorder;

    public RoleRecord(String nameSpace) {
        super(nameSpace,"RoleRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      RoleRecord ret = new RoleRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setShortname(KSoap2Utils.getString(response,"shortname") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setSortorder(KSoap2Utils.getInt(response,"sortorder") );
      return ret;

    }


    /**
     * Gets the error value for this RoleRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this RoleRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this RoleRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this RoleRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this RoleRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RoleRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the shortname value for this RoleRecord.
     * 
     * @return shortname
     */
    public java.lang.String getShortname() {
        return shortname;
    }


    /**
     * Sets the shortname value for this RoleRecord.
     * 
     * @param shortname
     */
    public void setShortname(java.lang.String shortname) {
        this.shortname = shortname;
       this.addProperty("shortname",shortname);
    }


    /**
     * Gets the description value for this RoleRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RoleRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the sortorder value for this RoleRecord.
     * 
     * @return sortorder
     */
    public int getSortorder() {
        return sortorder;
    }


    /**
     * Sets the sortorder value for this RoleRecord.
     * 
     * @param sortorder
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
       this.addProperty("sortorder",sortorder);
    }

}
