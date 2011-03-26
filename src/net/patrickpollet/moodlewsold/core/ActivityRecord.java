/**
 * ActivityRecord.java
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

public class ActivityRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int time;

    private int userid;

    private java.lang.String ip;

    private int course;

    private int module;

    private int cmid;

    private java.lang.String action;

    private java.lang.String url;

    private java.lang.String info;

    private java.lang.String DATE;

    private java.lang.String auth;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String email;

    private int firstaccess;

    private int lastaccess;

    private int lastlogin;

    private int currentlogin;

    private java.lang.String DLA;

    private java.lang.String DFA;

    private java.lang.String DLL;

    private java.lang.String DCL;

    public ActivityRecord(String nameSpace) {
        super(nameSpace,"ActivityRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ActivityRecord ret = new ActivityRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setTime(KSoap2Utils.getInt(response,"time") );
      ret.setUserid(KSoap2Utils.getInt(response,"userid") );
      ret.setIp(KSoap2Utils.getString(response,"ip") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setModule(KSoap2Utils.getInt(response,"module") );
      ret.setCmid(KSoap2Utils.getInt(response,"cmid") );
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setUrl(KSoap2Utils.getString(response,"url") );
      ret.setInfo(KSoap2Utils.getString(response,"info") );
      ret.setDATE(KSoap2Utils.getString(response,"DATE") );
      ret.setAuth(KSoap2Utils.getString(response,"auth") );
      ret.setFirstname(KSoap2Utils.getString(response,"firstname") );
      ret.setLastname(KSoap2Utils.getString(response,"lastname") );
      ret.setEmail(KSoap2Utils.getString(response,"email") );
      ret.setFirstaccess(KSoap2Utils.getInt(response,"firstaccess") );
      ret.setLastaccess(KSoap2Utils.getInt(response,"lastaccess") );
      ret.setLastlogin(KSoap2Utils.getInt(response,"lastlogin") );
      ret.setCurrentlogin(KSoap2Utils.getInt(response,"currentlogin") );
      ret.setDLA(KSoap2Utils.getString(response,"DLA") );
      ret.setDFA(KSoap2Utils.getString(response,"DFA") );
      ret.setDLL(KSoap2Utils.getString(response,"DLL") );
      ret.setDCL(KSoap2Utils.getString(response,"DCL") );
      return ret;

    }


    /**
     * Gets the error value for this ActivityRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ActivityRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this ActivityRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ActivityRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the time value for this ActivityRecord.
     * 
     * @return time
     */
    public int getTime() {
        return time;
    }


    /**
     * Sets the time value for this ActivityRecord.
     * 
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
       this.addProperty("time",time);
    }


    /**
     * Gets the userid value for this ActivityRecord.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this ActivityRecord.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the ip value for this ActivityRecord.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this ActivityRecord.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
       this.addProperty("ip",ip);
    }


    /**
     * Gets the course value for this ActivityRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ActivityRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the module value for this ActivityRecord.
     * 
     * @return module
     */
    public int getModule() {
        return module;
    }


    /**
     * Sets the module value for this ActivityRecord.
     * 
     * @param module
     */
    public void setModule(int module) {
        this.module = module;
       this.addProperty("module",module);
    }


    /**
     * Gets the cmid value for this ActivityRecord.
     * 
     * @return cmid
     */
    public int getCmid() {
        return cmid;
    }


    /**
     * Sets the cmid value for this ActivityRecord.
     * 
     * @param cmid
     */
    public void setCmid(int cmid) {
        this.cmid = cmid;
       this.addProperty("cmid",cmid);
    }


    /**
     * Gets the action value for this ActivityRecord.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ActivityRecord.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the url value for this ActivityRecord.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ActivityRecord.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
       this.addProperty("url",url);
    }


    /**
     * Gets the info value for this ActivityRecord.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ActivityRecord.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
       this.addProperty("info",info);
    }


    /**
     * Gets the DATE value for this ActivityRecord.
     * 
     * @return DATE
     */
    public java.lang.String getDATE() {
        return DATE;
    }


    /**
     * Sets the DATE value for this ActivityRecord.
     * 
     * @param DATE
     */
    public void setDATE(java.lang.String DATE) {
        this.DATE = DATE;
       this.addProperty("DATE",DATE);
    }


    /**
     * Gets the auth value for this ActivityRecord.
     * 
     * @return auth
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this ActivityRecord.
     * 
     * @param auth
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
       this.addProperty("auth",auth);
    }


    /**
     * Gets the firstname value for this ActivityRecord.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this ActivityRecord.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
       this.addProperty("firstname",firstname);
    }


    /**
     * Gets the lastname value for this ActivityRecord.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this ActivityRecord.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
       this.addProperty("lastname",lastname);
    }


    /**
     * Gets the email value for this ActivityRecord.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ActivityRecord.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
       this.addProperty("email",email);
    }


    /**
     * Gets the firstaccess value for this ActivityRecord.
     * 
     * @return firstaccess
     */
    public int getFirstaccess() {
        return firstaccess;
    }


    /**
     * Sets the firstaccess value for this ActivityRecord.
     * 
     * @param firstaccess
     */
    public void setFirstaccess(int firstaccess) {
        this.firstaccess = firstaccess;
       this.addProperty("firstaccess",firstaccess);
    }


    /**
     * Gets the lastaccess value for this ActivityRecord.
     * 
     * @return lastaccess
     */
    public int getLastaccess() {
        return lastaccess;
    }


    /**
     * Sets the lastaccess value for this ActivityRecord.
     * 
     * @param lastaccess
     */
    public void setLastaccess(int lastaccess) {
        this.lastaccess = lastaccess;
       this.addProperty("lastaccess",lastaccess);
    }


    /**
     * Gets the lastlogin value for this ActivityRecord.
     * 
     * @return lastlogin
     */
    public int getLastlogin() {
        return lastlogin;
    }


    /**
     * Sets the lastlogin value for this ActivityRecord.
     * 
     * @param lastlogin
     */
    public void setLastlogin(int lastlogin) {
        this.lastlogin = lastlogin;
       this.addProperty("lastlogin",lastlogin);
    }


    /**
     * Gets the currentlogin value for this ActivityRecord.
     * 
     * @return currentlogin
     */
    public int getCurrentlogin() {
        return currentlogin;
    }


    /**
     * Sets the currentlogin value for this ActivityRecord.
     * 
     * @param currentlogin
     */
    public void setCurrentlogin(int currentlogin) {
        this.currentlogin = currentlogin;
       this.addProperty("currentlogin",currentlogin);
    }


    /**
     * Gets the DLA value for this ActivityRecord.
     * 
     * @return DLA
     */
    public java.lang.String getDLA() {
        return DLA;
    }


    /**
     * Sets the DLA value for this ActivityRecord.
     * 
     * @param DLA
     */
    public void setDLA(java.lang.String DLA) {
        this.DLA = DLA;
       this.addProperty("DLA",DLA);
    }


    /**
     * Gets the DFA value for this ActivityRecord.
     * 
     * @return DFA
     */
    public java.lang.String getDFA() {
        return DFA;
    }


    /**
     * Sets the DFA value for this ActivityRecord.
     * 
     * @param DFA
     */
    public void setDFA(java.lang.String DFA) {
        this.DFA = DFA;
       this.addProperty("DFA",DFA);
    }


    /**
     * Gets the DLL value for this ActivityRecord.
     * 
     * @return DLL
     */
    public java.lang.String getDLL() {
        return DLL;
    }


    /**
     * Sets the DLL value for this ActivityRecord.
     * 
     * @param DLL
     */
    public void setDLL(java.lang.String DLL) {
        this.DLL = DLL;
       this.addProperty("DLL",DLL);
    }


    /**
     * Gets the DCL value for this ActivityRecord.
     * 
     * @return DCL
     */
    public java.lang.String getDCL() {
        return DCL;
    }


    /**
     * Sets the DCL value for this ActivityRecord.
     * 
     * @param DCL
     */
    public void setDCL(java.lang.String DCL) {
        this.DCL = DCL;
       this.addProperty("DCL",DCL);
    }

}
