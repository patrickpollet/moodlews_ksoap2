package net.patrickpollet.moodleandroid;

/**
 * this is a very basic android application using my moodlews_ksoap.jar package
 * and the standard ksoap2-android-assembly-2.5.2-jar-with-dependencies.jar

 * 
 * you must copy this source code into the main application of a new Android project that has in its classpath
 * the two jar cited above 
 * 
 *  * Nothing is displayed in the emulator screen (except an hello world...) 
 * all results are logged into the Android log file that can be seen in the DDMS view of Eclipse running Android SDK
 * 
 * this version used the old WSDL implementation available in net.patrickpollet.moodlewsold.core.* 
 */



import org.ksoap2.transport.HttpTransportSE;


import net.patrickpollet.moodlewsold.core.CourseRecord;
import net.patrickpollet.moodlewsold.core.GetCoursesReturn;
import net.patrickpollet.moodlewsold.core.LoginReturn;
import net.patrickpollet.moodlewsold.core.MoodleWSBindingStub;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class moodleandroid extends Activity {
	/** Called when the activity is first created. */
	// the array is right now available
	// TESTING adjust to your site
	private final String MOODLE_URL = "yourmoodle/";
	private final String LOGIN = "zzzzzzz";
	private final String PWD = "zzzzzz";
	private final boolean WS_DEBUG = true;
	// END TESTING

	// we use the simplified wsdl version
	private final String NAMESPACE = MOODLE_URL + "wspp/wsdl/";
	private final String TAG = "moodlews@android";
	private final String URL = MOODLE_URL + "/wspp/service_pp.php";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// nothing is printed onscreen see DDMS Log
		MoodleWSBindingStub moodle=new MoodleWSBindingStub(this.URL,this.NAMESPACE,this.WS_DEBUG);
		
			LoginReturn lr = moodle.login(LOGIN, PWD);
			if (lr != null) {
				int me = moodle.get_my_id(lr.getClient(),lr.getSessionkey());
				this.logInfo("get_my_id",""+me);
				
				GetCoursesReturn crs=moodle.get_my_courses(lr.getClient(),lr.getSessionkey(),me,"");
				for (CourseRecord c : crs.getCourses())
					this.logInfo("get_my_courses",c);			
				moodle.logout(lr.getClient(),lr.getSessionkey());
			}
		}



	/**
	 * log detailed errors if WS_DEBUG is activated
	 * 
	 * @param androidHttpTransport
	 * @param e
	 */
	private void logError(HttpTransportSE androidHttpTransport, Exception e) {
		// give a null pointer exception if debug is off in transport
		if (WS_DEBUG) {
			Log.e(TAG, androidHttpTransport.requestDump.toString());
			Log.e(TAG, "lng="
					+ (androidHttpTransport.requestDump.toString().length()));
			Log.e(TAG, androidHttpTransport.responseDump.toString());
			Log.e(TAG, "lng="
					+ (androidHttpTransport.responseDump.toString().length()));
		}
		e.printStackTrace();

	}

	/**
	 * log successfull operation if WS_DEBUG is activated
	 * 
	 * @param method_name
	 * @param ret
	 */
	private void logInfo(String method_name, Object ret) {
		if (WS_DEBUG)
			Log.i(TAG, "reponse " + method_name + " : " + ret.toString());
	}

}