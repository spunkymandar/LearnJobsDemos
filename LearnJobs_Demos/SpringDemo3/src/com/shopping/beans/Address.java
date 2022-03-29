package com.shopping.beans;

import org.springframework.stereotype.Component;


public class Address {
	int buildingNo;
	String cityName;
	
	public Address() {
		
	}

	
	public int getBuildingNo() {
		return buildingNo;
	}


	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "Address [buildingNo=" + buildingNo + ", cityName=" + cityName + "]";
	}
	
	
}
