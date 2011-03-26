/**
 * GetGroupingsReturn.java
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

public class GetGroupingsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GroupingRecord[] groupings;

    public GetGroupingsReturn(String nameSpace) {
        super(nameSpace,"GetGroupingsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetGroupingsReturn ret = new GetGroupingsReturn(this.namespace);
      List _groupings =KSoap2Utils.getList((SoapObject) response.getProperty("groupings"),new GroupingRecord(this.namespace));
      ret.setGroupings((GroupingRecord[]) _groupings.toArray(new GroupingRecord[0]));
      return ret;

    }


    /**
     * Gets the groupings value for this GetGroupingsReturn.
     * 
     * @return groupings
     */
    public net.patrickpollet.moodlewsold.core.GroupingRecord[] getGroupings() {
        return groupings;
    }


    /**
     * Sets the groupings value for this GetGroupingsReturn.
     * 
     * @param groupings
     */
    public void setGroupings(net.patrickpollet.moodlewsold.core.GroupingRecord[] groupings) {
        this.groupings = groupings;
       this.addProperty("groupings",groupings);
    }

}
