/**
 * MessageRecord.java
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

public class MessageRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private int useridfrom;

    private int useridto;

    private java.lang.String subject;

    private java.lang.String fullmessage;

    private int fullmessageformat;

    private java.lang.String fullmessagehtml;

    private java.lang.String smallmessage;

    private int notification;

    private java.lang.String contexturl;

    private java.lang.String contexturlname;

    private int timecreated;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String email;

    private java.lang.String picture;

    private java.lang.String imagealt;

    public MessageRecord(String nameSpace) {
        super(nameSpace,"MessageRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      MessageRecord ret = new MessageRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setUseridfrom(KSoap2Utils.getInt(response,"useridfrom") );
      ret.setUseridto(KSoap2Utils.getInt(response,"useridto") );
      ret.setSubject(KSoap2Utils.getString(response,"subject") );
      ret.setFullmessage(KSoap2Utils.getString(response,"fullmessage") );
      ret.setFullmessageformat(KSoap2Utils.getInt(response,"fullmessageformat") );
      ret.setFullmessagehtml(KSoap2Utils.getString(response,"fullmessagehtml") );
      ret.setSmallmessage(KSoap2Utils.getString(response,"smallmessage") );
      ret.setNotification(KSoap2Utils.getInt(response,"notification") );
      ret.setContexturl(KSoap2Utils.getString(response,"contexturl") );
      ret.setContexturlname(KSoap2Utils.getString(response,"contexturlname") );
      ret.setTimecreated(KSoap2Utils.getInt(response,"timecreated") );
      ret.setFirstname(KSoap2Utils.getString(response,"firstname") );
      ret.setLastname(KSoap2Utils.getString(response,"lastname") );
      ret.setEmail(KSoap2Utils.getString(response,"email") );
      ret.setPicture(KSoap2Utils.getString(response,"picture") );
      ret.setImagealt(KSoap2Utils.getString(response,"imagealt") );
      return ret;

    }


    /**
     * Gets the error value for this MessageRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this MessageRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this MessageRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this MessageRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the useridfrom value for this MessageRecord.
     * 
     * @return useridfrom
     */
    public int getUseridfrom() {
        return useridfrom;
    }


    /**
     * Sets the useridfrom value for this MessageRecord.
     * 
     * @param useridfrom
     */
    public void setUseridfrom(int useridfrom) {
        this.useridfrom = useridfrom;
       this.addProperty("useridfrom",useridfrom);
    }


    /**
     * Gets the useridto value for this MessageRecord.
     * 
     * @return useridto
     */
    public int getUseridto() {
        return useridto;
    }


    /**
     * Sets the useridto value for this MessageRecord.
     * 
     * @param useridto
     */
    public void setUseridto(int useridto) {
        this.useridto = useridto;
       this.addProperty("useridto",useridto);
    }


    /**
     * Gets the subject value for this MessageRecord.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MessageRecord.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
       this.addProperty("subject",subject);
    }


    /**
     * Gets the fullmessage value for this MessageRecord.
     * 
     * @return fullmessage
     */
    public java.lang.String getFullmessage() {
        return fullmessage;
    }


    /**
     * Sets the fullmessage value for this MessageRecord.
     * 
     * @param fullmessage
     */
    public void setFullmessage(java.lang.String fullmessage) {
        this.fullmessage = fullmessage;
       this.addProperty("fullmessage",fullmessage);
    }


    /**
     * Gets the fullmessageformat value for this MessageRecord.
     * 
     * @return fullmessageformat
     */
    public int getFullmessageformat() {
        return fullmessageformat;
    }


    /**
     * Sets the fullmessageformat value for this MessageRecord.
     * 
     * @param fullmessageformat
     */
    public void setFullmessageformat(int fullmessageformat) {
        this.fullmessageformat = fullmessageformat;
       this.addProperty("fullmessageformat",fullmessageformat);
    }


    /**
     * Gets the fullmessagehtml value for this MessageRecord.
     * 
     * @return fullmessagehtml
     */
    public java.lang.String getFullmessagehtml() {
        return fullmessagehtml;
    }


    /**
     * Sets the fullmessagehtml value for this MessageRecord.
     * 
     * @param fullmessagehtml
     */
    public void setFullmessagehtml(java.lang.String fullmessagehtml) {
        this.fullmessagehtml = fullmessagehtml;
       this.addProperty("fullmessagehtml",fullmessagehtml);
    }


    /**
     * Gets the smallmessage value for this MessageRecord.
     * 
     * @return smallmessage
     */
    public java.lang.String getSmallmessage() {
        return smallmessage;
    }


    /**
     * Sets the smallmessage value for this MessageRecord.
     * 
     * @param smallmessage
     */
    public void setSmallmessage(java.lang.String smallmessage) {
        this.smallmessage = smallmessage;
       this.addProperty("smallmessage",smallmessage);
    }


    /**
     * Gets the notification value for this MessageRecord.
     * 
     * @return notification
     */
    public int getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this MessageRecord.
     * 
     * @param notification
     */
    public void setNotification(int notification) {
        this.notification = notification;
       this.addProperty("notification",notification);
    }


    /**
     * Gets the contexturl value for this MessageRecord.
     * 
     * @return contexturl
     */
    public java.lang.String getContexturl() {
        return contexturl;
    }


    /**
     * Sets the contexturl value for this MessageRecord.
     * 
     * @param contexturl
     */
    public void setContexturl(java.lang.String contexturl) {
        this.contexturl = contexturl;
       this.addProperty("contexturl",contexturl);
    }


    /**
     * Gets the contexturlname value for this MessageRecord.
     * 
     * @return contexturlname
     */
    public java.lang.String getContexturlname() {
        return contexturlname;
    }


    /**
     * Sets the contexturlname value for this MessageRecord.
     * 
     * @param contexturlname
     */
    public void setContexturlname(java.lang.String contexturlname) {
        this.contexturlname = contexturlname;
       this.addProperty("contexturlname",contexturlname);
    }


    /**
     * Gets the timecreated value for this MessageRecord.
     * 
     * @return timecreated
     */
    public int getTimecreated() {
        return timecreated;
    }


    /**
     * Sets the timecreated value for this MessageRecord.
     * 
     * @param timecreated
     */
    public void setTimecreated(int timecreated) {
        this.timecreated = timecreated;
       this.addProperty("timecreated",timecreated);
    }


    /**
     * Gets the firstname value for this MessageRecord.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this MessageRecord.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
       this.addProperty("firstname",firstname);
    }


    /**
     * Gets the lastname value for this MessageRecord.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this MessageRecord.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
       this.addProperty("lastname",lastname);
    }


    /**
     * Gets the email value for this MessageRecord.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MessageRecord.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
       this.addProperty("email",email);
    }


    /**
     * Gets the picture value for this MessageRecord.
     * 
     * @return picture
     */
    public java.lang.String getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this MessageRecord.
     * 
     * @param picture
     */
    public void setPicture(java.lang.String picture) {
        this.picture = picture;
       this.addProperty("picture",picture);
    }


    /**
     * Gets the imagealt value for this MessageRecord.
     * 
     * @return imagealt
     */
    public java.lang.String getImagealt() {
        return imagealt;
    }


    /**
     * Sets the imagealt value for this MessageRecord.
     * 
     * @param imagealt
     */
    public void setImagealt(java.lang.String imagealt) {
        this.imagealt = imagealt;
       this.addProperty("imagealt",imagealt);
    }

}
