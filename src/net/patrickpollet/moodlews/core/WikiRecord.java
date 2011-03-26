/**
 * WikiRecord.java
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

public class WikiRecord  extends SoapObject  implements Soapeabilisable{
    private int course;

    private int disablecamelcase;

    private java.lang.String error;

    private int ewikiacceptbinary;

    private int ewikiprinttitle;

    private int htmlmode;

    private int id;

    private java.lang.String initialcontent;

    private java.lang.String name;

    private java.lang.String pagename;

    private int removepages;

    private int revertchanges;

    private int setpageflags;

    private int strippages;

    private java.lang.String summary;

    private int timemodified;

    private java.lang.String wtype;

    public WikiRecord(String nameSpace) {
        super(nameSpace,"WikiRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      WikiRecord ret = new WikiRecord(this.namespace);
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setDisablecamelcase(KSoap2Utils.getInt(response,"disablecamelcase") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setEwikiacceptbinary(KSoap2Utils.getInt(response,"ewikiacceptbinary") );
      ret.setEwikiprinttitle(KSoap2Utils.getInt(response,"ewikiprinttitle") );
      ret.setHtmlmode(KSoap2Utils.getInt(response,"htmlmode") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setInitialcontent(KSoap2Utils.getString(response,"initialcontent") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setPagename(KSoap2Utils.getString(response,"pagename") );
      ret.setRemovepages(KSoap2Utils.getInt(response,"removepages") );
      ret.setRevertchanges(KSoap2Utils.getInt(response,"revertchanges") );
      ret.setSetpageflags(KSoap2Utils.getInt(response,"setpageflags") );
      ret.setStrippages(KSoap2Utils.getInt(response,"strippages") );
      ret.setSummary(KSoap2Utils.getString(response,"summary") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setWtype(KSoap2Utils.getString(response,"wtype") );
      return ret;

    }


    /**
     * Gets the course value for this WikiRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this WikiRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the disablecamelcase value for this WikiRecord.
     * 
     * @return disablecamelcase
     */
    public int getDisablecamelcase() {
        return disablecamelcase;
    }


    /**
     * Sets the disablecamelcase value for this WikiRecord.
     * 
     * @param disablecamelcase
     */
    public void setDisablecamelcase(int disablecamelcase) {
        this.disablecamelcase = disablecamelcase;
       this.addProperty("disablecamelcase",disablecamelcase);
    }


    /**
     * Gets the error value for this WikiRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this WikiRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the ewikiacceptbinary value for this WikiRecord.
     * 
     * @return ewikiacceptbinary
     */
    public int getEwikiacceptbinary() {
        return ewikiacceptbinary;
    }


    /**
     * Sets the ewikiacceptbinary value for this WikiRecord.
     * 
     * @param ewikiacceptbinary
     */
    public void setEwikiacceptbinary(int ewikiacceptbinary) {
        this.ewikiacceptbinary = ewikiacceptbinary;
       this.addProperty("ewikiacceptbinary",ewikiacceptbinary);
    }


    /**
     * Gets the ewikiprinttitle value for this WikiRecord.
     * 
     * @return ewikiprinttitle
     */
    public int getEwikiprinttitle() {
        return ewikiprinttitle;
    }


    /**
     * Sets the ewikiprinttitle value for this WikiRecord.
     * 
     * @param ewikiprinttitle
     */
    public void setEwikiprinttitle(int ewikiprinttitle) {
        this.ewikiprinttitle = ewikiprinttitle;
       this.addProperty("ewikiprinttitle",ewikiprinttitle);
    }


    /**
     * Gets the htmlmode value for this WikiRecord.
     * 
     * @return htmlmode
     */
    public int getHtmlmode() {
        return htmlmode;
    }


    /**
     * Sets the htmlmode value for this WikiRecord.
     * 
     * @param htmlmode
     */
    public void setHtmlmode(int htmlmode) {
        this.htmlmode = htmlmode;
       this.addProperty("htmlmode",htmlmode);
    }


    /**
     * Gets the id value for this WikiRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this WikiRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the initialcontent value for this WikiRecord.
     * 
     * @return initialcontent
     */
    public java.lang.String getInitialcontent() {
        return initialcontent;
    }


    /**
     * Sets the initialcontent value for this WikiRecord.
     * 
     * @param initialcontent
     */
    public void setInitialcontent(java.lang.String initialcontent) {
        this.initialcontent = initialcontent;
       this.addProperty("initialcontent",initialcontent);
    }


    /**
     * Gets the name value for this WikiRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WikiRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the pagename value for this WikiRecord.
     * 
     * @return pagename
     */
    public java.lang.String getPagename() {
        return pagename;
    }


    /**
     * Sets the pagename value for this WikiRecord.
     * 
     * @param pagename
     */
    public void setPagename(java.lang.String pagename) {
        this.pagename = pagename;
       this.addProperty("pagename",pagename);
    }


    /**
     * Gets the removepages value for this WikiRecord.
     * 
     * @return removepages
     */
    public int getRemovepages() {
        return removepages;
    }


    /**
     * Sets the removepages value for this WikiRecord.
     * 
     * @param removepages
     */
    public void setRemovepages(int removepages) {
        this.removepages = removepages;
       this.addProperty("removepages",removepages);
    }


    /**
     * Gets the revertchanges value for this WikiRecord.
     * 
     * @return revertchanges
     */
    public int getRevertchanges() {
        return revertchanges;
    }


    /**
     * Sets the revertchanges value for this WikiRecord.
     * 
     * @param revertchanges
     */
    public void setRevertchanges(int revertchanges) {
        this.revertchanges = revertchanges;
       this.addProperty("revertchanges",revertchanges);
    }


    /**
     * Gets the setpageflags value for this WikiRecord.
     * 
     * @return setpageflags
     */
    public int getSetpageflags() {
        return setpageflags;
    }


    /**
     * Sets the setpageflags value for this WikiRecord.
     * 
     * @param setpageflags
     */
    public void setSetpageflags(int setpageflags) {
        this.setpageflags = setpageflags;
       this.addProperty("setpageflags",setpageflags);
    }


    /**
     * Gets the strippages value for this WikiRecord.
     * 
     * @return strippages
     */
    public int getStrippages() {
        return strippages;
    }


    /**
     * Sets the strippages value for this WikiRecord.
     * 
     * @param strippages
     */
    public void setStrippages(int strippages) {
        this.strippages = strippages;
       this.addProperty("strippages",strippages);
    }


    /**
     * Gets the summary value for this WikiRecord.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this WikiRecord.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
       this.addProperty("summary",summary);
    }


    /**
     * Gets the timemodified value for this WikiRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this WikiRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the wtype value for this WikiRecord.
     * 
     * @return wtype
     */
    public java.lang.String getWtype() {
        return wtype;
    }


    /**
     * Sets the wtype value for this WikiRecord.
     * 
     * @param wtype
     */
    public void setWtype(java.lang.String wtype) {
        this.wtype = wtype;
       this.addProperty("wtype",wtype);
    }

}
