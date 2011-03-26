/**
 * GroupingRecord.java
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

public class GroupingRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int courseid;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String configdata;

    private int timecreated;

    private int timemodified;

    public GroupingRecord(String nameSpace) {
        super(nameSpace,"GroupingRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GroupingRecord ret = new GroupingRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCourseid(KSoap2Utils.getInt(response,"courseid") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setConfigdata(KSoap2Utils.getString(response,"configdata") );
      ret.setTimecreated(KSoap2Utils.getInt(response,"timecreated") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      return ret;

    }


    /**
     * Gets the error value for this GroupingRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this GroupingRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this GroupingRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GroupingRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the courseid value for this GroupingRecord.
     * 
     * @return courseid
     */
    public int getCourseid() {
        return courseid;
    }


    /**
     * Sets the courseid value for this GroupingRecord.
     * 
     * @param courseid
     */
    public void setCourseid(int courseid) {
        this.courseid = courseid;
       this.addProperty("courseid",courseid);
    }


    /**
     * Gets the name value for this GroupingRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupingRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the description value for this GroupingRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GroupingRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the configdata value for this GroupingRecord.
     * 
     * @return configdata
     */
    public java.lang.String getConfigdata() {
        return configdata;
    }


    /**
     * Sets the configdata value for this GroupingRecord.
     * 
     * @param configdata
     */
    public void setConfigdata(java.lang.String configdata) {
        this.configdata = configdata;
       this.addProperty("configdata",configdata);
    }


    /**
     * Gets the timecreated value for this GroupingRecord.
     * 
     * @return timecreated
     */
    public int getTimecreated() {
        return timecreated;
    }


    /**
     * Sets the timecreated value for this GroupingRecord.
     * 
     * @param timecreated
     */
    public void setTimecreated(int timecreated) {
        this.timecreated = timecreated;
       this.addProperty("timecreated",timecreated);
    }


    /**
     * Gets the timemodified value for this GroupingRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this GroupingRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }

}
