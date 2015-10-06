package com.bt.ws.weather.jaxb;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bt.ws.weather.WeatherReport;

public class WeatherMarshaller {

	public static void main(String[] args) throws JAXBException {
//		JAXBContext context = JAXBContext.newInstance(WeatherReport.class);
		JAXBContext context = JAXBContext.newInstance("com.bt.ws.weather");
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		WeatherReport report = new WeatherReport();
		report.setCity("Bangalore");
		report.setMaxTemp(32.5F);
		report.setMinTemp(20.0F);
		report.setWeatherDate(new Date());
		
		marshaller.marshal(report, new File("weather.xml"));
	}

}
