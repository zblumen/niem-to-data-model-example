//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.utility.codelists.schema.appinfo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.niem.utility.codelists.schema.appinfo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.niem.utility.codelists.schema.appinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplexCodeListBinding }
     * 
     */
    public ComplexCodeListBinding createComplexCodeListBinding() {
        return new ComplexCodeListBinding();
    }

    /**
     * Create an instance of {@link SimpleCodeListBinding }
     * 
     */
    public SimpleCodeListBinding createSimpleCodeListBinding() {
        return new SimpleCodeListBinding();
    }

    /**
     * Create an instance of {@link ComplexCodeListBinding.ElementCodeListBinding }
     * 
     */
    public ComplexCodeListBinding.ElementCodeListBinding createComplexCodeListBindingElementCodeListBinding() {
        return new ComplexCodeListBinding.ElementCodeListBinding();
    }

}
