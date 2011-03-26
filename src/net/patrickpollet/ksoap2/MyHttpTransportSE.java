package net.patrickpollet.ksoap2;

import org.ksoap2.transport.HttpTransportSE;

public class MyHttpTransportSE extends HttpTransportSE {

	public MyHttpTransportSE(String url, boolean debug) {
		super(url);
		this.debug = debug;
	}

}
