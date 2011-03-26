/**
 * UserRecord.java
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

public class UserRecord  extends SoapObject  implements Soapeabilisable{
    private java.lang.String error;

    private int id;

    private java.lang.String auth;

    private int confirmed;

    private int policyagreed;

    private int deleted;

    private java.lang.String username;

    private java.lang.String idnumber;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String email;

    private java.lang.String icq;

    private int emailstop;

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

    private int mnethostid;

    private java.lang.String lastip;

    private java.lang.String theme;

    private java.lang.String description;

    private int role;

    private net.patrickpollet.moodlewsold.core.ProfileitemRecord[] profile;

    public UserRecord(String nameSpace) {
        super(nameSpace,"UserRecord");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      UserRecord ret = new UserRecord(this.namespace);
      ret.setError(KSoap2Utils.getString(response,"error") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setAuth(KSoap2Utils.getString(response,"auth") );
      ret.setConfirmed(KSoap2Utils.getInt(response,"confirmed") );
      ret.setPolicyagreed(KSoap2Utils.getInt(response,"policyagreed") );
      ret.setDeleted(KSoap2Utils.getInt(response,"deleted") );
      ret.setUsername(KSoap2Utils.getString(response,"username") );
      ret.setIdnumber(KSoap2Utils.getString(response,"idnumber") );
      ret.setFirstname(KSoap2Utils.getString(response,"firstname") );
      ret.setLastname(KSoap2Utils.getString(response,"lastname") );
      ret.setEmail(KSoap2Utils.getString(response,"email") );
      ret.setIcq(KSoap2Utils.getString(response,"icq") );
      ret.setEmailstop(KSoap2Utils.getInt(response,"emailstop") );
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
      ret.setMnethostid(KSoap2Utils.getInt(response,"mnethostid") );
      ret.setLastip(KSoap2Utils.getString(response,"lastip") );
      ret.setTheme(KSoap2Utils.getString(response,"theme") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setRole(KSoap2Utils.getInt(response,"role") );
      List _profile =KSoap2Utils.getList((SoapObject) response.getProperty("profile"),new ProfileitemRecord(this.namespace));
      ret.setProfile((ProfileitemRecord[]) _profile.toArray(new ProfileitemRecord[0]));
      return ret;

    }


    /**
     * Gets the error value for this UserRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this UserRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
       this.addProperty("error",error);
    }


    /**
     * Gets the id value for this UserRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this UserRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the auth value for this UserRecord.
     * 
     * @return auth
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this UserRecord.
     * 
     * @param auth
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
       this.addProperty("auth",auth);
    }


    /**
     * Gets the confirmed value for this UserRecord.
     * 
     * @return confirmed
     */
    public int getConfirmed() {
        return confirmed;
    }


    /**
     * Sets the confirmed value for this UserRecord.
     * 
     * @param confirmed
     */
    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
       this.addProperty("confirmed",confirmed);
    }


    /**
     * Gets the policyagreed value for this UserRecord.
     * 
     * @return policyagreed
     */
    public int getPolicyagreed() {
        return policyagreed;
    }


    /**
     * Sets the policyagreed value for this UserRecord.
     * 
     * @param policyagreed
     */
    public void setPolicyagreed(int policyagreed) {
        this.policyagreed = policyagreed;
       this.addProperty("policyagreed",policyagreed);
    }


    /**
     * Gets the deleted value for this UserRecord.
     * 
     * @return deleted
     */
    public int getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this UserRecord.
     * 
     * @param deleted
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
       this.addProperty("deleted",deleted);
    }


    /**
     * Gets the username value for this UserRecord.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserRecord.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
       this.addProperty("username",username);
    }


    /**
     * Gets the idnumber value for this UserRecord.
     * 
     * @return idnumber
     */
    public java.lang.String getIdnumber() {
        return idnumber;
    }


    /**
     * Sets the idnumber value for this UserRecord.
     * 
     * @param idnumber
     */
    public void setIdnumber(java.lang.String idnumber) {
        this.idnumber = idnumber;
       this.addProperty("idnumber",idnumber);
    }


    /**
     * Gets the firstname value for this UserRecord.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this UserRecord.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
       this.addProperty("firstname",firstname);
    }


    /**
     * Gets the lastname value for this UserRecord.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this UserRecord.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
       this.addProperty("lastname",lastname);
    }


    /**
     * Gets the email value for this UserRecord.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserRecord.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
       this.addProperty("email",email);
    }


    /**
     * Gets the icq value for this UserRecord.
     * 
     * @return icq
     */
    public java.lang.String getIcq() {
        return icq;
    }


    /**
     * Sets the icq value for this UserRecord.
     * 
     * @param icq
     */
    public void setIcq(java.lang.String icq) {
        this.icq = icq;
       this.addProperty("icq",icq);
    }


    /**
     * Gets the emailstop value for this UserRecord.
     * 
     * @return emailstop
     */
    public int getEmailstop() {
        return emailstop;
    }


    /**
     * Sets the emailstop value for this UserRecord.
     * 
     * @param emailstop
     */
    public void setEmailstop(int emailstop) {
        this.emailstop = emailstop;
       this.addProperty("emailstop",emailstop);
    }


    /**
     * Gets the skype value for this UserRecord.
     * 
     * @return skype
     */
    public java.lang.String getSkype() {
        return skype;
    }


    /**
     * Sets the skype value for this UserRecord.
     * 
     * @param skype
     */
    public void setSkype(java.lang.String skype) {
        this.skype = skype;
       this.addProperty("skype",skype);
    }


    /**
     * Gets the yahoo value for this UserRecord.
     * 
     * @return yahoo
     */
    public java.lang.String getYahoo() {
        return yahoo;
    }


    /**
     * Sets the yahoo value for this UserRecord.
     * 
     * @param yahoo
     */
    public void setYahoo(java.lang.String yahoo) {
        this.yahoo = yahoo;
       this.addProperty("yahoo",yahoo);
    }


    /**
     * Gets the aim value for this UserRecord.
     * 
     * @return aim
     */
    public java.lang.String getAim() {
        return aim;
    }


    /**
     * Sets the aim value for this UserRecord.
     * 
     * @param aim
     */
    public void setAim(java.lang.String aim) {
        this.aim = aim;
       this.addProperty("aim",aim);
    }


    /**
     * Gets the msn value for this UserRecord.
     * 
     * @return msn
     */
    public java.lang.String getMsn() {
        return msn;
    }


    /**
     * Sets the msn value for this UserRecord.
     * 
     * @param msn
     */
    public void setMsn(java.lang.String msn) {
        this.msn = msn;
       this.addProperty("msn",msn);
    }


    /**
     * Gets the phone1 value for this UserRecord.
     * 
     * @return phone1
     */
    public java.lang.String getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this UserRecord.
     * 
     * @param phone1
     */
    public void setPhone1(java.lang.String phone1) {
        this.phone1 = phone1;
       this.addProperty("phone1",phone1);
    }


    /**
     * Gets the phone2 value for this UserRecord.
     * 
     * @return phone2
     */
    public java.lang.String getPhone2() {
        return phone2;
    }


    /**
     * Sets the phone2 value for this UserRecord.
     * 
     * @param phone2
     */
    public void setPhone2(java.lang.String phone2) {
        this.phone2 = phone2;
       this.addProperty("phone2",phone2);
    }


    /**
     * Gets the institution value for this UserRecord.
     * 
     * @return institution
     */
    public java.lang.String getInstitution() {
        return institution;
    }


    /**
     * Sets the institution value for this UserRecord.
     * 
     * @param institution
     */
    public void setInstitution(java.lang.String institution) {
        this.institution = institution;
       this.addProperty("institution",institution);
    }


    /**
     * Gets the department value for this UserRecord.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this UserRecord.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
       this.addProperty("department",department);
    }


    /**
     * Gets the address value for this UserRecord.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UserRecord.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
       this.addProperty("address",address);
    }


    /**
     * Gets the city value for this UserRecord.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserRecord.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
       this.addProperty("city",city);
    }


    /**
     * Gets the country value for this UserRecord.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserRecord.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
       this.addProperty("country",country);
    }


    /**
     * Gets the lang value for this UserRecord.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this UserRecord.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
       this.addProperty("lang",lang);
    }


    /**
     * Gets the timezone value for this UserRecord.
     * 
     * @return timezone
     */
    public int getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UserRecord.
     * 
     * @param timezone
     */
    public void setTimezone(int timezone) {
        this.timezone = timezone;
       this.addProperty("timezone",timezone);
    }


    /**
     * Gets the mnethostid value for this UserRecord.
     * 
     * @return mnethostid
     */
    public int getMnethostid() {
        return mnethostid;
    }


    /**
     * Sets the mnethostid value for this UserRecord.
     * 
     * @param mnethostid
     */
    public void setMnethostid(int mnethostid) {
        this.mnethostid = mnethostid;
       this.addProperty("mnethostid",mnethostid);
    }


    /**
     * Gets the lastip value for this UserRecord.
     * 
     * @return lastip
     */
    public java.lang.String getLastip() {
        return lastip;
    }


    /**
     * Sets the lastip value for this UserRecord.
     * 
     * @param lastip
     */
    public void setLastip(java.lang.String lastip) {
        this.lastip = lastip;
       this.addProperty("lastip",lastip);
    }


    /**
     * Gets the theme value for this UserRecord.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this UserRecord.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
       this.addProperty("theme",theme);
    }


    /**
     * Gets the description value for this UserRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the role value for this UserRecord.
     * 
     * @return role
     */
    public int getRole() {
        return role;
    }


    /**
     * Sets the role value for this UserRecord.
     * 
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
       this.addProperty("role",role);
    }


    /**
     * Gets the profile value for this UserRecord.
     * 
     * @return profile
     */
    public net.patrickpollet.moodlewsold.core.ProfileitemRecord[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this UserRecord.
     * 
     * @param profile
     */
    public void setProfile(net.patrickpollet.moodlewsold.core.ProfileitemRecord[] profile) {
        this.profile = profile;
       this.addProperty("profile",profile);
    }

}
