//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.28 at 09:56:02 PM EST 
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
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonCitizenship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonDigitalImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonLicenseIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonNationalIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonOtherIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonPassportIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonPrimaryLanguage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonSexAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonSSNIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonStateIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonTaxIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "personCitizenship",
    "personDescriptionText",
    "personDigitalImage",
    "personLicenseIdentification",
    "personName",
    "personNationalIdentification",
    "personOtherIdentification",
    "personPassportIdentification",
    "personPrimaryLanguage",
    "personSexAbstract",
    "personSSNIdentification",
    "personStateIdentification",
    "personTaxIdentification",
    "personNationality"
})
public class PersonType
    extends ObjectType
{

    @XmlElement(name = "PersonBirthDate", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<DateType> personBirthDate;
    @XmlElement(name = "PersonCitizenship", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonCitizenshipType> personCitizenship;
    @XmlElement(name = "PersonDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> personDescriptionText;
    @XmlElement(name = "PersonDigitalImage", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<ImageType> personDigitalImage;
    @XmlElement(name = "PersonLicenseIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personLicenseIdentification;
    @XmlElement(name = "PersonName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNameType> personName;
    @XmlElement(name = "PersonNationalIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personNationalIdentification;
    @XmlElement(name = "PersonOtherIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personOtherIdentification;
    @XmlElement(name = "PersonPassportIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personPassportIdentification;
    @XmlElement(name = "PersonPrimaryLanguage", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonLanguageType> personPrimaryLanguage;
    @XmlElement(name = "PersonSexAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> personSexAbstract;
    @XmlElement(name = "PersonSSNIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personSSNIdentification;
    @XmlElement(name = "PersonStateIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personStateIdentification;
    @XmlElement(name = "PersonTaxIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> personTaxIdentification;
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
     * Gets the value of the personCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCitizenshipType }
     * 
     * 
     */
    public List<PersonCitizenshipType> getPersonCitizenship() {
        if (personCitizenship == null) {
            personCitizenship = new ArrayList<PersonCitizenshipType>();
        }
        return this.personCitizenship;
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
     * Gets the value of the personLicenseIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personLicenseIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonLicenseIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonLicenseIdentification() {
        if (personLicenseIdentification == null) {
            personLicenseIdentification = new ArrayList<IdentificationType>();
        }
        return this.personLicenseIdentification;
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
     * Gets the value of the personNationalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNationalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNationalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonNationalIdentification() {
        if (personNationalIdentification == null) {
            personNationalIdentification = new ArrayList<IdentificationType>();
        }
        return this.personNationalIdentification;
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
     * Gets the value of the personPassportIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPassportIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPassportIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonPassportIdentification() {
        if (personPassportIdentification == null) {
            personPassportIdentification = new ArrayList<IdentificationType>();
        }
        return this.personPassportIdentification;
    }

    /**
     * Gets the value of the personPrimaryLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPrimaryLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPrimaryLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLanguageType }
     * 
     * 
     */
    public List<PersonLanguageType> getPersonPrimaryLanguage() {
        if (personPrimaryLanguage == null) {
            personPrimaryLanguage = new ArrayList<PersonLanguageType>();
        }
        return this.personPrimaryLanguage;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPersonSexAbstract() {
        if (personSexAbstract == null) {
            personSexAbstract = new ArrayList<Object>();
        }
        return this.personSexAbstract;
    }

    /**
     * Gets the value of the personSSNIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personSSNIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonSSNIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonSSNIdentification() {
        if (personSSNIdentification == null) {
            personSSNIdentification = new ArrayList<IdentificationType>();
        }
        return this.personSSNIdentification;
    }

    /**
     * Gets the value of the personStateIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personStateIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonStateIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonStateIdentification() {
        if (personStateIdentification == null) {
            personStateIdentification = new ArrayList<IdentificationType>();
        }
        return this.personStateIdentification;
    }

    /**
     * Gets the value of the personTaxIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personTaxIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonTaxIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getPersonTaxIdentification() {
        if (personTaxIdentification == null) {
            personTaxIdentification = new ArrayList<IdentificationType>();
        }
        return this.personTaxIdentification;
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
