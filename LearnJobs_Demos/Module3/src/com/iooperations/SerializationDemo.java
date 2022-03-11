package com.iooperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serializable is marker interface, which marks the class eligible for serialization
class Student implements Serializable{
	int studentId;
	transient String studentName; //transient ignores the members in the process of ser. 
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId +" , "+studentName;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Rajesh");
		/*
		 * File to write the object
		 * Facility to pass the object to File
		 */
		//Open the file in write mode to accept option stream (byte)
		
		FileOutputStream fos=new FileOutputStream("d:\\student.dat");
		ObjectOutputStream  os=new ObjectOutputStream(fos);
		os.writeObject(s1);
		os.close();
		System.out.println("Object is serialized ");
		
		
		
		
		
		
		
		

	}

}
