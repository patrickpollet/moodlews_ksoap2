/**
 * CategoryRecord.java
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

public class CategoryRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private java.lang.String name;

    private java.lang.String description;

    private int parent;

    private int sortorder;

    private int coursecount;

    private int visible;

    private int timemodified;

    private int depth;

    private java.lang.String path;

    public CategoryRecord(String nameSpace) {
        super(nameSpace,"CategoryRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      CategoryRecord ret = new CategoryRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setParent(KSoap2Utils.getInt(response,"parent") );
      ret.setSortorder(KSoap2Utils.getInt(response,"sortorder") );
      ret.setCoursecount(KSoap2Utils.getInt(response,"coursecount") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setDepth(KSoap2Utils.getInt(response,"depth") );
      ret.setPath(KSoap2Utils.getString(response,"path") );
      return ret;

    }


    /**
     * Gets the error value for this CategoryRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this CategoryRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this CategoryRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CategoryRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this CategoryRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CategoryRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the description value for this CategoryRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CategoryRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the parent value for this CategoryRecord.
     * 
     * @return parent
     */
    public int getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CategoryRecord.
     * 
     * @param parent
     */
    public void setParent(int parent) {
        this.parent = parent;
       this.addProperty("parent",parent);
    }


    /**
     * Gets the sortorder value for this CategoryRecord.
     * 
     * @return sortorder
     */
    public int getSortorder() {
        return sortorder;
    }


    /**
     * Sets the sortorder value for this CategoryRecord.
     * 
     * @param sortorder
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
       this.addProperty("sortorder",sortorder);
    }


    /**
     * Gets the coursecount value for this CategoryRecord.
     * 
     * @return coursecount
     */
    public int getCoursecount() {
        return coursecount;
    }


    /**
     * Sets the coursecount value for this CategoryRecord.
     * 
     * @param coursecount
     */
    public void setCoursecount(int coursecount) {
        this.coursecount = coursecount;
       this.addProperty("coursecount",coursecount);
    }


    /**
     * Gets the visible value for this CategoryRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this CategoryRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }


    /**
     * Gets the timemodified value for this CategoryRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this CategoryRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the depth value for this CategoryRecord.
     * 
     * @return depth
     */
    public int getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this CategoryRecord.
     * 
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
       this.addProperty("depth",depth);
    }


    /**
     * Gets the path value for this CategoryRecord.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CategoryRecord.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
       this.addProperty("path",path);
    }

}
