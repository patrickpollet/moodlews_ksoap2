/**
 * PageWikiDatum.java
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

public class PageWikiDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int id;

    private java.lang.String pagename;

    private int version;

    private int flags;

    private java.lang.String content;

    private java.lang.String author;

    private int userid;

    private int created;

    private int lastmodified;

    private java.lang.String refs;

    private java.lang.String meta;

    private int hits;

    private int wiki;

    public PageWikiDatum(String nameSpace) {
        super(nameSpace,"PageWikiDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      PageWikiDatum ret = new PageWikiDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setPagename(KSoap2Utils.getString(response,"pagename") );
      ret.setVersion(KSoap2Utils.getInt(response,"version") );
      ret.setFlags(KSoap2Utils.getInt(response,"flags") );
      ret.setContent(KSoap2Utils.getString(response,"content") );
      ret.setAuthor(KSoap2Utils.getString(response,"author") );
      ret.setUserid(KSoap2Utils.getInt(response,"userid") );
      ret.setCreated(KSoap2Utils.getInt(response,"created") );
      ret.setLastmodified(KSoap2Utils.getInt(response,"lastmodified") );
      ret.setRefs(KSoap2Utils.getString(response,"refs") );
      ret.setMeta(KSoap2Utils.getString(response,"meta") );
      ret.setHits(KSoap2Utils.getInt(response,"hits") );
      ret.setWiki(KSoap2Utils.getInt(response,"wiki") );
      return ret;

    }


    /**
     * Gets the action value for this PageWikiDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this PageWikiDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the id value for this PageWikiDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PageWikiDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the pagename value for this PageWikiDatum.
     * 
     * @return pagename
     */
    public java.lang.String getPagename() {
        return pagename;
    }


    /**
     * Sets the pagename value for this PageWikiDatum.
     * 
     * @param pagename
     */
    public void setPagename(java.lang.String pagename) {
        this.pagename = pagename;
       this.addProperty("pagename",pagename);
    }


    /**
     * Gets the version value for this PageWikiDatum.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PageWikiDatum.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
       this.addProperty("version",version);
    }


    /**
     * Gets the flags value for this PageWikiDatum.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this PageWikiDatum.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
       this.addProperty("flags",flags);
    }


    /**
     * Gets the content value for this PageWikiDatum.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this PageWikiDatum.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
       this.addProperty("content",content);
    }


    /**
     * Gets the author value for this PageWikiDatum.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this PageWikiDatum.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
       this.addProperty("author",author);
    }


    /**
     * Gets the userid value for this PageWikiDatum.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this PageWikiDatum.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
       this.addProperty("userid",userid);
    }


    /**
     * Gets the created value for this PageWikiDatum.
     * 
     * @return created
     */
    public int getCreated() {
        return created;
    }


    /**
     * Sets the created value for this PageWikiDatum.
     * 
     * @param created
     */
    public void setCreated(int created) {
        this.created = created;
       this.addProperty("created",created);
    }


    /**
     * Gets the lastmodified value for this PageWikiDatum.
     * 
     * @return lastmodified
     */
    public int getLastmodified() {
        return lastmodified;
    }


    /**
     * Sets the lastmodified value for this PageWikiDatum.
     * 
     * @param lastmodified
     */
    public void setLastmodified(int lastmodified) {
        this.lastmodified = lastmodified;
       this.addProperty("lastmodified",lastmodified);
    }


    /**
     * Gets the refs value for this PageWikiDatum.
     * 
     * @return refs
     */
    public java.lang.String getRefs() {
        return refs;
    }


    /**
     * Sets the refs value for this PageWikiDatum.
     * 
     * @param refs
     */
    public void setRefs(java.lang.String refs) {
        this.refs = refs;
       this.addProperty("refs",refs);
    }


    /**
     * Gets the meta value for this PageWikiDatum.
     * 
     * @return meta
     */
    public java.lang.String getMeta() {
        return meta;
    }


    /**
     * Sets the meta value for this PageWikiDatum.
     * 
     * @param meta
     */
    public void setMeta(java.lang.String meta) {
        this.meta = meta;
       this.addProperty("meta",meta);
    }


    /**
     * Gets the hits value for this PageWikiDatum.
     * 
     * @return hits
     */
    public int getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this PageWikiDatum.
     * 
     * @param hits
     */
    public void setHits(int hits) {
        this.hits = hits;
       this.addProperty("hits",hits);
    }


    /**
     * Gets the wiki value for this PageWikiDatum.
     * 
     * @return wiki
     */
    public int getWiki() {
        return wiki;
    }


    /**
     * Sets the wiki value for this PageWikiDatum.
     * 
     * @param wiki
     */
    public void setWiki(int wiki) {
        this.wiki = wiki;
       this.addProperty("wiki",wiki);
    }

}
