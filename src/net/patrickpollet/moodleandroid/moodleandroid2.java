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

 * this version use the NEW WSDL implementation available in net.patrickpollet.moodlews.core.* 
 */




import java.util.Arrays;

import net.patrickpollet.moodlews.core.CourseRecord;
import net.patrickpollet.moodlews.core.LoginReturn;
import net.patrickpollet.moodlews.core.Mdl_soapserverBindingStub;
import net.patrickpollet.moodlews.core.UserRecord;

import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class moodleandroid2 extends Activity {
	/** Called when the activity is first created. */
	// the array is right now available
	// TESTING adjust to your site
	// do not use http://localhost/ if running under emulator ( connexion refused !) 
	private final String MOODLE_URL = "http://mymoodle/";
	private final String LOGIN = "zzzzzz";
	private final String PWD = "zzzzz";
	private final boolean WS_DEBUG = true;
	// END TESTING

	// we use the simplified wsdl version
	private final String NAMESPACE = MOODLE_URL + "wspp/wsdl2/";
	private final String TAG = "moodlews@android";
	private final String URL = MOODLE_URL + "/wspp/service_pp2.php";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// nothing is printed onscreen see DDMS Log
		Mdl_soapserverBindingStub moodle = new Mdl_soapserverBindingStub(URL,NAMESPACE,WS_DEBUG);
		
			LoginReturn lr = moodle.login(LOGIN, PWD);
			if (lr != null) {
				int me = moodle.get_my_id(lr.getClient(),lr.getSessionkey());
				this.logInfo("get_my_id",""+me);
				
		
				CourseRecord[] crs = moodle.get_my_courses(lr.getClient(),lr.getSessionkey(),""+me,"");
				
				for (CourseRecord c : crs)
					this.logInfo("get_my_courses",c);
				
				String[] userids = { "ppollet", "pguy", "astrid", "inconnu" };
				UserRecord[] thems = moodle.get_users(lr.getClient(), lr
						.getSessionkey(), userids, "username");
				System.out.println(Arrays.toString(thems));
				for (UserRecord u : thems)
					System.out.println(u);
				
				
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