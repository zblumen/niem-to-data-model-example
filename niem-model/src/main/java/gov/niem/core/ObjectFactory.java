//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.02 at 04:56:07 PM EST 
//


package gov.niem.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.niem.adapters.xs.AnyURI;
import gov.niem.adapters.xs.DateTime;
import gov.niem.adapters.xs.String;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.niem.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CountryRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "CountryRepresentation");
    private final static QName _BinaryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "BinaryDescriptionText");
    private final static QName _BinaryHash_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "BinaryHash");
    private final static QName _BinaryURI_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "BinaryURI");
    private final static QName _DateRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DateRepresentation");
    private final static QName _DateTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DateTime");
    private final static QName _DocumentBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentBinary");
    private final static QName _DocumentContentAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentContentAbstract");
    private final static QName _DocumentCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentCategoryAbstract");
    private final static QName _DocumentCategoryName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentCategoryName");
    private final static QName _DocumentDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentDescriptionText");
    private final static QName _DocumentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "DocumentText");
    private final static QName _EntityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "EntityDescriptionText");
    private final static QName _EntityName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "EntityName");
    private final static QName _EntityPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "EntityPerson");
    private final static QName _EntityRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "EntityRepresentation");
    private final static QName _GenericEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "GenericEntity");
    private final static QName _IdentificationCategoryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationCategoryDescriptionText");
    private final static QName _IdentificationEffectiveDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationEffectiveDate");
    private final static QName _IdentificationExpirationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationExpirationDate");
    private final static QName _IdentificationID_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationID");
    private final static QName _IdentificationJurisdiction_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationJurisdiction");
    private final static QName _IdentificationSourceText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationSourceText");
    private final static QName _IdentificationStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "IdentificationStatus");
    private final static QName _MessageAttachmentAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageAttachmentAbstract");
    private final static QName _MessageAttachmentBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageAttachmentBinary");
    private final static QName _MessageAttachmentDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageAttachmentDocument");
    private final static QName _MessageAttachmentImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageAttachmentImage");
    private final static QName _MessageCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageCategoryAbstract");
    private final static QName _MessageCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageCategoryText");
    private final static QName _MessageID_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageID");
    private final static QName _MessageRecipientAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageRecipientAbstract");
    private final static QName _MessageRecipientEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageRecipientEntity");
    private final static QName _MessageSenderAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageSenderAbstract");
    private final static QName _MessageSenderEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageSenderEntity");
    private final static QName _MessageSentDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageSentDate");
    private final static QName _MessageSubjectText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageSubjectText");
    private final static QName _MessageText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "MessageText");
    private final static QName _PersonBirthDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonBirthDate");
    private final static QName _PersonDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonDescriptionText");
    private final static QName _PersonDigitalImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonDigitalImage");
    private final static QName _PersonFullName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonFullName");
    private final static QName _PersonGivenName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonGivenName");
    private final static QName _PersonName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonName");
    private final static QName _PersonNationality_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonNationality");
    private final static QName _PersonNationalityCountry_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonNationalityCountry");
    private final static QName _PersonOtherIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonOtherIdentification");
    private final static QName _PersonSexAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonSexAbstract");
    private final static QName _PersonSurName_QNAME = new QName("http://release.niem.gov/niem/niem-core/5.0/", "PersonSurName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.niem.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link BinaryHashType }
     * 
     */
    public BinaryHashType createBinaryHashType() {
        return new BinaryHashType();
    }

    /**
     * Create an instance of {@link BinaryType }
     * 
     */
    public BinaryType createBinaryType() {
        return new BinaryType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link GenericEntityType }
     * 
     */
    public GenericEntityType createGenericEntityType() {
        return new GenericEntityType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link JurisdictionType }
     * 
     */
    public JurisdictionType createJurisdictionType() {
        return new JurisdictionType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link PersonNameTextType }
     * 
     */
    public PersonNameTextType createPersonNameTextType() {
        return new PersonNameTextType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link PersonNationalityType }
     * 
     */
    public PersonNationalityType createPersonNationalityType() {
        return new PersonNationalityType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link ProperNameTextType }
     * 
     */
    public ProperNameTextType createProperNameTextType() {
        return new ProperNameTextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "CountryRepresentation")
    public JAXBElement<Object> createCountryRepresentation(Object value) {
        return new JAXBElement<Object>(_CountryRepresentation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "BinaryDescriptionText")
    public JAXBElement<TextType> createBinaryDescriptionText(TextType value) {
        return new JAXBElement<TextType>(_BinaryDescriptionText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryHashType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "BinaryHash")
    public JAXBElement<BinaryHashType> createBinaryHash(BinaryHashType value) {
        return new JAXBElement<BinaryHashType>(_BinaryHash_QNAME, BinaryHashType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "BinaryURI")
    public JAXBElement<AnyURI> createBinaryURI(AnyURI value) {
        return new JAXBElement<AnyURI>(_BinaryURI_QNAME, AnyURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DateRepresentation")
    public JAXBElement<Object> createDateRepresentation(Object value) {
        return new JAXBElement<Object>(_DateRepresentation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DateTime", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "DateRepresentation")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "DocumentContentAbstract")
    public JAXBElement<BinaryType> createDocumentBinary(BinaryType value) {
        return new JAXBElement<BinaryType>(_DocumentBinary_QNAME, BinaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentContentAbstract")
    public JAXBElement<Object> createDocumentContentAbstract(Object value) {
        return new JAXBElement<Object>(_DocumentContentAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentCategoryAbstract")
    public JAXBElement<Object> createDocumentCategoryAbstract(Object value) {
        return new JAXBElement<Object>(_DocumentCategoryAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentCategoryName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "DocumentCategoryAbstract")
    public JAXBElement<TextType> createDocumentCategoryName(TextType value) {
        return new JAXBElement<TextType>(_DocumentCategoryName_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentDescriptionText")
    public JAXBElement<TextType> createDocumentDescriptionText(TextType value) {
        return new JAXBElement<TextType>(_DocumentDescriptionText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "DocumentText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "DocumentContentAbstract")
    public JAXBElement<TextType> createDocumentText(TextType value) {
        return new JAXBElement<TextType>(_DocumentText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "EntityDescriptionText")
    public JAXBElement<TextType> createEntityDescriptionText(TextType value) {
        return new JAXBElement<TextType>(_EntityDescriptionText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "EntityName")
    public JAXBElement<TextType> createEntityName(TextType value) {
        return new JAXBElement<TextType>(_EntityName_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "EntityPerson", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "EntityRepresentation")
    public JAXBElement<PersonType> createEntityPerson(PersonType value) {
        return new JAXBElement<PersonType>(_EntityPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "EntityRepresentation")
    public JAXBElement<Object> createEntityRepresentation(Object value) {
        return new JAXBElement<Object>(_EntityRepresentation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "GenericEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "EntityRepresentation")
    public JAXBElement<GenericEntityType> createGenericEntity(GenericEntityType value) {
        return new JAXBElement<GenericEntityType>(_GenericEntity_QNAME, GenericEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationCategoryDescriptionText")
    public JAXBElement<TextType> createIdentificationCategoryDescriptionText(TextType value) {
        return new JAXBElement<TextType>(_IdentificationCategoryDescriptionText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationEffectiveDate")
    public JAXBElement<DateType> createIdentificationEffectiveDate(DateType value) {
        return new JAXBElement<DateType>(_IdentificationEffectiveDate_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationExpirationDate")
    public JAXBElement<DateType> createIdentificationExpirationDate(DateType value) {
        return new JAXBElement<DateType>(_IdentificationExpirationDate_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationID")
    public JAXBElement<String> createIdentificationID(String value) {
        return new JAXBElement<String>(_IdentificationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationJurisdiction")
    public JAXBElement<JurisdictionType> createIdentificationJurisdiction(JurisdictionType value) {
        return new JAXBElement<JurisdictionType>(_IdentificationJurisdiction_QNAME, JurisdictionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationSourceText")
    public JAXBElement<TextType> createIdentificationSourceText(TextType value) {
        return new JAXBElement<TextType>(_IdentificationSourceText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "IdentificationStatus")
    public JAXBElement<StatusType> createIdentificationStatus(StatusType value) {
        return new JAXBElement<StatusType>(_IdentificationStatus_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageAttachmentAbstract")
    public JAXBElement<Object> createMessageAttachmentAbstract(Object value) {
        return new JAXBElement<Object>(_MessageAttachmentAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageAttachmentBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageAttachmentAbstract")
    public JAXBElement<BinaryType> createMessageAttachmentBinary(BinaryType value) {
        return new JAXBElement<BinaryType>(_MessageAttachmentBinary_QNAME, BinaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageAttachmentDocument", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageAttachmentAbstract")
    public JAXBElement<DocumentType> createMessageAttachmentDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_MessageAttachmentDocument_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageAttachmentImage", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageAttachmentAbstract")
    public JAXBElement<ImageType> createMessageAttachmentImage(ImageType value) {
        return new JAXBElement<ImageType>(_MessageAttachmentImage_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageCategoryAbstract")
    public JAXBElement<Object> createMessageCategoryAbstract(Object value) {
        return new JAXBElement<Object>(_MessageCategoryAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageCategoryAbstract")
    public JAXBElement<TextType> createMessageCategoryText(TextType value) {
        return new JAXBElement<TextType>(_MessageCategoryText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageRecipientAbstract")
    public JAXBElement<Object> createMessageRecipientAbstract(Object value) {
        return new JAXBElement<Object>(_MessageRecipientAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageRecipientEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageRecipientAbstract")
    public JAXBElement<EntityType> createMessageRecipientEntity(EntityType value) {
        return new JAXBElement<EntityType>(_MessageRecipientEntity_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageSenderAbstract")
    public JAXBElement<Object> createMessageSenderAbstract(Object value) {
        return new JAXBElement<Object>(_MessageSenderAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageSenderEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/5.0/", substitutionHeadName = "MessageSenderAbstract")
    public JAXBElement<EntityType> createMessageSenderEntity(EntityType value) {
        return new JAXBElement<EntityType>(_MessageSenderEntity_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageSentDate")
    public JAXBElement<DateType> createMessageSentDate(DateType value) {
        return new JAXBElement<DateType>(_MessageSentDate_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageSubjectText")
    public JAXBElement<TextType> createMessageSubjectText(TextType value) {
        return new JAXBElement<TextType>(_MessageSubjectText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "MessageText")
    public JAXBElement<TextType> createMessageText(TextType value) {
        return new JAXBElement<TextType>(_MessageText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonBirthDate")
    public JAXBElement<DateType> createPersonBirthDate(DateType value) {
        return new JAXBElement<DateType>(_PersonBirthDate_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonDescriptionText")
    public JAXBElement<TextType> createPersonDescriptionText(TextType value) {
        return new JAXBElement<TextType>(_PersonDescriptionText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonDigitalImage")
    public JAXBElement<ImageType> createPersonDigitalImage(ImageType value) {
        return new JAXBElement<ImageType>(_PersonDigitalImage_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonFullName")
    public JAXBElement<PersonNameTextType> createPersonFullName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonFullName_QNAME, PersonNameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonGivenName")
    public JAXBElement<PersonNameTextType> createPersonGivenName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonGivenName_QNAME, PersonNameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNationalityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonNationality")
    public JAXBElement<PersonNationalityType> createPersonNationality(PersonNationalityType value) {
        return new JAXBElement<PersonNationalityType>(_PersonNationality_QNAME, PersonNationalityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonNationalityCountry")
    public JAXBElement<CountryType> createPersonNationalityCountry(CountryType value) {
        return new JAXBElement<CountryType>(_PersonNationalityCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonOtherIdentification")
    public JAXBElement<IdentificationType> createPersonOtherIdentification(IdentificationType value) {
        return new JAXBElement<IdentificationType>(_PersonOtherIdentification_QNAME, IdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonSexAbstract")
    public JAXBElement<Object> createPersonSexAbstract(Object value) {
        return new JAXBElement<Object>(_PersonSexAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/5.0/", name = "PersonSurName")
    public JAXBElement<PersonNameTextType> createPersonSurName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonSurName_QNAME, PersonNameTextType.class, null, value);
    }

}
