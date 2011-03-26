/**
 * EditCoursesInput.java
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

public class EditCoursesInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.CourseDatum[] courses;

    public EditCoursesInput(String nameSpace) {
        super(nameSpace,"EditCoursesInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditCoursesInput ret = new EditCoursesInput(this.namespace);
      List _courses =KSoap2Utils.getList((SoapObject) response.getProperty("courses"),new CourseDatum(this.namespace));
      ret.setCourses((CourseDatum[]) _courses.toArray(new CourseDatum[0]));
      return ret;

    }


    /**
     * Gets the courses value for this EditCoursesInput.
     * 
     * @return courses
     */
    public net.patrickpollet.moodlewsold.core.CourseDatum[] getCourses() {
        return courses;
    }


    /**
     * Sets the courses value for this EditCoursesInput.
     * 
     * @param courses
     */
    public void setCourses(net.patrickpollet.moodlewsold.core.CourseDatum[] courses) {
        this.courses = courses;
       this.addProperty("courses",courses);
    }

}
