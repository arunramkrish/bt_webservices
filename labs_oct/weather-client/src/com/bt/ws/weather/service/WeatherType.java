
package com.bt.ws.weather.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weatherType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="weatherType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RAIN_WITH_THUNDERSTORM"/>
 *     &lt;enumeration value="NO_RAIN"/>
 *     &lt;enumeration value="HEAVY_RAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "weatherType")
@XmlEnum
public enum WeatherType {

    RAIN_WITH_THUNDERSTORM,
    NO_RAIN,
    HEAVY_RAIN;

    public String value() {
        return name();
    }

    public static WeatherType fromValue(String v) {
        return valueOf(v);
    }

}
