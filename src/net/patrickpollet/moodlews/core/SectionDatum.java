/**
 * SectionDatum.java
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

public class SectionDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int course;

    private int id;

    private int section;

    private java.lang.String sequence;

    private java.lang.String summary;

    private int visible;

    public SectionDatum(String nameSpace) {
        super(nameSpace,"SectionDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      SectionDatum ret = new SectionDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setSection(KSoap2Utils.getInt(response,"section") );
      ret.setSequence(KSoap2Utils.getString(response,"sequence") );
      ret.setSummary(KSoap2Utils.getString(response,"summary") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the action value for this SectionDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this SectionDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the course value for this SectionDatum.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this SectionDatum.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the id value for this SectionDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SectionDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the section value for this SectionDatum.
     * 
     * @return section
     */
    public int getSection() {
        return section;
    }


    /**
     * Sets the section value for this SectionDatum.
     * 
     * @param section
     */
    public void setSection(int section) {
        this.section = section;
       this.addProperty("section",section);
    }


    /**
     * Gets the sequence value for this SectionDatum.
     * 
     * @return sequence
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this SectionDatum.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
       this.addProperty("sequence",sequence);
    }


    /**
     * Gets the summary value for this SectionDatum.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this SectionDatum.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
       this.addProperty("summary",summary);
    }


    /**
     * Gets the visible value for this SectionDatum.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this SectionDatum.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
