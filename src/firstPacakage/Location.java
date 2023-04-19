package firstPacakage;

public class Location {

	
	private String locName;
	
	private String latitude;
	
	private String longitude;
    
	private Double getDistance;

	public Location()
	{
		
	}
	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Double getGetDistance() {
		return getDistance;
	}

	public void setGetDistance(Double getDistance) {
		this.getDistance = getDistance;
	}

	@Override
	public String toString() {
		return "Location [locName=" + locName + ", latitude=" + latitude + ", longitude=" + longitude + ", getDistance="
				+ getDistance + "]";
	}
	
	
}
