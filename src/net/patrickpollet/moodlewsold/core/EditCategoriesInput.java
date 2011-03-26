/**
 * EditCategoriesInput.java
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

public class EditCategoriesInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.CategoryDatum[] categories;

    public EditCategoriesInput(String nameSpace) {
        super(nameSpace,"EditCategoriesInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditCategoriesInput ret = new EditCategoriesInput(this.namespace);
      List _categories =KSoap2Utils.getList((SoapObject) response.getProperty("categories"),new CategoryDatum(this.namespace));
      ret.setCategories((CategoryDatum[]) _categories.toArray(new CategoryDatum[0]));
      return ret;

    }


    /**
     * Gets the categories value for this EditCategoriesInput.
     * 
     * @return categories
     */
    public net.patrickpollet.moodlewsold.core.CategoryDatum[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this EditCategoriesInput.
     * 
     * @param categories
     */
    public void setCategories(net.patrickpollet.moodlewsold.core.CategoryDatum[] categories) {
        this.categories = categories;
       this.addProperty("categories",categories);
    }

}
