/**
 * GetAllDatabasesReturn.java
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

public class GetAllDatabasesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.DatabaseRecord[] databases;

    public GetAllDatabasesReturn(String nameSpace) {
        super(nameSpace,"GetAllDatabasesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetAllDatabasesReturn ret = new GetAllDatabasesReturn(this.namespace);
      List _databases =KSoap2Utils.getList((SoapObject) response.getProperty("databases"),new DatabaseRecord(this.namespace));
      ret.setDatabases((DatabaseRecord[]) _databases.toArray(new DatabaseRecord[0]));
      return ret;

    }


    /**
     * Gets the databases value for this GetAllDatabasesReturn.
     * 
     * @return databases
     */
    public net.patrickpollet.moodlewsold.core.DatabaseRecord[] getDatabases() {
        return databases;
    }


    /**
     * Sets the databases value for this GetAllDatabasesReturn.
     * 
     * @param databases
     */
    public void setDatabases(net.patrickpollet.moodlewsold.core.DatabaseRecord[] databases) {
        this.databases = databases;
       this.addProperty("databases",databases);
    }

}
