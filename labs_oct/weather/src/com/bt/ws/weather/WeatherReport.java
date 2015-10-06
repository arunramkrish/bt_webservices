package com.bt.ws.weather;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(namespace="weather.ws.bt.com", name="report")
@XmlType(namespace="weather.ws.bt.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherReport {
	@XmlAttribute(name="place", required=true)
	private String city;
	@XmlElement(required=true)
	private Date weatherDate;
	/**
	 * 
	 */
	@XmlAttribute
	private Float minTemp;
	
	@XmlAttribute
	private Float maxTemp;
	private Boolean rainPresent;
	private Boolean thunderStormPresent;
	private WeatherType type;
	
	public WeatherReport() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return
	 */
	@XmlTransient
	public Date getWeatherDate() {
		return weatherDate;
	}

	public void setWeatherDate(Date weatherDate) {
		this.weatherDate = weatherDate;
	}

	public Float getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Float minTemp) {
		this.minTemp = minTemp;
	}

	public Float getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Float maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Boolean getRainPresent() {
		return rainPresent;
	}

	public void setRainPresent(Boolean rainPresent) {
		this.rainPresent = rainPresent;
	}

	public Boolean getThunderStormPresent() {
		return thunderStormPresent;
	}

	public void setThunderStormPresent(Boolean thunderStormPresent) {
		this.thunderStormPresent = thunderStormPresent;
	}

	public WeatherType getType() {
		return type;
	}

	public void setType(WeatherType type) {
		this.type = type;
	}

}
