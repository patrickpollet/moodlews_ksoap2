/**
 * ForumDiscussionRecord.java
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

public class ForumDiscussionRecord  extends SoapObject  implements Soapeabilisable{
    private int assessed;

    private int course;

    private java.lang.String error;

    private int firstpost;

    private int forum;

    private int groupid;

    private int id;

    private java.lang.String name;

    private net.patrickpollet.moodlews.core.ForumPostRecord post;

    private int timeend;

    private int timemodified;

    private int timestart;

    private int userid;

    private int usermodified;

    public ForumDiscussionRecord(String nameSpace) {
        super(nameSpace,"ForumDiscussionRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ForumDiscussionRecord ret = new ForumDiscussionRecord(this.namespace);
      ret.setAssessed(KSoap2Utils.getInt(response,"assessed") );
      ret.setCourse(KSoap2Utils.getInt(response,"course") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setFirstpost(KSoap2Utils.getInt(response,"firstpost") );
      ret.setForum(KSoap2Utils.getInt(response,"forum") );
      ret.setGroupid(KSoap2Utils.getInt(response,"groupid") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setTimeend(KSoap2Utils.getInt(response,"timeend") );
      ret.setTimemodified(KSoap2Utils.getInt(response,"timemodified") );
      ret.setTimestart(KSoap2Utils.getInt(response,"timestart") );
      ret.setUserid(KSoap2Utils.getInt(response,"userid") );
      ret.setUsermodified(KSoap2Utils.getInt(response,"usermodified") );
      return ret;

    }


    /**
     * Gets the assessed value for this ForumDiscussionRecord.
     * 
     * @return assessed
     */
    public int getAssessed() {
        return assessed;
    }


    /**
     * Sets the assessed value for this ForumDiscussionRecord.
     * 
     * @param assessed
     */
    public void setAssessed(int assessed) {
        this.assessed = assessed;
       this.addProperty("assessed",assessed);
    }


    /**
     * Gets the course value for this ForumDiscussionRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ForumDiscussionRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
       this.addProperty("course",course);
    }


    /**
     * Gets the error value for this ForumDiscussionRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ForumDiscussionRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the firstpost value for this ForumDiscussionRecord.
     * 
     * @return firstpost
     */
    public int getFirstpost() {
        return firstpost;
    }


    /**
     * Sets the firstpost value for this ForumDiscussionRecord.
     * 
     * @param firstpost
     */
    public void setFirstpost(int firstpost) {
        this.firstpost = firstpost;
       this.addProperty("firstpost",firstpost);
    }


    /**
     * Gets the forum value for this ForumDiscussionRecord.
     * 
     * @return forum
     */
    public int getForum() {
        return forum;
    }


    /**
     * Sets the forum value for this ForumDiscussionRecord.
     * 
     * @param forum
     */
    public void setForum(int forum) {
        this.forum = forum;
       this.addProperty("forum",forum);
    }


    /**
     * Gets the groupid value for this ForumDiscussionRecord.
     * 
     * @return groupid
     */
    public int getGroupid() {
        return groupid;
    }


    /**
     * Sets the groupid value for this ForumDiscussionRecord.
     * 
     * @param groupid
     */
    public void setGroupid(int groupid) {
        this.groupid = groupid;
       this.addProperty("groupid",groupid);
    }


    /**
     * Gets the id value for this ForumDiscussionRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ForumDiscussionRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this ForumDiscussionRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForumDiscussionRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the post value for this ForumDiscussionRecord.
     * 
     * @return post
     */
    public net.patrickpollet.moodlews.core.ForumPostRecord getPost() {
        return post;
    }


    /**
     * Sets the post value for this ForumDiscussionRecord.
     * 
     * @param post
     */
    public void setPost(net.patrickpollet.moodlews.core.ForumPostRecord post) {
        this.post = post;
       this.addProperty("post",post);
    }


    /**
     * Gets the timeend value for this ForumDiscussionRecord.
     * 
     * @return timeend
     */
    public int getTimeend() {
        return timeend;
    }


    /**
     * Sets the timeend value for this ForumDiscussionRecord.
     * 
     * @param timeend
     */
    public void setTimeend(int timeend) {
        this.timeend = timeend;
       this.addProperty("timeend",timeend);
    }


    /**
     * Gets the timemodified value for this ForumDiscussionRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this ForumDiscussionRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
       this.addProperty("timemodified",timemodified);
    }


    /**
     * Gets the timestart value for this ForumDiscussionRecord.
     * 
     * @return timestart
     */
    public int getTimestart() {
        return timestart;
    }


    /**
     * Sets the timestart value for this ForumDiscussionRecord.
     * 
     * @param timestart
     */
    public void setTimestart(int timestart) {
        this.timestart = timestart;
       this.addProperty("timestart",timestart);
    }


    /**
     * Gets the userid value for this ForumDiscussionRecord.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this ForumDiscussionRecord.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the usermodified value for this ForumDiscussionRecord.
     * 
     * @return usermodified
     */
    public int getUsermodified() {
        return usermodified;
    }


    /**
     * Sets the usermodified value for this ForumDiscussionRecord.
     * 
     * @param usermodified
     */
    public void setUsermodified(int usermodified) {
        this.usermodified = usermodified;
       this.addProperty("usermodified",usermodified);
    }

}
