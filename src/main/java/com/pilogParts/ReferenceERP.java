
package com.pilogParts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenceERP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenceERP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECORD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASS_TERM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHORT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATL_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceERP", propOrder = {
    "recordno",
    "referenceno",
    "uom",
    "classterm",
    "shortdesc",
    "purchase",
    "matlgroup",
    "url"
})
public class ReferenceERP {

    @XmlElement(name = "RECORD_NO")
    protected String recordno;
    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "UOM")
    protected String uom;
    @XmlElement(name = "CLASS_TERM")
    protected String classterm;
    @XmlElement(name = "SHORT_DESC")
    protected String shortdesc;
    @XmlElement(name = "PURCHASE")
    protected String purchase;
    @XmlElement(name = "MATL_GROUP")
    protected String matlgroup;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Gets the value of the recordno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDNO() {
        return recordno;
    }

    /**
     * Sets the value of the recordno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDNO(String value) {
        this.recordno = value;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the classterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSTERM() {
        return classterm;
    }

    /**
     * Sets the value of the classterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSTERM(String value) {
        this.classterm = value;
    }

    /**
     * Gets the value of the shortdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTDESC() {
        return shortdesc;
    }

    /**
     * Sets the value of the shortdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTDESC(String value) {
        this.shortdesc = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURCHASE() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURCHASE(String value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the matlgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATLGROUP() {
        return matlgroup;
    }

    /**
     * Sets the value of the matlgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATLGROUP(String value) {
        this.matlgroup = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
