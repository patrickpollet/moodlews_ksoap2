/**
 * AssignmentSubmissionRecord.java
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

public class AssignmentSubmissionRecord  extends SoapObject  implements Soapeabilisable{
    private int assignment;

    private java.lang.String assignmenttype;

    private java.lang.String data1;

    private java.lang.String data2;

    private java.lang.String error;

    private net.patrickpollet.moodlews.core.FileRecord[] files;

    private int format;

    private int grade;

    private int id;

    private int mailed;

    private int numfiles;

    private java.lang.String submissioncomment;

    private int teacher;

    private int timecreated;

    private int timemarked;

    private int timemodified;

    private java.lang.String useremail;

    private int userid;

    private java.lang.String useridnumber;

    private java.lang.String userusername;

    public AssignmentSubmissionRecord(String nameSpace) {
        super(nameSpace,"AssignmentSubmissionRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      AssignmentSubmissionRecord ret = new AssignmentSubmissionRecord(this.namespace);
      ret.setAssignment(KSoap2Utils.getInt(response,"assignment") );
      ret.setAssignmenttype(KSoap2Utils.getString(response,"assignmenttype") );
      ret.setData1(KSoap2Utils.getString(response,"data1") );
      ret.setData2(KSoap2Utils.getString(response,"data2") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      List _files =KSoap2Utils.getList((SoapObject) response.getProperty("files"),new FileRecord(this.namespace));
      ret.setFiles((FileRecord[]) _files.toArray(new FileRecord[0]));
      ret.setFormat(KSoap2Utils.getInt(response,"format") );
      ret.setGrade(KSoap2Utils.getInt(response,"grade") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setMailed(KSoap2Utils.getInt(response,"mailed") );
      ret.setNumfiles(KSoap2Utils.getInt(response,"numfiles") );
      ret.setSubmissioncomment(KSoap2Utils.getString(response,"submissioncomment") );
      ret.setTeacher(KSoap2Utils.getInt(response,"teacher") );
      ret.setTimecreated(KSoap2Utils.getInt(response,"timecreated") );
      ret.setTimemarked(KSoap2Utils.getInt(response,"timemarked") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setUseremail(KSoap2Utils.getString(response,"useremail") );
      ret.setUserid(KSoap2Utils.getInt(response,"userid") );
      ret.setUseridnumber(KSoap2Utils.getString(response,"useridnumber") );
      ret.setUserusername(KSoap2Utils.getString(response,"userusername") );
      return ret;

    }


    /**
     * Gets the assignment value for this AssignmentSubmissionRecord.
     * 
     * @return assignment
     */
    public int getAssignment() {
        return assignment;
    }


    /**
     * Sets the assignment value for this AssignmentSubmissionRecord.
     * 
     * @param assignment
     */
    public void setAssignment(int assignment) {
        this.assignment = assignment;
       this.addProperty("assignment",assignment);
    }


    /**
     * Gets the assignmenttype value for this AssignmentSubmissionRecord.
     * 
     * @return assignmenttype
     */
    public java.lang.String getAssignmenttype() {
        return assignmenttype;
    }


    /**
     * Sets the assignmenttype value for this AssignmentSubmissionRecord.
     * 
     * @param assignmenttype
     */
    public void setAssignmenttype(java.lang.String assignmenttype) {
        this.assignmenttype = assignmenttype;
       this.addProperty("assignmenttype",assignmenttype);
    }


    /**
     * Gets the data1 value for this AssignmentSubmissionRecord.
     * 
     * @return data1
     */
    public java.lang.String getData1() {
        return data1;
    }


    /**
     * Sets the data1 value for this AssignmentSubmissionRecord.
     * 
     * @param data1
     */
    public void setData1(java.lang.String data1) {
        this.data1 = data1;
       this.addProperty("data1",data1);
    }


    /**
     * Gets the data2 value for this AssignmentSubmissionRecord.
     * 
     * @return data2
     */
    public java.lang.String getData2() {
        return data2;
    }


    /**
     * Sets the data2 value for this AssignmentSubmissionRecord.
     * 
     * @param data2
     */
    public void setData2(java.lang.String data2) {
        this.data2 = data2;
       this.addProperty("data2",data2);
    }


    /**
     * Gets the error value for this AssignmentSubmissionRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this AssignmentSubmissionRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the files value for this AssignmentSubmissionRecord.
     * 
     * @return files
     */
    public net.patrickpollet.moodlews.core.FileRecord[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this AssignmentSubmissionRecord.
     * 
     * @param files
     */
    public void setFiles(net.patrickpollet.moodlews.core.FileRecord[] files) {
        this.files = files;
       this.addProperty("files",files);
    }


    /**
     * Gets the format value for this AssignmentSubmissionRecord.
     * 
     * @return format
     */
    public int getFormat() {
        return format;
    }


    /**
     * Sets the format value for this AssignmentSubmissionRecord.
     * 
     * @param format
     */
    public void setFormat(int format) {
        this.format = format;
       this.addProperty("format",format);
    }


    /**
     * Gets the grade value for this AssignmentSubmissionRecord.
     * 
     * @return grade
     */
    public int getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this AssignmentSubmissionRecord.
     * 
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
       this.addProperty("grade",grade);
    }


    /**
     * Gets the id value for this AssignmentSubmissionRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this AssignmentSubmissionRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the mailed value for this AssignmentSubmissionRecord.
     * 
     * @return mailed
     */
    public int getMailed() {
        return mailed;
    }


    /**
     * Sets the mailed value for this AssignmentSubmissionRecord.
     * 
     * @param mailed
     */
    public void setMailed(int mailed) {
        this.mailed = mailed;
       this.addProperty("mailed",mailed);
    }


    /**
     * Gets the numfiles value for this AssignmentSubmissionRecord.
     * 
     * @return numfiles
     */
    public int getNumfiles() {
        return numfiles;
    }


    /**
     * Sets the numfiles value for this AssignmentSubmissionRecord.
     * 
     * @param numfiles
     */
    public void setNumfiles(int numfiles) {
        this.numfiles = numfiles;
       this.addProperty("numfiles",numfiles);
    }


    /**
     * Gets the submissioncomment value for this AssignmentSubmissionRecord.
     * 
     * @return submissioncomment
     */
    public java.lang.String getSubmissioncomment() {
        return submissioncomment;
    }


    /**
     * Sets the submissioncomment value for this AssignmentSubmissionRecord.
     * 
     * @param submissioncomment
     */
    public void setSubmissioncomment(java.lang.String submissioncomment) {
        this.submissioncomment = submissioncomment;
       this.addProperty("submissioncomment",submissioncomment);
    }


    /**
     * Gets the teacher value for this AssignmentSubmissionRecord.
     * 
     * @return teacher
     */
    public int getTeacher() {
        return teacher;
    }


    /**
     * Sets the teacher value for this AssignmentSubmissionRecord.
     * 
     * @param teacher
     */
    public void setTeacher(int teacher) {
        this.teacher = teacher;
       this.addProperty("teacher",teacher);
    }


    /**
     * Gets the timecreated value for this AssignmentSubmissionRecord.
     * 
     * @return timecreated
     */
    public int getTimecreated() {
        return timecreated;
    }


    /**
     * Sets the timecreated value for this AssignmentSubmissionRecord.
     * 
     * @param timecreated
     */
    public void setTimecreated(int timecreated) {
        this.timecreated = timecreated;
       this.addProperty("timecreated",timecreated);
    }


    /**
     * Gets the timemarked value for this AssignmentSubmissionRecord.
     * 
     * @return timemarked
     */
    public int getTimemarked() {
        return timemarked;
    }


    /**
     * Sets the timemarked value for this AssignmentSubmissionRecord.
     * 
     * @param timemarked
     */
    public void setTimemarked(int timemarked) {
        this.timemarked = timemarked;
       this.addProperty("timemarked",timemarked);
    }


    /**
     * Gets the timemodified value for this AssignmentSubmissionRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this AssignmentSubmissionRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the useremail value for this AssignmentSubmissionRecord.
     * 
     * @return useremail
     */
    public java.lang.String getUseremail() {
        return useremail;
    }


    /**
     * Sets the useremail value for this AssignmentSubmissionRecord.
     * 
     * @param useremail
     */
    public void setUseremail(java.lang.String useremail) {
        this.useremail = useremail;
       this.addProperty("useremail",useremail);
    }


    /**
     * Gets the userid value for this AssignmentSubmissionRecord.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this AssignmentSubmissionRecord.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the useridnumber value for this AssignmentSubmissionRecord.
     * 
     * @return useridnumber
     */
    public java.lang.String getUseridnumber() {
        return useridnumber;
    }


    /**
     * Sets the useridnumber value for this AssignmentSubmissionRecord.
     * 
     * @param useridnumber
     */
    public void setUseridnumber(java.lang.String useridnumber) {
        this.useridnumber = useridnumber;
       this.addProperty("useridnumber",useridnumber);
    }


    /**
     * Gets the userusername value for this AssignmentSubmissionRecord.
     * 
     * @return userusername
     */
    public java.lang.String getUserusername() {
        return userusername;
    }


    /**
     * Sets the userusername value for this AssignmentSubmissionRecord.
     * 
     * @param userusername
     */
    public void setUserusername(java.lang.String userusername) {
        this.userusername = userusername;
       this.addProperty("userusername",userusername);
    }

}
