/**
 * GetSectionsReturn.java
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

public class GetSectionsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.SectionRecord[] sections;

    public GetSectionsReturn(String nameSpace) {
        super(nameSpace,"GetSectionsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetSectionsReturn ret = new GetSectionsReturn(this.namespace);
      List _sections =KSoap2Utils.getList((SoapObject) response.getProperty("sections"),new SectionRecord(this.namespace));
      ret.setSections((SectionRecord[]) _sections.toArray(new SectionRecord[0]));
      return ret;

    }


    /**
     * Gets the sections value for this GetSectionsReturn.
     * 
     * @return sections
     */
    public net.patrickpollet.moodlewsold.core.SectionRecord[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this GetSectionsReturn.
     * 
     * @param sections
     */
    public void setSections(net.patrickpollet.moodlewsold.core.SectionRecord[] sections) {
        this.sections = sections;
       this.addProperty("sections",sections);
    }

}
