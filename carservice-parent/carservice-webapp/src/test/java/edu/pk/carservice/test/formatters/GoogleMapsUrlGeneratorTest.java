package edu.pk.carservice.test.formatters;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.pk.carservice.formatters.GoogleMapsUrlGenerator;

public class GoogleMapsUrlGeneratorTest {
	
	private GoogleMapsUrlGenerator urlGenerator = new GoogleMapsUrlGenerator();
	
	@Test
	public void shouldGenerateValidGoogleMapsUrlWithDefaultZoom() {
		String url = urlGenerator.generateMapsUrl(51.123, 52.123);
		String expectedUrl = "http://maps.google.com/maps/?ll=51.123,52.123&output=embed&z=" 
				+ GoogleMapsUrlGenerator.DEFAULT_ZOOM;
		
		assertEquals(expectedUrl, url);
	}
	
	@Test
	public void shouldGenerateValidGoogleMapsUrlWithCustomZoom() {
		String url = urlGenerator.generateMapsUrl(51.123, 52.123, 7);
		String expectedUrl = "http://maps.google.com/maps/?ll=51.123,52.123&output=embed&z=7";
		
		assertEquals(expectedUrl, url);
	}
}
