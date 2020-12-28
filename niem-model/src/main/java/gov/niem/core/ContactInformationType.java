//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 06:04:33 PM EST 
//


package gov.niem.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.niem.utility.structures.ObjectType;


/**
 * A data type for how to contact a person or an organization.
 * 
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/structures/5.0/}ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactMeansAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactEntityDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactInformationCategoryAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactInformationDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactResponder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactInformationAvailabilityAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}ContactInformationAugmentationPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ContactInformationType", namespace = "http://release.niem.gov/niem/niem-core/5.0/", propOrder = {
    "contactMeansAbstract",
    "contactEntity",
    "contactEntityDescriptionText",
    "contactInformationCategoryAbstract",
    "contactInformationDescriptionText",
    "contactResponder",
    "contactInformationAvailabilityAbstract",
    "contactInformationAugmentationPoint"
})
public class ContactInformationType
    extends ObjectType
{

    @XmlElement(name = "ContactMeansAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> contactMeansAbstract;
    @XmlElement(name = "ContactEntity", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<EntityType> contactEntity;
    @XmlElement(name = "ContactEntityDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> contactEntityDescriptionText;
    @XmlElement(name = "ContactInformationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> contactInformationCategoryAbstract;
    @XmlElement(name = "ContactInformationDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> contactInformationDescriptionText;
    @XmlElement(name = "ContactResponder", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonType> contactResponder;
    @XmlElement(name = "ContactInformationAvailabilityAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> contactInformationAvailabilityAbstract;
    @XmlElement(name = "ContactInformationAugmentationPoint", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> contactInformationAugmentationPoint;

    /**
     * Gets the value of the contactMeansAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMeansAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMeansAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContactMeansAbstract() {
        if (contactMeansAbstract == null) {
            contactMeansAbstract = new ArrayList<Object>();
        }
        return this.contactMeansAbstract;
    }

    /**
     * Gets the value of the contactEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getContactEntity() {
        if (contactEntity == null) {
            contactEntity = new ArrayList<EntityType>();
        }
        return this.contactEntity;
    }

    /**
     * Gets the value of the contactEntityDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEntityDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEntityDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getContactEntityDescriptionText() {
        if (contactEntityDescriptionText == null) {
            contactEntityDescriptionText = new ArrayList<TextType>();
        }
        return this.contactEntityDescriptionText;
    }

    /**
     * Gets the value of the contactInformationCategoryAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformationCategoryAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformationCategoryAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContactInformationCategoryAbstract() {
        if (contactInformationCategoryAbstract == null) {
            contactInformationCategoryAbstract = new ArrayList<Object>();
        }
        return this.contactInformationCategoryAbstract;
    }

    /**
     * Gets the value of the contactInformationDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformationDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformationDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getContactInformationDescriptionText() {
        if (contactInformationDescriptionText == null) {
            contactInformationDescriptionText = new ArrayList<TextType>();
        }
        return this.contactInformationDescriptionText;
    }

    /**
     * Gets the value of the contactResponder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactResponder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactResponder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getContactResponder() {
        if (contactResponder == null) {
            contactResponder = new ArrayList<PersonType>();
        }
        return this.contactResponder;
    }

    /**
     * Gets the value of the contactInformationAvailabilityAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformationAvailabilityAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformationAvailabilityAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContactInformationAvailabilityAbstract() {
        if (contactInformationAvailabilityAbstract == null) {
            contactInformationAvailabilityAbstract = new ArrayList<Object>();
        }
        return this.contactInformationAvailabilityAbstract;
    }

    /**
     * Gets the value of the contactInformationAugmentationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformationAugmentationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformationAugmentationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContactInformationAugmentationPoint() {
        if (contactInformationAugmentationPoint == null) {
            contactInformationAugmentationPoint = new ArrayList<Object>();
        }
        return this.contactInformationAugmentationPoint;
    }

}