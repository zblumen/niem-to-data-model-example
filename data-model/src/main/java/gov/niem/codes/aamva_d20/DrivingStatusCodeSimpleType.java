//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 04:09:22 PM EST 
//


package gov.niem.codes.aamva_d20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrivingStatusCodeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrivingStatusCodeSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ELG"/&gt;
 *     &lt;enumeration value="LIC"/&gt;
 *     &lt;enumeration value="NEN"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrivingStatusCodeSimpleType", namespace = "http://release.niem.gov/niem/codes/aamva_d20/5.0/")
@XmlEnum
public enum DrivingStatusCodeSimpleType {


    /**
     * The individual does not have a current valid license and has nothing on record that would prevent issuance.
     * 
     */
    ELG,

    /**
     * The individual has a current valid license with all their driving privileges intact.
     * 
     */
    LIC,

    /**
     * The individual has been withdrawn in a specific jurisdiction for an offense which is not federally mandated and not related to traffic safety.
     * 
     */
    NEN,

    /**
     * The individual does not have a current valid license and has an adverse action on record that prevents issuance in all jurisdictions.
     * 
     */
    NOT,

    /**
     * The individual has been reported deceased.
     * 
     */
    RPD;

    public String value() {
        return name();
    }

    public static DrivingStatusCodeSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
