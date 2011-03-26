/**
 * CourseDatum.java
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

public class CourseDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int category;

    private java.lang.String cost;

    private int enrolperiod;

    private java.lang.String format;

    private java.lang.String fullname;

    private int groupmode;

    private int groupmodeforce;

    private int guest;

    private int hiddensections;

    private int id;

    private java.lang.String idnumber;

    private java.lang.String lang;

    private int marker;

    private int maxbytes;

    private int metacourse;

    private int newsitems;

    private java.lang.String password;

    private java.lang.String shortname;

    private int showgrades;

    private int sortorder;

    private int startdate;

    private java.lang.String student;

    private java.lang.String students;

    private java.lang.String summary;

    private java.lang.String teacher;

    private java.lang.String teachers;

    private java.lang.String theme;

    private int visible;

    public CourseDatum(String nameSpace) {
        super(nameSpace,"CourseDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      CourseDatum ret = new CourseDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setCategory(KSoap2Utils.getInt(response,"category") );
      ret.setCost(KSoap2Utils.getString(response,"cost") );
      ret.setEnrolperiod(KSoap2Utils.getInt(response,"enrolperiod") );
      ret.setFormat(KSoap2Utils.getString(response,"format") );
      ret.setFullname(KSoap2Utils.getString(response,"fullname") );
      ret.setGroupmode(KSoap2Utils.getInt(response,"groupmode") );
      ret.setGroupmodeforce(KSoap2Utils.getInt(response,"groupmodeforce") );
      ret.setGuest(KSoap2Utils.getInt(response,"guest") );
      ret.setHiddensections(KSoap2Utils.getInt(response,"hiddensections") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setIdnumber(KSoap2Utils.getString(response,"idnumber") );
      ret.setLang(KSoap2Utils.getString(response,"lang") );
      ret.setMarker(KSoap2Utils.getInt(response,"marker") );
      ret.setMaxbytes(KSoap2Utils.getInt(response,"maxbytes") );
      ret.setMetacourse(KSoap2Utils.getInt(response,"metacourse") );
      ret.setNewsitems(KSoap2Utils.getInt(response,"newsitems") );
      ret.setPassword(KSoap2Utils.getString(response,"password") );
      ret.setShortname(KSoap2Utils.getString(response,"shortname") );
      ret.setShowgrades(KSoap2Utils.getInt(response,"showgrades") );
      ret.setSortorder(KSoap2Utils.getInt(response,"sortorder") );
      ret.setStartdate(KSoap2Utils.getInt(response,"startdate") );
      ret.setStudent(KSoap2Utils.getString(response,"student") );
      ret.setStudents(KSoap2Utils.getString(response,"students") );
      ret.setSummary(KSoap2Utils.getString(response,"summary") );
      ret.setTeacher(KSoap2Utils.getString(response,"teacher") );
      ret.setTeachers(KSoap2Utils.getString(response,"teachers") );
      ret.setTheme(KSoap2Utils.getString(response,"theme") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the action value for this CourseDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CourseDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the category value for this CourseDatum.
     * 
     * @return category
     */
    public int getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CourseDatum.
     * 
     * @param category
     */
    public void setCategory(int category) {
        this.category = category;
       this.addProperty("category",category);
    }


    /**
     * Gets the cost value for this CourseDatum.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CourseDatum.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
       this.addProperty("cost",cost);
    }


    /**
     * Gets the enrolperiod value for this CourseDatum.
     * 
     * @return enrolperiod
     */
    public int getEnrolperiod() {
        return enrolperiod;
    }


    /**
     * Sets the enrolperiod value for this CourseDatum.
     * 
     * @param enrolperiod
     */
    public void setEnrolperiod(int enrolperiod) {
        this.enrolperiod = enrolperiod;
       this.addProperty("enrolperiod",enrolperiod);
    }


    /**
     * Gets the format value for this CourseDatum.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CourseDatum.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
       this.addProperty("format",format);
    }


    /**
     * Gets the fullname value for this CourseDatum.
     * 
     * @return fullname
     */
    public java.lang.String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this CourseDatum.
     * 
     * @param fullname
     */
    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
       this.addProperty("fullname",fullname);
    }


    /**
     * Gets the groupmode value for this CourseDatum.
     * 
     * @return groupmode
     */
    public int getGroupmode() {
        return groupmode;
    }


    /**
     * Sets the groupmode value for this CourseDatum.
     * 
     * @param groupmode
     */
    public void setGroupmode(int groupmode) {
        this.groupmode = groupmode;
       this.addProperty("groupmode",groupmode);
    }


    /**
     * Gets the groupmodeforce value for this CourseDatum.
     * 
     * @return groupmodeforce
     */
    public int getGroupmodeforce() {
        return groupmodeforce;
    }


    /**
     * Sets the groupmodeforce value for this CourseDatum.
     * 
     * @param groupmodeforce
     */
    public void setGroupmodeforce(int groupmodeforce) {
        this.groupmodeforce = groupmodeforce;
       this.addProperty("groupmodeforce",groupmodeforce);
    }


    /**
     * Gets the guest value for this CourseDatum.
     * 
     * @return guest
     */
    public int getGuest() {
        return guest;
    }


    /**
     * Sets the guest value for this CourseDatum.
     * 
     * @param guest
     */
    public void setGuest(int guest) {
        this.guest = guest;
       this.addProperty("guest",guest);
    }


    /**
     * Gets the hiddensections value for this CourseDatum.
     * 
     * @return hiddensections
     */
    public int getHiddensections() {
        return hiddensections;
    }


    /**
     * Sets the hiddensections value for this CourseDatum.
     * 
     * @param hiddensections
     */
    public void setHiddensections(int hiddensections) {
        this.hiddensections = hiddensections;
       this.addProperty("hiddensections",hiddensections);
    }


    /**
     * Gets the id value for this CourseDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CourseDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the idnumber value for this CourseDatum.
     * 
     * @return idnumber
     */
    public java.lang.String getIdnumber() {
        return idnumber;
    }


    /**
     * Sets the idnumber value for this CourseDatum.
     * 
     * @param idnumber
     */
    public void setIdnumber(java.lang.String idnumber) {
        this.idnumber = idnumber;
       this.addProperty("idnumber",idnumber);
    }


    /**
     * Gets the lang value for this CourseDatum.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this CourseDatum.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
       this.addProperty("lang",lang);
    }


    /**
     * Gets the marker value for this CourseDatum.
     * 
     * @return marker
     */
    public int getMarker() {
        return marker;
    }


    /**
     * Sets the marker value for this CourseDatum.
     * 
     * @param marker
     */
    public void setMarker(int marker) {
        this.marker = marker;
       this.addProperty("marker",marker);
    }


    /**
     * Gets the maxbytes value for this CourseDatum.
     * 
     * @return maxbytes
     */
    public int getMaxbytes() {
        return maxbytes;
    }


    /**
     * Sets the maxbytes value for this CourseDatum.
     * 
     * @param maxbytes
     */
    public void setMaxbytes(int maxbytes) {
        this.maxbytes = maxbytes;
       this.addProperty("maxbytes",maxbytes);
    }


    /**
     * Gets the metacourse value for this CourseDatum.
     * 
     * @return metacourse
     */
    public int getMetacourse() {
        return metacourse;
    }


    /**
     * Sets the metacourse value for this CourseDatum.
     * 
     * @param metacourse
     */
    public void setMetacourse(int metacourse) {
        this.metacourse = metacourse;
       this.addProperty("metacourse",metacourse);
    }


    /**
     * Gets the newsitems value for this CourseDatum.
     * 
     * @return newsitems
     */
    public int getNewsitems() {
        return newsitems;
    }


    /**
     * Sets the newsitems value for this CourseDatum.
     * 
     * @param newsitems
     */
    public void setNewsitems(int newsitems) {
        this.newsitems = newsitems;
       this.addProperty("newsitems",newsitems);
    }


    /**
     * Gets the password value for this CourseDatum.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CourseDatum.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
       this.addProperty("password",password);
    }


    /**
     * Gets the shortname value for this CourseDatum.
     * 
     * @return shortname
     */
    public java.lang.String getShortname() {
        return shortname;
    }


    /**
     * Sets the shortname value for this CourseDatum.
     * 
     * @param shortname
     */
    public void setShortname(java.lang.String shortname) {
        this.shortname = shortname;
       this.addProperty("shortname",shortname);
    }


    /**
     * Gets the showgrades value for this CourseDatum.
     * 
     * @return showgrades
     */
    public int getShowgrades() {
        return showgrades;
    }


    /**
     * Sets the showgrades value for this CourseDatum.
     * 
     * @param showgrades
     */
    public void setShowgrades(int showgrades) {
        this.showgrades = showgrades;
       this.addProperty("showgrades",showgrades);
    }


    /**
     * Gets the sortorder value for this CourseDatum.
     * 
     * @return sortorder
     */
    public int getSortorder() {
        return sortorder;
    }


    /**
     * Sets the sortorder value for this CourseDatum.
     * 
     * @param sortorder
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
       this.addProperty("sortorder",sortorder);
    }


    /**
     * Gets the startdate value for this CourseDatum.
     * 
     * @return startdate
     */
    public int getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this CourseDatum.
     * 
     * @param startdate
     */
    public void setStartdate(int startdate) {
        this.startdate = startdate;
       this.addProperty("startdate",startdate);
    }


    /**
     * Gets the student value for this CourseDatum.
     * 
     * @return student
     */
    public java.lang.String getStudent() {
        return student;
    }


    /**
     * Sets the student value for this CourseDatum.
     * 
     * @param student
     */
    public void setStudent(java.lang.String student) {
        this.student = student;
       this.addProperty("student",student);
    }


    /**
     * Gets the students value for this CourseDatum.
     * 
     * @return students
     */
    public java.lang.String getStudents() {
        return students;
    }


    /**
     * Sets the students value for this CourseDatum.
     * 
     * @param students
     */
    public void setStudents(java.lang.String students) {
        this.students = students;
       this.addProperty("students",students);
    }


    /**
     * Gets the summary value for this CourseDatum.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CourseDatum.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
       this.addProperty("summary",summary);
    }


    /**
     * Gets the teacher value for this CourseDatum.
     * 
     * @return teacher
     */
    public java.lang.String getTeacher() {
        return teacher;
    }


    /**
     * Sets the teacher value for this CourseDatum.
     * 
     * @param teacher
     */
    public void setTeacher(java.lang.String teacher) {
        this.teacher = teacher;
       this.addProperty("teacher",teacher);
    }


    /**
     * Gets the teachers value for this CourseDatum.
     * 
     * @return teachers
     */
    public java.lang.String getTeachers() {
        return teachers;
    }


    /**
     * Sets the teachers value for this CourseDatum.
     * 
     * @param teachers
     */
    public void setTeachers(java.lang.String teachers) {
        this.teachers = teachers;
       this.addProperty("teachers",teachers);
    }


    /**
     * Gets the theme value for this CourseDatum.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this CourseDatum.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
       this.addProperty("theme",theme);
    }


    /**
     * Gets the visible value for this CourseDatum.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this CourseDatum.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
