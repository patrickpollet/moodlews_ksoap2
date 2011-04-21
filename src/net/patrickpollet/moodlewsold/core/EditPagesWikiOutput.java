/**
 * EditPagesWikiOutput.java
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

public class EditPagesWikiOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.PageWikiRecord[] pagesWiki;

    public EditPagesWikiOutput(String nameSpace) {
        super(nameSpace,"EditPagesWikiOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditPagesWikiOutput ret = new EditPagesWikiOutput(this.namespace);
      List _pagesWiki =KSoap2Utils.getList((SoapObject) response.getProperty("pagesWiki"),new PageWikiRecord(this.namespace));
      ret.setPagesWiki((PageWikiRecord[]) _pagesWiki.toArray(new PageWikiRecord[0]));
      return ret;

    }


    /**
     * Gets the pagesWiki value for this EditPagesWikiOutput.
     * 
     * @return pagesWiki
     */
    public net.patrickpollet.moodlewsold.core.PageWikiRecord[] getPagesWiki() {
        return pagesWiki;
    }


    /**
     * Sets the pagesWiki value for this EditPagesWikiOutput.
     * 
     * @param pagesWiki
     */
    public void setPagesWiki(net.patrickpollet.moodlewsold.core.PageWikiRecord[] pagesWiki) {
        this.pagesWiki = pagesWiki;
       this.addProperty("pagesWiki",pagesWiki);
    }

}
