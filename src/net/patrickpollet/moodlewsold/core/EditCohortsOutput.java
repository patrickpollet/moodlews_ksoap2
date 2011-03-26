/**
 * EditCohortsOutput.java
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

public class EditCohortsOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.CohortRecord[] cohorts;

    public EditCohortsOutput(String nameSpace) {
        super(nameSpace,"EditCohortsOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditCohortsOutput ret = new EditCohortsOutput(this.namespace);
      List _cohorts =KSoap2Utils.getList((SoapObject) response.getProperty("cohorts"),new CohortRecord(this.namespace));
      ret.setCohorts((CohortRecord[]) _cohorts.toArray(new CohortRecord[0]));
      return ret;

    }


    /**
     * Gets the cohorts value for this EditCohortsOutput.
     * 
     * @return cohorts
     */
    public net.patrickpollet.moodlewsold.core.CohortRecord[] getCohorts() {
        return cohorts;
    }


    /**
     * Sets the cohorts value for this EditCohortsOutput.
     * 
     * @param cohorts
     */
    public void setCohorts(net.patrickpollet.moodlewsold.core.CohortRecord[] cohorts) {
        this.cohorts = cohorts;
       this.addProperty("cohorts",cohorts);
    }

}
