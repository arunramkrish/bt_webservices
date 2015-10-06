package com.bt.ws.weather.service;

import java.util.Date;

import javax.jws.WebService;

import com.bt.ws.weather.WeatherReport;

@WebService(endpointInterface = "com.bt.ws.weather.service.WeatherService")
public class WeatherServiceImpl implements WeatherService {

	@Override
	public WeatherReport getWeather(String city, Date date)
			throws InvalidCityException {
		if (!("Bangalore".equals(city))) {
			throw new InvalidCityException(city + "city not found");
		}
		WeatherReport report = new WeatherReport();
		report.setCity(city);
		report.setMaxTemp(32.5F);
		report.setMinTemp(20.0F);
		report.setWeatherDate(new Date());

		return report;
	}

}
