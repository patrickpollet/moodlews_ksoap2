/*
 * Copyright (c) 2011 Patrick Pollet France
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * Contributor(s): 
 */

package net.patrickpollet.ksoap2;

import net.patrickpollet.moodlews.core.LoginReturn;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalFloat;
import org.ksoap2.serialization.PropertyInfo;
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
		this.registerMyTypes();
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
	
	
	/**
	 * add serialization of primitive types not set by default in KSoap2_android 
	 */
	protected void registerMyTypes () {
		new MarshalDouble().register(this);
		new MarshalFloat().register(this);
		new MarshalInteger().register(this);
		
	}

}
