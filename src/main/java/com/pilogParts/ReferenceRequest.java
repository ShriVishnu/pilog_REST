
package com.pilogParts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTNUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORGN_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceRequest", propOrder = {
    "partnumber",
    "_class",
    "orgnid",
    "searchType"
})
public class ReferenceRequest {

    @XmlElement(name = "PARTNUMBER", required = true)
    protected String partnumber;
    @XmlElement(name = "CLASS", required = true)
    protected String _class;
    @XmlElement(name = "ORGN_ID", required = true)
    protected String orgnid;
    @XmlElement(required = true)
    protected String searchType;

    /**
     * Gets the value of the partnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNUMBER() {
        return partnumber;
    }

    /**
     * Sets the value of the partnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNUMBER(String value) {
        this.partnumber = value;
    }

    /**
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * Gets the value of the orgnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGNID() {
        return orgnid;
    }

    /**
     * Sets the value of the orgnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGNID(String value) {
        this.orgnid = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

}
