package edu.pk.carservice.formatters;

public class GoogleMapsUrlGenerator {
	
	public static final int DEFAULT_ZOOM = 15;
	private static final String STATIC_MAPS_API_BASE_URL = "http://maps.google.com/maps/?ll=";
	
	public String generateMapsUrl(double latitude, double longitude) {
		return generateMapsUrl(latitude, longitude, DEFAULT_ZOOM);
	}
	
	public String generateMapsUrl(double latitude, double longitude, int zoom) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(STATIC_MAPS_API_BASE_URL).append(latitude).append(",");
		sb.append(longitude);
		sb.append("&output=embed&z=");
		sb.append(zoom);
		
		return sb.toString();
	}
}
