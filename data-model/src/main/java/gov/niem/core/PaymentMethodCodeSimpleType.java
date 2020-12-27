//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 04:09:22 PM EST 
//


package gov.niem.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodCodeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodCodeSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Check"/&gt;
 *     &lt;enumeration value="Dividends"/&gt;
 *     &lt;enumeration value="Gross Proceeds/Redemptions"/&gt;
 *     &lt;enumeration value="Interest"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodCodeSimpleType", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
@XmlEnum
public enum PaymentMethodCodeSimpleType {


    /**
     * Cash
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * Check
     * 
     */
    @XmlEnumValue("Check")
    CHECK("Check"),

    /**
     * Dividends
     * 
     */
    @XmlEnumValue("Dividends")
    DIVIDENDS("Dividends"),

    /**
     * Gross Proceeds/Redemptions
     * 
     */
    @XmlEnumValue("Gross Proceeds/Redemptions")
    GROSS_PROCEEDS_REDEMPTIONS("Gross Proceeds/Redemptions"),

    /**
     * Interest
     * 
     */
    @XmlEnumValue("Interest")
    INTEREST("Interest"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PaymentMethodCodeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodCodeSimpleType fromValue(String v) {
        for (PaymentMethodCodeSimpleType c: PaymentMethodCodeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
