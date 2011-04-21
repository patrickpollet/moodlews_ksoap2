package net.patrickpollet.ksoap2;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.utils.JavaUtils;
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
		 //KSoap2 does not Marshall yet float
		 //return Float.parseFloat(response.getProperty(id).toString());
		// rev 1.8.4 it now does (see class net.patrickpollet.ksoap2.MySoapSerializationEnvelope) 
		return ((Float) (response.getProperty(id))).floatValue(); 
	}

	public static double getDouble(SoapObject response, String id) {
		//KSoap2 does not Marshall yet float
		 //return Double.parseDouble(response.getProperty(id).toString());
		// rev 1.8.4 it now does (see class net.patrickpollet.ksoap2.MySoapSerializationEnvelope) 
		return ((Double) (response.getProperty(id))).doubleValue(); 
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
	 * return an array of objects from the Soap response
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
	
	
	/**
	 * return an array of simple objects (String or Java wrapper classes)  from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  Object[]  These object MUST be kvmSerialisable
	 */
	public static Object[] getObjectArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		Object[] rets = new Object[recordsCount];
		for (int i = 0; i < recordsCount; i++) {
			Object record = response.getProperty(i);
			rets[i] = record; 
		}
		return rets;
	}
	
	
	/**
	 * return an array of strings from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  String[]  String is already kvmSerialisable
	 */
	public static String[] getStringArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		String[] rets = new String[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = response.getProperty(i).toString();
		return rets;
	}
	
	/**
	 * return an array of boolean from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  boolean []  Boolean is already kvmSerialisable
	 */
	public static boolean[] getBooleanArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		boolean[] rets = new boolean[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = ((Boolean)response.getProperty(i)).booleanValue();
		return rets;
	}
	
	/**
	 * return an array of int from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  int[]  Integer is already kvmSerialisable
	 */
	public static int[] getIntegerArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		int[] rets = new int[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = ((Integer)response.getProperty(i)).intValue();
		return rets;
	}
	
	
	/**
	 * return an array of long from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  long[]  Long is already kvmSerialisable
	 */
	public static long[] getLongArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		long[] rets = new long[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = ((Long)response.getProperty(i)).longValue();
		return rets;
	}
	
	/**
	 * return an array of short from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  Short[]  Short is already kvmSerialisable
	 */
	public static short[] getShortArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		short[] rets = new short[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = ((Short)response.getProperty(i)).shortValue();
		return rets;
	}
	
	/**
	 * return an array of strings from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  byte[]  Byte is already kvmSerialisable
	 */
	public static byte[] getByteArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		byte[] rets = new byte[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			rets[i] = ((Byte)response.getProperty(i)).byteValue();
		return rets;
	}
	
	/**
	 * return an array of float from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  float[]  Float ARE now kvmSerialisable if one use MySoapSerialisationEnvelope class instead
	 */
	public static float[] getFloatArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		float[] rets = new float[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			// rev 1.8.4 it now does (see class net.patrickpollet.ksoap2.MySoapSerializationEnvelope) 
			rets[i]= ((Float) (response.getProperty(i))).floatValue(); 
		   // KSoap2 does not Marshall yet float
		   //rets[i]=Float.parseFloat(response.getProperty(i).toString()); 
		return rets;
	}
	
	/**
	 * return an array of double from the Soap response
	 * 
	 * @param response  a full or partial Soap Response
	 * @return  double[]  Double ARE now kvmSerialisable if one use MySoapSerialisationEnvelope class instead
	 */
	public static double[] getDoubleArray(SoapObject response) {
		int recordsCount = response.getPropertyCount();
		double[] rets = new double[recordsCount];
		for (int i = 0; i < recordsCount; i++) 
			//KSoap2 does not Marshall yet double
			//rets[i]=Double.parseDouble(response.getProperty(i).toString());
			// rev 1.8.4 it now does (see class net.patrickpollet.ksoap2.MySoapSerializationEnvelope) 
			rets[i]= ((Double) (response.getProperty(i))).doubleValue();
		return rets;
	}

	private static String[] PRIMITIVE_TYPES = { "boolean", "int", "long",
			"short", "byte", "float", "double" };
	
	private static String[] PRIMITIVE_WRAPPER_TYPES = { "Boolean", "Integer", "Long",
		"Short", "Byte", "Float", "Double" };

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

	public static String getWrapperClassName (String typeName) {
		int i=findPrimitiveTypeIndex(typeName);
		if (i!=-1) return PRIMITIVE_WRAPPER_TYPES[i];
		else return null ; // unlikeley 
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
	/**  not anymore needed  enums type are now Soapeabilisable 
	public static boolean isEnumType(String typeName) {
		//return false; // TODO
		try {
			return JavaUtils.isEnumClass(Class.forName(typeName));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false; 
		}

	}
	***/
	
	public static boolean isWrapperType(String typeName) {
		String shortTypeName=getBaseType(typeName); //remove java.lang. prefix
		for (int i = 0; i < PRIMITIVE_WRAPPER_TYPES.length; i++)
			if (shortTypeName.equals(PRIMITIVE_WRAPPER_TYPES[i]))
				return true;
		return false;

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
