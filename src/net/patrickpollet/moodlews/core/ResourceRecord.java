/**
 * ResourceRecord.java
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

public class ResourceRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String alltext;

    private int course;

    private int coursemodule;

    private java.lang.String error;

    private int groupmode;

    private int id;

    private java.lang.String name;

    private java.lang.String options;

    private java.lang.String popup;

    private java.lang.String reference;

    private int section;

    private java.lang.String summary;

    private int timemodified;

    private java.lang.String timemodified_ut;

    private java.lang.String type;

    private java.lang.String url;

    private int visible;

    public ResourceRecord(String nameSpace) {
        super(nameSpace,"ResourceRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ResourceRecord ret = new ResourceRecord(this.namespace);
      ret.setAlltext(KSoap2Utils.getString(response,"alltext") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setCoursemodule(KSoap2Utils.getInt(response,"coursemodule") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setGroupmode(KSoap2Utils.getInt(response,"groupmode") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setOptions(KSoap2Utils.getString(response,"options") );
      ret.setPopup(KSoap2Utils.getString(response,"popup") );
      ret.setReference(KSoap2Utils.getString(response,"reference") );
      ret.setSection(KSoap2Utils.getInt(response,"section") );
      ret.setSummary(KSoap2Utils.getString(response,"summary") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setTimemodified_ut(KSoap2Utils.getString(response,"timemodified_ut") );
      ret.setType(KSoap2Utils.getString(response,"type") );
      ret.setUrl(KSoap2Utils.getString(response,"url") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the alltext value for this ResourceRecord.
     * 
     * @return alltext
     */
    public java.lang.String getAlltext() {
        return alltext;
    }


    /**
     * Sets the alltext value for this ResourceRecord.
     * 
     * @param alltext
     */
    public void setAlltext(java.lang.String alltext) {
        this.alltext = alltext;
       this.addProperty("alltext",alltext);
    }


    /**
     * Gets the course value for this ResourceRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ResourceRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the coursemodule value for this ResourceRecord.
     * 
     * @return coursemodule
     */
    public int getCoursemodule() {
        return coursemodule;
    }


    /**
     * Sets the coursemodule value for this ResourceRecord.
     * 
     * @param coursemodule
     */
    public void setCoursemodule(int coursemodule) {
        this.coursemodule = coursemodule;
       this.addProperty("coursemodule",coursemodule);
    }


    /**
     * Gets the error value for this ResourceRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ResourceRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the groupmode value for this ResourceRecord.
     * 
     * @return groupmode
     */
    public int getGroupmode() {
        return groupmode;
    }


    /**
     * Sets the groupmode value for this ResourceRecord.
     * 
     * @param groupmode
     */
    public void setGroupmode(int groupmode) {
        this.groupmode = groupmode;
       this.addProperty("groupmode",groupmode);
    }


    /**
     * Gets the id value for this ResourceRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ResourceRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this ResourceRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResourceRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the options value for this ResourceRecord.
     * 
     * @return options
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ResourceRecord.
     * 
     * @param options
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
       this.addProperty("options",options);
    }


    /**
     * Gets the popup value for this ResourceRecord.
     * 
     * @return popup
     */
    public java.lang.String getPopup() {
        return popup;
    }


    /**
     * Sets the popup value for this ResourceRecord.
     * 
     * @param popup
     */
    public void setPopup(java.lang.String popup) {
        this.popup = popup;
       this.addProperty("popup",popup);
    }


    /**
     * Gets the reference value for this ResourceRecord.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ResourceRecord.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
       this.addProperty("reference",reference);
    }


    /**
     * Gets the section value for this ResourceRecord.
     * 
     * @return section
     */
    public int getSection() {
        return section;
    }


    /**
     * Sets the section value for this ResourceRecord.
     * 
     * @param section
     */
    public void setSection(int section) {
        this.section = section;
       this.addProperty("section",section);
    }


    /**
     * Gets the summary value for this ResourceRecord.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this ResourceRecord.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
       this.addProperty("summary",summary);
    }


    /**
     * Gets the timemodified value for this ResourceRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this ResourceRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the timemodified_ut value for this ResourceRecord.
     * 
     * @return timemodified_ut
     */
    public java.lang.String getTimemodified_ut() {
        return timemodified_ut;
    }


    /**
     * Sets the timemodified_ut value for this ResourceRecord.
     * 
     * @param timemodified_ut
     */
    public void setTimemodified_ut(java.lang.String timemodified_ut) {
        this.timemodified_ut = timemodified_ut;
       this.addProperty("timemodified_ut",timemodified_ut);
    }


    /**
     * Gets the type value for this ResourceRecord.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ResourceRecord.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
       this.addProperty("type",type);
    }


    /**
     * Gets the url value for this ResourceRecord.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ResourceRecord.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
       this.addProperty("url",url);
    }


    /**
     * Gets the visible value for this ResourceRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this ResourceRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
