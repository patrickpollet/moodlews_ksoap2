/**
 * GetEventsReturn.java
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

public class GetEventsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.EventRecord[] events;

    public GetEventsReturn(String nameSpace) {
        super(nameSpace,"GetEventsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetEventsReturn ret = new GetEventsReturn(this.namespace);
      List _events =KSoap2Utils.getList((SoapObject) response.getProperty("events"),new EventRecord(this.namespace));
      ret.setEvents((EventRecord[]) _events.toArray(new EventRecord[0]));
      return ret;

    }


    /**
     * Gets the events value for this GetEventsReturn.
     * 
     * @return events
     */
    public net.patrickpollet.moodlewsold.core.EventRecord[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this GetEventsReturn.
     * 
     * @param events
     */
    public void setEvents(net.patrickpollet.moodlewsold.core.EventRecord[] events) {
        this.events = events;
       this.addProperty("events",events);
    }

}
