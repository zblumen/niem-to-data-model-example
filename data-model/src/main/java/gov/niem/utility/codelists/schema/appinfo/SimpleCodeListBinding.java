//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 03:48:01 PM EST 
//


package gov.niem.utility.codelists.schema.appinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="codeListURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="constrainingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SimpleCodeListBinding", namespace = "http://reference.niem.gov/niem/specification/code-lists/5.0/code-lists-schema-appinfo/")
public class SimpleCodeListBinding {

    @XmlAttribute(name = "codeListURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String codeListURI;
    @XmlAttribute(name = "columnName")
    protected String columnName;
    @XmlAttribute(name = "constrainingIndicator")
    protected Boolean constrainingIndicator;

    /**
     * Gets the value of the codeListURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListURI() {
        return codeListURI;
    }

    /**
     * Sets the value of the codeListURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListURI(String value) {
        this.codeListURI = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the constrainingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstrainingIndicator() {
        return constrainingIndicator;
    }

    /**
     * Sets the value of the constrainingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstrainingIndicator(Boolean value) {
        this.constrainingIndicator = value;
    }

}
