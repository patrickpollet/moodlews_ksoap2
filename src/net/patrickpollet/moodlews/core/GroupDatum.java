/**
 * GroupDatum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net
 */

package net.patrickpollet.moodlews.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class GroupDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int courseid;

    private java.lang.String description;

    private java.lang.String enrolmentkey;

    private int hidepicture;

    private int id;

    private java.lang.String name;

    private int picture;

    public GroupDatum(String nameSpace) {
        super(nameSpace,"GroupDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GroupDatum ret = new GroupDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setCourseid(KSoap2Utils.getInt(response,"courseid") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setEnrolmentkey(KSoap2Utils.getString(response,"enrolmentkey") );
      ret.setHidepicture(KSoap2Utils.getInt(response,"hidepicture") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setPicture(KSoap2Utils.getInt(response,"picture") );
      return ret;

    }


    /**
     * Gets the action value for this GroupDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this GroupDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the courseid value for this GroupDatum.
     * 
     * @return courseid
     */
    public int getCourseid() {
        return courseid;
    }


    /**
     * Sets the courseid value for this GroupDatum.
     * 
     * @param courseid
     */
    public void setCourseid(int courseid) {
        this.courseid = courseid;
       this.addProperty("courseid",courseid);
    }


    /**
     * Gets the description value for this GroupDatum.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GroupDatum.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the enrolmentkey value for this GroupDatum.
     * 
     * @return enrolmentkey
     */
    public java.lang.String getEnrolmentkey() {
        return enrolmentkey;
    }


    /**
     * Sets the enrolmentkey value for this GroupDatum.
     * 
     * @param enrolmentkey
     */
    public void setEnrolmentkey(java.lang.String enrolmentkey) {
        this.enrolmentkey = enrolmentkey;
       this.addProperty("enrolmentkey",enrolmentkey);
    }


    /**
     * Gets the hidepicture value for this GroupDatum.
     * 
     * @return hidepicture
     */
    public int getHidepicture() {
        return hidepicture;
    }


    /**
     * Sets the hidepicture value for this GroupDatum.
     * 
     * @param hidepicture
     */
    public void setHidepicture(int hidepicture) {
        this.hidepicture = hidepicture;
       this.addProperty("hidepicture",hidepicture);
    }


    /**
     * Gets the id value for this GroupDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GroupDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this GroupDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the picture value for this GroupDatum.
     * 
     * @return picture
     */
    public int getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this GroupDatum.
     * 
     * @param picture
     */
    public void setPicture(int picture) {
        this.picture = picture;
       this.addProperty("picture",picture);
    }

}
