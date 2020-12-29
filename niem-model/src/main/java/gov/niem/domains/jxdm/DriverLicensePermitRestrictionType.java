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
import gov.niem.codes.aamva_d20.DrivingPermitRestrictionCodeType;


/**
 * A data type for a restriction applicable to a driver permit.
 * 
 * <p>Java class for DriverLicensePermitRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverLicensePermitRestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/domains/jxdm/7.0/}DrivingRestrictionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/domains/jxdm/7.0/}DriverLicensePermitRestrictionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/domains/jxdm/7.0/}DriverLicensePermitRestrictionAugmentationPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DriverLicensePermitRestrictionType", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/", propOrder = {
    "driverLicensePermitRestrictionCode",
    "driverLicensePermitRestrictionAugmentationPoint"
})
public class DriverLicensePermitRestrictionType
    extends DrivingRestrictionType
{

    @XmlElement(name = "DriverLicensePermitRestrictionCode", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/", nillable = true)
    protected List<DrivingPermitRestrictionCodeType> driverLicensePermitRestrictionCode;
    @XmlElement(name = "DriverLicensePermitRestrictionAugmentationPoint", namespace = "http://release.niem.gov/niem/domains/jxdm/7.0/")
    protected List<Object> driverLicensePermitRestrictionAugmentationPoint;

    /**
     * Gets the value of the driverLicensePermitRestrictionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverLicensePermitRestrictionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverLicensePermitRestrictionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrivingPermitRestrictionCodeType }
     * 
     * 
     */
    public List<DrivingPermitRestrictionCodeType> getDriverLicensePermitRestrictionCode() {
        if (driverLicensePermitRestrictionCode == null) {
            driverLicensePermitRestrictionCode = new ArrayList<DrivingPermitRestrictionCodeType>();
        }
        return this.driverLicensePermitRestrictionCode;
    }

    /**
     * Gets the value of the driverLicensePermitRestrictionAugmentationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverLicensePermitRestrictionAugmentationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverLicensePermitRestrictionAugmentationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDriverLicensePermitRestrictionAugmentationPoint() {
        if (driverLicensePermitRestrictionAugmentationPoint == null) {
            driverLicensePermitRestrictionAugmentationPoint = new ArrayList<Object>();
        }
        return this.driverLicensePermitRestrictionAugmentationPoint;
    }

}
