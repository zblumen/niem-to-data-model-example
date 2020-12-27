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
 * <p>Java class for DrivingPermitRestrictionCodeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrivingPermitRestrictionCodeSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrivingPermitRestrictionCodeSimpleType", namespace = "http://release.niem.gov/niem/codes/aamva_d20/5.0/")
@XmlEnum
public enum DrivingPermitRestrictionCodeSimpleType {


    /**
     * Corrective lenses must be worn
     * 
     */
    B,

    /**
     * Mechanical Aid
     * 
     */
    C,

    /**
     * Prosthetic Aid
     * 
     */
    D,

    /**
     * No Manual Transmission
     * 
     */
    E,

    /**
     * Outside Mirror
     * 
     */
    F,

    /**
     * Limit to Daylight Only
     * 
     */
    G,

    /**
     * Limited to Employment
     * 
     */
    H,

    /**
     * Limited - other
     * 
     */
    I,

    /**
     * Other
     * 
     */
    J,

    /**
     * Intrastate Only
     * 
     */
    K,

    /**
     * No Air Brakes Equipped Vehicle
     * 
     */
    L,

    /**
     * No Class A Passenger Vehicle
     * 
     */
    M,

    /**
     * No Class A and Class B Passenger Vehicle
     * 
     */
    N,

    /**
     * No Tractor-Trailer
     * 
     */
    O,

    /**
     * No Passengers in CMV Bus
     * 
     */
    P,

    /**
     * Medical Variance
     * 
     */
    V,

    /**
     * Farm Waiver
     * 
     */
    W,

    /**
     * No Cargo in CMV Tank Vehicle
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static DrivingPermitRestrictionCodeSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
