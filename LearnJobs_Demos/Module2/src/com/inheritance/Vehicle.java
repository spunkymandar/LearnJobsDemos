package com.inheritance;

//Marker Interfaces
//inteface which do not have any method
interface Task{}

//Serializable : class can be serialized
//Cloneable : class can be cloned 



//normal interface
public interface Vehicle {
	public void start();
	public void drive();

}

class Car implements Vehicle{
	public void start() {
		
	}
	public void drive() {
		
	}
	
}

class MotorBike implements Vehicle{
	public void start() {
		
	}
	public void drive() {
		
	}
}

//class can extend only one class 
//class can extend one class and one/more interfaces
//interfaces can extend another interface


