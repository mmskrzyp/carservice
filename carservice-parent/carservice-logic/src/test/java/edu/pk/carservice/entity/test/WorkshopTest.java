package edu.pk.carservice.entity.test;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.pk.carservice.entity.Workshop;

public class WorkshopTest {
	
	@Test
	public void doubleValuedLatitudeShouldBeOk() {
		Workshop workshop = new Workshop();
		workshop.setLatitude(51123456);
		
		assertEquals(workshop.getDoubleLatitude(), 51.123456, 0);
	}
	
	@Test
	public void doubleValuedLongitudeShouldBeOk() {
		Workshop workshop = new Workshop();
		workshop.setLongitude(51123456);
		
		assertEquals(workshop.getDoubleLongitude(), 51.123456, 0);
	}
}
