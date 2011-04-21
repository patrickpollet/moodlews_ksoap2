/**
 * GroupRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter
 */

package net.patrickpollet.moodlews.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class GroupRecord  extends SoapObject  implements Soapeabilisable{
    private int courseid;

    private java.lang.String description;

    private java.lang.String enrolmentkey;

    private java.lang.String error;

    private int hidepicture;

    private int id;

    private java.lang.String name;

    private int picture;

    private int timecreated;

    private int timemodified;

    public GroupRecord(String nameSpace) {
        super(nameSpace,"GroupRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GroupRecord ret = new GroupRecord(this.namespace);
      ret.setCourseid(KSoap2Utils.getInt(response,"courseid") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setEnrolmentkey(KSoap2Utils.getString(response,"enrolmentkey") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setHidepicture(KSoap2Utils.getInt(response,"hidepicture") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setPicture(KSoap2Utils.getInt(response,"picture") );
      ret.setTimecreated(KSoap2Utils.getInt(response,"timecreated") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      return ret;

    }


    /**
     * Gets the courseid value for this GroupRecord.
     * 
     * @return courseid
     */
    public int getCourseid() {
        return courseid;
    }


    /**
     * Sets the courseid value for this GroupRecord.
     * 
     * @param courseid
     */
    public void setCourseid(int courseid) {
        this.courseid = courseid;
       this.addProperty("courseid",courseid);
    }


    /**
     * Gets the description value for this GroupRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GroupRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the enrolmentkey value for this GroupRecord.
     * 
     * @return enrolmentkey
     */
    public java.lang.String getEnrolmentkey() {
        return enrolmentkey;
    }


    /**
     * Sets the enrolmentkey value for this GroupRecord.
     * 
     * @param enrolmentkey
     */
    public void setEnrolmentkey(java.lang.String enrolmentkey) {
        this.enrolmentkey = enrolmentkey;
       this.addProperty("enrolmentkey",enrolmentkey);
    }


    /**
     * Gets the error value for this GroupRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this GroupRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the hidepicture value for this GroupRecord.
     * 
     * @return hidepicture
     */
    public int getHidepicture() {
        return hidepicture;
    }


    /**
     * Sets the hidepicture value for this GroupRecord.
     * 
     * @param hidepicture
     */
    public void setHidepicture(int hidepicture) {
        this.hidepicture = hidepicture;
       this.addProperty("hidepicture",hidepicture);
    }


    /**
     * Gets the id value for this GroupRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GroupRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this GroupRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the picture value for this GroupRecord.
     * 
     * @return picture
     */
    public int getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this GroupRecord.
     * 
     * @param picture
     */
    public void setPicture(int picture) {
        this.picture = picture;
       this.addProperty("picture",picture);
    }


    /**
     * Gets the timecreated value for this GroupRecord.
     * 
     * @return timecreated
     */
    public int getTimecreated() {
        return timecreated;
    }


    /**
     * Sets the timecreated value for this GroupRecord.
     * 
     * @param timecreated
     */
    public void setTimecreated(int timecreated) {
        this.timecreated = timecreated;
       this.addProperty("timecreated",timecreated);
    }


    /**
     * Gets the timemodified value for this GroupRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this GroupRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }

}
