package com.bt.ws.weather.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bt.ws.weather.WeatherReport;

public class WeatherServiceClient {

	public static void main(String[] args) throws MalformedURLException {
		Service service = Service.create(new URL(
				"http://localhost:8889/api/weatherReport?wsdl"), new QName(
				"http://service.weather.ws.bt.com/",
				"WeatherServiceImplService"));
		WeatherService serviceInterface = service.getPort(WeatherService.class);
		
		WeatherReport report;
		try {
			report = serviceInterface.getWeather("Bangalore", new Date());
			System.out.println(report.getMaxTemp());
		} catch (InvalidCityException e) {
			e.printStackTrace();
		}
		
	}

}
