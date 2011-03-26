/**
 * DatabaseDatum.java
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

public class DatabaseDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private java.lang.String addtemplatee;

    private int approval;

    private java.lang.String asearchtemplate;

    private int assessed;

    private int comments;

    private int course;

    private java.lang.String csstemplate;

    private int defaultsort;

    private int defaultsortdir;

    private int editany;

    private int id;

    private java.lang.String intro;

    private java.lang.String jstemplate;

    private java.lang.String listtemplate;

    private java.lang.String listtemplatefooter;

    private java.lang.String listtemplateheader;

    private int maxentries;

    private java.lang.String name;

    private int notification;

    private int requiredentries;

    private int requiredentriestoview;

    private int ressarticles;

    private java.lang.String rsstemplate;

    private java.lang.String rsstitletemplate;

    private int scale;

    private java.lang.String singletemplate;

    private int timeavailablefrom;

    private int timeavailableto;

    private int timeviewfrom;

    private int timeviewto;

    public DatabaseDatum(String nameSpace) {
        super(nameSpace,"DatabaseDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      DatabaseDatum ret = new DatabaseDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setAddtemplatee(KSoap2Utils.getString(response,"addtemplatee") );
      ret.setApproval(KSoap2Utils.getInt(response,"approval") );
      ret.setAsearchtemplate(KSoap2Utils.getString(response,"asearchtemplate") );
      ret.setAssessed(KSoap2Utils.getInt(response,"assessed") );
      ret.setComments(KSoap2Utils.getInt(response,"comments") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setCsstemplate(KSoap2Utils.getString(response,"csstemplate") );
      ret.setDefaultsort(KSoap2Utils.getInt(response,"defaultsort") );
      ret.setDefaultsortdir(KSoap2Utils.getInt(response,"defaultsortdir") );
      ret.setEditany(KSoap2Utils.getInt(response,"editany") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setIntro(KSoap2Utils.getString(response,"intro") );
      ret.setJstemplate(KSoap2Utils.getString(response,"jstemplate") );
      ret.setListtemplate(KSoap2Utils.getString(response,"listtemplate") );
      ret.setListtemplatefooter(KSoap2Utils.getString(response,"listtemplatefooter") );
      ret.setListtemplateheader(KSoap2Utils.getString(response,"listtemplateheader") );
      ret.setMaxentries(KSoap2Utils.getInt(response,"maxentries") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setNotification(KSoap2Utils.getInt(response,"notification") );
      ret.setRequiredentries(KSoap2Utils.getInt(response,"requiredentries") );
      ret.setRequiredentriestoview(KSoap2Utils.getInt(response,"requiredentriestoview") );
      ret.setRessarticles(KSoap2Utils.getInt(response,"ressarticles") );
      ret.setRsstemplate(KSoap2Utils.getString(response,"rsstemplate") );
      ret.setRsstitletemplate(KSoap2Utils.getString(response,"rsstitletemplate") );
      ret.setScale(KSoap2Utils.getInt(response,"scale") );
      ret.setSingletemplate(KSoap2Utils.getString(response,"singletemplate") );
      ret.setTimeavailablefrom(KSoap2Utils.getInt(response,"timeavailablefrom") );
      ret.setTimeavailableto(KSoap2Utils.getInt(response,"timeavailableto") );
      ret.setTimeviewfrom(KSoap2Utils.getInt(response,"timeviewfrom") );
      ret.setTimeviewto(KSoap2Utils.getInt(response,"timeviewto") );
      return ret;

    }


    /**
     * Gets the action value for this DatabaseDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this DatabaseDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the addtemplatee value for this DatabaseDatum.
     * 
     * @return addtemplatee
     */
    public java.lang.String getAddtemplatee() {
        return addtemplatee;
    }


    /**
     * Sets the addtemplatee value for this DatabaseDatum.
     * 
     * @param addtemplatee
     */
    public void setAddtemplatee(java.lang.String addtemplatee) {
        this.addtemplatee = addtemplatee;
       this.addProperty("addtemplatee",addtemplatee);
    }


    /**
     * Gets the approval value for this DatabaseDatum.
     * 
     * @return approval
     */
    public int getApproval() {
        return approval;
    }


    /**
     * Sets the approval value for this DatabaseDatum.
     * 
     * @param approval
     */
    public void setApproval(int approval) {
        this.approval = approval;
       this.addProperty("approval",approval);
    }


    /**
     * Gets the asearchtemplate value for this DatabaseDatum.
     * 
     * @return asearchtemplate
     */
    public java.lang.String getAsearchtemplate() {
        return asearchtemplate;
    }


    /**
     * Sets the asearchtemplate value for this DatabaseDatum.
     * 
     * @param asearchtemplate
     */
    public void setAsearchtemplate(java.lang.String asearchtemplate) {
        this.asearchtemplate = asearchtemplate;
       this.addProperty("asearchtemplate",asearchtemplate);
    }


    /**
     * Gets the assessed value for this DatabaseDatum.
     * 
     * @return assessed
     */
    public int getAssessed() {
        return assessed;
    }


    /**
     * Sets the assessed value for this DatabaseDatum.
     * 
     * @param assessed
     */
    public void setAssessed(int assessed) {
        this.assessed = assessed;
       this.addProperty("assessed",assessed);
    }


    /**
     * Gets the comments value for this DatabaseDatum.
     * 
     * @return comments
     */
    public int getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this DatabaseDatum.
     * 
     * @param comments
     */
    public void setComments(int comments) {
        this.comments = comments;
       this.addProperty("comments",comments);
    }


    /**
     * Gets the course value for this DatabaseDatum.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this DatabaseDatum.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the csstemplate value for this DatabaseDatum.
     * 
     * @return csstemplate
     */
    public java.lang.String getCsstemplate() {
        return csstemplate;
    }


    /**
     * Sets the csstemplate value for this DatabaseDatum.
     * 
     * @param csstemplate
     */
    public void setCsstemplate(java.lang.String csstemplate) {
        this.csstemplate = csstemplate;
       this.addProperty("csstemplate",csstemplate);
    }


    /**
     * Gets the defaultsort value for this DatabaseDatum.
     * 
     * @return defaultsort
     */
    public int getDefaultsort() {
        return defaultsort;
    }


    /**
     * Sets the defaultsort value for this DatabaseDatum.
     * 
     * @param defaultsort
     */
    public void setDefaultsort(int defaultsort) {
        this.defaultsort = defaultsort;
       this.addProperty("defaultsort",defaultsort);
    }


    /**
     * Gets the defaultsortdir value for this DatabaseDatum.
     * 
     * @return defaultsortdir
     */
    public int getDefaultsortdir() {
        return defaultsortdir;
    }


    /**
     * Sets the defaultsortdir value for this DatabaseDatum.
     * 
     * @param defaultsortdir
     */
    public void setDefaultsortdir(int defaultsortdir) {
        this.defaultsortdir = defaultsortdir;
       this.addProperty("defaultsortdir",defaultsortdir);
    }


    /**
     * Gets the editany value for this DatabaseDatum.
     * 
     * @return editany
     */
    public int getEditany() {
        return editany;
    }


    /**
     * Sets the editany value for this DatabaseDatum.
     * 
     * @param editany
     */
    public void setEditany(int editany) {
        this.editany = editany;
       this.addProperty("editany",editany);
    }


    /**
     * Gets the id value for this DatabaseDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DatabaseDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the intro value for this DatabaseDatum.
     * 
     * @return intro
     */
    public java.lang.String getIntro() {
        return intro;
    }


    /**
     * Sets the intro value for this DatabaseDatum.
     * 
     * @param intro
     */
    public void setIntro(java.lang.String intro) {
        this.intro = intro;
       this.addProperty("intro",intro);
    }


    /**
     * Gets the jstemplate value for this DatabaseDatum.
     * 
     * @return jstemplate
     */
    public java.lang.String getJstemplate() {
        return jstemplate;
    }


    /**
     * Sets the jstemplate value for this DatabaseDatum.
     * 
     * @param jstemplate
     */
    public void setJstemplate(java.lang.String jstemplate) {
        this.jstemplate = jstemplate;
       this.addProperty("jstemplate",jstemplate);
    }


    /**
     * Gets the listtemplate value for this DatabaseDatum.
     * 
     * @return listtemplate
     */
    public java.lang.String getListtemplate() {
        return listtemplate;
    }


    /**
     * Sets the listtemplate value for this DatabaseDatum.
     * 
     * @param listtemplate
     */
    public void setListtemplate(java.lang.String listtemplate) {
        this.listtemplate = listtemplate;
       this.addProperty("listtemplate",listtemplate);
    }


    /**
     * Gets the listtemplatefooter value for this DatabaseDatum.
     * 
     * @return listtemplatefooter
     */
    public java.lang.String getListtemplatefooter() {
        return listtemplatefooter;
    }


    /**
     * Sets the listtemplatefooter value for this DatabaseDatum.
     * 
     * @param listtemplatefooter
     */
    public void setListtemplatefooter(java.lang.String listtemplatefooter) {
        this.listtemplatefooter = listtemplatefooter;
       this.addProperty("listtemplatefooter",listtemplatefooter);
    }


    /**
     * Gets the listtemplateheader value for this DatabaseDatum.
     * 
     * @return listtemplateheader
     */
    public java.lang.String getListtemplateheader() {
        return listtemplateheader;
    }


    /**
     * Sets the listtemplateheader value for this DatabaseDatum.
     * 
     * @param listtemplateheader
     */
    public void setListtemplateheader(java.lang.String listtemplateheader) {
        this.listtemplateheader = listtemplateheader;
       this.addProperty("listtemplateheader",listtemplateheader);
    }


    /**
     * Gets the maxentries value for this DatabaseDatum.
     * 
     * @return maxentries
     */
    public int getMaxentries() {
        return maxentries;
    }


    /**
     * Sets the maxentries value for this DatabaseDatum.
     * 
     * @param maxentries
     */
    public void setMaxentries(int maxentries) {
        this.maxentries = maxentries;
       this.addProperty("maxentries",maxentries);
    }


    /**
     * Gets the name value for this DatabaseDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatabaseDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the notification value for this DatabaseDatum.
     * 
     * @return notification
     */
    public int getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this DatabaseDatum.
     * 
     * @param notification
     */
    public void setNotification(int notification) {
        this.notification = notification;
       this.addProperty("notification",notification);
    }


    /**
     * Gets the requiredentries value for this DatabaseDatum.
     * 
     * @return requiredentries
     */
    public int getRequiredentries() {
        return requiredentries;
    }


    /**
     * Sets the requiredentries value for this DatabaseDatum.
     * 
     * @param requiredentries
     */
    public void setRequiredentries(int requiredentries) {
        this.requiredentries = requiredentries;
       this.addProperty("requiredentries",requiredentries);
    }


    /**
     * Gets the requiredentriestoview value for this DatabaseDatum.
     * 
     * @return requiredentriestoview
     */
    public int getRequiredentriestoview() {
        return requiredentriestoview;
    }


    /**
     * Sets the requiredentriestoview value for this DatabaseDatum.
     * 
     * @param requiredentriestoview
     */
    public void setRequiredentriestoview(int requiredentriestoview) {
        this.requiredentriestoview = requiredentriestoview;
       this.addProperty("requiredentriestoview",requiredentriestoview);
    }


    /**
     * Gets the ressarticles value for this DatabaseDatum.
     * 
     * @return ressarticles
     */
    public int getRessarticles() {
        return ressarticles;
    }


    /**
     * Sets the ressarticles value for this DatabaseDatum.
     * 
     * @param ressarticles
     */
    public void setRessarticles(int ressarticles) {
        this.ressarticles = ressarticles;
       this.addProperty("ressarticles",ressarticles);
    }


    /**
     * Gets the rsstemplate value for this DatabaseDatum.
     * 
     * @return rsstemplate
     */
    public java.lang.String getRsstemplate() {
        return rsstemplate;
    }


    /**
     * Sets the rsstemplate value for this DatabaseDatum.
     * 
     * @param rsstemplate
     */
    public void setRsstemplate(java.lang.String rsstemplate) {
        this.rsstemplate = rsstemplate;
       this.addProperty("rsstemplate",rsstemplate);
    }


    /**
     * Gets the rsstitletemplate value for this DatabaseDatum.
     * 
     * @return rsstitletemplate
     */
    public java.lang.String getRsstitletemplate() {
        return rsstitletemplate;
    }


    /**
     * Sets the rsstitletemplate value for this DatabaseDatum.
     * 
     * @param rsstitletemplate
     */
    public void setRsstitletemplate(java.lang.String rsstitletemplate) {
        this.rsstitletemplate = rsstitletemplate;
       this.addProperty("rsstitletemplate",rsstitletemplate);
    }


    /**
     * Gets the scale value for this DatabaseDatum.
     * 
     * @return scale
     */
    public int getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this DatabaseDatum.
     * 
     * @param scale
     */
    public void setScale(int scale) {
        this.scale = scale;
       this.addProperty("scale",scale);
    }


    /**
     * Gets the singletemplate value for this DatabaseDatum.
     * 
     * @return singletemplate
     */
    public java.lang.String getSingletemplate() {
        return singletemplate;
    }


    /**
     * Sets the singletemplate value for this DatabaseDatum.
     * 
     * @param singletemplate
     */
    public void setSingletemplate(java.lang.String singletemplate) {
        this.singletemplate = singletemplate;
       this.addProperty("singletemplate",singletemplate);
    }


    /**
     * Gets the timeavailablefrom value for this DatabaseDatum.
     * 
     * @return timeavailablefrom
     */
    public int getTimeavailablefrom() {
        return timeavailablefrom;
    }


    /**
     * Sets the timeavailablefrom value for this DatabaseDatum.
     * 
     * @param timeavailablefrom
     */
    public void setTimeavailablefrom(int timeavailablefrom) {
        this.timeavailablefrom = timeavailablefrom;
       this.addProperty("timeavailablefrom",timeavailablefrom);
    }


    /**
     * Gets the timeavailableto value for this DatabaseDatum.
     * 
     * @return timeavailableto
     */
    public int getTimeavailableto() {
        return timeavailableto;
    }


    /**
     * Sets the timeavailableto value for this DatabaseDatum.
     * 
     * @param timeavailableto
     */
    public void setTimeavailableto(int timeavailableto) {
        this.timeavailableto = timeavailableto;
       this.addProperty("timeavailableto",timeavailableto);
    }


    /**
     * Gets the timeviewfrom value for this DatabaseDatum.
     * 
     * @return timeviewfrom
     */
    public int getTimeviewfrom() {
        return timeviewfrom;
    }


    /**
     * Sets the timeviewfrom value for this DatabaseDatum.
     * 
     * @param timeviewfrom
     */
    public void setTimeviewfrom(int timeviewfrom) {
        this.timeviewfrom = timeviewfrom;
       this.addProperty("timeviewfrom",timeviewfrom);
    }


    /**
     * Gets the timeviewto value for this DatabaseDatum.
     * 
     * @return timeviewto
     */
    public int getTimeviewto() {
        return timeviewto;
    }


    /**
     * Sets the timeviewto value for this DatabaseDatum.
     * 
     * @param timeviewto
     */
    public void setTimeviewto(int timeviewto) {
        this.timeviewto = timeviewto;
       this.addProperty("timeviewto",timeviewto);
    }

}
