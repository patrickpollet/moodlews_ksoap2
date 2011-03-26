/**
 * EditLabelsInput.java
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

public class EditLabelsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.LabelDatum[] labels;

    public EditLabelsInput(String nameSpace) {
        super(nameSpace,"EditLabelsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditLabelsInput ret = new EditLabelsInput(this.namespace);
      List _labels =KSoap2Utils.getList((SoapObject) response.getProperty("labels"),new LabelDatum(this.namespace));
      ret.setLabels((LabelDatum[]) _labels.toArray(new LabelDatum[0]));
      return ret;

    }


    /**
     * Gets the labels value for this EditLabelsInput.
     * 
     * @return labels
     */
    public net.patrickpollet.moodlewsold.core.LabelDatum[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this EditLabelsInput.
     * 
     * @param labels
     */
    public void setLabels(net.patrickpollet.moodlewsold.core.LabelDatum[] labels) {
        this.labels = labels;
       this.addProperty("labels",labels);
    }

}
