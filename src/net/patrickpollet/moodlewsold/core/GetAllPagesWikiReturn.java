/**
 * GetAllPagesWikiReturn.java
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

public class GetAllPagesWikiReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.PageWikiRecord[] pageswiki;

    public GetAllPagesWikiReturn(String nameSpace) {
        super(nameSpace,"GetAllPagesWikiReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetAllPagesWikiReturn ret = new GetAllPagesWikiReturn(this.namespace);
      List _pageswiki =KSoap2Utils.getList((SoapObject) response.getProperty("pageswiki"),new PageWikiRecord(this.namespace));
      ret.setPageswiki((PageWikiRecord[]) _pageswiki.toArray(new PageWikiRecord[0]));
      return ret;

    }


    /**
     * Gets the pageswiki value for this GetAllPagesWikiReturn.
     * 
     * @return pageswiki
     */
    public net.patrickpollet.moodlewsold.core.PageWikiRecord[] getPageswiki() {
        return pageswiki;
    }


    /**
     * Sets the pageswiki value for this GetAllPagesWikiReturn.
     * 
     * @param pageswiki
     */
    public void setPageswiki(net.patrickpollet.moodlewsold.core.PageWikiRecord[] pageswiki) {
        this.pageswiki = pageswiki;
       this.addProperty("pageswiki",pageswiki);
    }

}
