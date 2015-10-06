package com.bt.ws.weather.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;

import com.bt.ws.weather.WeatherReport;

public class WeatherUnmarshaller {

	public static void main(String[] args) throws JAXBException,
			FileNotFoundException, XMLStreamException {
		JAXBContext context = JAXBContext.newInstance("com.bt.ws.weather");
		Unmarshaller unmarshaller = context.createUnmarshaller();

		WeatherReport report = (WeatherReport) unmarshaller.unmarshal(new File(
				"weather.xml"));

		// XMLInputFactory factory = XMLInputFactory.newInstance();
		// XMLEventReader eventReader = factory
		// .createXMLEventReader(new FileInputStream("weather.xml"));
		// WeatherReport report = null;
		// while (eventReader.hasNext()) {
		// XMLEvent event = eventReader.nextEvent();
		// if ((event.getEventType() == XMLEvent.START_ELEMENT)) {
		// StartElement element = event.asStartElement();
		// if (element.getName().getLocalPart().equals("myWeatherApp")) {
		// JAXBElement<WeatherReport> reportElement =
		// unmarshaller.unmarshal(eventReader, WeatherReport.class);
		// report = reportElement.getValue();
		// }
		// }
		// }
		// JAXBElement<WeatherReport> element = unmarshaller.unmarshal(new
		// StreamSource(
		// new FileInputStream("weather.xml")), WeatherReport.class);
		// WeatherReport report = element.getValue();
		System.out.println(report.getMaxTemp());

	}

}
