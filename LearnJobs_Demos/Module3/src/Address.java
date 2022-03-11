
public class Address {
	String buildingName,cityName;
	int streetNo;

	public Address(String buildingName, String cityName,int streetNo) {
		super();
		this.buildingName = buildingName;
		this.cityName = cityName;
		this.streetNo=streetNo;
	}

	@Override
	public String toString() {
		return streetNo +" ,"+buildingName +"  , "+cityName;
	}


}
