/**
 * GetLastChangesReturn.java
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

public class GetLastChangesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ChangeRecord[] changes;

    public GetLastChangesReturn(String nameSpace) {
        super(nameSpace,"GetLastChangesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetLastChangesReturn ret = new GetLastChangesReturn(this.namespace);
      List _changes =KSoap2Utils.getList((SoapObject) response.getProperty("changes"),new ChangeRecord(this.namespace));
      ret.setChanges((ChangeRecord[]) _changes.toArray(new ChangeRecord[0]));
      return ret;

    }


    /**
     * Gets the changes value for this GetLastChangesReturn.
     * 
     * @return changes
     */
    public net.patrickpollet.moodlewsold.core.ChangeRecord[] getChanges() {
        return changes;
    }


    /**
     * Sets the changes value for this GetLastChangesReturn.
     * 
     * @param changes
     */
    public void setChanges(net.patrickpollet.moodlewsold.core.ChangeRecord[] changes) {
        this.changes = changes;
       this.addProperty("changes",changes);
    }

}
