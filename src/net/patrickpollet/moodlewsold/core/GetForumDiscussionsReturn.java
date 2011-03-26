/**
 * GetForumDiscussionsReturn.java
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

public class GetForumDiscussionsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ForumDiscussionRecord[] forumDiscussions;

    public GetForumDiscussionsReturn(String nameSpace) {
        super(nameSpace,"GetForumDiscussionsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetForumDiscussionsReturn ret = new GetForumDiscussionsReturn(this.namespace);
      List _forumDiscussions =KSoap2Utils.getList((SoapObject) response.getProperty("forumDiscussions"),new ForumDiscussionRecord(this.namespace));
      ret.setForumDiscussions((ForumDiscussionRecord[]) _forumDiscussions.toArray(new ForumDiscussionRecord[0]));
      return ret;

    }


    /**
     * Gets the forumDiscussions value for this GetForumDiscussionsReturn.
     * 
     * @return forumDiscussions
     */
    public net.patrickpollet.moodlewsold.core.ForumDiscussionRecord[] getForumDiscussions() {
        return forumDiscussions;
    }


    /**
     * Sets the forumDiscussions value for this GetForumDiscussionsReturn.
     * 
     * @param forumDiscussions
     */
    public void setForumDiscussions(net.patrickpollet.moodlewsold.core.ForumDiscussionRecord[] forumDiscussions) {
        this.forumDiscussions = forumDiscussions;
       this.addProperty("forumDiscussions",forumDiscussions);
    }

}
