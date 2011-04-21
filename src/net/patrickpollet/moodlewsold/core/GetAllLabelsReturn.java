/**
 * GetAllLabelsReturn.java
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

public class GetAllLabelsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.LabelRecord[] labels;

    public GetAllLabelsReturn(String nameSpace) {
        super(nameSpace,"GetAllLabelsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetAllLabelsReturn ret = new GetAllLabelsReturn(this.namespace);
      List _labels =KSoap2Utils.getList((SoapObject) response.getProperty("labels"),new LabelRecord(this.namespace));
      ret.setLabels((LabelRecord[]) _labels.toArray(new LabelRecord[0]));
      return ret;

    }


    /**
     * Gets the labels value for this GetAllLabelsReturn.
     * 
     * @return labels
     */
    public net.patrickpollet.moodlewsold.core.LabelRecord[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this GetAllLabelsReturn.
     * 
     * @param labels
     */
    public void setLabels(net.patrickpollet.moodlewsold.core.LabelRecord[] labels) {
        this.labels = labels;
       this.addProperty("labels",labels);
    }

}
