/**
 * EnrolStudentsReturn.java
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

public class EnrolStudentsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.EnrolRecord[] students;

    public EnrolStudentsReturn(String nameSpace) {
        super(nameSpace,"EnrolStudentsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EnrolStudentsReturn ret = new EnrolStudentsReturn(this.namespace);
      List _students =KSoap2Utils.getList((SoapObject) response.getProperty("students"),new EnrolRecord(this.namespace));
      ret.setStudents((EnrolRecord[]) _students.toArray(new EnrolRecord[0]));
      return ret;

    }


    /**
     * Gets the students value for this EnrolStudentsReturn.
     * 
     * @return students
     */
    public net.patrickpollet.moodlewsold.core.EnrolRecord[] getStudents() {
        return students;
    }


    /**
     * Sets the students value for this EnrolStudentsReturn.
     * 
     * @param students
     */
    public void setStudents(net.patrickpollet.moodlewsold.core.EnrolRecord[] students) {
        this.students = students;
       this.addProperty("students",students);
    }

}
