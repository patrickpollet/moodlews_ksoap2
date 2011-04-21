/**
 * GetModuleGradesReturn.java
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

public class GetModuleGradesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GradeItemRecord[] grades;

    public GetModuleGradesReturn(String nameSpace) {
        super(nameSpace,"GetModuleGradesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetModuleGradesReturn ret = new GetModuleGradesReturn(this.namespace);
      List _grades =KSoap2Utils.getList((SoapObject) response.getProperty("grades"),new GradeItemRecord(this.namespace));
      ret.setGrades((GradeItemRecord[]) _grades.toArray(new GradeItemRecord[0]));
      return ret;

    }


    /**
     * Gets the grades value for this GetModuleGradesReturn.
     * 
     * @return grades
     */
    public net.patrickpollet.moodlewsold.core.GradeItemRecord[] getGrades() {
        return grades;
    }


    /**
     * Sets the grades value for this GetModuleGradesReturn.
     * 
     * @param grades
     */
    public void setGrades(net.patrickpollet.moodlewsold.core.GradeItemRecord[] grades) {
        this.grades = grades;
       this.addProperty("grades",grades);
    }

}
