//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.niem.adapters.xs.AnyURI;
import gov.niem.utility.structures.ObjectType;


/**
 * A data type for a digital representation of an object encoded in a binary format.
 * 
 * <p>Java class for BinaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/structures/5.0/}ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}BinaryHash" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}BinaryDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}BinaryURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='urn:us:gov:ic:ntk urn:us:gov:ic:ism'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryType", namespace = "http://release.niem.gov/niem/niem-core/5.0/", propOrder = {
    "binaryHash",
    "binaryDescriptionText",
    "binaryURI"
})
@XmlSeeAlso({
    ImageType.class
})
public class BinaryType
    extends ObjectType
{

    @XmlElement(name = "BinaryHash", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<BinaryHashType> binaryHash;
    @XmlElement(name = "BinaryDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> binaryDescriptionText;
    @XmlElement(name = "BinaryURI", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<AnyURI> binaryURI;

    /**
     * Gets the value of the binaryHash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryHash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryHashType }
     * 
     * 
     */
    public List<BinaryHashType> getBinaryHash() {
        if (binaryHash == null) {
            binaryHash = new ArrayList<BinaryHashType>();
        }
        return this.binaryHash;
    }

    /**
     * Gets the value of the binaryDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getBinaryDescriptionText() {
        if (binaryDescriptionText == null) {
            binaryDescriptionText = new ArrayList<TextType>();
        }
        return this.binaryDescriptionText;
    }

    /**
     * Gets the value of the binaryURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyURI }
     * 
     * 
     */
    public List<AnyURI> getBinaryURI() {
        if (binaryURI == null) {
            binaryURI = new ArrayList<AnyURI>();
        }
        return this.binaryURI;
    }

}
