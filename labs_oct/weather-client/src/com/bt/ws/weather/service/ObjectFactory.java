
package com.bt.ws.weather.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bt.ws.weather.service package. 
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

    private final static QName _GetWeatherResponse_QNAME = new QName("http://service.weather.ws.bt.com/", "getWeatherResponse");
    private final static QName _InvalidCityException_QNAME = new QName("http://service.weather.ws.bt.com/", "InvalidCityException");
    private final static QName _GetWeather_QNAME = new QName("http://service.weather.ws.bt.com/", "getWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bt.ws.weather.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvalidCityException }
     * 
     */
    public InvalidCityException createInvalidCityException() {
        return new InvalidCityException();
    }

    /**
     * Create an instance of {@link GetWeather }
     * 
     */
    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    /**
     * Create an instance of {@link GetWeatherResponse }
     * 
     */
    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.weather.ws.bt.com/", name = "getWeatherResponse")
    public JAXBElement<GetWeatherResponse> createGetWeatherResponse(GetWeatherResponse value) {
        return new JAXBElement<GetWeatherResponse>(_GetWeatherResponse_QNAME, GetWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.weather.ws.bt.com/", name = "InvalidCityException")
    public JAXBElement<InvalidCityException> createInvalidCityException(InvalidCityException value) {
        return new JAXBElement<InvalidCityException>(_InvalidCityException_QNAME, InvalidCityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.weather.ws.bt.com/", name = "getWeather")
    public JAXBElement<GetWeather> createGetWeather(GetWeather value) {
        return new JAXBElement<GetWeather>(_GetWeather_QNAME, GetWeather.class, null, value);
    }

}