//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.28 at 09:56:02 PM EST 
//


package gov.niem.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for a word or phrase by which a person or thing is known, referred, or addressed.
 * 
 * <p>Java class for ProperNameTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProperNameTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://release.niem.gov/niem/niem-core/5.0/&gt;TextType"&gt;
 *       &lt;anyAttribute processContents='lax' namespace='urn:us:gov:ic:ntk urn:us:gov:ic:ism'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProperNameTextType", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
public class ProperNameTextType
    extends TextType
{


}
