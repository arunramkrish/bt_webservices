package com.bt.globalweather.client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class GetWeatherClient {

	public static void main(String[] args) {
		GlobalWeatherSoap svc = new GlobalWeather()
				.getPort(GlobalWeatherSoap.class);
		System.out.println(svc.getCitiesByCountry("INDIA"));
		
		System.out.println(svc.getWeather("Agra", "INDIA"));

	}

}
