/**
 * CategoryDatum.java
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

public class CategoryDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int depth;

    private java.lang.String description;

    private int id;

    private java.lang.String name;

    private int parent;

    private java.lang.String path;

    private int sortorder;

    private java.lang.String theme;

    private int visible;

    public CategoryDatum(String nameSpace) {
        super(nameSpace,"CategoryDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      CategoryDatum ret = new CategoryDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setDepth(KSoap2Utils.getInt(response,"depth") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      ret.setParent(KSoap2Utils.getInt(response,"parent") );
      ret.setPath(KSoap2Utils.getString(response,"path") );
      ret.setSortorder(KSoap2Utils.getInt(response,"sortorder") );
      ret.setTheme(KSoap2Utils.getString(response,"theme") );
      ret.setVisible(KSoap2Utils.getInt(response,"visible") );
      return ret;

    }


    /**
     * Gets the action value for this CategoryDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CategoryDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the depth value for this CategoryDatum.
     * 
     * @return depth
     */
    public int getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this CategoryDatum.
     * 
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
       this.addProperty("depth",depth);
    }


    /**
     * Gets the description value for this CategoryDatum.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CategoryDatum.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the id value for this CategoryDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CategoryDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this CategoryDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CategoryDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }


    /**
     * Gets the parent value for this CategoryDatum.
     * 
     * @return parent
     */
    public int getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CategoryDatum.
     * 
     * @param parent
     */
    public void setParent(int parent) {
        this.parent = parent;
       this.addProperty("parent",parent);
    }


    /**
     * Gets the path value for this CategoryDatum.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CategoryDatum.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
       this.addProperty("path",path);
    }


    /**
     * Gets the sortorder value for this CategoryDatum.
     * 
     * @return sortorder
     */
    public int getSortorder() {
        return sortorder;
    }


    /**
     * Sets the sortorder value for this CategoryDatum.
     * 
     * @param sortorder
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
       this.addProperty("sortorder",sortorder);
    }


    /**
     * Gets the theme value for this CategoryDatum.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this CategoryDatum.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
       this.addProperty("theme",theme);
    }


    /**
     * Gets the visible value for this CategoryDatum.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this CategoryDatum.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
       this.addProperty("visible",visible);
    }

}
