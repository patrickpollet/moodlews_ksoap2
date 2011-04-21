/**
 * SectionRecord.java
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

public class SectionRecord  extends SoapObject  implements Soapeabilisable{
    private int course;

    private java.lang.String error;

    private int id;

    private int section;

    private java.lang.String sequence;

    private java.lang.String summary;

    private int visible;

    public SectionRecord(String nameSpace) {
        super(nameSpace,"SectionRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      SectionRecord ret = new SectionRecord(this.namespace);
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setSection(KSoap2Utils.getInt(response,"section") );
      ret.setSequence(KSoap2Utils.getString(response,"sequence") );
      ret.setSummary(KSoap2Utils.getString(response,"summary") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the course value for this SectionRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this SectionRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the error value for this SectionRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this SectionRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this SectionRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SectionRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the section value for this SectionRecord.
     * 
     * @return section
     */
    public int getSection() {
        return section;
    }


    /**
     * Sets the section value for this SectionRecord.
     * 
     * @param section
     */
    public void setSection(int section) {
        this.section = section;
       this.addProperty("section",section);
    }


    /**
     * Gets the sequence value for this SectionRecord.
     * 
     * @return sequence
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this SectionRecord.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
       this.addProperty("sequence",sequence);
    }


    /**
     * Gets the summary value for this SectionRecord.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this SectionRecord.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
       this.addProperty("summary",summary);
    }


    /**
     * Gets the visible value for this SectionRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this SectionRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
