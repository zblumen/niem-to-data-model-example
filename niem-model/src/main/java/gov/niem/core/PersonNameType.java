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
import javax.xml.bind.annotation.XmlType;
import gov.niem.utility.structures.ObjectType;


/**
 * A data type for a combination of names and/or titles by which a person is known.
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/structures/5.0/}ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonGivenName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonSurName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}PersonFullName" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PersonNameType", namespace = "http://release.niem.gov/niem/niem-core/5.0/", propOrder = {
    "personGivenName",
    "personSurName",
    "personFullName"
})
public class PersonNameType
    extends ObjectType
{

    @XmlElement(name = "PersonGivenName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNameTextType> personGivenName;
    @XmlElement(name = "PersonSurName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNameTextType> personSurName;
    @XmlElement(name = "PersonFullName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<PersonNameTextType> personFullName;

    /**
     * Gets the value of the personGivenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personGivenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonGivenName() {
        if (personGivenName == null) {
            personGivenName = new ArrayList<PersonNameTextType>();
        }
        return this.personGivenName;
    }

    /**
     * Gets the value of the personSurName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personSurName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonSurName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonSurName() {
        if (personSurName == null) {
            personSurName = new ArrayList<PersonNameTextType>();
        }
        return this.personSurName;
    }

    /**
     * Gets the value of the personFullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonFullName() {
        if (personFullName == null) {
            personFullName = new ArrayList<PersonNameTextType>();
        }
        return this.personFullName;
    }

}
