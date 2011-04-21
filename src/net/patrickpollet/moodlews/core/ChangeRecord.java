/**
 * ChangeRecord.java
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

public class ChangeRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String author;

    private int courseid;

    private java.lang.String date;

    private java.lang.String error;

    private int id;

    private int instance;

    private java.lang.String link;

    private java.lang.String name;

    private int resid;

    private int timestamp;

    private java.lang.String type;

    private java.lang.String url;

    private int visible;

    public ChangeRecord(String nameSpace) {
        super(nameSpace,"ChangeRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ChangeRecord ret = new ChangeRecord(this.namespace);
      ret.setAuthor(KSoap2Utils.getString(response,"author") );
      ret.setCourseid(KSoap2Utils.getInt(response,"courseid") );
      ret.setDate(KSoap2Utils.getString(response,"date") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setInstance(KSoap2Utils.getInt(response,"instance") );
      ret.setLink(KSoap2Utils.getString(response,"link") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setResid(KSoap2Utils.getInt(response,"resid") );
      ret.setTimestamp(KSoap2Utils.getInt(response,"timestamp") );
      ret.setType(KSoap2Utils.getString(response,"type") );
      ret.setUrl(KSoap2Utils.getString(response,"url") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the author value for this ChangeRecord.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ChangeRecord.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
       this.addProperty("author",author);
    }


    /**
     * Gets the courseid value for this ChangeRecord.
     * 
     * @return courseid
     */
    public int getCourseid() {
        return courseid;
    }


    /**
     * Sets the courseid value for this ChangeRecord.
     * 
     * @param courseid
     */
    public void setCourseid(int courseid) {
        this.courseid = courseid;
       this.addProperty("courseid",courseid);
    }


    /**
     * Gets the date value for this ChangeRecord.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ChangeRecord.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
       this.addProperty("date",date);
    }


    /**
     * Gets the error value for this ChangeRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ChangeRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this ChangeRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ChangeRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the instance value for this ChangeRecord.
     * 
     * @return instance
     */
    public int getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this ChangeRecord.
     * 
     * @param instance
     */
    public void setInstance(int instance) {
        this.instance = instance;
       this.addProperty("instance",instance);
    }


    /**
     * Gets the link value for this ChangeRecord.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this ChangeRecord.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
       this.addProperty("link",link);
    }


    /**
     * Gets the name value for this ChangeRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ChangeRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the resid value for this ChangeRecord.
     * 
     * @return resid
     */
    public int getResid() {
        return resid;
    }


    /**
     * Sets the resid value for this ChangeRecord.
     * 
     * @param resid
     */
    public void setResid(int resid) {
        this.resid = resid;
       this.addProperty("resid",resid);
    }


    /**
     * Gets the timestamp value for this ChangeRecord.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this ChangeRecord.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
       this.addProperty("timestamp",timestamp);
    }


    /**
     * Gets the type value for this ChangeRecord.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ChangeRecord.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
       this.addProperty("type",type);
    }


    /**
     * Gets the url value for this ChangeRecord.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ChangeRecord.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
       this.addProperty("url",url);
    }


    /**
     * Gets the visible value for this ChangeRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this ChangeRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
