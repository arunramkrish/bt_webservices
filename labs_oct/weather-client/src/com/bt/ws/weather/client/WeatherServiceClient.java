package com.bt.ws.weather.client;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;

import com.bt.ws.weather.WeatherReport;
import com.bt.ws.weather.service.InvalidCityException_Exception;
import com.bt.ws.weather.service.WeatherService;
import com.bt.ws.weather.service.WeatherServiceImplService;

public class WeatherServiceClient {

	public static void main(String[] args)
			throws DatatypeConfigurationException {
		WeatherService svc = new WeatherServiceImplService()
				.getPort(WeatherService.class);
		((BindingProvider) svc).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:9999/api/weatherReport");

		WeatherReport report;
		try {
			report = svc.getWeather("Delhi", DatatypeFactory.newInstance()
					.newXMLGregorianCalendar());
			System.out.println(report.getMaxTemp());
		} catch (InvalidCityException_Exception e) {
			e.printStackTrace();
		}

	}

}
