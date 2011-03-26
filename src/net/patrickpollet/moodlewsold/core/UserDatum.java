/**
 * UserDatum.java
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

public class UserDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int id;

    private int confirmed;

    private int policyagreed;

    private int deleted;

    private java.lang.String username;

    private java.lang.String auth;

    private java.lang.String password;

    private java.lang.String passwordmd5;

    private java.lang.String idnumber;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String email;

    private int emailstop;

    private java.lang.String icq;

    private java.lang.String skype;

    private java.lang.String yahoo;

    private java.lang.String aim;

    private java.lang.String msn;

    private java.lang.String phone1;

    private java.lang.String phone2;

    private java.lang.String institution;

    private java.lang.String department;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String lang;

    private int timezone;

    private java.lang.String lastip;

    private java.lang.String theme;

    private java.lang.String description;

    private int mnethostid;

    public UserDatum(String nameSpace) {
        super(nameSpace,"UserDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      UserDatum ret = new UserDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setConfirmed(KSoap2Utils.getInt(response,"confirmed") );
      ret.setPolicyagreed(KSoap2Utils.getInt(response,"policyagreed") );
      ret.setDeleted(KSoap2Utils.getInt(response,"deleted") );
      ret.setUsername(KSoap2Utils.getString(response,"username") );
      ret.setAuth(KSoap2Utils.getString(response,"auth") );
      ret.setPassword(KSoap2Utils.getString(response,"password") );
      ret.setPasswordmd5(KSoap2Utils.getString(response,"passwordmd5") );
      ret.setIdnumber(KSoap2Utils.getString(response,"idnumber") );
      ret.setFirstname(KSoap2Utils.getString(response,"firstname") );
      ret.setLastname(KSoap2Utils.getString(response,"lastname") );
      ret.setEmail(KSoap2Utils.getString(response,"email") );
      ret.setEmailstop(KSoap2Utils.getInt(response,"emailstop") );
      ret.setIcq(KSoap2Utils.getString(response,"icq") );
      ret.setSkype(KSoap2Utils.getString(response,"skype") );
      ret.setYahoo(KSoap2Utils.getString(response,"yahoo") );
      ret.setAim(KSoap2Utils.getString(response,"aim") );
      ret.setMsn(KSoap2Utils.getString(response,"msn") );
      ret.setPhone1(KSoap2Utils.getString(response,"phone1") );
      ret.setPhone2(KSoap2Utils.getString(response,"phone2") );
      ret.setInstitution(KSoap2Utils.getString(response,"institution") );
      ret.setDepartment(KSoap2Utils.getString(response,"department") );
      ret.setAddress(KSoap2Utils.getString(response,"address") );
      ret.setCity(KSoap2Utils.getString(response,"city") );
      ret.setCountry(KSoap2Utils.getString(response,"country") );
      ret.setLang(KSoap2Utils.getString(response,"lang") );
      ret.setTimezone(KSoap2Utils.getInt(response,"timezone") );
      ret.setLastip(KSoap2Utils.getString(response,"lastip") );
      ret.setTheme(KSoap2Utils.getString(response,"theme") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setMnethostid(KSoap2Utils.getInt(response,"mnethostid") );
      return ret;

    }


    /**
     * Gets the action value for this UserDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this UserDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the id value for this UserDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this UserDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the confirmed value for this UserDatum.
     * 
     * @return confirmed
     */
    public int getConfirmed() {
        return confirmed;
    }


    /**
     * Sets the confirmed value for this UserDatum.
     * 
     * @param confirmed
     */
    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
       this.addProperty("confirmed",confirmed);
    }


    /**
     * Gets the policyagreed value for this UserDatum.
     * 
     * @return policyagreed
     */
    public int getPolicyagreed() {
        return policyagreed;
    }


    /**
     * Sets the policyagreed value for this UserDatum.
     * 
     * @param policyagreed
     */
    public void setPolicyagreed(int policyagreed) {
        this.policyagreed = policyagreed;
       this.addProperty("policyagreed",policyagreed);
    }


    /**
     * Gets the deleted value for this UserDatum.
     * 
     * @return deleted
     */
    public int getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this UserDatum.
     * 
     * @param deleted
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
       this.addProperty("deleted",deleted);
    }


    /**
     * Gets the username value for this UserDatum.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserDatum.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
       this.addProperty("username",username);
    }


    /**
     * Gets the auth value for this UserDatum.
     * 
     * @return auth
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this UserDatum.
     * 
     * @param auth
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
       this.addProperty("auth",auth);
    }


    /**
     * Gets the password value for this UserDatum.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserDatum.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
       this.addProperty("password",password);
    }


    /**
     * Gets the passwordmd5 value for this UserDatum.
     * 
     * @return passwordmd5
     */
    public java.lang.String getPasswordmd5() {
        return passwordmd5;
    }


    /**
     * Sets the passwordmd5 value for this UserDatum.
     * 
     * @param passwordmd5
     */
    public void setPasswordmd5(java.lang.String passwordmd5) {
        this.passwordmd5 = passwordmd5;
       this.addProperty("passwordmd5",passwordmd5);
    }


    /**
     * Gets the idnumber value for this UserDatum.
     * 
     * @return idnumber
     */
    public java.lang.String getIdnumber() {
        return idnumber;
    }


    /**
     * Sets the idnumber value for this UserDatum.
     * 
     * @param idnumber
     */
    public void setIdnumber(java.lang.String idnumber) {
        this.idnumber = idnumber;
       this.addProperty("idnumber",idnumber);
    }


    /**
     * Gets the firstname value for this UserDatum.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this UserDatum.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
       this.addProperty("firstname",firstname);
    }


    /**
     * Gets the lastname value for this UserDatum.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this UserDatum.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
       this.addProperty("lastname",lastname);
    }


    /**
     * Gets the email value for this UserDatum.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserDatum.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
       this.addProperty("email",email);
    }


    /**
     * Gets the emailstop value for this UserDatum.
     * 
     * @return emailstop
     */
    public int getEmailstop() {
        return emailstop;
    }


    /**
     * Sets the emailstop value for this UserDatum.
     * 
     * @param emailstop
     */
    public void setEmailstop(int emailstop) {
        this.emailstop = emailstop;
       this.addProperty("emailstop",emailstop);
    }


    /**
     * Gets the icq value for this UserDatum.
     * 
     * @return icq
     */
    public java.lang.String getIcq() {
        return icq;
    }


    /**
     * Sets the icq value for this UserDatum.
     * 
     * @param icq
     */
    public void setIcq(java.lang.String icq) {
        this.icq = icq;
       this.addProperty("icq",icq);
    }


    /**
     * Gets the skype value for this UserDatum.
     * 
     * @return skype
     */
    public java.lang.String getSkype() {
        return skype;
    }


    /**
     * Sets the skype value for this UserDatum.
     * 
     * @param skype
     */
    public void setSkype(java.lang.String skype) {
        this.skype = skype;
       this.addProperty("skype",skype);
    }


    /**
     * Gets the yahoo value for this UserDatum.
     * 
     * @return yahoo
     */
    public java.lang.String getYahoo() {
        return yahoo;
    }


    /**
     * Sets the yahoo value for this UserDatum.
     * 
     * @param yahoo
     */
    public void setYahoo(java.lang.String yahoo) {
        this.yahoo = yahoo;
       this.addProperty("yahoo",yahoo);
    }


    /**
     * Gets the aim value for this UserDatum.
     * 
     * @return aim
     */
    public java.lang.String getAim() {
        return aim;
    }


    /**
     * Sets the aim value for this UserDatum.
     * 
     * @param aim
     */
    public void setAim(java.lang.String aim) {
        this.aim = aim;
       this.addProperty("aim",aim);
    }


    /**
     * Gets the msn value for this UserDatum.
     * 
     * @return msn
     */
    public java.lang.String getMsn() {
        return msn;
    }


    /**
     * Sets the msn value for this UserDatum.
     * 
     * @param msn
     */
    public void setMsn(java.lang.String msn) {
        this.msn = msn;
       this.addProperty("msn",msn);
    }


    /**
     * Gets the phone1 value for this UserDatum.
     * 
     * @return phone1
     */
    public java.lang.String getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this UserDatum.
     * 
     * @param phone1
     */
    public void setPhone1(java.lang.String phone1) {
        this.phone1 = phone1;
       this.addProperty("phone1",phone1);
    }


    /**
     * Gets the phone2 value for this UserDatum.
     * 
     * @return phone2
     */
    public java.lang.String getPhone2() {
        return phone2;
    }


    /**
     * Sets the phone2 value for this UserDatum.
     * 
     * @param phone2
     */
    public void setPhone2(java.lang.String phone2) {
        this.phone2 = phone2;
       this.addProperty("phone2",phone2);
    }


    /**
     * Gets the institution value for this UserDatum.
     * 
     * @return institution
     */
    public java.lang.String getInstitution() {
        return institution;
    }


    /**
     * Sets the institution value for this UserDatum.
     * 
     * @param institution
     */
    public void setInstitution(java.lang.String institution) {
        this.institution = institution;
       this.addProperty("institution",institution);
    }


    /**
     * Gets the department value for this UserDatum.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this UserDatum.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
       this.addProperty("department",department);
    }


    /**
     * Gets the address value for this UserDatum.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UserDatum.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
       this.addProperty("address",address);
    }


    /**
     * Gets the city value for this UserDatum.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserDatum.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
       this.addProperty("city",city);
    }


    /**
     * Gets the country value for this UserDatum.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserDatum.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
       this.addProperty("country",country);
    }


    /**
     * Gets the lang value for this UserDatum.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this UserDatum.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
       this.addProperty("lang",lang);
    }


    /**
     * Gets the timezone value for this UserDatum.
     * 
     * @return timezone
     */
    public int getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UserDatum.
     * 
     * @param timezone
     */
    public void setTimezone(int timezone) {
        this.timezone = timezone;
       this.addProperty("timezone",timezone);
    }


    /**
     * Gets the lastip value for this UserDatum.
     * 
     * @return lastip
     */
    public java.lang.String getLastip() {
        return lastip;
    }


    /**
     * Sets the lastip value for this UserDatum.
     * 
     * @param lastip
     */
    public void setLastip(java.lang.String lastip) {
        this.lastip = lastip;
       this.addProperty("lastip",lastip);
    }


    /**
     * Gets the theme value for this UserDatum.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this UserDatum.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
       this.addProperty("theme",theme);
    }


    /**
     * Gets the description value for this UserDatum.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserDatum.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the mnethostid value for this UserDatum.
     * 
     * @return mnethostid
     */
    public int getMnethostid() {
        return mnethostid;
    }


    /**
     * Sets the mnethostid value for this UserDatum.
     * 
     * @param mnethostid
     */
    public void setMnethostid(int mnethostid) {
        this.mnethostid = mnethostid;
       this.addProperty("mnethostid",mnethostid);
    }

}
