/**
 * EditCoursesOutput.java
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

public class EditCoursesOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.CourseRecord[] courses;

    public EditCoursesOutput(String nameSpace) {
        super(nameSpace,"EditCoursesOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditCoursesOutput ret = new EditCoursesOutput(this.namespace);
      List _courses =KSoap2Utils.getList((SoapObject) response.getProperty("courses"),new CourseRecord(this.namespace));
      ret.setCourses((CourseRecord[]) _courses.toArray(new CourseRecord[0]));
      return ret;

    }


    /**
     * Gets the courses value for this EditCoursesOutput.
     * 
     * @return courses
     */
    public net.patrickpollet.moodlewsold.core.CourseRecord[] getCourses() {
        return courses;
    }


    /**
     * Sets the courses value for this EditCoursesOutput.
     * 
     * @param courses
     */
    public void setCourses(net.patrickpollet.moodlewsold.core.CourseRecord[] courses) {
        this.courses = courses;
       this.addProperty("courses",courses);
    }

}
