package com.nt.service;

import com.nt.dao.IWeatherForeCasterStub;

public class WeatherService {
	IWeatherForeCasterStub stub;

	public void setStub(IWeatherForeCasterStub stub) {
		this.stub = stub;
	}
	
	public  Double getTemperature(Integer zip) {
		//web service call
		Double temperature=stub.invokeTemperature(zip);
		return temperature;
	}
	
	
	

}
