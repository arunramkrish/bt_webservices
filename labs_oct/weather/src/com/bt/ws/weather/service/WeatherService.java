package com.bt.ws.weather.service;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.bt.ws.weather.WeatherReport;

@WebService()
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED, use = Use.LITERAL)
public interface WeatherService {
	/**
	 * @param city
	 * @return
	 */
	@WebMethod()
	WeatherReport getWeather(String city, Date date)
			throws InvalidCityException;
}
