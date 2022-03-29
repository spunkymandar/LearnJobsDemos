//Factory design pattern
package com.factory;

import com.beans.Car;

public class CarFactory {

	Car car=new Car();
	
	//factory method which returns object of a car
	public Car buildCar() {
		return car;
	}
}
