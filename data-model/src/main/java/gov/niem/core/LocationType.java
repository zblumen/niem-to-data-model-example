//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 03:48:01 PM EST 
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
 * A data type for geospatial location.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://release.niem.gov/niem/structures/5.0/}ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationAddressAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationCategoryAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationDirectionsText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationGeospatialCoordinateAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationHeightAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationLandmarkAbstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationLocale" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationMapLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationRangeDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationRelativeLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationSurroundingAreaDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/5.0/}LocationAugmentationPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LocationType", namespace = "http://release.niem.gov/niem/niem-core/5.0/", propOrder = {
    "locationAddressAbstract",
    "locationArea",
    "locationCategoryAbstract",
    "locationContactInformation",
    "locationDescriptionText",
    "locationDirectionsText",
    "locationGeospatialCoordinateAbstract",
    "locationHeightAbstract",
    "locationIdentification",
    "locationLandmarkAbstract",
    "locationLocale",
    "locationMapLocation",
    "locationName",
    "locationPart",
    "locationRangeDescriptionText",
    "locationRelativeLocation",
    "locationSurroundingAreaDescriptionText",
    "locationAugmentationPoint"
})
public class LocationType
    extends ObjectType
{

    @XmlElement(name = "LocationAddressAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationAddressAbstract;
    @XmlElement(name = "LocationArea", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<AreaType> locationArea;
    @XmlElement(name = "LocationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationCategoryAbstract;
    @XmlElement(name = "LocationContactInformation", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<ContactInformationType> locationContactInformation;
    @XmlElement(name = "LocationDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> locationDescriptionText;
    @XmlElement(name = "LocationDirectionsText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> locationDirectionsText;
    @XmlElement(name = "LocationGeospatialCoordinateAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationGeospatialCoordinateAbstract;
    @XmlElement(name = "LocationHeightAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationHeightAbstract;
    @XmlElement(name = "LocationIdentification", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<IdentificationType> locationIdentification;
    @XmlElement(name = "LocationLandmarkAbstract", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationLandmarkAbstract;
    @XmlElement(name = "LocationLocale", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<LocaleType> locationLocale;
    @XmlElement(name = "LocationMapLocation", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<MapLocationType> locationMapLocation;
    @XmlElement(name = "LocationName", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<ProperNameTextType> locationName;
    @XmlElement(name = "LocationPart", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<LocationPartType> locationPart;
    @XmlElement(name = "LocationRangeDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> locationRangeDescriptionText;
    @XmlElement(name = "LocationRelativeLocation", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<RelativeLocationType> locationRelativeLocation;
    @XmlElement(name = "LocationSurroundingAreaDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/5.0/", nillable = true)
    protected List<TextType> locationSurroundingAreaDescriptionText;
    @XmlElement(name = "LocationAugmentationPoint", namespace = "http://release.niem.gov/niem/niem-core/5.0/")
    protected List<Object> locationAugmentationPoint;

    /**
     * Gets the value of the locationAddressAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAddressAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAddressAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationAddressAbstract() {
        if (locationAddressAbstract == null) {
            locationAddressAbstract = new ArrayList<Object>();
        }
        return this.locationAddressAbstract;
    }

    /**
     * Gets the value of the locationArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaType }
     * 
     * 
     */
    public List<AreaType> getLocationArea() {
        if (locationArea == null) {
            locationArea = new ArrayList<AreaType>();
        }
        return this.locationArea;
    }

    /**
     * Gets the value of the locationCategoryAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCategoryAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCategoryAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationCategoryAbstract() {
        if (locationCategoryAbstract == null) {
            locationCategoryAbstract = new ArrayList<Object>();
        }
        return this.locationCategoryAbstract;
    }

    /**
     * Gets the value of the locationContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getLocationContactInformation() {
        if (locationContactInformation == null) {
            locationContactInformation = new ArrayList<ContactInformationType>();
        }
        return this.locationContactInformation;
    }

    /**
     * Gets the value of the locationDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getLocationDescriptionText() {
        if (locationDescriptionText == null) {
            locationDescriptionText = new ArrayList<TextType>();
        }
        return this.locationDescriptionText;
    }

    /**
     * Gets the value of the locationDirectionsText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDirectionsText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDirectionsText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getLocationDirectionsText() {
        if (locationDirectionsText == null) {
            locationDirectionsText = new ArrayList<TextType>();
        }
        return this.locationDirectionsText;
    }

    /**
     * Gets the value of the locationGeospatialCoordinateAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationGeospatialCoordinateAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationGeospatialCoordinateAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationGeospatialCoordinateAbstract() {
        if (locationGeospatialCoordinateAbstract == null) {
            locationGeospatialCoordinateAbstract = new ArrayList<Object>();
        }
        return this.locationGeospatialCoordinateAbstract;
    }

    /**
     * Gets the value of the locationHeightAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHeightAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHeightAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationHeightAbstract() {
        if (locationHeightAbstract == null) {
            locationHeightAbstract = new ArrayList<Object>();
        }
        return this.locationHeightAbstract;
    }

    /**
     * Gets the value of the locationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType }
     * 
     * 
     */
    public List<IdentificationType> getLocationIdentification() {
        if (locationIdentification == null) {
            locationIdentification = new ArrayList<IdentificationType>();
        }
        return this.locationIdentification;
    }

    /**
     * Gets the value of the locationLandmarkAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLandmarkAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLandmarkAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationLandmarkAbstract() {
        if (locationLandmarkAbstract == null) {
            locationLandmarkAbstract = new ArrayList<Object>();
        }
        return this.locationLandmarkAbstract;
    }

    /**
     * Gets the value of the locationLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocaleType }
     * 
     * 
     */
    public List<LocaleType> getLocationLocale() {
        if (locationLocale == null) {
            locationLocale = new ArrayList<LocaleType>();
        }
        return this.locationLocale;
    }

    /**
     * Gets the value of the locationMapLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationMapLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationMapLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapLocationType }
     * 
     * 
     */
    public List<MapLocationType> getLocationMapLocation() {
        if (locationMapLocation == null) {
            locationMapLocation = new ArrayList<MapLocationType>();
        }
        return this.locationMapLocation;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProperNameTextType }
     * 
     * 
     */
    public List<ProperNameTextType> getLocationName() {
        if (locationName == null) {
            locationName = new ArrayList<ProperNameTextType>();
        }
        return this.locationName;
    }

    /**
     * Gets the value of the locationPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationPartType }
     * 
     * 
     */
    public List<LocationPartType> getLocationPart() {
        if (locationPart == null) {
            locationPart = new ArrayList<LocationPartType>();
        }
        return this.locationPart;
    }

    /**
     * Gets the value of the locationRangeDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRangeDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRangeDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getLocationRangeDescriptionText() {
        if (locationRangeDescriptionText == null) {
            locationRangeDescriptionText = new ArrayList<TextType>();
        }
        return this.locationRangeDescriptionText;
    }

    /**
     * Gets the value of the locationRelativeLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRelativeLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRelativeLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeLocationType }
     * 
     * 
     */
    public List<RelativeLocationType> getLocationRelativeLocation() {
        if (locationRelativeLocation == null) {
            locationRelativeLocation = new ArrayList<RelativeLocationType>();
        }
        return this.locationRelativeLocation;
    }

    /**
     * Gets the value of the locationSurroundingAreaDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationSurroundingAreaDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationSurroundingAreaDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getLocationSurroundingAreaDescriptionText() {
        if (locationSurroundingAreaDescriptionText == null) {
            locationSurroundingAreaDescriptionText = new ArrayList<TextType>();
        }
        return this.locationSurroundingAreaDescriptionText;
    }

    /**
     * Gets the value of the locationAugmentationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAugmentationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAugmentationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLocationAugmentationPoint() {
        if (locationAugmentationPoint == null) {
            locationAugmentationPoint = new ArrayList<Object>();
        }
        return this.locationAugmentationPoint;
    }

}
