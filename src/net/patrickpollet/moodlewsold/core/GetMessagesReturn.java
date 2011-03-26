/**
 * GetMessagesReturn.java
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

public class GetMessagesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.MessageRecord[] messages;

    public GetMessagesReturn(String nameSpace) {
        super(nameSpace,"GetMessagesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetMessagesReturn ret = new GetMessagesReturn(this.namespace);
      List _messages =KSoap2Utils.getList((SoapObject) response.getProperty("messages"),new MessageRecord(this.namespace));
      ret.setMessages((MessageRecord[]) _messages.toArray(new MessageRecord[0]));
      return ret;

    }


    /**
     * Gets the messages value for this GetMessagesReturn.
     * 
     * @return messages
     */
    public net.patrickpollet.moodlewsold.core.MessageRecord[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this GetMessagesReturn.
     * 
     * @param messages
     */
    public void setMessages(net.patrickpollet.moodlewsold.core.MessageRecord[] messages) {
        this.messages = messages;
       this.addProperty("messages",messages);
    }

}
