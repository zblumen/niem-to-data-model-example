//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.28 at 09:56:02 PM EST 
//


package gov.niem.domains.jxdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.niem.codes.aamva_d20.DriverLicensePermitEndorsementCodeType;


/**
 * A data type for an endorsement on a driver license permit which authorizes the operation of specified types of vehicles carrying specified loads.
 * 
 * <p>Java class for DriverLicensePermitEndorsementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverLicensePermitEndorsementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/domains/jxdm/7.0/}DriverLicenseBaseEndorsementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/domains/jxdm/7.0/}DriverLicensePermitEndorsementCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/domains/jxdm/7.0/}DriverLicensePermitEndorsementAugmentationPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DriverLicensePermitEndorsementType", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/", propOrder = {
    "driverLicensePermitEndorsementCode",
    "driverLicensePermitEndorsementAugmentationPoint"
})
public class DriverLicensePermitEndorsementType
    extends DriverLicenseBaseEndorsementType
{

    @XmlElement(name = "DriverLicensePermitEndorsementCode", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/", nillable = true)
    protected List<DriverLicensePermitEndorsementCodeType> driverLicensePermitEndorsementCode;
    @XmlElement(name = "DriverLicensePermitEndorsementAugmentationPoint", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/")
    protected List<Object> driverLicensePermitEndorsementAugmentationPoint;

    /**
     * Gets the value of the driverLicensePermitEndorsementCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverLicensePermitEndorsementCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverLicensePermitEndorsementCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverLicensePermitEndorsementCodeType }
     * 
     * 
     */
    public List<DriverLicensePermitEndorsementCodeType> getDriverLicensePermitEndorsementCode() {
        if (driverLicensePermitEndorsementCode == null) {
            driverLicensePermitEndorsementCode = new ArrayList<DriverLicensePermitEndorsementCodeType>();
        }
        return this.driverLicensePermitEndorsementCode;
    }

    /**
     * Gets the value of the driverLicensePermitEndorsementAugmentationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverLicensePermitEndorsementAugmentationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverLicensePermitEndorsementAugmentationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDriverLicensePermitEndorsementAugmentationPoint() {
        if (driverLicensePermitEndorsementAugmentationPoint == null) {
            driverLicensePermitEndorsementAugmentationPoint = new ArrayList<Object>();
        }
        return this.driverLicensePermitEndorsementAugmentationPoint;
    }

}
