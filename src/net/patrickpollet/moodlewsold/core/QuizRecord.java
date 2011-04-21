/**
 * QuizRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter
 */

package net.patrickpollet.moodlewsold.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class QuizRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int course;

    private java.lang.String name;

    private java.lang.String intro;

    private int timeopen;

    private int timeclose;

    private int shufflequestions;

    private int shuffleanswers;

    private java.lang.String questions;

    private int timelimit;

    private java.lang.String data;

    public QuizRecord(String nameSpace) {
        super(nameSpace,"QuizRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      QuizRecord ret = new QuizRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setIntro(KSoap2Utils.getString(response,"intro") );
      ret.setTimeopen(KSoap2Utils.getInt(response,"timeopen") );
      ret.setTimeclose(KSoap2Utils.getInt(response,"timeclose") );
      ret.setShufflequestions(KSoap2Utils.getInt(response,"shufflequestions") );
      ret.setShuffleanswers(KSoap2Utils.getInt(response,"shuffleanswers") );
      ret.setQuestions(KSoap2Utils.getString(response,"questions") );
      ret.setTimelimit(KSoap2Utils.getInt(response,"timelimit") );
      ret.setData(KSoap2Utils.getString(response,"data") );
      return ret;

    }


    /**
     * Gets the error value for this QuizRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this QuizRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this QuizRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this QuizRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the course value for this QuizRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this QuizRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the name value for this QuizRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this QuizRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the intro value for this QuizRecord.
     * 
     * @return intro
     */
    public java.lang.String getIntro() {
        return intro;
    }


    /**
     * Sets the intro value for this QuizRecord.
     * 
     * @param intro
     */
    public void setIntro(java.lang.String intro) {
        this.intro = intro;
       this.addProperty("intro",intro);
    }


    /**
     * Gets the timeopen value for this QuizRecord.
     * 
     * @return timeopen
     */
    public int getTimeopen() {
        return timeopen;
    }


    /**
     * Sets the timeopen value for this QuizRecord.
     * 
     * @param timeopen
     */
    public void setTimeopen(int timeopen) {
        this.timeopen = timeopen;
       this.addProperty("timeopen",timeopen);
    }


    /**
     * Gets the timeclose value for this QuizRecord.
     * 
     * @return timeclose
     */
    public int getTimeclose() {
        return timeclose;
    }


    /**
     * Sets the timeclose value for this QuizRecord.
     * 
     * @param timeclose
     */
    public void setTimeclose(int timeclose) {
        this.timeclose = timeclose;
       this.addProperty("timeclose",timeclose);
    }


    /**
     * Gets the shufflequestions value for this QuizRecord.
     * 
     * @return shufflequestions
     */
    public int getShufflequestions() {
        return shufflequestions;
    }


    /**
     * Sets the shufflequestions value for this QuizRecord.
     * 
     * @param shufflequestions
     */
    public void setShufflequestions(int shufflequestions) {
        this.shufflequestions = shufflequestions;
       this.addProperty("shufflequestions",shufflequestions);
    }


    /**
     * Gets the shuffleanswers value for this QuizRecord.
     * 
     * @return shuffleanswers
     */
    public int getShuffleanswers() {
        return shuffleanswers;
    }


    /**
     * Sets the shuffleanswers value for this QuizRecord.
     * 
     * @param shuffleanswers
     */
    public void setShuffleanswers(int shuffleanswers) {
        this.shuffleanswers = shuffleanswers;
       this.addProperty("shuffleanswers",shuffleanswers);
    }


    /**
     * Gets the questions value for this QuizRecord.
     * 
     * @return questions
     */
    public java.lang.String getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this QuizRecord.
     * 
     * @param questions
     */
    public void setQuestions(java.lang.String questions) {
        this.questions = questions;
       this.addProperty("questions",questions);
    }


    /**
     * Gets the timelimit value for this QuizRecord.
     * 
     * @return timelimit
     */
    public int getTimelimit() {
        return timelimit;
    }


    /**
     * Sets the timelimit value for this QuizRecord.
     * 
     * @param timelimit
     */
    public void setTimelimit(int timelimit) {
        this.timelimit = timelimit;
       this.addProperty("timelimit",timelimit);
    }


    /**
     * Gets the data value for this QuizRecord.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this QuizRecord.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
       this.addProperty("data",data);
    }

}
