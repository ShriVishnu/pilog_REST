
package com.pilogProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGN_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search", propOrder = {
    "recordNo",
    "orgnid"
})
public class Search {

    protected String recordNo;
    @XmlElement(name = "ORGN_ID")
    protected String orgnid;

    /**
     * Gets the value of the recordNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordNo() {
        return recordNo;
    }

    /**
     * Sets the value of the recordNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordNo(String value) {
        this.recordNo = value;
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

}
