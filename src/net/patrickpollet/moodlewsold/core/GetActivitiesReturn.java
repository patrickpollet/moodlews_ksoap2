/**
 * GetActivitiesReturn.java
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

public class GetActivitiesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ActivityRecord[] activities;

    public GetActivitiesReturn(String nameSpace) {
        super(nameSpace,"GetActivitiesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetActivitiesReturn ret = new GetActivitiesReturn(this.namespace);
      List _activities =KSoap2Utils.getList((SoapObject) response.getProperty("activities"),new ActivityRecord(this.namespace));
      ret.setActivities((ActivityRecord[]) _activities.toArray(new ActivityRecord[0]));
      return ret;

    }


    /**
     * Gets the activities value for this GetActivitiesReturn.
     * 
     * @return activities
     */
    public net.patrickpollet.moodlewsold.core.ActivityRecord[] getActivities() {
        return activities;
    }


    /**
     * Sets the activities value for this GetActivitiesReturn.
     * 
     * @param activities
     */
    public void setActivities(net.patrickpollet.moodlewsold.core.ActivityRecord[] activities) {
        this.activities = activities;
       this.addProperty("activities",activities);
    }

}
