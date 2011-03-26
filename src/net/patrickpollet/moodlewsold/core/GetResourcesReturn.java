/**
 * GetResourcesReturn.java
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

public class GetResourcesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ResourceRecord[] resources;

    public GetResourcesReturn(String nameSpace) {
        super(nameSpace,"GetResourcesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetResourcesReturn ret = new GetResourcesReturn(this.namespace);
      List _resources =KSoap2Utils.getList((SoapObject) response.getProperty("resources"),new ResourceRecord(this.namespace));
      ret.setResources((ResourceRecord[]) _resources.toArray(new ResourceRecord[0]));
      return ret;

    }


    /**
     * Gets the resources value for this GetResourcesReturn.
     * 
     * @return resources
     */
    public net.patrickpollet.moodlewsold.core.ResourceRecord[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this GetResourcesReturn.
     * 
     * @param resources
     */
    public void setResources(net.patrickpollet.moodlewsold.core.ResourceRecord[] resources) {
        this.resources = resources;
       this.addProperty("resources",resources);
    }

}
