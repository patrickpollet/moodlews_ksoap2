/**
 * EditSectionsInput.java
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

public class EditSectionsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.SectionDatum[] sections;

    public EditSectionsInput(String nameSpace) {
        super(nameSpace,"EditSectionsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditSectionsInput ret = new EditSectionsInput(this.namespace);
      List _sections =KSoap2Utils.getList((SoapObject) response.getProperty("sections"),new SectionDatum(this.namespace));
      ret.setSections((SectionDatum[]) _sections.toArray(new SectionDatum[0]));
      return ret;

    }


    /**
     * Gets the sections value for this EditSectionsInput.
     * 
     * @return sections
     */
    public net.patrickpollet.moodlewsold.core.SectionDatum[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this EditSectionsInput.
     * 
     * @param sections
     */
    public void setSections(net.patrickpollet.moodlewsold.core.SectionDatum[] sections) {
        this.sections = sections;
       this.addProperty("sections",sections);
    }

}
