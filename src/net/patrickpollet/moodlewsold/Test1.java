package net.patrickpollet.moodlewsold;

import java.util.Arrays;

//use the old WSDL 
import net.patrickpollet.moodlewsold.core.*;
// definitions of Moodle server, login, password ...



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
	

	

	//DO NOT CHANGE we are talking to Ws using the old WSDL
	private static final String MOODLE_SERVICE=Constantes.MOODLE_URL+"wspp/service_pp.php";
	private static final String MOODLE_NAMESPACE=Constantes.MOODLE_URL+"wspp/wsdl/";
	
	public static void main (String args[]) throws Exception {
		new Test1();
	}
	
	public Test1 () throws Exception{
		
		MoodleWSBindingStub moodle=new MoodleWSBindingStub(MOODLE_SERVICE,MOODLE_NAMESPACE,Constantes.WS_DEBUG);
		
		LoginReturn lr = moodle.login(Constantes.LOGIN, Constantes.PWD);
		

		if (lr != null) {
		
			int me =moodle.get_my_id(lr.getClient(),lr.getSessionkey());
			System.out.println ("me "+me);
			CourseRecord []ret = moodle.get_my_courses(lr.getClient(),lr.getSessionkey(), me,null).getCourses();
			
			if (ret!=null){// System.out.println(Arrays.toString(ret));
			System.out.println(ret); //Arrays.toString(ret));
			for(CourseRecord c : ret)
				System.out.println(c.getShortname());
			}
			
			
			// get forums of all my courses
			for (int i = 0; i < ret.length; i++) {
				CourseRecord course = ret[i];
				ResourceRecord[] forums=moodle.get_instances_bytype(lr.getClient(),lr.getSessionkey(),
						new String[]{""+course.getId()}, "id","forum").getResources();
				 System.out.println(Arrays.toString(forums));
				if (i>2) break;
			}
		
		
			GetRolesReturn roles=moodle.get_roles(lr.getClient(),lr.getSessionkey());
			System.out.println (Arrays.toString(roles.getRoles()));
			
			
			
			
			
			String[] userids={"astrid","pguy","ppollet","inconnu"};
			GetUsersReturn thems= moodle.get_users(lr.getClient(),lr.getSessionkey(), userids,"username");
			System.out.println(Arrays.toString(thems.getUsers()));
			for (UserRecord u : thems.getUsers())
				System.out.println(u);
		    
			UserRecord[] users=moodle.get_user(lr.getClient(),lr.getSessionkey(),"ppollet","username").getUsers();
			System.out.println (Arrays.toString(users));
			
			
			// create a new user 
			UserDatum newU=new UserDatum(moodle.getNAMESPACE());
			newU.setUsername("inconnu010");
			newU.setFirstname("inconnu");
			newU.setLastname("inconnu");
			newU.setEmail("inconnu104@patrickpollet.net");
			newU.setIdnumber("inconnu004");
			newU.setPassword("inconnu");
			System.out.println(newU);
			
			UserRecord[] res=moodle.add_user(lr.getClient(),lr.getSessionkey(),newU).getUsers();
			System.out.println (Arrays.toString(res));
			
			// testing edit_users params passing with test action 'get' 
			// this code fails since KSoap2 cannont serialize Lnet.patrickpollet.moodlewsold.core.UserDatum
			// that is included in the EditUsersInput class 
			// it works Ok with the new WSDL simply sending an array of UserDatum[]
			UserDatum[] users2= new UserDatum[10];
			for (int i=0; i<10; i++) {
				users2[i]=new UserDatum(moodle.getNAMESPACE());
				users2[i].setId(i);
				users2[i].setAction("get");
			}
			EditUsersInput eui= new EditUsersInput(moodle.getNAMESPACE());
			eui.setUsers(users2);
			UserRecord[] users3=moodle.edit_users(lr.getClient(), lr.getSessionkey(), eui).getUsers();
			for (UserRecord u : users3)
				System.out.println (u);
		
			moodle.logout(lr.getClient(),lr.getSessionkey());
		}else System.out.println ("echec");
	}

	
}