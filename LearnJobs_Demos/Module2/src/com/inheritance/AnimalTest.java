package com.inheritance;
class Animal {//super class
	public void makeNoise() {
		System.out.println("Animal's make noise");
	}
}

//extends creats a subclass of existing class, it behaves automatically as super class 
class Dog extends Animal{//subclass
	//polymorphism : different implements for the methods which are already available in super class
	public void makeNoise() {
		System.out.println("Dog barks!!");
	}
}

public class AnimalTest{
	public static void main(String[] args) {
		Dog dog=new Dog();//Invoke constructor of Dog
		dog.makeNoise();
	}
	
}
