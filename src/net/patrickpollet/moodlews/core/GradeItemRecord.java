/**
 * GradeItemRecord.java
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

public class GradeItemRecord  extends SoapObject  implements Soapeabilisable{
    private int dategraded;

    private int datesubmitted;

    private java.lang.String error;

    private int feedback_format;

    private float grade;

    private java.lang.String str_feedback;

    private java.lang.String str_grade;

    private java.lang.String str_long_grade;

    private java.lang.String userid;

    private java.lang.String useridnumber;

    private int usermodified;

    public GradeItemRecord(String nameSpace) {
        super(nameSpace,"GradeItemRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GradeItemRecord ret = new GradeItemRecord(this.namespace);
      ret.setDategraded(KSoap2Utils.getInt(response,"dategraded") );
      ret.setDatesubmitted(KSoap2Utils.getInt(response,"datesubmitted") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setFeedback_format(KSoap2Utils.getInt(response,"feedback_format") );
      ret.setGrade(KSoap2Utils.getFloat(response,"grade") );
      ret.setStr_feedback(KSoap2Utils.getString(response,"str_feedback") );
      ret.setStr_grade(KSoap2Utils.getString(response,"str_grade") );
      ret.setStr_long_grade(KSoap2Utils.getString(response,"str_long_grade") );
      ret.setUserid(KSoap2Utils.getString(response,"userid") );
      ret.setUseridnumber(KSoap2Utils.getString(response,"useridnumber") );
      ret.setUsermodified(KSoap2Utils.getInt(response,"usermodified") );
      return ret;

    }


    /**
     * Gets the dategraded value for this GradeItemRecord.
     * 
     * @return dategraded
     */
    public int getDategraded() {
        return dategraded;
    }


    /**
     * Sets the dategraded value for this GradeItemRecord.
     * 
     * @param dategraded
     */
    public void setDategraded(int dategraded) {
        this.dategraded = dategraded;
       this.addProperty("dategraded",dategraded);
    }


    /**
     * Gets the datesubmitted value for this GradeItemRecord.
     * 
     * @return datesubmitted
     */
    public int getDatesubmitted() {
        return datesubmitted;
    }


    /**
     * Sets the datesubmitted value for this GradeItemRecord.
     * 
     * @param datesubmitted
     */
    public void setDatesubmitted(int datesubmitted) {
        this.datesubmitted = datesubmitted;
       this.addProperty("datesubmitted",datesubmitted);
    }


    /**
     * Gets the error value for this GradeItemRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this GradeItemRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the feedback_format value for this GradeItemRecord.
     * 
     * @return feedback_format
     */
    public int getFeedback_format() {
        return feedback_format;
    }


    /**
     * Sets the feedback_format value for this GradeItemRecord.
     * 
     * @param feedback_format
     */
    public void setFeedback_format(int feedback_format) {
        this.feedback_format = feedback_format;
       this.addProperty("feedback_format",feedback_format);
    }


    /**
     * Gets the grade value for this GradeItemRecord.
     * 
     * @return grade
     */
    public float getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this GradeItemRecord.
     * 
     * @param grade
     */
    public void setGrade(float grade) {
        this.grade = grade;
       this.addProperty("grade",grade);
    }


    /**
     * Gets the str_feedback value for this GradeItemRecord.
     * 
     * @return str_feedback
     */
    public java.lang.String getStr_feedback() {
        return str_feedback;
    }


    /**
     * Sets the str_feedback value for this GradeItemRecord.
     * 
     * @param str_feedback
     */
    public void setStr_feedback(java.lang.String str_feedback) {
        this.str_feedback = str_feedback;
       this.addProperty("str_feedback",str_feedback);
    }


    /**
     * Gets the str_grade value for this GradeItemRecord.
     * 
     * @return str_grade
     */
    public java.lang.String getStr_grade() {
        return str_grade;
    }


    /**
     * Sets the str_grade value for this GradeItemRecord.
     * 
     * @param str_grade
     */
    public void setStr_grade(java.lang.String str_grade) {
        this.str_grade = str_grade;
       this.addProperty("str_grade",str_grade);
    }


    /**
     * Gets the str_long_grade value for this GradeItemRecord.
     * 
     * @return str_long_grade
     */
    public java.lang.String getStr_long_grade() {
        return str_long_grade;
    }


    /**
     * Sets the str_long_grade value for this GradeItemRecord.
     * 
     * @param str_long_grade
     */
    public void setStr_long_grade(java.lang.String str_long_grade) {
        this.str_long_grade = str_long_grade;
       this.addProperty("str_long_grade",str_long_grade);
    }


    /**
     * Gets the userid value for this GradeItemRecord.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this GradeItemRecord.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the useridnumber value for this GradeItemRecord.
     * 
     * @return useridnumber
     */
    public java.lang.String getUseridnumber() {
        return useridnumber;
    }


    /**
     * Sets the useridnumber value for this GradeItemRecord.
     * 
     * @param useridnumber
     */
    public void setUseridnumber(java.lang.String useridnumber) {
        this.useridnumber = useridnumber;
       this.addProperty("useridnumber",useridnumber);
    }


    /**
     * Gets the usermodified value for this GradeItemRecord.
     * 
     * @return usermodified
     */
    public int getUsermodified() {
        return usermodified;
    }


    /**
     * Sets the usermodified value for this GradeItemRecord.
     * 
     * @param usermodified
     */
    public void setUsermodified(int usermodified) {
        this.usermodified = usermodified;
       this.addProperty("usermodified",usermodified);
    }

}
