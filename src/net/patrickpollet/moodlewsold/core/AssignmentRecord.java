/**
 * AssignmentRecord.java
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

public class AssignmentRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int course;

    private java.lang.String name;

    private java.lang.String description;

    private int format;

    private java.lang.String assignmenttype;

    private int resubmit;

    private int preventlate;

    private int emailteachers;

    private int var1;

    private int var2;

    private int var3;

    private int var4;

    private int var5;

    private int maxbytes;

    private int timedue;

    private int timeavailable;

    private int grade;

    private int timemodified;

    public AssignmentRecord(String nameSpace) {
        super(nameSpace,"AssignmentRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      AssignmentRecord ret = new AssignmentRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setFormat(KSoap2Utils.getInt(response,"format") );
      ret.setAssignmenttype(KSoap2Utils.getString(response,"assignmenttype") );
      ret.setResubmit(KSoap2Utils.getInt(response,"resubmit") );
      ret.setPreventlate(KSoap2Utils.getInt(response,"preventlate") );
      ret.setEmailteachers(KSoap2Utils.getInt(response,"emailteachers") );
      ret.setVar1(KSoap2Utils.getInt(response,"var1") );
      ret.setVar2(KSoap2Utils.getInt(response,"var2") );
      ret.setVar3(KSoap2Utils.getInt(response,"var3") );
      ret.setVar4(KSoap2Utils.getInt(response,"var4") );
      ret.setVar5(KSoap2Utils.getInt(response,"var5") );
      ret.setMaxbytes(KSoap2Utils.getInt(response,"maxbytes") );
      ret.setTimedue(KSoap2Utils.getInt(response,"timedue") );
      ret.setTimeavailable(KSoap2Utils.getInt(response,"timeavailable") );
      ret.setGrade(KSoap2Utils.getInt(response,"grade") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      return ret;

    }


    /**
     * Gets the error value for this AssignmentRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this AssignmentRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this AssignmentRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this AssignmentRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the course value for this AssignmentRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this AssignmentRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the name value for this AssignmentRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AssignmentRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the description value for this AssignmentRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AssignmentRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the format value for this AssignmentRecord.
     * 
     * @return format
     */
    public int getFormat() {
        return format;
    }


    /**
     * Sets the format value for this AssignmentRecord.
     * 
     * @param format
     */
    public void setFormat(int format) {
        this.format = format;
       this.addProperty("format",format);
    }


    /**
     * Gets the assignmenttype value for this AssignmentRecord.
     * 
     * @return assignmenttype
     */
    public java.lang.String getAssignmenttype() {
        return assignmenttype;
    }


    /**
     * Sets the assignmenttype value for this AssignmentRecord.
     * 
     * @param assignmenttype
     */
    public void setAssignmenttype(java.lang.String assignmenttype) {
        this.assignmenttype = assignmenttype;
       this.addProperty("assignmenttype",assignmenttype);
    }


    /**
     * Gets the resubmit value for this AssignmentRecord.
     * 
     * @return resubmit
     */
    public int getResubmit() {
        return resubmit;
    }


    /**
     * Sets the resubmit value for this AssignmentRecord.
     * 
     * @param resubmit
     */
    public void setResubmit(int resubmit) {
        this.resubmit = resubmit;
       this.addProperty("resubmit",resubmit);
    }


    /**
     * Gets the preventlate value for this AssignmentRecord.
     * 
     * @return preventlate
     */
    public int getPreventlate() {
        return preventlate;
    }


    /**
     * Sets the preventlate value for this AssignmentRecord.
     * 
     * @param preventlate
     */
    public void setPreventlate(int preventlate) {
        this.preventlate = preventlate;
       this.addProperty("preventlate",preventlate);
    }


    /**
     * Gets the emailteachers value for this AssignmentRecord.
     * 
     * @return emailteachers
     */
    public int getEmailteachers() {
        return emailteachers;
    }


    /**
     * Sets the emailteachers value for this AssignmentRecord.
     * 
     * @param emailteachers
     */
    public void setEmailteachers(int emailteachers) {
        this.emailteachers = emailteachers;
       this.addProperty("emailteachers",emailteachers);
    }


    /**
     * Gets the var1 value for this AssignmentRecord.
     * 
     * @return var1
     */
    public int getVar1() {
        return var1;
    }


    /**
     * Sets the var1 value for this AssignmentRecord.
     * 
     * @param var1
     */
    public void setVar1(int var1) {
        this.var1 = var1;
       this.addProperty("var1",var1);
    }


    /**
     * Gets the var2 value for this AssignmentRecord.
     * 
     * @return var2
     */
    public int getVar2() {
        return var2;
    }


    /**
     * Sets the var2 value for this AssignmentRecord.
     * 
     * @param var2
     */
    public void setVar2(int var2) {
        this.var2 = var2;
       this.addProperty("var2",var2);
    }


    /**
     * Gets the var3 value for this AssignmentRecord.
     * 
     * @return var3
     */
    public int getVar3() {
        return var3;
    }


    /**
     * Sets the var3 value for this AssignmentRecord.
     * 
     * @param var3
     */
    public void setVar3(int var3) {
        this.var3 = var3;
       this.addProperty("var3",var3);
    }


    /**
     * Gets the var4 value for this AssignmentRecord.
     * 
     * @return var4
     */
    public int getVar4() {
        return var4;
    }


    /**
     * Sets the var4 value for this AssignmentRecord.
     * 
     * @param var4
     */
    public void setVar4(int var4) {
        this.var4 = var4;
       this.addProperty("var4",var4);
    }


    /**
     * Gets the var5 value for this AssignmentRecord.
     * 
     * @return var5
     */
    public int getVar5() {
        return var5;
    }


    /**
     * Sets the var5 value for this AssignmentRecord.
     * 
     * @param var5
     */
    public void setVar5(int var5) {
        this.var5 = var5;
       this.addProperty("var5",var5);
    }


    /**
     * Gets the maxbytes value for this AssignmentRecord.
     * 
     * @return maxbytes
     */
    public int getMaxbytes() {
        return maxbytes;
    }


    /**
     * Sets the maxbytes value for this AssignmentRecord.
     * 
     * @param maxbytes
     */
    public void setMaxbytes(int maxbytes) {
        this.maxbytes = maxbytes;
       this.addProperty("maxbytes",maxbytes);
    }


    /**
     * Gets the timedue value for this AssignmentRecord.
     * 
     * @return timedue
     */
    public int getTimedue() {
        return timedue;
    }


    /**
     * Sets the timedue value for this AssignmentRecord.
     * 
     * @param timedue
     */
    public void setTimedue(int timedue) {
        this.timedue = timedue;
       this.addProperty("timedue",timedue);
    }


    /**
     * Gets the timeavailable value for this AssignmentRecord.
     * 
     * @return timeavailable
     */
    public int getTimeavailable() {
        return timeavailable;
    }


    /**
     * Sets the timeavailable value for this AssignmentRecord.
     * 
     * @param timeavailable
     */
    public void setTimeavailable(int timeavailable) {
        this.timeavailable = timeavailable;
       this.addProperty("timeavailable",timeavailable);
    }


    /**
     * Gets the grade value for this AssignmentRecord.
     * 
     * @return grade
     */
    public int getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this AssignmentRecord.
     * 
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
       this.addProperty("grade",grade);
    }


    /**
     * Gets the timemodified value for this AssignmentRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this AssignmentRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }

}
