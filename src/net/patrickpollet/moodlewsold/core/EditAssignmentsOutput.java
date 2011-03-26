/**
 * EditAssignmentsOutput.java
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

public class EditAssignmentsOutput  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.AssignmentRecord[] assignments;

    public EditAssignmentsOutput(String nameSpace) {
        super(nameSpace,"EditAssignmentsOutput");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      EditAssignmentsOutput ret = new EditAssignmentsOutput(this.namespace);
      List _assignments =KSoap2Utils.getList((SoapObject) response.getProperty("assignments"),new AssignmentRecord(this.namespace));
      ret.setAssignments((AssignmentRecord[]) _assignments.toArray(new AssignmentRecord[0]));
      return ret;

    }


    /**
     * Gets the assignments value for this EditAssignmentsOutput.
     * 
     * @return assignments
     */
    public net.patrickpollet.moodlewsold.core.AssignmentRecord[] getAssignments() {
        return assignments;
    }


    /**
     * Sets the assignments value for this EditAssignmentsOutput.
     * 
     * @param assignments
     */
    public void setAssignments(net.patrickpollet.moodlewsold.core.AssignmentRecord[] assignments) {
        this.assignments = assignments;
       this.addProperty("assignments",assignments);
    }

}
