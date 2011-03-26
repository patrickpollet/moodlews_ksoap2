/**
 * EnrolRecord.java
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

public class EnrolRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private java.lang.String userid;

    private java.lang.String course;

    private int timestart;

    private int timeend;

    private int timeaccess;

    private java.lang.String enrol;

    public EnrolRecord(String nameSpace) {
        super(nameSpace,"EnrolRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EnrolRecord ret = new EnrolRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setUserid(KSoap2Utils.getString(response,"userid") );
      ret.setCourse(KSoap2Utils.getString(response,"course") );
      ret.setTimestart(KSoap2Utils.getInt(response,"timestart") );
      ret.setTimeend(KSoap2Utils.getInt(response,"timeend") );
      ret.setTimeaccess(KSoap2Utils.getInt(response,"timeaccess") );
      ret.setEnrol(KSoap2Utils.getString(response,"enrol") );
      return ret;

    }


    /**
     * Gets the error value for this EnrolRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this EnrolRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the userid value for this EnrolRecord.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this EnrolRecord.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the course value for this EnrolRecord.
     * 
     * @return course
     */
    public java.lang.String getCourse() {
        return course;
    }


    /**
     * Sets the course value for this EnrolRecord.
     * 
     * @param course
     */
    public void setCourse(java.lang.String course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the timestart value for this EnrolRecord.
     * 
     * @return timestart
     */
    public int getTimestart() {
        return timestart;
    }


    /**
     * Sets the timestart value for this EnrolRecord.
     * 
     * @param timestart
     */
    public void setTimestart(int timestart) {
        this.timestart = timestart;
       this.addProperty("timestart",timestart);
    }


    /**
     * Gets the timeend value for this EnrolRecord.
     * 
     * @return timeend
     */
    public int getTimeend() {
        return timeend;
    }


    /**
     * Sets the timeend value for this EnrolRecord.
     * 
     * @param timeend
     */
    public void setTimeend(int timeend) {
        this.timeend = timeend;
       this.addProperty("timeend",timeend);
    }


    /**
     * Gets the timeaccess value for this EnrolRecord.
     * 
     * @return timeaccess
     */
    public int getTimeaccess() {
        return timeaccess;
    }


    /**
     * Sets the timeaccess value for this EnrolRecord.
     * 
     * @param timeaccess
     */
    public void setTimeaccess(int timeaccess) {
        this.timeaccess = timeaccess;
       this.addProperty("timeaccess",timeaccess);
    }


    /**
     * Gets the enrol value for this EnrolRecord.
     * 
     * @return enrol
     */
    public java.lang.String getEnrol() {
        return enrol;
    }


    /**
     * Sets the enrol value for this EnrolRecord.
     * 
     * @param enrol
     */
    public void setEnrol(java.lang.String enrol) {
        this.enrol = enrol;
       this.addProperty("enrol",enrol);
    }

}
