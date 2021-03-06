//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.domains.jxdm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.niem.domains.jxdm package. 
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

    private final static QName _PersonSexCode_QNAME = new QName("http://release.niem.gov/niem/domains/jxdm/7.0/", "PersonSexCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.niem.domains.jxdm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonSexCodeType }
     * 
     */
    public PersonSexCodeType createPersonSexCodeType() {
        return new PersonSexCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonSexCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/", name = "PersonSexCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "PersonSexAbstract")
    public JAXBElement<PersonSexCodeType> createPersonSexCode(PersonSexCodeType value) {
        return new JAXBElement<PersonSexCodeType>(_PersonSexCode_QNAME, PersonSexCodeType.class, null, value);
    }

}
