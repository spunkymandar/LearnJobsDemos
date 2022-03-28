/*
 * Create a public class
 * Add default constructor
 * Add data members
 * Add getters and setter for each data member	
 */
package com.util.emp;

public class Address {
	String cityName;
	String stateName;
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	public Address(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
	public Address() {
		
	}

}
