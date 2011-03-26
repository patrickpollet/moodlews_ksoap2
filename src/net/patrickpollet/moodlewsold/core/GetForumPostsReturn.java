/**
 * GetForumPostsReturn.java
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

public class GetForumPostsReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.ForumPostRecord[] forumPosts;

    public GetForumPostsReturn(String nameSpace) {
        super(nameSpace,"GetForumPostsReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetForumPostsReturn ret = new GetForumPostsReturn(this.namespace);
      List _forumPosts =KSoap2Utils.getList((SoapObject) response.getProperty("forumPosts"),new ForumPostRecord(this.namespace));
      ret.setForumPosts((ForumPostRecord[]) _forumPosts.toArray(new ForumPostRecord[0]));
      return ret;

    }


    /**
     * Gets the forumPosts value for this GetForumPostsReturn.
     * 
     * @return forumPosts
     */
    public net.patrickpollet.moodlewsold.core.ForumPostRecord[] getForumPosts() {
        return forumPosts;
    }


    /**
     * Sets the forumPosts value for this GetForumPostsReturn.
     * 
     * @param forumPosts
     */
    public void setForumPosts(net.patrickpollet.moodlewsold.core.ForumPostRecord[] forumPosts) {
        this.forumPosts = forumPosts;
       this.addProperty("forumPosts",forumPosts);
    }

}
