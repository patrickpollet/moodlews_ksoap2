package net.patrickpollet.ksoap2;

import java.io.IOException;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/**
* 
* @author PPollet
* Used to marshal integer - crucial to serialization for SOAP
* some WSDL send xsd:integer instead of xsd:int and whithout this class
* if will be 'marshalled" as java.lang.BigInteger
*/
public class MarshalInteger implements Marshal 
{


    public Object readInstance(XmlPullParser parser, String namespace, String name, 
            PropertyInfo expected) throws IOException, XmlPullParserException {
        
        return Double.parseDouble(parser.nextText());
    }


    public void register(SoapSerializationEnvelope cm) {
         cm.addMapping(cm.xsd, "integer", Integer.class, this);
        
    }


    public void writeInstance(XmlSerializer writer, Object obj) throws IOException {
           writer.text(obj.toString());
        }
    
}

