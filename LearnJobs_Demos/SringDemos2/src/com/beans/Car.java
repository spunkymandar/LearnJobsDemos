package com.beans;

public class Car {
	private int carId;
	private String carMake;
	private long carPrice;
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public long getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	
	public Car() {
		carId=105;
		carMake="Mahindra";
		carPrice=800000;
		
	}
	public Car(int carId, String carMake, long carPrice) {
		super();
		this.carId = carId;
		this.carMake = carMake;
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carMake=" + carMake + ", carPrice=" + carPrice + "]";
	}
	
	
	

}
