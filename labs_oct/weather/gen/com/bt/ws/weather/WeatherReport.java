//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.05 at 11:45:41 AM IST 
//


package com.bt.ws.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for weatherReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weatherReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weatherDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="place" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minTemp" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxTemp" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherReport", propOrder = {
    "weatherDate"
})
public class WeatherReport {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weatherDate;
    @XmlAttribute(name = "place", required = true)
    protected String place;
    @XmlAttribute(name = "minTemp")
    protected Float minTemp;
    @XmlAttribute(name = "maxTemp")
    protected Float maxTemp;

    /**
     * Gets the value of the weatherDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeatherDate() {
        return weatherDate;
    }

    /**
     * Sets the value of the weatherDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeatherDate(XMLGregorianCalendar value) {
        this.weatherDate = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the minTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinTemp() {
        return minTemp;
    }

    /**
     * Sets the value of the minTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinTemp(Float value) {
        this.minTemp = value;
    }

    /**
     * Gets the value of the maxTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTemp() {
        return maxTemp;
    }

    /**
     * Sets the value of the maxTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTemp(Float value) {
        this.maxTemp = value;
    }

}
