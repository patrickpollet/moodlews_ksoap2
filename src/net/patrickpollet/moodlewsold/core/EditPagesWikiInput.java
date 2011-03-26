/**
 * EditPagesWikiInput.java
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

public class EditPagesWikiInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.PageWikiDatum[] pagesWiki;

    public EditPagesWikiInput(String nameSpace) {
        super(nameSpace,"EditPagesWikiInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditPagesWikiInput ret = new EditPagesWikiInput(this.namespace);
      List _pagesWiki =KSoap2Utils.getList((SoapObject) response.getProperty("pagesWiki"),new PageWikiDatum(this.namespace));
      ret.setPagesWiki((PageWikiDatum[]) _pagesWiki.toArray(new PageWikiDatum[0]));
      return ret;

    }


    /**
     * Gets the pagesWiki value for this EditPagesWikiInput.
     * 
     * @return pagesWiki
     */
    public net.patrickpollet.moodlewsold.core.PageWikiDatum[] getPagesWiki() {
        return pagesWiki;
    }


    /**
     * Sets the pagesWiki value for this EditPagesWikiInput.
     * 
     * @param pagesWiki
     */
    public void setPagesWiki(net.patrickpollet.moodlewsold.core.PageWikiDatum[] pagesWiki) {
        this.pagesWiki = pagesWiki;
       this.addProperty("pagesWiki",pagesWiki);
    }

}
