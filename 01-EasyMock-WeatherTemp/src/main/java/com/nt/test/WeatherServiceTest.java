package com.nt.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.nt.dao.IWeatherForeCasterStub;
import com.nt.service.WeatherService;

public class WeatherServiceTest {
	
	
	@Test
	public void test_getTemperature() {
		WeatherService service=null;
				
		//inject stub implemented object to service
		
		//creating mock object
		IWeatherForeCasterStub stub=EasyMock.createMock(IWeatherForeCasterStub.class);
		EasyMock.expect(stub.invokeTemperature(500008)).andReturn(47.85);
		EasyMock.expect(stub.invokeTemperature(443201)).andReturn(45.25);
		EasyMock.expect(stub.invokeTemperature(0)).andReturn(null);
		EasyMock.replay(stub);
		
		//create service class object
		service=new WeatherService();
		
		//inject mocked stub into service
		service.setStub(stub);
		
		//call getTemperature method
		Double temperature=service.getTemperature(4432051);
		
		assertNotNull(temperature);
	}
}