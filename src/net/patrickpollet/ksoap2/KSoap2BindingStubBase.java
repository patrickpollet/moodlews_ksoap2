/**
 * 
 */
package net.patrickpollet.ksoap2;

import java.util.List;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;

/**
 * @author ppollet
 *
 */
public class KSoap2BindingStubBase{
	
	
	protected  String NAMESPACE;
	public String getNAMESPACE() {
		return NAMESPACE;
	}


	public void setNAMESPACE(String namespace) {
		NAMESPACE = namespace;
	}


	public String getURL() {
		return URL;
	}


	public void setURL(String url) {
		URL = url;
	}

	//protected  String TAG = "moodlews@ksoap2";
	protected  String URL;
	protected  boolean WS_DEBUG = true;
	
	public KSoap2BindingStubBase (String service_url, String nameSpace,boolean debug) {
		this.NAMESPACE=nameSpace; //moodle_url+ "wspp/wsdl2/";
		this.URL=service_url; //+"wspp/service_pp2.php";
		this.WS_DEBUG=debug;
	}
	
	
	public MyHttpTransportSE makeHttpTransport() {
		return  new MyHttpTransportSE(URL,WS_DEBUG);
	}
	
	public 	MySoapSerializationEnvelope makeEnvelope(String method_name,int client, String sesskey) {
		return  new MySoapSerializationEnvelope(NAMESPACE, method_name, client,sesskey);
	}
	
	public 	MySoapSerializationEnvelope makeEnvelope(String method_name) {
		return  new MySoapSerializationEnvelope(NAMESPACE, method_name, 0,"");
	}
	
	public Soapeabilisable getObject (SoapObject response,Soapeabilisable theClass) {
		return KSoap2Utils.getObject(response, theClass);
	}
	
	public List<Soapeabilisable> getList(SoapObject response,Soapeabilisable theClass) {
		return KSoap2Utils.getList(response, theClass);
	}
	
	public Soapeabilisable[] getArray(SoapObject response,Soapeabilisable theClass) {
		return KSoap2Utils.getArray(response, theClass);
	}



	/**
	 * log detailed errors if WS_DEBUG is activated
	 * 
	 * @param httpTransport
	 * @param e
	 */
	protected void logError(HttpTransportSE httpTransport, Exception e) {
		// give a null pointer exception if debug is off in transport
		if (WS_DEBUG) {
			System.out.println( httpTransport.requestDump.toString());
			System.out.println(  "lng="
					+ (httpTransport.requestDump.toString().length()));
			System.out.println( httpTransport.responseDump.toString());
			System.out.println( "lng="
					+ (httpTransport.responseDump.toString().length()));
		}
		e.printStackTrace();

	}

	/**
	 * log successfull operation if WS_DEBUG is activated
	 * 
	 * @param method_name
	 * @param ret
	 */
	protected void logInfo(String method_name, Object ret) {
		if (WS_DEBUG)
			System.out.println(  "reponse " + method_name + " : " + ret.toString());
	}
	
	
	
	
	
	
	


}
