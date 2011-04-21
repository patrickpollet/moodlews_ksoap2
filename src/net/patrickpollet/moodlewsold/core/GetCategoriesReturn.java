/**
 * GetCategoriesReturn.java
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

public class GetCategoriesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.CategoryRecord[] categories;

    public GetCategoriesReturn(String nameSpace) {
        super(nameSpace,"GetCategoriesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetCategoriesReturn ret = new GetCategoriesReturn(this.namespace);
      List _categories =KSoap2Utils.getList((SoapObject) response.getProperty("categories"),new CategoryRecord(this.namespace));
      ret.setCategories((CategoryRecord[]) _categories.toArray(new CategoryRecord[0]));
      return ret;

    }


    /**
     * Gets the categories value for this GetCategoriesReturn.
     * 
     * @return categories
     */
    public net.patrickpollet.moodlewsold.core.CategoryRecord[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this GetCategoriesReturn.
     * 
     * @param categories
     */
    public void setCategories(net.patrickpollet.moodlewsold.core.CategoryRecord[] categories) {
        this.categories = categories;
       this.addProperty("categories",categories);
    }

}
