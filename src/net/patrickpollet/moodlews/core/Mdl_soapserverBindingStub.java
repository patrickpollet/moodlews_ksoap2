/**
 * Mdl_soapserverBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net
 */

package net.patrickpollet.moodlews.core;

import java.util.List;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;
import net.patrickpollet.ksoap2.*;

public class Mdl_soapserverBindingStub extends  KSoap2BindingStubBase{
    public Mdl_soapserverBindingStub(String service_url, String nameSpace, boolean debug) {
         super(service_url,nameSpace,debug);
     }

    public net.patrickpollet.moodlews.core.AssignmentRecord[] add_assignment(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.AssignmentDatum datum)  {
    final String METH_NAME = "add_assignment";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new AssignmentRecord(this.NAMESPACE));
      return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CategoryRecord[] add_category(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CategoryDatum datum)  {
    final String METH_NAME = "add_category";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CategoryRecord(this.NAMESPACE));
      return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] add_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CohortDatum datum)  {
    final String METH_NAME = "add_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] add_course(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CourseDatum coursedatum)  {
    final String METH_NAME = "add_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("coursedatum",coursedatum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.DatabaseRecord[] add_database(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.DatabaseDatum datum)  {
    final String METH_NAME = "add_database";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new DatabaseRecord(this.NAMESPACE));
      return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumRecord[] add_forum(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.ForumDatum datum)  {
    final String METH_NAME = "add_forum";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumRecord(this.NAMESPACE));
      return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] add_group(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupDatum datum)  {
    final String METH_NAME = "add_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] add_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupingDatum datum)  {
    final String METH_NAME = "add_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.LabelRecord[] add_label(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.LabelDatum datum)  {
    final String METH_NAME = "add_label";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new LabelRecord(this.NAMESPACE));
      return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord add_noneditingteacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_noneditingteacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.PageWikiRecord[] add_pagewiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.PageWikiDatum datum)  {
    final String METH_NAME = "add_pagewiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new PageWikiRecord(this.NAMESPACE));
      return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.SectionRecord[] add_section(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.SectionDatum datum)  {
    final String METH_NAME = "add_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new SectionRecord(this.NAMESPACE));
      return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord add_student(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_student";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord add_teacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_teacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] add_user(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.UserDatum userdatum)  {
    final String METH_NAME = "add_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userdatum",userdatum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.WikiRecord[] add_wiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.WikiDatum datum)  {
    final String METH_NAME = "add_wiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new WikiRecord(this.NAMESPACE));
      return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_assignment_to_section(int client, java.lang.String sesskey, int assignmentid, int sectionid, int groupmode)  {
    final String METH_NAME = "affect_assignment_to_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignmentid",assignmentid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_course_to_category(int client, java.lang.String sesskey, int courseid, int categoryid)  {
    final String METH_NAME = "affect_course_to_category";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("categoryid",categoryid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_database_to_section(int client, java.lang.String sesskey, int databaseid, int sectionid)  {
    final String METH_NAME = "affect_database_to_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("databaseid",databaseid);
      envelope.addProperty("sectionid",sectionid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_forum_to_section(int client, java.lang.String sesskey, int forumid, int sectionid, int groupmode)  {
    final String METH_NAME = "affect_forum_to_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_group_to_course(int client, java.lang.String sesskey, int groupid, int courseid)  {
    final String METH_NAME = "affect_group_to_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_group_to_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
    final String METH_NAME = "affect_group_to_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupingid",groupingid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_grouping_to_course(int client, java.lang.String sesskey, int groupingid, int courseid)  {
    final String METH_NAME = "affect_grouping_to_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupingid",groupingid);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_label_to_section(int client, java.lang.String sesskey, int labelid, int sectionid)  {
    final String METH_NAME = "affect_label_to_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("labelid",labelid);
      envelope.addProperty("sectionid",sectionid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_pageWiki_to_wiki(int client, java.lang.String sesskey, int pageid, int wikiid)  {
    final String METH_NAME = "affect_pageWiki_to_wiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("pageid",pageid);
      envelope.addProperty("wikiid",wikiid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_section_to_course(int client, java.lang.String sesskey, int sectionid, int courseid)  {
    final String METH_NAME = "affect_section_to_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_user_to_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "affect_user_to_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_user_to_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
    final String METH_NAME = "affect_user_to_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("rolename",rolename);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_user_to_group(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "affect_user_to_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] affect_users_to_cohort(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "affect_users_to_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] affect_users_to_group(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "affect_users_to_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord affect_wiki_to_section(int client, java.lang.String sesskey, int wikiid, int sectionid, int groupmode, int visible)  {
    final String METH_NAME = "affect_wiki_to_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("wikiid",wikiid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
      envelope.addProperty("visible",visible);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int count_activities(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "count_activities";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Integer response = (Integer) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public int count_users_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield, int roleid)  {
    final String METH_NAME = "count_users_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("roleid",roleid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Integer response = (Integer) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] delete_cohort(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] delete_course(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "delete_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] delete_group(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] delete_grouping(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] delete_user(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "delete_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AssignmentRecord[] edit_assignments(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.AssignmentDatum[] assignments)  {
    final String METH_NAME = "edit_assignments";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _assignments= new SoapObject(this.NAMESPACE,"AssignmentDatumArray");
     if (assignments !=null)      
         for ( Object o : assignments) 
            _assignments.addProperty("item",o);
     envelope.addProperty("assignments",_assignments);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new AssignmentRecord(this.NAMESPACE));
      return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CategoryRecord[] edit_categories(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CategoryDatum[] categories)  {
    final String METH_NAME = "edit_categories";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _categories= new SoapObject(this.NAMESPACE,"CategoryDatumArray");
     if (categories !=null)      
         for ( Object o : categories) 
            _categories.addProperty("item",o);
     envelope.addProperty("categories",_categories);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CategoryRecord(this.NAMESPACE));
      return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] edit_courses(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CourseDatum[] courses)  {
    final String METH_NAME = "edit_courses";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _courses= new SoapObject(this.NAMESPACE,"CourseDatumArray");
     if (courses !=null)      
         for ( Object o : courses) 
            _courses.addProperty("item",o);
     envelope.addProperty("courses",_courses);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.DatabaseRecord[] edit_databases(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.DatabaseDatum[] databases)  {
    final String METH_NAME = "edit_databases";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _databases= new SoapObject(this.NAMESPACE,"DatabaseDatumArray");
     if (databases !=null)      
         for ( Object o : databases) 
            _databases.addProperty("item",o);
     envelope.addProperty("databases",_databases);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new DatabaseRecord(this.NAMESPACE));
      return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumRecord[] edit_forums(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.ForumDatum[] forums)  {
    final String METH_NAME = "edit_forums";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _forums= new SoapObject(this.NAMESPACE,"ForumDatumArray");
     if (forums !=null)      
         for ( Object o : forums) 
            _forums.addProperty("item",o);
     envelope.addProperty("forums",_forums);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumRecord(this.NAMESPACE));
      return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] edit_groupings(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupingDatum[] groupings)  {
    final String METH_NAME = "edit_groupings";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _groupings= new SoapObject(this.NAMESPACE,"GroupingDatumArray");
     if (groupings !=null)      
         for ( Object o : groupings) 
            _groupings.addProperty("item",o);
     envelope.addProperty("groupings",_groupings);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] edit_groups(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupDatum[] groups)  {
    final String METH_NAME = "edit_groups";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _groups= new SoapObject(this.NAMESPACE,"GroupDatumArray");
     if (groups !=null)      
         for ( Object o : groups) 
            _groups.addProperty("item",o);
     envelope.addProperty("groups",_groups);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.LabelRecord[] edit_labels(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.LabelDatum[] labels)  {
    final String METH_NAME = "edit_labels";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _labels= new SoapObject(this.NAMESPACE,"LabelDatumArray");
     if (labels !=null)      
         for ( Object o : labels) 
            _labels.addProperty("item",o);
     envelope.addProperty("labels",_labels);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new LabelRecord(this.NAMESPACE));
      return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.PageWikiRecord[] edit_pagesWiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.PageWikiDatum[] pageswiki)  {
    final String METH_NAME = "edit_pagesWiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _pageswiki= new SoapObject(this.NAMESPACE,"PageWikiDatumArray");
     if (pageswiki !=null)      
         for ( Object o : pageswiki) 
            _pageswiki.addProperty("item",o);
     envelope.addProperty("pageswiki",_pageswiki);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new PageWikiRecord(this.NAMESPACE));
      return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.SectionRecord[] edit_sections(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.SectionDatum[] sections)  {
    final String METH_NAME = "edit_sections";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _sections= new SoapObject(this.NAMESPACE,"SectionDatumArray");
     if (sections !=null)      
         for ( Object o : sections) 
            _sections.addProperty("item",o);
     envelope.addProperty("sections",_sections);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new SectionRecord(this.NAMESPACE));
      return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] edit_users(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.UserDatum[] users)  {
    final String METH_NAME = "edit_users";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _users= new SoapObject(this.NAMESPACE,"UserDatumArray");
     if (users !=null)      
         for ( Object o : users) 
            _users.addProperty("item",o);
     envelope.addProperty("users",_users);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.WikiRecord[] edit_wikis(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.WikiDatum[] wikis)  {
    final String METH_NAME = "edit_wikis";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _wikis= new SoapObject(this.NAMESPACE,"WikiDatumArray");
     if (wikis !=null)      
         for ( Object o : wikis) 
            _wikis.addProperty("item",o);
     envelope.addProperty("wikis",_wikis);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new WikiRecord(this.NAMESPACE));
      return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] enrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "enrol_students";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumDiscussionRecord[] forum_add_discussion(int client, java.lang.String sesskey, int forumid, net.patrickpollet.moodlews.core.ForumDiscussionDatum discussion)  {
    final String METH_NAME = "forum_add_discussion";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("discussion",discussion);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumDiscussionRecord(this.NAMESPACE));
      return (ForumDiscussionRecord[]) ret.toArray( new ForumDiscussionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumPostRecord[] forum_add_reply(int client, java.lang.String sesskey, int parenttid, net.patrickpollet.moodlews.core.ForumPostDatum post)  {
    final String METH_NAME = "forum_add_reply";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("parenttid",parenttid);
      envelope.addProperty("post",post);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumPostRecord(this.NAMESPACE));
      return (ForumPostRecord[]) ret.toArray( new ForumPostRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ActivityRecord[] get_activities(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "get_activities";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ActivityRecord(this.NAMESPACE));
      return (ActivityRecord[]) ret.toArray( new ActivityRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AssignmentRecord[] get_all_assignments(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_assignments";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new AssignmentRecord(this.NAMESPACE));
      return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] get_all_cohorts(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_cohorts";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.DatabaseRecord[] get_all_databases(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_databases";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new DatabaseRecord(this.NAMESPACE));
      return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumRecord[] get_all_forums(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_forums";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumRecord(this.NAMESPACE));
      return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] get_all_groupings(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_groupings";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_all_groups(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_groups";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.LabelRecord[] get_all_labels(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_labels";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new LabelRecord(this.NAMESPACE));
      return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.PageWikiRecord[] get_all_pagesWiki(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_pagesWiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new PageWikiRecord(this.NAMESPACE));
      return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.QuizRecord[] get_all_quizzes(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_quizzes";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new QuizRecord(this.NAMESPACE));
      return (QuizRecord[]) ret.toArray( new QuizRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.WikiRecord[] get_all_wikis(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_wikis";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new WikiRecord(this.NAMESPACE));
      return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AssignmentSubmissionRecord[] get_assignment_submissions(int client, java.lang.String sesskey, int assignmentid, java.lang.String[] userids, java.lang.String useridfield, int timemodified, int zipfiles)  {
    final String METH_NAME = "get_assignment_submissions";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignmentid",assignmentid);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("timemodified",timemodified);
      envelope.addProperty("zipfiles",zipfiles);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new AssignmentSubmissionRecord(this.NAMESPACE));
      return (AssignmentSubmissionRecord[]) ret.toArray( new AssignmentSubmissionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CategoryRecord[] get_categories(int client, java.lang.String sesskey, java.lang.String catid, java.lang.String idfield)  {
    final String METH_NAME = "get_categories";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CategoryRecord(this.NAMESPACE));
      return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CategoryRecord[] get_category_byid(int client, java.lang.String sesskey, java.lang.String catid)  {
    final String METH_NAME = "get_category_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CategoryRecord(this.NAMESPACE));
      return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CategoryRecord[] get_category_byname(int client, java.lang.String sesskey, java.lang.String catname)  {
    final String METH_NAME = "get_category_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catname",catname);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CategoryRecord(this.NAMESPACE));
      return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] get_cohort_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_cohort_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] get_cohort_byidnumber(int client, java.lang.String sesskey, java.lang.String cohortIdNumber)  {
    final String METH_NAME = "get_cohort_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohortIdNumber",cohortIdNumber);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_cohort_members(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "get_cohort_members";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] get_cohorts_byname(int client, java.lang.String sesskey, java.lang.String cohortName)  {
    final String METH_NAME = "get_cohorts_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohortName",cohortName);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_course(int client, java.lang.String sesskey, java.lang.String info, java.lang.String idfield)  {
    final String METH_NAME = "get_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_course_byid(int client, java.lang.String sesskey, java.lang.String info)  {
    final String METH_NAME = "get_course_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_course_byidnumber(int client, java.lang.String sesskey, java.lang.String info)  {
    final String METH_NAME = "get_course_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeRecord[] get_course_grades(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_course_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeRecord(this.NAMESPACE));
      return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_courses(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_courses";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _courseids= new SoapObject(this.NAMESPACE,"StringArray");
     if (courseids !=null)      
         for ( Object o : courseids) 
            _courseids.addProperty("item",o);
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_courses_bycategory(int client, java.lang.String sesskey, java.lang.String catid)  {
    final String METH_NAME = "get_courses_bycategory";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_courses_search(int client, java.lang.String sesskey, java.lang.String search)  {
    final String METH_NAME = "get_courses_search";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("search",search);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EventRecord[] get_events(int client, java.lang.String sesskey, int eventtype, java.lang.String ownerid, java.lang.String owneridfield)  {
    final String METH_NAME = "get_events";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("eventtype",eventtype);
      envelope.addProperty("ownerid",ownerid);
      envelope.addProperty("owneridfield",owneridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EventRecord(this.NAMESPACE));
      return (EventRecord[]) ret.toArray( new EventRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumDiscussionRecord[] get_forum_discussions(int client, java.lang.String sesskey, int forumid, int limit)  {
    final String METH_NAME = "get_forum_discussions";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumDiscussionRecord(this.NAMESPACE));
      return (ForumDiscussionRecord[]) ret.toArray( new ForumDiscussionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ForumPostRecord[] get_forum_posts(int client, java.lang.String sesskey, int discussionid, int limit)  {
    final String METH_NAME = "get_forum_posts";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("discussionid",discussionid);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ForumPostRecord(this.NAMESPACE));
      return (ForumPostRecord[]) ret.toArray( new ForumPostRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeRecord[] get_grades(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String[] courseids, java.lang.String courseidfield)  {
    final String METH_NAME = "get_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
     //generate an arraytype SoapObject for input array 
      SoapObject _courseids= new SoapObject(this.NAMESPACE,"StringArray");
     if (courseids !=null)      
         for ( Object o : courseids) 
            _courseids.addProperty("item",o);
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("courseidfield",courseidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeRecord(this.NAMESPACE));
      return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_group_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_group_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_group_members(int client, java.lang.String sesskey, java.lang.String groupid, java.lang.String groupidfield)  {
    final String METH_NAME = "get_group_members";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupidfield",groupidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_grouping_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_grouping_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_grouping_members(int client, java.lang.String sesskey, java.lang.String groupid, java.lang.String groupidfield)  {
    final String METH_NAME = "get_grouping_members";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupidfield",groupidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] get_groupings_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_groupings_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_groupings_byname(int client, java.lang.String sesskey, java.lang.String groupname, int courseid)  {
    final String METH_NAME = "get_groupings_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupname",groupname);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_groups_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_groups_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_groups_byname(int client, java.lang.String sesskey, java.lang.String groupname, int courseid)  {
    final String METH_NAME = "get_groups_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupname",groupname);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ResourceRecord[] get_instances_bytype(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield, java.lang.String type)  {
    final String METH_NAME = "get_instances_bytype";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _courseids= new SoapObject(this.NAMESPACE,"StringArray");
     if (courseids !=null)      
         for ( Object o : courseids) 
            _courseids.addProperty("item",o);
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("type",type);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ResourceRecord(this.NAMESPACE));
      return (ResourceRecord[]) ret.toArray( new ResourceRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ChangeRecord[] get_last_changes(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "get_last_changes";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ChangeRecord(this.NAMESPACE));
      return (ChangeRecord[]) ret.toArray( new ChangeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ContactRecord[] get_message_contacts(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "get_message_contacts";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ContactRecord(this.NAMESPACE));
      return (ContactRecord[]) ret.toArray( new ContactRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.MessageRecord[] get_messages(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "get_messages";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new MessageRecord(this.NAMESPACE));
      return (MessageRecord[]) ret.toArray( new MessageRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.MessageRecord[] get_messages_history(int client, java.lang.String sesskey, java.lang.String useridto, java.lang.String useridtofield, java.lang.String useridfrom, java.lang.String useridfromfield)  {
    final String METH_NAME = "get_messages_history";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("useridto",useridto);
      envelope.addProperty("useridtofield",useridtofield);
      envelope.addProperty("useridfrom",useridfrom);
      envelope.addProperty("useridfromfield",useridfromfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new MessageRecord(this.NAMESPACE));
      return (MessageRecord[]) ret.toArray( new MessageRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeItemRecord[] get_module_grades(int client, java.lang.String sesskey, int activityid, java.lang.String activitytype, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "get_module_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("activityid",activityid);
      envelope.addProperty("activitytype",activitytype);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeItemRecord(this.NAMESPACE));
      return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeItemRecord[] get_my_assignment_grade(int client, java.lang.String sesskey, int quizid)  {
    final String METH_NAME = "get_my_assignment_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeItemRecord(this.NAMESPACE));
      return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] get_my_cohorts(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
    final String METH_NAME = "get_my_cohorts";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_my_courses(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_my_courses_byidnumber(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] get_my_courses_byusername(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byusername";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_my_group(int client, java.lang.String sesskey, int uid, int idfield, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "get_my_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] get_my_groups(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
    final String METH_NAME = "get_my_groups";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int get_my_id(int client, java.lang.String sesskey)  {
    final String METH_NAME = "get_my_id";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Integer response = (Integer) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews.core.GradeItemRecord[] get_my_module_grade(int client, java.lang.String sesskey, int activityid, java.lang.String activitytype)  {
    final String METH_NAME = "get_my_module_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("activityid",activityid);
      envelope.addProperty("activitytype",activitytype);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeItemRecord(this.NAMESPACE));
      return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeItemRecord[] get_my_quiz_grade(int client, java.lang.String sesskey, int quizid)  {
    final String METH_NAME = "get_my_quiz_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeItemRecord(this.NAMESPACE));
      return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int get_primaryrole_incourse(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "get_primaryrole_incourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Integer response = (Integer) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews.core.QuizRecord get_quiz(int client, java.lang.String sesskey, int quizid, java.lang.String format)  {
    final String METH_NAME = "get_quiz";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
      envelope.addProperty("format",format);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (QuizRecord)KSoap2Utils.getObject(response,new QuizRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.FileRecord get_resourcefile_byid(int client, java.lang.String sesskey, int resourceid)  {
    final String METH_NAME = "get_resourcefile_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("resourceid",resourceid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (FileRecord)KSoap2Utils.getObject(response,new FileRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ResourceRecord[] get_resources(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_resources";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _courseids= new SoapObject(this.NAMESPACE,"StringArray");
     if (courseids !=null)      
         for ( Object o : courseids) 
            _courseids.addProperty("item",o);
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ResourceRecord(this.NAMESPACE));
      return (ResourceRecord[]) ret.toArray( new ResourceRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.RoleRecord[] get_role_byid(int client, java.lang.String sesskey, int roleid)  {
    final String METH_NAME = "get_role_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("roleid",roleid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new RoleRecord(this.NAMESPACE));
      return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.RoleRecord[] get_role_byname(int client, java.lang.String sesskey, java.lang.String rolename)  {
    final String METH_NAME = "get_role_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("rolename",rolename);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new RoleRecord(this.NAMESPACE));
      return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.RoleRecord[] get_roles(int client, java.lang.String sesskey, java.lang.String roleid, java.lang.String idfield)  {
    final String METH_NAME = "get_roles";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("roleid",roleid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new RoleRecord(this.NAMESPACE));
      return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.SectionRecord[] get_sections(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_sections";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _courseids= new SoapObject(this.NAMESPACE,"StringArray");
     if (courseids !=null)      
         for ( Object o : courseids) 
            _courseids.addProperty("item",o);
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new SectionRecord(this.NAMESPACE));
      return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_students";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_teachers(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_teachers";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_user(int client, java.lang.String sesskey, java.lang.String userinfo, java.lang.String idfield)  {
    final String METH_NAME = "get_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_user_byid(int client, java.lang.String sesskey, int userinfo)  {
    final String METH_NAME = "get_user_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_user_byidnumber(int client, java.lang.String sesskey, java.lang.String userinfo)  {
    final String METH_NAME = "get_user_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_user_byusername(int client, java.lang.String sesskey, java.lang.String userinfo)  {
    final String METH_NAME = "get_user_byusername";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GradeRecord[] get_user_grades(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String idfield)  {
    final String METH_NAME = "get_user_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GradeRecord(this.NAMESPACE));
      return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_users(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "get_users";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_users_bycourse(int client, java.lang.String sesskey, java.lang.String idcourse, java.lang.String idfield, int roleid)  {
    final String METH_NAME = "get_users_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("roleid",roleid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] get_users_byprofile(int client, java.lang.String sesskey, java.lang.String profilefieldname, java.lang.String profilefieldvalue)  {
    final String METH_NAME = "get_users_byprofile";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("profilefieldname",profilefieldname);
      envelope.addProperty("profilefieldvalue",profilefieldvalue);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean has_role_incourse(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int roleid)  {
    final String METH_NAME = "has_role_incourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("roleid",roleid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Boolean response = (Boolean) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.booleanValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return false;
        }
   }
    public net.patrickpollet.moodlews.core.LoginReturn login(java.lang.String username, java.lang.String password)  {
    final String METH_NAME = "login";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("username",username);
      envelope.addProperty("password",password);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (LoginReturn)KSoap2Utils.getObject(response,new LoginReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean logout(int client, java.lang.String sesskey)  {
    final String METH_NAME = "logout";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     Boolean response = (Boolean) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.booleanValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return false;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord message_send(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String message)  {
    final String METH_NAME = "message_send";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("message",message);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_group_from_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
    final String METH_NAME = "remove_group_from_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupingid",groupingid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_noneditingteacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_noneditingteacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_student(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_student";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_teacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_teacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_user_from_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "remove_user_from_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_user_from_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
    final String METH_NAME = "remove_user_from_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("rolename",rolename);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.AffectRecord remove_user_from_group(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "remove_user_from_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)KSoap2Utils.getObject(response,new AffectRecord(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] remove_users_from_cohort(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "remove_users_from_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] remove_users_from_group(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "remove_users_from_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.ProfileitemRecord[] set_user_profile_values(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, net.patrickpollet.moodlews.core.ProfileitemRecord[] values)  {
    final String METH_NAME = "set_user_profile_values";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
     //generate an arraytype SoapObject for input array 
      SoapObject _values= new SoapObject(this.NAMESPACE,"ProfileitemRecordArray");
     if (values !=null)      
         for ( Object o : values) 
            _values.addProperty("item",o);
     envelope.addProperty("values",_values);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new ProfileitemRecord(this.NAMESPACE));
      return (ProfileitemRecord[]) ret.toArray( new ProfileitemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.EnrolRecord[] unenrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "unenrol_students";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
     //generate an arraytype SoapObject for input array 
      SoapObject _userids= new SoapObject(this.NAMESPACE,"StringArray");
     if (userids !=null)      
         for ( Object o : userids) 
            _userids.addProperty("item",o);
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new EnrolRecord(this.NAMESPACE));
      return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CohortRecord[] update_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CohortDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CohortRecord(this.NAMESPACE));
      return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.CourseRecord[] update_course(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.CourseDatum datum, java.lang.String courseidfield)  {
    final String METH_NAME = "update_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("courseidfield",courseidfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new CourseRecord(this.NAMESPACE));
      return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupRecord[] update_group(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupRecord(this.NAMESPACE));
      return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.GroupingRecord[] update_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.GroupingDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new GroupingRecord(this.NAMESPACE));
      return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.SectionRecord[] update_section(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.SectionDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new SectionRecord(this.NAMESPACE));
      return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews.core.UserRecord[] update_user(int client, java.lang.String sesskey, net.patrickpollet.moodlews.core.UserDatum datum, java.lang.String useridfield)  {
    final String METH_NAME = "update_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      List ret=this.getList(response,new UserRecord(this.NAMESPACE));
      return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
}
