package net.patrickpollet.moodlews;

import java.util.Arrays;

import net.patrickpollet.moodlews.core.CourseRecord;
import net.patrickpollet.moodlews.core.LoginReturn;
import net.patrickpollet.moodlews.core.Mdl_soapserverBindingStub;
import net.patrickpollet.moodlews.core.RoleRecord;
import net.patrickpollet.moodlews.core.UserRecord;

public class Test2 {
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
	private static final String MOODLE_URL = "http://localhost/moodle20/";
	private static final String LOGIN = "astrid";
	private static final String PWD = "bpitt1";
	private static final boolean WS_DEBUG = false;
	// END TESTING
	
	//DO NOT CHANGE we are talking to Ws using the NEW simplified WSDL
	private static final String MOODLE_SERVICE=MOODLE_URL+"wspp/service_pp2.php";
	private static final String MOODLE_NAMESPACE=MOODLE_URL+"wspp/wsdl2/";



	public static void main(String args[]) throws Exception {
		new Test2();
	}

	public Test2() throws Exception {

		Mdl_soapserverBindingStub moodle = new Mdl_soapserverBindingStub(MOODLE_SERVICE,MOODLE_NAMESPACE, WS_DEBUG);
		LoginReturn lr = moodle.login(LOGIN, PWD);

		// moodle.get_my_id(client, sesskey);
		if (lr != null) {
			int me = moodle.get_my_id(lr.getClient(),lr.getSessionkey());
			System.out.println("me " + me);
			CourseRecord[] ret = moodle.get_my_courses(lr.getClient(), lr
					.getSessionkey(), "" + me, null);
			/*
			 * get forums of the first course
			 */
			if (ret != null) {// System.out.println(Arrays.toString(ret));
				System.out.println(Arrays.toString(ret));
				String[] coursesIds = new String[ret.length];
				
				int n=0;
				for (CourseRecord c : ret) {
					System.out.println(c.getShortname());
					coursesIds[n++]="" + c.getId();
				}
				System.out.println(Arrays.toString(coursesIds));
				

				CourseRecord[] bis = moodle
						.get_courses(lr.getClient(), lr.getSessionkey(),
								coursesIds, "id");
				for (CourseRecord c : bis)
					System.out.println(c);

				/*
				 * if (ret.length > 0) { CourseRecord firstCourse = ret[0];
				 * ResourceRecord[]
				 * forums=moodle.getCourseActivityByType(lr,firstCourse.getId(),
				 * "forum");
				 * 
				 * }
				 * 
				 * // get forums of all my courses for (int i = 0; i <
				 * ret.size(); i++) { CourseRecord course = ret.get(i);
				 * List<ResourceRecord>
				 * forums=moodle.getCourseActivityByType(lr, course.getId(),
				 * "assignment"); if (i>2) break; }
				 */
				RoleRecord[] roles = moodle.get_roles(lr.getClient(), lr
						.getSessionkey(), null, null);
				System.out.println(Arrays.toString(roles));

				UserRecord[] users = moodle.get_user(lr.getClient(), lr
						.getSessionkey(), "ppollet", "username");
				System.out.println(Arrays.toString(users));

				String[] userids = { "ppollet", "pguy", "astrid", "inconnu" };
				UserRecord[] thems = moodle.get_users(lr.getClient(), lr
						.getSessionkey(), userids, "username");
				System.out.println(Arrays.toString(thems));
				for (UserRecord u : thems)
					System.out.println(u);
				for (int i=0; i<thems.length;i++)
					System.out.println(i+" "+thems[i]);

				/*
				 * String[] userids={"ppollet","pguy","astrid","inconnu"};
				 * UserRecord[]thems=
				 * moodle.get_users(lr.getClient(),lr.getSessionkey(),
				 * userids,"username");
				 * System.out.println(Arrays.toString(thems));
				 */
				moodle.logout(lr.getClient(),lr.getSessionkey());
			} else
				System.out.println("echec");
		}
	}

}