/**
 * GetGradesReturn.java
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

public class GetGradesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.GradeRecord[] grades;

    public GetGradesReturn(String nameSpace) {
        super(nameSpace,"GetGradesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetGradesReturn ret = new GetGradesReturn(this.namespace);
      List _grades =KSoap2Utils.getList((SoapObject) response.getProperty("grades"),new GradeRecord(this.namespace));
      ret.setGrades((GradeRecord[]) _grades.toArray(new GradeRecord[0]));
      return ret;

    }


    /**
     * Gets the grades value for this GetGradesReturn.
     * 
     * @return grades
     */
    public net.patrickpollet.moodlewsold.core.GradeRecord[] getGrades() {
        return grades;
    }


    /**
     * Sets the grades value for this GetGradesReturn.
     * 
     * @param grades
     */
    public void setGrades(net.patrickpollet.moodlewsold.core.GradeRecord[] grades) {
        this.grades = grades;
       this.addProperty("grades",grades);
    }

}
