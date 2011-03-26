/**
 * CohortDatum.java
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

public class CohortDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int id;

    private int categoryid;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String component;

    private java.lang.String idnumber;

    public CohortDatum(String nameSpace) {
        super(nameSpace,"CohortDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      CohortDatum ret = new CohortDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCategoryid(KSoap2Utils.getInt(response,"categoryid") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setComponent(KSoap2Utils.getString(response,"component") );
      ret.setIdnumber(KSoap2Utils.getString(response,"idnumber") );
      return ret;

    }


    /**
     * Gets the action value for this CohortDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CohortDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the id value for this CohortDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CohortDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the categoryid value for this CohortDatum.
     * 
     * @return categoryid
     */
    public int getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this CohortDatum.
     * 
     * @param categoryid
     */
    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
       this.addProperty("categoryid",categoryid);
    }


    /**
     * Gets the name value for this CohortDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CohortDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the description value for this CohortDatum.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CohortDatum.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the component value for this CohortDatum.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this CohortDatum.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
       this.addProperty("component",component);
    }


    /**
     * Gets the idnumber value for this CohortDatum.
     * 
     * @return idnumber
     */
    public java.lang.String getIdnumber() {
        return idnumber;
    }


    /**
     * Sets the idnumber value for this CohortDatum.
     * 
     * @param idnumber
     */
    public void setIdnumber(java.lang.String idnumber) {
        this.idnumber = idnumber;
       this.addProperty("idnumber",idnumber);
    }

}
