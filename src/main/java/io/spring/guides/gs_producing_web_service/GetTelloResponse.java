//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.29 at 11:22:22 PM CET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tello" type="{http://spring.io/guides/gs-producing-web-service}tello"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tello"
})
@XmlRootElement(name = "getTelloResponse")
public class GetTelloResponse {

    @XmlElement(required = true)
    protected Tello tello;

    /**
     * Gets the value of the tello property.
     * 
     * @return
     *     possible object is
     *     {@link Tello }
     *     
     */
    public Tello getTello() {
        return tello;
    }

    /**
     * Sets the value of the tello property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tello }
     *     
     */
    public void setTello(Tello value) {
        this.tello = value;
    }

}
