/**
 * ForumDatum.java
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

public class ForumDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int assessed;

    private int assesstimefinish;

    private int assesstimestart;

    private int blockafter;

    private int blockperiod;

    private int course;

    private int forcesubscribe;

    private int id;

    private java.lang.String intro;

    private int maxbytes;

    private java.lang.String name;

    private int rssarticles;

    private int rsstype;

    private int scale;

    private int timemodified;

    private int trackingtype;

    private java.lang.String type;

    private int warnafter;

    public ForumDatum(String nameSpace) {
        super(nameSpace,"ForumDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ForumDatum ret = new ForumDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setAssessed(KSoap2Utils.getInt(response,"assessed") );
      ret.setAssesstimefinish(KSoap2Utils.getInt(response,"assesstimefinish") );
      ret.setAssesstimestart(KSoap2Utils.getInt(response,"assesstimestart") );
      ret.setBlockafter(KSoap2Utils.getInt(response,"blockafter") );
      ret.setBlockperiod(KSoap2Utils.getInt(response,"blockperiod") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setForcesubscribe(KSoap2Utils.getInt(response,"forcesubscribe") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setIntro(KSoap2Utils.getString(response,"intro") );
      ret.setMaxbytes(KSoap2Utils.getInt(response,"maxbytes") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setRssarticles(KSoap2Utils.getInt(response,"rssarticles") );
      ret.setRsstype(KSoap2Utils.getInt(response,"rsstype") );
      ret.setScale(KSoap2Utils.getInt(response,"scale") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setTrackingtype(KSoap2Utils.getInt(response,"trackingtype") );
      ret.setType(KSoap2Utils.getString(response,"type") );
      ret.setWarnafter(KSoap2Utils.getInt(response,"warnafter") );
      return ret;

    }


    /**
     * Gets the action value for this ForumDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ForumDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the assessed value for this ForumDatum.
     * 
     * @return assessed
     */
    public int getAssessed() {
        return assessed;
    }


    /**
     * Sets the assessed value for this ForumDatum.
     * 
     * @param assessed
     */
    public void setAssessed(int assessed) {
        this.assessed = assessed;
       this.addProperty("assessed",assessed);
    }


    /**
     * Gets the assesstimefinish value for this ForumDatum.
     * 
     * @return assesstimefinish
     */
    public int getAssesstimefinish() {
        return assesstimefinish;
    }


    /**
     * Sets the assesstimefinish value for this ForumDatum.
     * 
     * @param assesstimefinish
     */
    public void setAssesstimefinish(int assesstimefinish) {
        this.assesstimefinish = assesstimefinish;
       this.addProperty("assesstimefinish",assesstimefinish);
    }


    /**
     * Gets the assesstimestart value for this ForumDatum.
     * 
     * @return assesstimestart
     */
    public int getAssesstimestart() {
        return assesstimestart;
    }


    /**
     * Sets the assesstimestart value for this ForumDatum.
     * 
     * @param assesstimestart
     */
    public void setAssesstimestart(int assesstimestart) {
        this.assesstimestart = assesstimestart;
       this.addProperty("assesstimestart",assesstimestart);
    }


    /**
     * Gets the blockafter value for this ForumDatum.
     * 
     * @return blockafter
     */
    public int getBlockafter() {
        return blockafter;
    }


    /**
     * Sets the blockafter value for this ForumDatum.
     * 
     * @param blockafter
     */
    public void setBlockafter(int blockafter) {
        this.blockafter = blockafter;
       this.addProperty("blockafter",blockafter);
    }


    /**
     * Gets the blockperiod value for this ForumDatum.
     * 
     * @return blockperiod
     */
    public int getBlockperiod() {
        return blockperiod;
    }


    /**
     * Sets the blockperiod value for this ForumDatum.
     * 
     * @param blockperiod
     */
    public void setBlockperiod(int blockperiod) {
        this.blockperiod = blockperiod;
       this.addProperty("blockperiod",blockperiod);
    }


    /**
     * Gets the course value for this ForumDatum.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ForumDatum.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the forcesubscribe value for this ForumDatum.
     * 
     * @return forcesubscribe
     */
    public int getForcesubscribe() {
        return forcesubscribe;
    }


    /**
     * Sets the forcesubscribe value for this ForumDatum.
     * 
     * @param forcesubscribe
     */
    public void setForcesubscribe(int forcesubscribe) {
        this.forcesubscribe = forcesubscribe;
       this.addProperty("forcesubscribe",forcesubscribe);
    }


    /**
     * Gets the id value for this ForumDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ForumDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the intro value for this ForumDatum.
     * 
     * @return intro
     */
    public java.lang.String getIntro() {
        return intro;
    }


    /**
     * Sets the intro value for this ForumDatum.
     * 
     * @param intro
     */
    public void setIntro(java.lang.String intro) {
        this.intro = intro;
       this.addProperty("intro",intro);
    }


    /**
     * Gets the maxbytes value for this ForumDatum.
     * 
     * @return maxbytes
     */
    public int getMaxbytes() {
        return maxbytes;
    }


    /**
     * Sets the maxbytes value for this ForumDatum.
     * 
     * @param maxbytes
     */
    public void setMaxbytes(int maxbytes) {
        this.maxbytes = maxbytes;
       this.addProperty("maxbytes",maxbytes);
    }


    /**
     * Gets the name value for this ForumDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForumDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the rssarticles value for this ForumDatum.
     * 
     * @return rssarticles
     */
    public int getRssarticles() {
        return rssarticles;
    }


    /**
     * Sets the rssarticles value for this ForumDatum.
     * 
     * @param rssarticles
     */
    public void setRssarticles(int rssarticles) {
        this.rssarticles = rssarticles;
       this.addProperty("rssarticles",rssarticles);
    }


    /**
     * Gets the rsstype value for this ForumDatum.
     * 
     * @return rsstype
     */
    public int getRsstype() {
        return rsstype;
    }


    /**
     * Sets the rsstype value for this ForumDatum.
     * 
     * @param rsstype
     */
    public void setRsstype(int rsstype) {
        this.rsstype = rsstype;
       this.addProperty("rsstype",rsstype);
    }


    /**
     * Gets the scale value for this ForumDatum.
     * 
     * @return scale
     */
    public int getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this ForumDatum.
     * 
     * @param scale
     */
    public void setScale(int scale) {
        this.scale = scale;
       this.addProperty("scale",scale);
    }


    /**
     * Gets the timemodified value for this ForumDatum.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this ForumDatum.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the trackingtype value for this ForumDatum.
     * 
     * @return trackingtype
     */
    public int getTrackingtype() {
        return trackingtype;
    }


    /**
     * Sets the trackingtype value for this ForumDatum.
     * 
     * @param trackingtype
     */
    public void setTrackingtype(int trackingtype) {
        this.trackingtype = trackingtype;
       this.addProperty("trackingtype",trackingtype);
    }


    /**
     * Gets the type value for this ForumDatum.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ForumDatum.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
       this.addProperty("type",type);
    }


    /**
     * Gets the warnafter value for this ForumDatum.
     * 
     * @return warnafter
     */
    public int getWarnafter() {
        return warnafter;
    }


    /**
     * Sets the warnafter value for this ForumDatum.
     * 
     * @param warnafter
     */
    public void setWarnafter(int warnafter) {
        this.warnafter = warnafter;
       this.addProperty("warnafter",warnafter);
    }

}
