/**
 * MoodleWSBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net using KSoap2StubWriter
 */

package net.patrickpollet.moodlewsold.core;

import java.util.List;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;
import net.patrickpollet.ksoap2.*;

public class MoodleWSBindingStub extends  KSoap2BindingStubBase{
    public MoodleWSBindingStub(String service_url, String nameSpace, boolean debug) {
         super(service_url,nameSpace,debug);
     }

    public net.patrickpollet.moodlewsold.core.LoginReturn login(java.lang.String username, java.lang.String password)  {
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
    public net.patrickpollet.moodlewsold.core.EditUsersOutput edit_users(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditUsersInput users)  {
    final String METH_NAME = "edit_users";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("users",users);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditUsersOutput)KSoap2Utils.getObject(response,new EditUsersOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_users(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String idfield)  {
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCoursesOutput edit_courses(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditCoursesInput courses)  {
    final String METH_NAME = "edit_courses";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courses",courses);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCoursesOutput)KSoap2Utils.getObject(response,new EditCoursesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_courses(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
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
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_courses_search(int client, java.lang.String sesskey, java.lang.String value)  {
    final String METH_NAME = "get_courses_search";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetResourcesReturn get_resources(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
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
      return (GetResourcesReturn)KSoap2Utils.getObject(response,new GetResourcesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public java.lang.String get_version(int client, java.lang.String sesskey)  {
    final String METH_NAME = "get_version";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     String response = (String) envelope.getResponse();
	  this.logInfo(METH_NAME, response);
      return response.toString();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetSectionsReturn get_sections(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
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
      return (GetSectionsReturn)KSoap2Utils.getObject(response,new GetSectionsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetResourcesReturn get_instances_bytype(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield, java.lang.String type)  {
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
      return (GetResourcesReturn)KSoap2Utils.getObject(response,new GetResourcesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGradesReturn get_grades(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String userfield, java.lang.String[] courseids, java.lang.String courseidfield)  {
    final String METH_NAME = "get_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("userfield",userfield);
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
      return (GetGradesReturn)KSoap2Utils.getObject(response,new GetGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGradesReturn get_user_grades(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "get_user_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGradesReturn)KSoap2Utils.getObject(response,new GetGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGradesReturn get_course_grades(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "get_course_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGradesReturn)KSoap2Utils.getObject(response,new GetGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn enrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn unenrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetLastChangesReturn get_last_changes(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield, int limit)  {
    final String METH_NAME = "get_last_changes";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("limit",limit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetLastChangesReturn)KSoap2Utils.getObject(response,new GetLastChangesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetEventsReturn get_events(int client, java.lang.String sesskey, int eventtype, int ownerid)  {
    final String METH_NAME = "get_events";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("eventtype",eventtype);
      envelope.addProperty("ownerid",ownerid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetEventsReturn)KSoap2Utils.getObject(response,new GetEventsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_course(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_course";
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
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_course_byid(int client, java.lang.String sesskey, java.lang.String info)  {
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
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_course_byidnumber(int client, java.lang.String sesskey, java.lang.String info)  {
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
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_user(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String idfield)  {
    final String METH_NAME = "get_user";
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetRolesReturn get_roles(int client, java.lang.String sesskey)  {
    final String METH_NAME = "get_roles";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetRolesReturn)KSoap2Utils.getObject(response,new GetRolesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetRolesReturn get_role_byid(int client, java.lang.String sesskey, java.lang.String value)  {
    final String METH_NAME = "get_role_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetRolesReturn)KSoap2Utils.getObject(response,new GetRolesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetRolesReturn get_role_byname(int client, java.lang.String sesskey, java.lang.String value)  {
    final String METH_NAME = "get_role_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetRolesReturn)KSoap2Utils.getObject(response,new GetRolesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCategoriesReturn get_categories(int client, java.lang.String sesskey)  {
    final String METH_NAME = "get_categories";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCategoriesReturn)KSoap2Utils.getObject(response,new GetCategoriesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCategoriesReturn get_category_byid(int client, java.lang.String sesskey, java.lang.String value)  {
    final String METH_NAME = "get_category_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCategoriesReturn)KSoap2Utils.getObject(response,new GetCategoriesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCategoriesReturn get_category_byname(int client, java.lang.String sesskey, java.lang.String value)  {
    final String METH_NAME = "get_category_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCategoriesReturn)KSoap2Utils.getObject(response,new GetCategoriesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_my_courses(int client, java.lang.String sesskey, int uid, java.lang.String sort)  {
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
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_my_courses_byusername(int client, java.lang.String sesskey, java.lang.String uinfo, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byusername";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uinfo",uinfo);
      envelope.addProperty("sort",sort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_my_courses_byidnumber(int client, java.lang.String sesskey, java.lang.String uinfo, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uinfo",uinfo);
      envelope.addProperty("sort",sort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_user_byusername(int client, java.lang.String sesskey, java.lang.String userinfo)  {
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_user_byidnumber(int client, java.lang.String sesskey, java.lang.String userinfo)  {
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_user_byid(int client, java.lang.String sesskey, java.lang.String userinfo)  {
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_users_bycourse(int client, java.lang.String sesskey, java.lang.String idcourse, java.lang.String idfield, int idrole)  {
    final String METH_NAME = "get_users_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("idrole",idrole);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int count_users_bycourse(int client, java.lang.String sesskey, java.lang.String idcourse, java.lang.String idfield, int idrole)  {
    final String METH_NAME = "count_users_bycourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("idrole",idrole);
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
    public net.patrickpollet.moodlewsold.core.GetCoursesReturn get_courses_bycategory(int client, java.lang.String sesskey, int categoryid)  {
    final String METH_NAME = "get_courses_bycategory";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("categoryid",categoryid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCoursesReturn)KSoap2Utils.getObject(response,new GetCoursesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_groups_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
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
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_group_byid(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_group_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_groups_byname(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_groups_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupingsReturn get_grouping_byid(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_grouping_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGroupingsReturn)KSoap2Utils.getObject(response,new GetGroupingsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupingsReturn get_groupings_byname(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_groupings_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetGroupingsReturn)KSoap2Utils.getObject(response,new GetGroupingsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCohortsReturn get_cohort_byid(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_cohort_byid";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCohortsReturn)KSoap2Utils.getObject(response,new GetCohortsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCohortsReturn get_cohort_byidnumber(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_cohort_byidnumber";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCohortsReturn)KSoap2Utils.getObject(response,new GetCohortsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCohortsReturn get_cohorts_byname(int client, java.lang.String sesskey, java.lang.String info, int courseid)  {
    final String METH_NAME = "get_cohorts_byname";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("courseid",courseid);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetCohortsReturn)KSoap2Utils.getObject(response,new GetCohortsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_group_members(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_group_members";
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_grouping_members(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_grouping_members";
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_cohort_members(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_cohort_members";
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
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
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_my_group(int client, java.lang.String sesskey, int uid, java.lang.String idfield, int courseid, java.lang.String courseidfield)  {
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
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_my_groups(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
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
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCohortsReturn get_my_cohorts(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
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
      return (GetCohortsReturn)KSoap2Utils.getObject(response,new GetCohortsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_teachers(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "get_teachers";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_students(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "get_students";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean has_role_incourse(int client, java.lang.String sesskey, java.lang.String iduser, java.lang.String iduserfield, java.lang.String idcourse, java.lang.String idcoursefield, int idrole)  {
    final String METH_NAME = "has_role_incourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("iduser",iduser);
      envelope.addProperty("iduserfield",iduserfield);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idcoursefield",idcoursefield);
      envelope.addProperty("idrole",idrole);
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
    public int get_primaryrole_incourse(int client, java.lang.String sesskey, java.lang.String iduser, java.lang.String iduserfield, java.lang.String idcourse, java.lang.String idcoursefield)  {
    final String METH_NAME = "get_primaryrole_incourse";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("iduser",iduser);
      envelope.addProperty("iduserfield",iduserfield);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idcoursefield",idcoursefield);
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
    public net.patrickpollet.moodlewsold.core.GetActivitiesReturn get_activities(int client, java.lang.String sesskey, java.lang.String iduser, java.lang.String iduserfield, java.lang.String idcourse, java.lang.String idcoursefield, int idlimit)  {
    final String METH_NAME = "get_activities";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("iduser",iduser);
      envelope.addProperty("iduserfield",iduserfield);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idcoursefield",idcoursefield);
      envelope.addProperty("idlimit",idlimit);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetActivitiesReturn)KSoap2Utils.getObject(response,new GetActivitiesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int count_activities(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "count_activities";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.GetAssignmentSubmissionsReturn get_assignment_submissions(int client, java.lang.String sesskey, int assignmentid, java.lang.String[] userids, java.lang.String useridfield, int timemodified)  {
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
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetAssignmentSubmissionsReturn)KSoap2Utils.getObject(response,new GetAssignmentSubmissionsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditUsersOutput add_user(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.UserDatum user)  {
    final String METH_NAME = "add_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("user",user);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditUsersOutput)KSoap2Utils.getObject(response,new EditUsersOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCoursesOutput add_course(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.CourseDatum course)  {
    final String METH_NAME = "add_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("course",course);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCoursesOutput)KSoap2Utils.getObject(response,new EditCoursesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupsOutput add_group(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.GroupDatum group)  {
    final String METH_NAME = "add_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("group",group);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupsOutput)KSoap2Utils.getObject(response,new EditGroupsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupingsOutput add_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.GroupingDatum grouping)  {
    final String METH_NAME = "add_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("grouping",grouping);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupingsOutput)KSoap2Utils.getObject(response,new EditGroupingsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCohortsOutput add_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.CohortDatum cohort)  {
    final String METH_NAME = "add_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohort",cohort);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCohortsOutput)KSoap2Utils.getObject(response,new EditCohortsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditSectionsOutput add_section(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.SectionDatum section)  {
    final String METH_NAME = "add_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("section",section);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditSectionsOutput)KSoap2Utils.getObject(response,new EditSectionsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditLabelsOutput add_label(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.LabelDatum label)  {
    final String METH_NAME = "add_label";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("label",label);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditLabelsOutput)KSoap2Utils.getObject(response,new EditLabelsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditForumsOutput add_forum(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.ForumDatum forum)  {
    final String METH_NAME = "add_forum";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forum",forum);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditForumsOutput)KSoap2Utils.getObject(response,new EditForumsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditDatabasesOutput add_database(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.DatabaseDatum database)  {
    final String METH_NAME = "add_database";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("database",database);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditDatabasesOutput)KSoap2Utils.getObject(response,new EditDatabasesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditAssignmentsOutput add_assignment(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.AssignmentDatum assignment)  {
    final String METH_NAME = "add_assignment";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignment",assignment);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditAssignmentsOutput)KSoap2Utils.getObject(response,new EditAssignmentsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditWikisOutput add_wiki(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.WikiDatum wiki)  {
    final String METH_NAME = "add_wiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("wiki",wiki);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditWikisOutput)KSoap2Utils.getObject(response,new EditWikisOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditPagesWikiOutput add_pagewiki(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.PageWikiDatum page)  {
    final String METH_NAME = "add_pagewiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("page",page);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditPagesWikiOutput)KSoap2Utils.getObject(response,new EditPagesWikiOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditUsersOutput delete_user(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "delete_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditUsersOutput)KSoap2Utils.getObject(response,new EditUsersOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCategoriesOutput add_category(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.CategoryDatum category)  {
    final String METH_NAME = "add_category";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("category",category);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCategoriesOutput)KSoap2Utils.getObject(response,new EditCategoriesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCoursesOutput delete_course(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "delete_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCoursesOutput)KSoap2Utils.getObject(response,new EditCoursesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupsOutput delete_group(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "delete_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupsOutput)KSoap2Utils.getObject(response,new EditGroupsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupingsOutput delete_grouping(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "delete_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupingsOutput)KSoap2Utils.getObject(response,new EditGroupingsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCohortsOutput delete_cohort(int client, java.lang.String sesskey, java.lang.String value, java.lang.String id)  {
    final String METH_NAME = "delete_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value",value);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCohortsOutput)KSoap2Utils.getObject(response,new EditCohortsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditUsersOutput update_user(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.UserDatum user, java.lang.String idfield)  {
    final String METH_NAME = "update_user";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("user",user);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditUsersOutput)KSoap2Utils.getObject(response,new EditUsersOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCoursesOutput update_course(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.CourseDatum course, java.lang.String idfield)  {
    final String METH_NAME = "update_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("course",course);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCoursesOutput)KSoap2Utils.getObject(response,new EditCoursesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditSectionsOutput update_section(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.SectionDatum section, java.lang.String idfield)  {
    final String METH_NAME = "update_section";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("section",section);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditSectionsOutput)KSoap2Utils.getObject(response,new EditSectionsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupsOutput update_group(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.GroupDatum group, java.lang.String idfield)  {
    final String METH_NAME = "update_group";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("group",group);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupsOutput)KSoap2Utils.getObject(response,new EditGroupsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupingsOutput update_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.GroupingDatum grouping, java.lang.String idfield)  {
    final String METH_NAME = "update_grouping";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("grouping",grouping);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupingsOutput)KSoap2Utils.getObject(response,new EditGroupingsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCohortsOutput update_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.CohortDatum cohort, java.lang.String idfield)  {
    final String METH_NAME = "update_cohort";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohort",cohort);
      envelope.addProperty("idfield",idfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCohortsOutput)KSoap2Utils.getObject(response,new EditCohortsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditLabelsOutput edit_labels(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditLabelsInput labels)  {
    final String METH_NAME = "edit_labels";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("labels",labels);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditLabelsOutput)KSoap2Utils.getObject(response,new EditLabelsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditGroupsOutput edit_groups(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditGroupsInput groups)  {
    final String METH_NAME = "edit_groups";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groups",groups);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupsOutput)KSoap2Utils.getObject(response,new EditGroupsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditAssignmentsOutput edit_assignments(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditAssignmentsInput assignments)  {
    final String METH_NAME = "edit_assignments";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignments",assignments);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditAssignmentsOutput)KSoap2Utils.getObject(response,new EditAssignmentsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditDatabasesOutput edit_databases(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditDatabasesInput databases)  {
    final String METH_NAME = "edit_databases";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("databases",databases);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditDatabasesOutput)KSoap2Utils.getObject(response,new EditDatabasesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditCategoriesOutput edit_categories(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditCategoriesInput categories)  {
    final String METH_NAME = "edit_categories";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("categories",categories);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditCategoriesOutput)KSoap2Utils.getObject(response,new EditCategoriesOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditSectionsOutput edit_sections(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditSectionsInput sections)  {
    final String METH_NAME = "edit_sections";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("sections",sections);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditSectionsOutput)KSoap2Utils.getObject(response,new EditSectionsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditForumsOutput edit_forums(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditForumsInput forums)  {
    final String METH_NAME = "edit_forums";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forums",forums);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditForumsOutput)KSoap2Utils.getObject(response,new EditForumsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditWikisOutput edit_wikis(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditWikisInput wikis)  {
    final String METH_NAME = "edit_wikis";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("wikis",wikis);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditWikisOutput)KSoap2Utils.getObject(response,new EditWikisOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EditPagesWikiOutput edit_pagesWiki(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditPagesWikiInput pagesWiki)  {
    final String METH_NAME = "edit_pagesWiki";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("pagesWiki",pagesWiki);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditPagesWikiOutput)KSoap2Utils.getObject(response,new EditPagesWikiOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_course_to_category(int client, java.lang.String sesskey, int courseid, int categoryid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_label_to_section(int client, java.lang.String sesskey, int labelid, int sectionid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_forum_to_section(int client, java.lang.String sesskey, int forumid, int sectionid, int groupmode)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_section_to_course(int client, java.lang.String sesskey, int sectionid, int courseid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_user_to_group(int client, java.lang.String sesskey, int userid, int groupid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_user_to_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_group_to_course(int client, java.lang.String sesskey, int groupid, int coursid)  {
    final String METH_NAME = "affect_group_to_course";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("coursid",coursid);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_wiki_to_section(int client, java.lang.String sesskey, int wikiid, int sectionid, int groupmode, int visible)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_database_to_section(int client, java.lang.String sesskey, int databaseid, int sectionid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_assignment_to_section(int client, java.lang.String sesskey, int assignmentid, int sectionid, int groupmode)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_user_to_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_pageWiki_to_wiki(int client, java.lang.String sesskey, int pageid, int wikiid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_user_from_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
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
    public net.patrickpollet.moodlewsold.core.GetGroupsReturn get_all_groups(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetGroupsReturn)KSoap2Utils.getObject(response,new GetGroupsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllForumsReturn get_all_forums(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllForumsReturn)KSoap2Utils.getObject(response,new GetAllForumsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllLabelsReturn get_all_labels(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllLabelsReturn)KSoap2Utils.getObject(response,new GetAllLabelsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllWikisReturn get_all_wikis(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllWikisReturn)KSoap2Utils.getObject(response,new GetAllWikisReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllPagesWikiReturn get_all_pagesWiki(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllPagesWikiReturn)KSoap2Utils.getObject(response,new GetAllPagesWikiReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllAssignmentsReturn get_all_assignments(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllAssignmentsReturn)KSoap2Utils.getObject(response,new GetAllAssignmentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllDatabasesReturn get_all_databases(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllDatabasesReturn)KSoap2Utils.getObject(response,new GetAllDatabasesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetAllQuizzesReturn get_all_quizzes(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetAllQuizzesReturn)KSoap2Utils.getObject(response,new GetAllQuizzesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetGroupingsReturn get_all_groupings(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetGroupingsReturn)KSoap2Utils.getObject(response,new GetGroupingsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetCohortsReturn get_all_cohorts(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
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
      return (GetCohortsReturn)KSoap2Utils.getObject(response,new GetCohortsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_user_from_group(int client, java.lang.String sesskey, int userid, int groupid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_user_from_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
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
    public net.patrickpollet.moodlewsold.core.EditGroupingsOutput edit_groupings(int client, java.lang.String sesskey, net.patrickpollet.moodlewsold.core.EditGroupingsInput groupings)  {
    final String METH_NAME = "edit_groupings";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupings",groupings);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EditGroupingsOutput)KSoap2Utils.getObject(response,new EditGroupingsOutput(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_group_from_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
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
    public net.patrickpollet.moodlewsold.core.AffectRecord affect_group_to_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
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
    public net.patrickpollet.moodlewsold.core.SetUserProfileValuesReturn set_user_profile_values(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, net.patrickpollet.moodlewsold.core.ProfileitemRecord[] values)  {
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
      return (SetUserProfileValuesReturn)KSoap2Utils.getObject(response,new SetUserProfileValuesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetUsersReturn get_users_byprofile(int client, java.lang.String sesskey, java.lang.String profilefieldname, java.lang.String profilefieldvalue)  {
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
      return (GetUsersReturn)KSoap2Utils.getObject(response,new GetUsersReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.QuizRecord get_quiz(int client, java.lang.String sesskey, int quizid, java.lang.String quizformat)  {
    final String METH_NAME = "get_quiz";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
      envelope.addProperty("quizformat",quizformat);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord add_teacher(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "add_teacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_teacher(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "remove_teacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord add_noneditingteacher(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "add_noneditingteacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_noneditingteacher(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "remove_noneditingteacher";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord add_student(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "add_student";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.AffectRecord remove_student(int client, java.lang.String sesskey, java.lang.String value1, java.lang.String id1, java.lang.String value2, java.lang.String id2)  {
    final String METH_NAME = "remove_student";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("value1",value1);
      envelope.addProperty("id1",id1);
      envelope.addProperty("value2",value2);
      envelope.addProperty("id2",id2);
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
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn affect_users_to_cohort(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "affect_users_to_cohort";
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn remove_users_from_cohort(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "remove_users_from_cohort";
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn affect_users_to_group(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "affect_users_to_group";
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.EnrolStudentsReturn remove_users_from_group(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "remove_users_from_group";
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
      envelope.addProperty("useridfield",useridfield);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (EnrolStudentsReturn)KSoap2Utils.getObject(response,new EnrolStudentsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetForumDiscussionsReturn get_forum_discussions(int client, java.lang.String sesskey, int forumid, int limit)  {
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
      return (GetForumDiscussionsReturn)KSoap2Utils.getObject(response,new GetForumDiscussionsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetForumPostsReturn get_forum_posts(int client, java.lang.String sesskey, int discussionid, int limit)  {
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
      return (GetForumPostsReturn)KSoap2Utils.getObject(response,new GetForumPostsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetForumDiscussionsReturn forum_add_discussion(int client, java.lang.String sesskey, int forumid, net.patrickpollet.moodlewsold.core.ForumDiscussionDatum discussion)  {
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
      return (GetForumDiscussionsReturn)KSoap2Utils.getObject(response,new GetForumDiscussionsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetForumPostsReturn forum_add_reply(int client, java.lang.String sesskey, int parentid, net.patrickpollet.moodlewsold.core.ForumPostDatum post)  {
    final String METH_NAME = "forum_add_reply";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("parentid",parentid);
      envelope.addProperty("post",post);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetForumPostsReturn)KSoap2Utils.getObject(response,new GetForumPostsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetMessagesReturn get_messages(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
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
      return (GetMessagesReturn)KSoap2Utils.getObject(response,new GetMessagesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetMessagesReturn get_messages_history(int client, java.lang.String sesskey, java.lang.String useridto, java.lang.String useridtofield, java.lang.String useridfrom, java.lang.String useridfromfield)  {
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
      return (GetMessagesReturn)KSoap2Utils.getObject(response,new GetMessagesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.AffectRecord message_send(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String message)  {
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
    public net.patrickpollet.moodlewsold.core.GetMessageContactsReturn get_message_contacts(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
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
      return (GetMessageContactsReturn)KSoap2Utils.getObject(response,new GetMessageContactsReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.FileRecord get_resourcefile_byid(int client, java.lang.String sesskey, int resourceid)  {
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
    public net.patrickpollet.moodlewsold.core.GetModuleGradesReturn get_my_quiz_grade(int client, java.lang.String sesskey, int id)  {
    final String METH_NAME = "get_my_quiz_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetModuleGradesReturn)KSoap2Utils.getObject(response,new GetModuleGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetModuleGradesReturn get_my_assignment_grade(int client, java.lang.String sesskey, int id)  {
    final String METH_NAME = "get_my_assignment_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetModuleGradesReturn)KSoap2Utils.getObject(response,new GetModuleGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetModuleGradesReturn get_my_module_grade(int client, java.lang.String sesskey, int id, java.lang.String type)  {
    final String METH_NAME = "get_my_module_grade";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("type",type);
    HttpTransportSE httpTransport = this.makeHttpTransport();
     try {
       httpTransport.call(METH_NAME, envelope);
     SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
      SoapObject response = (SoapObject) resultsRequestSOAP.getProperty(0);
	  this.logInfo(METH_NAME, response);
      return (GetModuleGradesReturn)KSoap2Utils.getObject(response,new GetModuleGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlewsold.core.GetModuleGradesReturn get_module_grades(int client, java.lang.String sesskey, int id, java.lang.String type, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "get_module_grades";
	MySoapSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("type",type);
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
      return (GetModuleGradesReturn)KSoap2Utils.getObject(response,new GetModuleGradesReturn(this.NAMESPACE));
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
}
