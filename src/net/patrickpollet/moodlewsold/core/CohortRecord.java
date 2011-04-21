/**
 * CohortRecord.java
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

public class CohortRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int contextid;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String idnumber;

    private java.lang.String component;

    private int timecreated;

    private int timemodified;

    public CohortRecord(String nameSpace) {
        super(nameSpace,"CohortRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      CohortRecord ret = new CohortRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setContextid(KSoap2Utils.getInt(response,"contextid") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setIdnumber(KSoap2Utils.getString(response,"idnumber") );
      ret.setComponent(KSoap2Utils.getString(response,"component") );
      ret.setTimecreated(KSoap2Utils.getInt(response,"timecreated") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      return ret;

    }


    /**
     * Gets the error value for this CohortRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this CohortRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this CohortRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CohortRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the contextid value for this CohortRecord.
     * 
     * @return contextid
     */
    public int getContextid() {
        return contextid;
    }


    /**
     * Sets the contextid value for this CohortRecord.
     * 
     * @param contextid
     */
    public void setContextid(int contextid) {
        this.contextid = contextid;
       this.addProperty("contextid",contextid);
    }


    /**
     * Gets the name value for this CohortRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CohortRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the description value for this CohortRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CohortRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the idnumber value for this CohortRecord.
     * 
     * @return idnumber
     */
    public java.lang.String getIdnumber() {
        return idnumber;
    }


    /**
     * Sets the idnumber value for this CohortRecord.
     * 
     * @param idnumber
     */
    public void setIdnumber(java.lang.String idnumber) {
        this.idnumber = idnumber;
       this.addProperty("idnumber",idnumber);
    }


    /**
     * Gets the component value for this CohortRecord.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this CohortRecord.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
       this.addProperty("component",component);
    }


    /**
     * Gets the timecreated value for this CohortRecord.
     * 
     * @return timecreated
     */
    public int getTimecreated() {
        return timecreated;
    }


    /**
     * Sets the timecreated value for this CohortRecord.
     * 
     * @param timecreated
     */
    public void setTimecreated(int timecreated) {
        this.timecreated = timecreated;
       this.addProperty("timecreated",timecreated);
    }


    /**
     * Gets the timemodified value for this CohortRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this CohortRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }

}
