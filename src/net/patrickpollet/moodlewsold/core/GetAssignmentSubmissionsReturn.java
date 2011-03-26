/**
 * GetAssignmentSubmissionsReturn.java
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

public class GetAssignmentSubmissionsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.AssignmentSubmissionRecord[] submissions;

    public GetAssignmentSubmissionsReturn(String nameSpace) {
        super(nameSpace,"GetAssignmentSubmissionsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetAssignmentSubmissionsReturn ret = new GetAssignmentSubmissionsReturn(this.namespace);
      List _submissions =KSoap2Utils.getList((SoapObject) response.getProperty("submissions"),new AssignmentSubmissionRecord(this.namespace));
      ret.setSubmissions((AssignmentSubmissionRecord[]) _submissions.toArray(new AssignmentSubmissionRecord[0]));
      return ret;

    }


    /**
     * Gets the submissions value for this GetAssignmentSubmissionsReturn.
     * 
     * @return submissions
     */
    public net.patrickpollet.moodlewsold.core.AssignmentSubmissionRecord[] getSubmissions() {
        return submissions;
    }


    /**
     * Sets the submissions value for this GetAssignmentSubmissionsReturn.
     * 
     * @param submissions
     */
    public void setSubmissions(net.patrickpollet.moodlewsold.core.AssignmentSubmissionRecord[] submissions) {
        this.submissions = submissions;
       this.addProperty("submissions",submissions);
    }

}
