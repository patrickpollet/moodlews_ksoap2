/**
 * LabelDatum.java
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

public class LabelDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int id;

    private int course;

    private java.lang.String name;

    private java.lang.String content;

    public LabelDatum(String nameSpace) {
        super(nameSpace,"LabelDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      LabelDatum ret = new LabelDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setContent(KSoap2Utils.getString(response,"content") );
      return ret;

    }


    /**
     * Gets the action value for this LabelDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this LabelDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the id value for this LabelDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this LabelDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the course value for this LabelDatum.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this LabelDatum.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the name value for this LabelDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LabelDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the content value for this LabelDatum.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this LabelDatum.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
       this.addProperty("content",content);
    }

}
