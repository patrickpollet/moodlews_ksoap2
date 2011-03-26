package net.patrickpollet.moodlewsold;

import java.util.Arrays;

import net.patrickpollet.moodlewsold.core.GetRolesReturn;
import net.patrickpollet.moodlewsold.core.GetUsersReturn;
import net.patrickpollet.moodlewsold.core.LoginReturn;
import net.patrickpollet.moodlewsold.core.MoodleWSBindingStub;
import net.patrickpollet.moodlewsold.core.UserDatum;
import net.patrickpollet.moodlewsold.core.UserRecord;




public class Test1 {
	// WE now use the simplified WSDL that is now generated from the server's
	// php
	// classes !!!
	// instead of the one created by hand ...
	// major difference is that integer type are now mapped to java int and not
	// Integer
	// and in the case of returned arrays there is no need to extract first a
	// property xxxReturn
	// the array is right now available
	// TESTING adjust to your site
	private static final String MOODLE_URL = "http://prope.insa-lyon.fr/moodle.195/";
	
	private static final String LOGIN = "astrid";
	private static final String PWD = "bpitt1";
	private static final boolean WS_DEBUG = false;
	// END TESTING
	//DO NOT CHANGE we are talking to Ws using the old WSDL
	private static final String MOODLE_SERVICE=MOODLE_URL+"wspp/service_pp.php";
	private static final String MOODLE_NAMESPACE=MOODLE_URL+"wspp/wsdl/";
	
	public static void main (String args[]) throws Exception {
		new Test1();
	}
	
	public Test1 () throws Exception{
		
		MoodleWSBindingStub moodle=new MoodleWSBindingStub(MOODLE_SERVICE,MOODLE_NAMESPACE,WS_DEBUG);
		
		LoginReturn lr = moodle.login(LOGIN, PWD);
		
		//moodle.get_my_id(client, sesskey);
		if (lr != null) {
			/**
			int me =0; // moodle.get_my_id(lr.getClient(),lr.getSessionkey());
			System.out.println ("me "+me);
			CourseRecord []ret = moodle.get_my_courses(lr.getClient(),lr.getSessionkey(), ""+me,null);
			
			if (ret!=null){// System.out.println(Arrays.toString(ret));
			System.out.println(ret); //Arrays.toString(ret));
			for(CourseRecord c : ret)
				System.out.println(c.getShortname());
			}
			if (ret.length > 0) { 
			 CourseRecord  firstCourse = ret[0]; 
			 ResourceRecord[] forums=moodle.getCourseActivityByType(lr,firstCourse.getId(), "forum");
			 
	     	}	
			
			// get forums of all my courses
			for (int i = 0; i < ret.size(); i++) {
				CourseRecord course = ret.get(i);
				List<ResourceRecord> forums=moodle.getCourseActivityByType(lr, course.getId(), "assignment");
				if (i>2) break;
			}
		
			*/
			GetRolesReturn roles=moodle.get_roles(lr.getClient(),lr.getSessionkey());
			System.out.println (Arrays.toString(roles.getRoles()));
			
			
			
			
			
			String[] userids={"astrid","pguy","ppollet","inconnu"};
			GetUsersReturn thems= moodle.get_users(lr.getClient(),lr.getSessionkey(), userids,"username");
			System.out.println(Arrays.toString(thems.getUsers()));
			for (UserRecord u : thems.getUsers())
				System.out.println(u);
		    
			UserRecord[] users=moodle.get_user(lr.getClient(),lr.getSessionkey(),"ppollet","username").getUsers();
			System.out.println (Arrays.toString(users));
			
			
			UserDatum newU=new UserDatum(moodle.getNAMESPACE());
			newU.setUsername("inconnu");
			newU.setFirstname("inconnu");
			newU.setLastname("inconnu");
			newU.setEmail("inconnu@patrickpollet.net");
			newU.setIdnumber("inconnu");
			newU.setPassword("inconnu");
			System.out.println(newU);
			
			UserRecord[] res=moodle.add_user(lr.getClient(),lr.getSessionkey(),newU).getUsers();
			System.out.println (Arrays.toString(res));
			
		
			moodle.logout(lr.getClient(),lr.getSessionkey());
		}else System.out.println ("echec");
	}

	
}