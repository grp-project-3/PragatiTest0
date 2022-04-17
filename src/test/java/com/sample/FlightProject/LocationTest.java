package com.sample.FlightProject;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import com.Dao.LocationService;
import com.model.Location;
@SpringBootTest
 class LocationTest {

	@Autowired
	LocationService service;
	@Test
	void testAdd() {
		Location location=new Location();
		location.setName("Steffi");
		location.setCode("453235");
		location.setCountry("USA");
		location.setAirportName("Abudhabi");
		service.add(location);
		Location location1=service.find(location.getId());
			Assert.assertEquals("Steffi",location.getName());
	}
	
	@Test
	void testFind() {
		Location location2=new Location();
		location2.setCountry("India");
		Location location3=service.find(location2.getId());
		Assert.assertNull(location3);
	}
	@Test
	void testFindAll() {
		Location profile5=new Location();
		profile5.setName("Ranjitha");
		profile5.setCode("243562");
		profile5.setCountry("India");
		profile5.setAirportName("Banglore");
		service.add(profile5);
		Location profile6=new Location();
		profile6.setName("Pragati");
		profile6.setCode("255632");
		profile6.setCountry("India");
		profile6.setAirportName("Pune");
		service.add(profile6);
	List<Location>locationlist=service.findAll();
	Assert.assertEquals(locationlist.get(1).getName(), "Ranjitha");
	Assert.assertEquals(locationlist.get(1).getAirportName(), "Banglore");

}
	@Test
	void testUpdate() {
		Location lc=new Location();
		lc.setName("Lakshmi");
		lc.setCode("453156");
		lc.setCountry("India");
		lc.setAirportName("Mumbai");
		service.add(lc);
		
		service.update(lc);
		Assert.assertEquals(true, service.update(lc));
				
		}
	
	@Test 
	void testDelete() {
		Location lc = service.find(3);
		service.delete(lc.getId());
//		if(u1!=null) {
//			System.out.println("*Not deleted*");
//			
//		}
		Location u2=service.find(3);
		Assert.assertNull(u2);
	}
}
