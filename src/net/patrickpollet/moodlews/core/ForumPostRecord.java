/**
 * ForumPostRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2BeanWriter
 */

package net.patrickpollet.moodlews.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class ForumPostRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String attachment;

    private net.patrickpollet.moodlews.core.ForumPostRecord[] children;

    private int created;

    private int discussion;

    private java.lang.String email;

    private java.lang.String error;

    private java.lang.String firstname;

    private int id;

    private java.lang.String imagealt;

    private java.lang.String lastname;

    private int mailed;

    private int mailnow;

    private java.lang.String message;

    private int messageformat;

    private int messagetrust;

    private int modified;

    private int parent;

    private java.lang.String picture;

    private java.lang.String subject;

    private int totalscore;

    private int userid;

    public ForumPostRecord(String nameSpace) {
        super(nameSpace,"ForumPostRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      ForumPostRecord ret = new ForumPostRecord(this.namespace);
      ret.setAttachment(KSoap2Utils.getString(response,"attachment") );
      List _children =KSoap2Utils.getList((SoapObject) response.getProperty("children"),new ForumPostRecord(this.namespace));
      ret.setChildren((ForumPostRecord[]) _children.toArray(new ForumPostRecord[0]));
      ret.setCreated(KSoap2Utils.getInt(response,"created") );
      ret.setDiscussion(KSoap2Utils.getInt(response,"discussion") );
      ret.setEmail(KSoap2Utils.getString(response,"email") );
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setFirstname(KSoap2Utils.getString(response,"firstname") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setImagealt(KSoap2Utils.getString(response,"imagealt") );
      ret.setLastname(KSoap2Utils.getString(response,"lastname") );
      ret.setMailed(KSoap2Utils.getInt(response,"mailed") );
      ret.setMailnow(KSoap2Utils.getInt(response,"mailnow") );
      ret.setMessage(KSoap2Utils.getString(response,"message") );
      ret.setMessageformat(KSoap2Utils.getInt(response,"messageformat") );
      ret.setMessagetrust(KSoap2Utils.getInt(response,"messagetrust") );
      ret.setModified(KSoap2Utils.getInt(response,"modified") );
      ret.setParent(KSoap2Utils.getInt(response,"parent") );
      ret.setPicture(KSoap2Utils.getString(response,"picture") );
      ret.setSubject(KSoap2Utils.getString(response,"subject") );
      ret.setTotalscore(KSoap2Utils.getInt(response,"totalscore") );
      ret.setUserid(KSoap2Utils.getInt(response,"userid") );
      return ret;

    }


    /**
     * Gets the attachment value for this ForumPostRecord.
     * 
     * @return attachment
     */
    public java.lang.String getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this ForumPostRecord.
     * 
     * @param attachment
     */
    public void setAttachment(java.lang.String attachment) {
        this.attachment = attachment;
       this.addProperty("attachment",attachment);
    }


    /**
     * Gets the children value for this ForumPostRecord.
     * 
     * @return children
     */
    public net.patrickpollet.moodlews.core.ForumPostRecord[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this ForumPostRecord.
     * 
     * @param children
     */
    public void setChildren(net.patrickpollet.moodlews.core.ForumPostRecord[] children) {
        this.children = children;
       this.addProperty("children",children);
    }


    /**
     * Gets the created value for this ForumPostRecord.
     * 
     * @return created
     */
    public int getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ForumPostRecord.
     * 
     * @param created
     */
    public void setCreated(int created) {
        this.created = created;
       this.addProperty("created",created);
    }


    /**
     * Gets the discussion value for this ForumPostRecord.
     * 
     * @return discussion
     */
    public int getDiscussion() {
        return discussion;
    }


    /**
     * Sets the discussion value for this ForumPostRecord.
     * 
     * @param discussion
     */
    public void setDiscussion(int discussion) {
        this.discussion = discussion;
       this.addProperty("discussion",discussion);
    }


    /**
     * Gets the email value for this ForumPostRecord.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ForumPostRecord.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
       this.addProperty("email",email);
    }


    /**
     * Gets the error value for this ForumPostRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ForumPostRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the firstname value for this ForumPostRecord.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this ForumPostRecord.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
       this.addProperty("firstname",firstname);
    }


    /**
     * Gets the id value for this ForumPostRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ForumPostRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the imagealt value for this ForumPostRecord.
     * 
     * @return imagealt
     */
    public java.lang.String getImagealt() {
        return imagealt;
    }


    /**
     * Sets the imagealt value for this ForumPostRecord.
     * 
     * @param imagealt
     */
    public void setImagealt(java.lang.String imagealt) {
        this.imagealt = imagealt;
       this.addProperty("imagealt",imagealt);
    }


    /**
     * Gets the lastname value for this ForumPostRecord.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this ForumPostRecord.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
       this.addProperty("lastname",lastname);
    }


    /**
     * Gets the mailed value for this ForumPostRecord.
     * 
     * @return mailed
     */
    public int getMailed() {
        return mailed;
    }


    /**
     * Sets the mailed value for this ForumPostRecord.
     * 
     * @param mailed
     */
    public void setMailed(int mailed) {
        this.mailed = mailed;
       this.addProperty("mailed",mailed);
    }


    /**
     * Gets the mailnow value for this ForumPostRecord.
     * 
     * @return mailnow
     */
    public int getMailnow() {
        return mailnow;
    }


    /**
     * Sets the mailnow value for this ForumPostRecord.
     * 
     * @param mailnow
     */
    public void setMailnow(int mailnow) {
        this.mailnow = mailnow;
       this.addProperty("mailnow",mailnow);
    }


    /**
     * Gets the message value for this ForumPostRecord.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ForumPostRecord.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
       this.addProperty("message",message);
    }


    /**
     * Gets the messageformat value for this ForumPostRecord.
     * 
     * @return messageformat
     */
    public int getMessageformat() {
        return messageformat;
    }


    /**
     * Sets the messageformat value for this ForumPostRecord.
     * 
     * @param messageformat
     */
    public void setMessageformat(int messageformat) {
        this.messageformat = messageformat;
       this.addProperty("messageformat",messageformat);
    }


    /**
     * Gets the messagetrust value for this ForumPostRecord.
     * 
     * @return messagetrust
     */
    public int getMessagetrust() {
        return messagetrust;
    }


    /**
     * Sets the messagetrust value for this ForumPostRecord.
     * 
     * @param messagetrust
     */
    public void setMessagetrust(int messagetrust) {
        this.messagetrust = messagetrust;
       this.addProperty("messagetrust",messagetrust);
    }


    /**
     * Gets the modified value for this ForumPostRecord.
     * 
     * @return modified
     */
    public int getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this ForumPostRecord.
     * 
     * @param modified
     */
    public void setModified(int modified) {
        this.modified = modified;
       this.addProperty("modified",modified);
    }


    /**
     * Gets the parent value for this ForumPostRecord.
     * 
     * @return parent
     */
    public int getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ForumPostRecord.
     * 
     * @param parent
     */
    public void setParent(int parent) {
        this.parent = parent;
       this.addProperty("parent",parent);
    }


    /**
     * Gets the picture value for this ForumPostRecord.
     * 
     * @return picture
     */
    public java.lang.String getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this ForumPostRecord.
     * 
     * @param picture
     */
    public void setPicture(java.lang.String picture) {
        this.picture = picture;
       this.addProperty("picture",picture);
    }


    /**
     * Gets the subject value for this ForumPostRecord.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ForumPostRecord.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
       this.addProperty("subject",subject);
    }


    /**
     * Gets the totalscore value for this ForumPostRecord.
     * 
     * @return totalscore
     */
    public int getTotalscore() {
        return totalscore;
    }


    /**
     * Sets the totalscore value for this ForumPostRecord.
     * 
     * @param totalscore
     */
    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
       this.addProperty("totalscore",totalscore);
    }


    /**
     * Gets the userid value for this ForumPostRecord.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this ForumPostRecord.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }

}
