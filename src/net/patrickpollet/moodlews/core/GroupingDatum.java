/**
 * GroupingDatum.java
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

public class GroupingDatum  extends SoapObject  implements Soapeabilisable{
    private java.lang.String action;

    private int courseid;

    private java.lang.String description;

    private int id;

    private java.lang.String name;

    public GroupingDatum(String nameSpace) {
        super(nameSpace,"GroupingDatum");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GroupingDatum ret = new GroupingDatum(this.namespace);
      ret.setAction(KSoap2Utils.getString(response,"action") );
      ret.setCourseid(KSoap2Utils.getInt(response,"courseid") );
      ret.setDescription(KSoap2Utils.getString(response,"description") );
      ret.setId(KSoap2Utils.getInt(response,"id") );
      ret.setName(KSoap2Utils.getString(response,"name") );
      return ret;

    }


    /**
     * Gets the action value for this GroupingDatum.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this GroupingDatum.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
       this.addProperty("action",action);
    }


    /**
     * Gets the courseid value for this GroupingDatum.
     * 
     * @return courseid
     */
    public int getCourseid() {
        return courseid;
    }


    /**
     * Sets the courseid value for this GroupingDatum.
     * 
     * @param courseid
     */
    public void setCourseid(int courseid) {
        this.courseid = courseid;
       this.addProperty("courseid",courseid);
    }


    /**
     * Gets the description value for this GroupingDatum.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GroupingDatum.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
       this.addProperty("description",description);
    }


    /**
     * Gets the id value for this GroupingDatum.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GroupingDatum.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
       this.addProperty("id",id);
    }


    /**
     * Gets the name value for this GroupingDatum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupingDatum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
       this.addProperty("name",name);
    }

}
