/**
 * EditAssignmentsInput.java
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

public class EditAssignmentsInput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.AssignmentDatum[] assignments;

    public EditAssignmentsInput(String nameSpace) {
        super(nameSpace,"EditAssignmentsInput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditAssignmentsInput ret = new EditAssignmentsInput(this.namespace);
      List _assignments =KSoap2Utils.getList((SoapObject) response.getProperty("assignments"),new AssignmentDatum(this.namespace));
      ret.setAssignments((AssignmentDatum[]) _assignments.toArray(new AssignmentDatum[0]));
      return ret;

    }


    /**
     * Gets the assignments value for this EditAssignmentsInput.
     * 
     * @return assignments
     */
    public net.patrickpollet.moodlewsold.core.AssignmentDatum[] getAssignments() {
        return assignments;
    }


    /**
     * Sets the assignments value for this EditAssignmentsInput.
     * 
     * @param assignments
     */
    public void setAssignments(net.patrickpollet.moodlewsold.core.AssignmentDatum[] assignments) {
        this.assignments = assignments;
       this.addProperty("assignments",assignments);
    }

}
