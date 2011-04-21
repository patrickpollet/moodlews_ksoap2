/**
 * DatabaseRecord.java
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

public class DatabaseRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int course;

    private java.lang.String name;

    private java.lang.String intro;

    private int comments;

    private int timeavailablefrom;

    private int timeavailableto;

    private int timeviewfrom;

    private int timeviewto;

    private int requiredentries;

    private int requiredentriestoview;

    private int maxentries;

    private int ressarticles;

    private java.lang.String singletemplate;

    private java.lang.String listtemplate;

    private java.lang.String listtemplateheader;

    private java.lang.String listtemplatefooter;

    private java.lang.String addtemplatee;

    private java.lang.String rsstemplate;

    private java.lang.String rsstitletemplate;

    private java.lang.String csstemplate;

    private java.lang.String jstemplate;

    private java.lang.String asearchtemplate;

    private int approval;

    private int scale;

    private int assessed;

    private int defaultsort;

    private int defaultsortdir;

    private int editany;

    private int notification;

    public DatabaseRecord(String nameSpace) {
        super(nameSpace,"DatabaseRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      DatabaseRecord ret = new DatabaseRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setIntro(KSoap2Utils.getString(response,"intro") );
      ret.setComments(KSoap2Utils.getInt(response,"comments") );
      ret.setTimeavailablefrom(KSoap2Utils.getInt(response,"timeavailablefrom") );
      ret.setTimeavailableto(KSoap2Utils.getInt(response,"timeavailableto") );
      ret.setTimeviewfrom(KSoap2Utils.getInt(response,"timeviewfrom") );
      ret.setTimeviewto(KSoap2Utils.getInt(response,"timeviewto") );
      ret.setRequiredentries(KSoap2Utils.getInt(response,"requiredentries") );
      ret.setRequiredentriestoview(KSoap2Utils.getInt(response,"requiredentriestoview") );
      ret.setMaxentries(KSoap2Utils.getInt(response,"maxentries") );
      ret.setRessarticles(KSoap2Utils.getInt(response,"ressarticles") );
      ret.setSingletemplate(KSoap2Utils.getString(response,"singletemplate") );
      ret.setListtemplate(KSoap2Utils.getString(response,"listtemplate") );
      ret.setListtemplateheader(KSoap2Utils.getString(response,"listtemplateheader") );
      ret.setListtemplatefooter(KSoap2Utils.getString(response,"listtemplatefooter") );
      ret.setAddtemplatee(KSoap2Utils.getString(response,"addtemplatee") );
      ret.setRsstemplate(KSoap2Utils.getString(response,"rsstemplate") );
      ret.setRsstitletemplate(KSoap2Utils.getString(response,"rsstitletemplate") );
      ret.setCsstemplate(KSoap2Utils.getString(response,"csstemplate") );
      ret.setJstemplate(KSoap2Utils.getString(response,"jstemplate") );
      ret.setAsearchtemplate(KSoap2Utils.getString(response,"asearchtemplate") );
      ret.setApproval(KSoap2Utils.getInt(response,"approval") );
      ret.setScale(KSoap2Utils.getInt(response,"scale") );
      ret.setAssessed(KSoap2Utils.getInt(response,"assessed") );
      ret.setDefaultsort(KSoap2Utils.getInt(response,"defaultsort") );
      ret.setDefaultsortdir(KSoap2Utils.getInt(response,"defaultsortdir") );
      ret.setEditany(KSoap2Utils.getInt(response,"editany") );
      ret.setNotification(KSoap2Utils.getInt(response,"notification") );
      return ret;

    }


    /**
     * Gets the error value for this DatabaseRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this DatabaseRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this DatabaseRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DatabaseRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the course value for this DatabaseRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this DatabaseRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the name value for this DatabaseRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatabaseRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the intro value for this DatabaseRecord.
     * 
     * @return intro
     */
    public java.lang.String getIntro() {
        return intro;
    }


    /**
     * Sets the intro value for this DatabaseRecord.
     * 
     * @param intro
     */
    public void setIntro(java.lang.String intro) {
        this.intro = intro;
       this.addProperty("intro",intro);
    }


    /**
     * Gets the comments value for this DatabaseRecord.
     * 
     * @return comments
     */
    public int getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this DatabaseRecord.
     * 
     * @param comments
     */
    public void setComments(int comments) {
        this.comments = comments;
       this.addProperty("comments",comments);
    }


    /**
     * Gets the timeavailablefrom value for this DatabaseRecord.
     * 
     * @return timeavailablefrom
     */
    public int getTimeavailablefrom() {
        return timeavailablefrom;
    }


    /**
     * Sets the timeavailablefrom value for this DatabaseRecord.
     * 
     * @param timeavailablefrom
     */
    public void setTimeavailablefrom(int timeavailablefrom) {
        this.timeavailablefrom = timeavailablefrom;
       this.addProperty("timeavailablefrom",timeavailablefrom);
    }


    /**
     * Gets the timeavailableto value for this DatabaseRecord.
     * 
     * @return timeavailableto
     */
    public int getTimeavailableto() {
        return timeavailableto;
    }


    /**
     * Sets the timeavailableto value for this DatabaseRecord.
     * 
     * @param timeavailableto
     */
    public void setTimeavailableto(int timeavailableto) {
        this.timeavailableto = timeavailableto;
       this.addProperty("timeavailableto",timeavailableto);
    }


    /**
     * Gets the timeviewfrom value for this DatabaseRecord.
     * 
     * @return timeviewfrom
     */
    public int getTimeviewfrom() {
        return timeviewfrom;
    }


    /**
     * Sets the timeviewfrom value for this DatabaseRecord.
     * 
     * @param timeviewfrom
     */
    public void setTimeviewfrom(int timeviewfrom) {
        this.timeviewfrom = timeviewfrom;
       this.addProperty("timeviewfrom",timeviewfrom);
    }


    /**
     * Gets the timeviewto value for this DatabaseRecord.
     * 
     * @return timeviewto
     */
    public int getTimeviewto() {
        return timeviewto;
    }


    /**
     * Sets the timeviewto value for this DatabaseRecord.
     * 
     * @param timeviewto
     */
    public void setTimeviewto(int timeviewto) {
        this.timeviewto = timeviewto;
       this.addProperty("timeviewto",timeviewto);
    }


    /**
     * Gets the requiredentries value for this DatabaseRecord.
     * 
     * @return requiredentries
     */
    public int getRequiredentries() {
        return requiredentries;
    }


    /**
     * Sets the requiredentries value for this DatabaseRecord.
     * 
     * @param requiredentries
     */
    public void setRequiredentries(int requiredentries) {
        this.requiredentries = requiredentries;
       this.addProperty("requiredentries",requiredentries);
    }


    /**
     * Gets the requiredentriestoview value for this DatabaseRecord.
     * 
     * @return requiredentriestoview
     */
    public int getRequiredentriestoview() {
        return requiredentriestoview;
    }


    /**
     * Sets the requiredentriestoview value for this DatabaseRecord.
     * 
     * @param requiredentriestoview
     */
    public void setRequiredentriestoview(int requiredentriestoview) {
        this.requiredentriestoview = requiredentriestoview;
       this.addProperty("requiredentriestoview",requiredentriestoview);
    }


    /**
     * Gets the maxentries value for this DatabaseRecord.
     * 
     * @return maxentries
     */
    public int getMaxentries() {
        return maxentries;
    }


    /**
     * Sets the maxentries value for this DatabaseRecord.
     * 
     * @param maxentries
     */
    public void setMaxentries(int maxentries) {
        this.maxentries = maxentries;
       this.addProperty("maxentries",maxentries);
    }


    /**
     * Gets the ressarticles value for this DatabaseRecord.
     * 
     * @return ressarticles
     */
    public int getRessarticles() {
        return ressarticles;
    }


    /**
     * Sets the ressarticles value for this DatabaseRecord.
     * 
     * @param ressarticles
     */
    public void setRessarticles(int ressarticles) {
        this.ressarticles = ressarticles;
       this.addProperty("ressarticles",ressarticles);
    }


    /**
     * Gets the singletemplate value for this DatabaseRecord.
     * 
     * @return singletemplate
     */
    public java.lang.String getSingletemplate() {
        return singletemplate;
    }


    /**
     * Sets the singletemplate value for this DatabaseRecord.
     * 
     * @param singletemplate
     */
    public void setSingletemplate(java.lang.String singletemplate) {
        this.singletemplate = singletemplate;
       this.addProperty("singletemplate",singletemplate);
    }


    /**
     * Gets the listtemplate value for this DatabaseRecord.
     * 
     * @return listtemplate
     */
    public java.lang.String getListtemplate() {
        return listtemplate;
    }


    /**
     * Sets the listtemplate value for this DatabaseRecord.
     * 
     * @param listtemplate
     */
    public void setListtemplate(java.lang.String listtemplate) {
        this.listtemplate = listtemplate;
       this.addProperty("listtemplate",listtemplate);
    }


    /**
     * Gets the listtemplateheader value for this DatabaseRecord.
     * 
     * @return listtemplateheader
     */
    public java.lang.String getListtemplateheader() {
        return listtemplateheader;
    }


    /**
     * Sets the listtemplateheader value for this DatabaseRecord.
     * 
     * @param listtemplateheader
     */
    public void setListtemplateheader(java.lang.String listtemplateheader) {
        this.listtemplateheader = listtemplateheader;
       this.addProperty("listtemplateheader",listtemplateheader);
    }


    /**
     * Gets the listtemplatefooter value for this DatabaseRecord.
     * 
     * @return listtemplatefooter
     */
    public java.lang.String getListtemplatefooter() {
        return listtemplatefooter;
    }


    /**
     * Sets the listtemplatefooter value for this DatabaseRecord.
     * 
     * @param listtemplatefooter
     */
    public void setListtemplatefooter(java.lang.String listtemplatefooter) {
        this.listtemplatefooter = listtemplatefooter;
       this.addProperty("listtemplatefooter",listtemplatefooter);
    }


    /**
     * Gets the addtemplatee value for this DatabaseRecord.
     * 
     * @return addtemplatee
     */
    public java.lang.String getAddtemplatee() {
        return addtemplatee;
    }


    /**
     * Sets the addtemplatee value for this DatabaseRecord.
     * 
     * @param addtemplatee
     */
    public void setAddtemplatee(java.lang.String addtemplatee) {
        this.addtemplatee = addtemplatee;
       this.addProperty("addtemplatee",addtemplatee);
    }


    /**
     * Gets the rsstemplate value for this DatabaseRecord.
     * 
     * @return rsstemplate
     */
    public java.lang.String getRsstemplate() {
        return rsstemplate;
    }


    /**
     * Sets the rsstemplate value for this DatabaseRecord.
     * 
     * @param rsstemplate
     */
    public void setRsstemplate(java.lang.String rsstemplate) {
        this.rsstemplate = rsstemplate;
       this.addProperty("rsstemplate",rsstemplate);
    }


    /**
     * Gets the rsstitletemplate value for this DatabaseRecord.
     * 
     * @return rsstitletemplate
     */
    public java.lang.String getRsstitletemplate() {
        return rsstitletemplate;
    }


    /**
     * Sets the rsstitletemplate value for this DatabaseRecord.
     * 
     * @param rsstitletemplate
     */
    public void setRsstitletemplate(java.lang.String rsstitletemplate) {
        this.rsstitletemplate = rsstitletemplate;
       this.addProperty("rsstitletemplate",rsstitletemplate);
    }


    /**
     * Gets the csstemplate value for this DatabaseRecord.
     * 
     * @return csstemplate
     */
    public java.lang.String getCsstemplate() {
        return csstemplate;
    }


    /**
     * Sets the csstemplate value for this DatabaseRecord.
     * 
     * @param csstemplate
     */
    public void setCsstemplate(java.lang.String csstemplate) {
        this.csstemplate = csstemplate;
       this.addProperty("csstemplate",csstemplate);
    }


    /**
     * Gets the jstemplate value for this DatabaseRecord.
     * 
     * @return jstemplate
     */
    public java.lang.String getJstemplate() {
        return jstemplate;
    }


    /**
     * Sets the jstemplate value for this DatabaseRecord.
     * 
     * @param jstemplate
     */
    public void setJstemplate(java.lang.String jstemplate) {
        this.jstemplate = jstemplate;
       this.addProperty("jstemplate",jstemplate);
    }


    /**
     * Gets the asearchtemplate value for this DatabaseRecord.
     * 
     * @return asearchtemplate
     */
    public java.lang.String getAsearchtemplate() {
        return asearchtemplate;
    }


    /**
     * Sets the asearchtemplate value for this DatabaseRecord.
     * 
     * @param asearchtemplate
     */
    public void setAsearchtemplate(java.lang.String asearchtemplate) {
        this.asearchtemplate = asearchtemplate;
       this.addProperty("asearchtemplate",asearchtemplate);
    }


    /**
     * Gets the approval value for this DatabaseRecord.
     * 
     * @return approval
     */
    public int getApproval() {
        return approval;
    }


    /**
     * Sets the approval value for this DatabaseRecord.
     * 
     * @param approval
     */
    public void setApproval(int approval) {
        this.approval = approval;
       this.addProperty("approval",approval);
    }


    /**
     * Gets the scale value for this DatabaseRecord.
     * 
     * @return scale
     */
    public int getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this DatabaseRecord.
     * 
     * @param scale
     */
    public void setScale(int scale) {
        this.scale = scale;
       this.addProperty("scale",scale);
    }


    /**
     * Gets the assessed value for this DatabaseRecord.
     * 
     * @return assessed
     */
    public int getAssessed() {
        return assessed;
    }


    /**
     * Sets the assessed value for this DatabaseRecord.
     * 
     * @param assessed
     */
    public void setAssessed(int assessed) {
        this.assessed = assessed;
       this.addProperty("assessed",assessed);
    }


    /**
     * Gets the defaultsort value for this DatabaseRecord.
     * 
     * @return defaultsort
     */
    public int getDefaultsort() {
        return defaultsort;
    }


    /**
     * Sets the defaultsort value for this DatabaseRecord.
     * 
     * @param defaultsort
     */
    public void setDefaultsort(int defaultsort) {
        this.defaultsort = defaultsort;
       this.addProperty("defaultsort",defaultsort);
    }


    /**
     * Gets the defaultsortdir value for this DatabaseRecord.
     * 
     * @return defaultsortdir
     */
    public int getDefaultsortdir() {
        return defaultsortdir;
    }


    /**
     * Sets the defaultsortdir value for this DatabaseRecord.
     * 
     * @param defaultsortdir
     */
    public void setDefaultsortdir(int defaultsortdir) {
        this.defaultsortdir = defaultsortdir;
       this.addProperty("defaultsortdir",defaultsortdir);
    }


    /**
     * Gets the editany value for this DatabaseRecord.
     * 
     * @return editany
     */
    public int getEditany() {
        return editany;
    }


    /**
     * Sets the editany value for this DatabaseRecord.
     * 
     * @param editany
     */
    public void setEditany(int editany) {
        this.editany = editany;
       this.addProperty("editany",editany);
    }


    /**
     * Gets the notification value for this DatabaseRecord.
     * 
     * @return notification
     */
    public int getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this DatabaseRecord.
     * 
     * @param notification
     */
    public void setNotification(int notification) {
        this.notification = notification;
       this.addProperty("notification",notification);
    }

}
