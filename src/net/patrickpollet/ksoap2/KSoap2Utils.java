package net.patrickpollet.ksoap2;

import java.util.ArrayList;
import java.util.List;

import org.ksoap2.serialization.SoapObject;

public class KSoap2Utils {

	/**
	 * extract an int value from the soap response
	 * 
	 * @param response
	 * @param id
	 * @return
	 */
	public static int getInt(SoapObject response, String id) {
		return ((Integer) (response.getProperty(id))).intValue();
	}

	public static long getLong(SoapObject response, String id) {
		return ((Long) (response.getProperty(id))).longValue();
	}

	public static short getShort(SoapObject response, String id) {
		return ((Short) (response.getProperty(id))).shortValue();
	}

	public static byte getByte(SoapObject response, String id) {
		return ((Byte) (response.getProperty(id))).byteValue();
	}

	/**
	 * extract an float value from the soap response
	 * 
	 * @param response
	 * @param id
	 * @return
	 */
	public static float getFloat(SoapObject response, String id) {
		//return ((Float) (response.getProperty(id))).floatValue();
		return Float.parseFloat(response.getProperty(id).toString());
	}

	public static double getDouble(SoapObject response, String id) {
		//return ((Double) (response.getProperty(id))).doubleValue();
		return Double.parseDouble(response.getProperty(id).toString());
	}

	/**
	 * extract a boolean value from the soap response
	 * 
	 * @param response
	 * @param id
	 * @return
	 */
	public static boolean getBoolean(SoapObject response, String id) {
		return ((Boolean) (response.getProperty(id))).booleanValue();
	}

	/**
	 * extract a string value from the soap response
	 * 
	 * @param response
	 * @param id
	 * @return
	 */
	public static String getString(SoapObject response, String id) {
		if (response.getProperty(id) != null)  //watch for nilleable strings !!!!
			return response.getProperty(id).toString();
		else
			return "null";
	}

	/**
	 * return one object from the Soap response
	 * 
	 * @param response
	 * @param theClass
	 * @return
	 */
	public static Soapeabilisable getObject(SoapObject response,
			Soapeabilisable theClass) {
		return theClass.fromSoapResponse(response);
	}

	/**
	 * return an arrayList of objects from the Soap response
	 * 
	 * @param response
	 * @param theClass
	 * @return
	 */
	public static List<Soapeabilisable> getList(SoapObject response,
			Soapeabilisable theClass) {
		int recordsCount = response.getPropertyCount();
		List<Soapeabilisable> rets = new ArrayList<Soapeabilisable>();
		for (int i = 0; i < recordsCount; i++) {
			SoapObject record = (SoapObject) response.getProperty(i);
			rets.add(getObject(record, theClass));
		}
		return rets;
	}

	/**
	 * return an arrayList of objects from the Soap response
	 * 
	 * @param response
	 * @param theClass
	 * @return
	 */
	public static Soapeabilisable[] getArray(SoapObject response,
			Soapeabilisable theClass) {
		int recordsCount = response.getPropertyCount();
		Soapeabilisable[] rets = new Soapeabilisable[recordsCount];
		for (int i = 0; i < recordsCount; i++) {
			SoapObject record = (SoapObject) response.getProperty(i);
			rets[i] = getObject(record, theClass);
		}
		return rets;
	}

	private static String[] PRIMITIVE_TYPES = { "boolean", "int", "long",
			"short", "byte", "float", "double" };

	private static String[] PRIMITIVE_FETCH_VALUES = {
			"Boolean response = (Boolean) envelope.getResponse();",
			"Integer response = (Integer) envelope.getResponse();",
			"Long response = (Long) envelope.getResponse();",
			"Short response = (Short) envelope.getResponse();",
			"Byte response = (Byte) envelope.getResponse();",
			"Float response = (Float) envelope.getResponse();",
			"Double response = (Double) envelope.getResponse();" };

	private static String[] PRIMITIVE_RETURN_VALUES = {
			"return response.booleanValue();", "return response.intValue();",
			"return response.longValue();", "return response.shortValue();",
			"return response.byteValue();", "return response.floatValue();",
			"return response.doubleValue();" };

	private static String[] PRIMITIVE_RETURN_FAULT_VALUES = { "return false;",
			"return 0;", "return 0;", "return 0;", "return 0;", "return 0;",
			"return 0;" };

	private static int findPrimitiveTypeIndex(String typeName) {
		for (int i = 0; i < PRIMITIVE_TYPES.length; i++)
			if (typeName.equals(PRIMITIVE_TYPES[i]))
				return i;
		return -1;
	}

	public static boolean isPrimitiveType(String typeName) {
		return findPrimitiveTypeIndex(typeName) != -1;
	}

	public static boolean isArrayType(String typeName) {
		return typeName.indexOf("[]") >= 0;

	}

	public static boolean isStringType(String typeName) {
		return typeName.endsWith("String");

	}

	public static String getPrimitiveTypeFetchValue(String typeName) {
		int i = findPrimitiveTypeIndex(typeName);
		if (i != -1)
			return PRIMITIVE_FETCH_VALUES[i];
		else
			return "";
	}

	public static String getPrimitiveTypeReturnValue(String typeName,
			boolean fault) {
		int i = findPrimitiveTypeIndex(typeName);
		if (i != -1)
			return fault ? PRIMITIVE_RETURN_FAULT_VALUES[i]
					: PRIMITIVE_RETURN_VALUES[i];
		else
			return "";
	}

	public static String getBaseType(String typeName) {
		String ret = typeName.substring(typeName.lastIndexOf('.') + 1);
		return ret.replace("[]", "");
	}

}
