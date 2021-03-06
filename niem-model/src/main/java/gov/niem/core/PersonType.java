//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import gov.niem.domains.jxdm.PersonSexCodeType;
import gov.niem.utility.structures.ObjectType;


/**
 * A data type for a human being.
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/structures/5.0/}ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonBirthDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonDigitalImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonOtherIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonSexAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonNationality" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PersonType", namespace = "http://release.niem.gov/niem/niem-core/5.0/", propOrder = {
    "personBirthDate",
    "personDescriptionText",
    "personDigitalImage",
    "personName",
    "personOtherIdentification",
    "personSexAbstract",
    "personNationality"
})
public class PersonType
    extends ObjectType
{

    @XmlElement(name = "PersonBirthDate", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<DateType> personBirthDate;
    @XmlElement(name = "PersonDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> personDescriptionText;
    @XmlElement(name = "PersonDigitalImage", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<ImageType> personDigitalImage;
    @XmlElement(name = "PersonName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNameType> personName;
    @XmlElement(name = "PersonOtherIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personOtherIdentification;
    @XmlElementRef(name = "PersonSexAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> personSexAbstract;
    @XmlElement(name = "PersonNationality", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNationalityType> personNationality;

    /**
     * Gets the value of the personBirthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personBirthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getPersonBirthDate() {
        if (personBirthDate == null) {
            personBirthDate = new ArrayList<DateType>();
        }
        return this.personBirthDate;
    }

    /**
     * Gets the value of the personDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPersonDescriptionText() {
        if (personDescriptionText == null) {
            personDescriptionText = new ArrayList<TextType>();
        }
        return this.personDescriptionText;
    }

    /**
     * Gets the value of the personDigitalImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDigitalImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDigitalImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public List<ImageType> getPersonDigitalImage() {
        if (personDigitalImage == null) {
            personDigitalImage = new ArrayList<ImageType>();
        }
        return this.personDigitalImage;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the personOtherIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personOtherIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonOtherIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonOtherIdentification() {
        if (personOtherIdentification == null) {
            personOtherIdentification = new ArrayList<IdentificationType>();
        }
        return this.personOtherIdentification;
    }

    /**
     * Gets the value of the personSexAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personSexAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonSexAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonSexCodeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPersonSexAbstract() {
        if (personSexAbstract == null) {
            personSexAbstract = new ArrayList<JAXBElement<?>>();
        }
        return this.personSexAbstract;
    }

    /**
     * Gets the value of the personNationality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNationality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNationality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNationalityType }
     * 
     * 
     */
    public List<PersonNationalityType> getPersonNationality() {
        if (personNationality == null) {
            personNationality = new ArrayList<PersonNationalityType>();
        }
        return this.personNationality;
    }

}
