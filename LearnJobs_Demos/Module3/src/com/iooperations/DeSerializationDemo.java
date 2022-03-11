package com.iooperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//Serializable is marker interface, which marks the class eligible for serialization

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fos=new FileInputStream("d:\\student.dat");
		ObjectInputStream  os=new ObjectInputStream(fos);
		Student s1=(Student)os.readObject();
		System.out.println(s1);

	}

}
