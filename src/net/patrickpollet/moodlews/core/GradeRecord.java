/**
 * GradeRecord.java
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

public class GradeRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private java.lang.String feedback;

    private float grade;

    private java.lang.String itemid;

    private java.lang.String str_grade;

    public GradeRecord(String nameSpace) {
        super(nameSpace,"GradeRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GradeRecord ret = new GradeRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setFeedback(KSoap2Utils.getString(response,"feedback") );
      ret.setGrade(KSoap2Utils.getFloat(response,"grade") );
      ret.setItemid(KSoap2Utils.getString(response,"itemid") );
      ret.setStr_grade(KSoap2Utils.getString(response,"str_grade") );
      return ret;

    }


    /**
     * Gets the error value for this GradeRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this GradeRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the feedback value for this GradeRecord.
     * 
     * @return feedback
     */
    public java.lang.String getFeedback() {
        return feedback;
    }


    /**
     * Sets the feedback value for this GradeRecord.
     * 
     * @param feedback
     */
    public void setFeedback(java.lang.String feedback) {
        this.feedback = feedback;
       this.addProperty("feedback",feedback);
    }


    /**
     * Gets the grade value for this GradeRecord.
     * 
     * @return grade
     */
    public float getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this GradeRecord.
     * 
     * @param grade
     */
    public void setGrade(float grade) {
        this.grade = grade;
       this.addProperty("grade",grade);
    }


    /**
     * Gets the itemid value for this GradeRecord.
     * 
     * @return itemid
     */
    public java.lang.String getItemid() {
        return itemid;
    }


    /**
     * Sets the itemid value for this GradeRecord.
     * 
     * @param itemid
     */
    public void setItemid(java.lang.String itemid) {
        this.itemid = itemid;
       this.addProperty("itemid",itemid);
    }


    /**
     * Gets the str_grade value for this GradeRecord.
     * 
     * @return str_grade
     */
    public java.lang.String getStr_grade() {
        return str_grade;
    }


    /**
     * Sets the str_grade value for this GradeRecord.
     * 
     * @param str_grade
     */
    public void setStr_grade(java.lang.String str_grade) {
        this.str_grade = str_grade;
       this.addProperty("str_grade",str_grade);
    }

}
