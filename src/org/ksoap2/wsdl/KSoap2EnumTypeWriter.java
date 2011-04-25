package org.ksoap2.wsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import net.patrickpollet.ksoap2.Soapeabilisable;

import org.apache.axis.utils.Messages;
import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaEnumTypeWriter;
import org.ksoap2.serialization.SoapObject;

//import enums.ObjectType;


public class KSoap2EnumTypeWriter extends JavaEnumTypeWriter {
	
	
	/**
	 * thses fields are private in superclass, so I duplicate them here 
	 */
	/** Field elements */
    private Vector elements;

    /** Field type */
    private TypeEntry type;
	
	  /**
     * Constructor.
     * 
     * @param emitter  
     * @param type     
     * @param elements 
     */
    protected KSoap2EnumTypeWriter(Emitter emitter, TypeEntry type,
                                 Vector elements) {
    	super(emitter,type,elements);
    	this.type=type;
    	this.elements=elements;
    }
    
    
	/**
     * Write the header comments.
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writeHeaderComments(PrintWriter pw) throws IOException {
       super.writeHeaderComments(pw);
        pw.println("/**");
        pw.println(" * Modified for KSoap2 library by pp@patrickpollet.net  using KSoap2EnumTypeWriter");
        pw.println(" */");
        pw.println();
    }    // writeHeaderComments
    
    /**
     * Returns the appropriate extends text
     * 
     * @return "" or " extends <class> "
     */
    protected String getExtendsText() {

        // See if this class extends another class
       // String extendsText = " extends SoapObject ";
    	 String extendsText = "";
/*
        if ((extendType != null) && !isUnion()
                && (!type.isSimpleType() || !extendType.isBaseType())
                && (extendType.getDimensions().length() == 0)) {
            extendsText = " extends " + extendType.getName() + " ";
        }
*/
        return extendsText;
    }
    
    /**
     * Returns the appropriate implements text
     * 
     * @return " implements <classes> "
     */
    protected String getImplementsText() {
    	return " implements Soapeabilisable";
    	// return "";
    }
    
    
    /**
     * Write the package declaration statement.
     * add some needed imports
     * @param pw 
     * @throws IOException 
     */
    protected void writePackage(PrintWriter pw) throws IOException {

        super.writePackage(pw);
        
        pw.println();
        pw.println("import java.util.Arrays;");
        pw.println("import java.util.List;");
        pw.println("import net.patrickpollet.ksoap2.KSoap2Utils;");
        pw.println("import net.patrickpollet.ksoap2.Soapeabilisable;");
        pw.println("import org.ksoap2.serialization.SoapObject;");
        pw.println();
        
       // System.out.println ("processing "+getClassName());
    }    // writePackage
    
    /**
     * Generate the binding for the given enumeration type.
     * The values vector contains the base type (first index) and
     * the values (subsequent Strings)
     * REMOVED Axis's specific code generation
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writeFileBody(PrintWriter pw) throws IOException {

        // Get the java name of the type
        String javaName = getClassName();

        // The first index is the base type.
        // The base type could be a non-object, if so get the corresponding Class.
        String baseType = ((TypeEntry) elements.get(0)).getName();
        String baseClass = baseType;

        if (baseType.indexOf("int") == 0) {
            baseClass = "java.lang.Integer";
        } else if (baseType.indexOf("char") == 0) {
            baseClass = "java.lang.Character";
        } else if (baseType.indexOf("short") == 0) {
            baseClass = "java.lang.Short";
        } else if (baseType.indexOf("long") == 0) {
            baseClass = "java.lang.Long";
        } else if (baseType.indexOf("double") == 0) {
            baseClass = "java.lang.Double";
        } else if (baseType.indexOf("float") == 0) {
            baseClass = "java.lang.Float";
        } else if (baseType.indexOf("byte") == 0) {
            baseClass = "java.lang.Byte";
        }

        // Create a list of the literal values.
        Vector values = new Vector();

        for (int i = 1; i < elements.size(); i++) {
            String value = (String) elements.get(i);

            if (baseClass.equals("java.lang.String")) {
                value = "\"" + value
                        + "\"";    // Surround literal with double quotes
            } else if (baseClass.equals("java.lang.Character")) {
                value = "'" + value + "'";
            } else if (baseClass.equals("java.lang.Float")) {
                if (!value.endsWith("F") && // Indicate float literal so javac
                        !value.endsWith(
                                "f")) {    // doesn't complain about precision.
                    value += "F";
                }
            } else if (baseClass.equals("java.lang.Long")) {
                if (!value.endsWith("L") && // Indicate float literal so javac
                        !value.endsWith(
                                "l")) {    // doesn't complain about precision.
                    value += "L";
                }
            } else if (baseClass.equals("javax.xml.namespace.QName")) {
                value = org.apache.axis.wsdl.symbolTable.Utils.getQNameFromPrefixedName(type.getNode(), value).toString();
                value = "javax.xml.namespace.QName.valueOf(\"" + value + "\")";
            } else if (baseClass.equals(baseType)) {

                // Construct baseClass object with literal string
                value = "new " + baseClass + "(\"" + value + "\")";
            }

            values.add(value);
        }

        // Create a list of ids
        Vector ids = getEnumValueIds(elements);

        // Each object has a private _value_ variable to store the base value
        pw.println("    private " + baseType + " _value_;");

        // The enumeration values are kept in a hashtable
        pw.println(
                "    private static java.util.HashMap _table_ = new java.util.HashMap();");
        pw.println("");

        // A protected constructor is used to create the static enumeration values
        pw.println("    // " + Messages.getMessage("ctor00"));
        pw.println("    protected " + javaName + "(" + baseType + " value) {");
        pw.println("        _value_ = value;");

        if (baseClass.equals("java.lang.String")
                || baseClass.equals(baseType)) {
            pw.println("        _table_.put(_value_,this);");
        } else {
            pw.println("        _table_.put(new " + baseClass
                    + "(_value_),this);");
        }

        pw.println("    }");
        pw.println("");

        // A public static variable of the base type is generated for each enumeration value.
        // Each variable is preceded by an _.
        for (int i = 0; i < ids.size(); i++) {
            
            // Need to catch the checked MalformedURIException for URI base types
            if(baseType.equals("org.apache.axis.types.URI")) {
                pw.println("    public static final " + baseType + " _" + ids.get(i) + ";");
                pw.println("    static {");
                pw.println("    	try {");
                pw.println("            _" + ids.get(i) + " = " + values.get(i) + ";");
                pw.println("        }");
                pw.println("        catch (org.apache.axis.types.URI.MalformedURIException mue) {");
                pw.println("            throw new java.lang.RuntimeException(mue.toString());");
                pw.println("        }");
                pw.println("    }");
                pw.println("");
            }
            else {
                pw.println("    public static final " + baseType + " _"
                    + ids.get(i) + " = " + values.get(i) + ";");
            }
        }

        // A public static variable is generated for each enumeration value.
        for (int i = 0; i < ids.size(); i++) {
            pw.println("    public static final " + javaName + " " + ids.get(i)
                    + " = new " + javaName + "(_" + ids.get(i) + ");");
        }

        // Getter that returns the base value of the enumeration value
        pw.println("    public " + baseType + " getValue() { return _value_;}");

        // FromValue returns the unique enumeration value object from the table
        pw.println("    public static " + javaName + " fromValue(" + baseType
                + " value)");
        pw.println("          throws java.lang.IllegalArgumentException {");
        pw.println("        " + javaName + " enumeration = (" + javaName + ")");

        if (baseClass.equals("java.lang.String")
                || baseClass.equals(baseType)) {
            pw.println("            _table_.get(value);");
        } else {
            pw.println("            _table_.get(new " + baseClass
                    + "(value));");
        }

        pw.println(
                "        if (enumeration==null) throw new java.lang.IllegalArgumentException();");
        pw.println("        return enumeration;");
        pw.println("    }");

        // FromString returns the unique enumeration value object from a string representation
        pw.println("    public static " + javaName
                + " fromString(java.lang.String value)");
        pw.println("          throws java.lang.IllegalArgumentException {");

        if (baseClass.equals("java.lang.String")) {
            pw.println("        return fromValue(value);");
        } else if (baseClass.equals("javax.xml.namespace.QName")) {
            pw.println("        try {");
            pw.println("            return fromValue(javax.xml.namespace.QName.valueOf"
                    + "(value));");
            pw.println("        } catch (Exception e) {");
            pw.println(
                    "            throw new java.lang.IllegalArgumentException();");
            pw.println("        }");
        } else if (baseClass.equals(baseType)) {
            pw.println("        try {");
            pw.println("            return fromValue(new " + baseClass
                    + "(value));");
            pw.println("        } catch (Exception e) {");
            pw.println(
                    "            throw new java.lang.IllegalArgumentException();");
            pw.println("        }");
        } else if (baseClass.equals("java.lang.Character")) {
            pw.println("        if (value != null && value.length() == 1);");
            pw.println("            return fromValue(value.charAt(0));");
            pw.println(
                    "        throw new java.lang.IllegalArgumentException();");
        } else if (baseClass.equals("java.lang.Integer")) {
            pw.println("        try {");
            pw.println(
                    "            return fromValue(java.lang.Integer.parseInt(value));");
            pw.println("        } catch (Exception e) {");
            pw.println(
                    "            throw new java.lang.IllegalArgumentException();");
            pw.println("        }");
        } else {
            String parse = "parse"
                    + baseClass.substring(baseClass.lastIndexOf(".")
                    + 1);

            pw.println("        try {");
            pw.println("            return fromValue(" + baseClass + "."
                    + parse + "(value));");
            pw.println("        } catch (Exception e) {");
            pw.println(
                    "            throw new java.lang.IllegalArgumentException();");
            pw.println("        }");
        }

        pw.println("    }");

        // Equals == to determine equality value.
        // Since enumeration values are singletons, == is appropriate for equals()
        pw.println(
                "    public boolean equals(java.lang.Object obj) {return (obj == this);}");

        // Provide a reasonable hashCode method (hashCode of the string value of the enumeration)
        pw.println(
                "    public int hashCode() { return toString().hashCode();}");

        // toString returns a string representation of the enumerated value
        if (baseClass.equals("java.lang.String")) {
            pw.println(
                    "    public java.lang.String toString() { return _value_;}");
        } else if (baseClass.equals(baseType)) {
            pw.println(
                    "    public java.lang.String toString() { return _value_.toString();}");
        } else {
            pw.println(
                    "    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}");
        }
     
        pw.println();
        
        // enum typas are Soapeabilisable 
        pw.println ("    public Soapeabilisable fromSoapResponse(SoapObject response) {");
        pw.printf("          return %s.fromValue(response.toString());",javaName);
        pw.println ("    }");
        
        
    }    // writeFileBody

}
