package net.patrickpollet.ksoap2;

import net.patrickpollet.moodlews.core.LoginReturn;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

/**
 * make all the setup for a proper envelope against a MoodleWS type Web Service
 * 
 * @author ppollet
 * 
 */
public class MySoapSerializationEnvelope extends SoapSerializationEnvelope {

	private SoapObject request;

	/**
	 * old call for all operation EXECPT login
	 * @param nameSpace
	 * @param method_name
	 * @param lr
	 */
	public MySoapSerializationEnvelope(String nameSpace, String method_name,
			LoginReturn lr) {
			this(nameSpace,method_name,lr.getClient(),lr.getSessionkey());
	}
	
	/**
	 * call specific to login operation, obviously not yet a loginReturn 
	 * @param nameSpace
	 * @param method_name
	 */
	public MySoapSerializationEnvelope(String nameSpace, String method_name) {
		this(nameSpace,method_name,0,"");
	}
	
	/**
	 * standard call for all operations 
	 * @param nameSpace
	 * @param method_name
	 * @param client
	 * @param sesskey
	 */
	public MySoapSerializationEnvelope(String nameSpace, String method_name,
			int client, String sesskey) {
		super(SoapEnvelope.VER11);
		this.request = new SoapObject(nameSpace, method_name);
		this.dotNet = false;
		this.setOutputSoapObject(request);
		if (client !=0) {
			this.request.addProperty("client", client);
			this.request.addProperty("sesskey", sesskey);
		}
	}

	/**
	 * simplify coding of client
	 * 
	 * @param name
	 * @param value
	 */
	public void addProperty(String name, Object value) {
		this.request.addProperty(name, value);
	}

}
