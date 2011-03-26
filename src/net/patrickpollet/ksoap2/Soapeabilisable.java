package net.patrickpollet.ksoap2;

import org.ksoap2.serialization.SoapObject;

public interface Soapeabilisable {
	public Soapeabilisable fromSoapResponse(SoapObject response);

}
