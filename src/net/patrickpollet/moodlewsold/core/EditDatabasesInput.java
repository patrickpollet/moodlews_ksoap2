/**
 * EditDatabasesInput.java
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

public class EditDatabasesInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.DatabaseDatum[] databases;

    public EditDatabasesInput(String nameSpace) {
        super(nameSpace,"EditDatabasesInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditDatabasesInput ret = new EditDatabasesInput(this.namespace);
      List _databases =KSoap2Utils.getList((SoapObject) response.getProperty("databases"),new DatabaseDatum(this.namespace));
      ret.setDatabases((DatabaseDatum[]) _databases.toArray(new DatabaseDatum[0]));
      return ret;

    }


    /**
     * Gets the databases value for this EditDatabasesInput.
     * 
     * @return databases
     */
    public net.patrickpollet.moodlewsold.core.DatabaseDatum[] getDatabases() {
        return databases;
    }


    /**
     * Sets the databases value for this EditDatabasesInput.
     * 
     * @param databases
     */
    public void setDatabases(net.patrickpollet.moodlewsold.core.DatabaseDatum[] databases) {
        this.databases = databases;
       this.addProperty("databases",databases);
    }

}
