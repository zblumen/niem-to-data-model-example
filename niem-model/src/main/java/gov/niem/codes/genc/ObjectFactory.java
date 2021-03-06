//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.codes.genc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.niem.codes.genc package. 
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

    private final static QName _CountryAlpha3Code_QNAME = new QName("http://release.niem.gov/niem/codes/genc/5.0/", "CountryAlpha3Code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.niem.codes.genc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryAlpha3CodeType }
     * 
     */
    public CountryAlpha3CodeType createCountryAlpha3CodeType() {
        return new CountryAlpha3CodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryAlpha3CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/codes/genc/5.0/", name = "CountryAlpha3Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "CountryRepresentation")
    public JAXBElement<CountryAlpha3CodeType> createCountryAlpha3Code(CountryAlpha3CodeType value) {
        return new JAXBElement<CountryAlpha3CodeType>(_CountryAlpha3Code_QNAME, CountryAlpha3CodeType.class, null, value);
    }

}
