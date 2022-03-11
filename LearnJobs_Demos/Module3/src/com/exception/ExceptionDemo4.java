package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			processFile();
		} catch (IOException e) {
			System.out.println("Exception occured !!");
		}

	}

	public static void processFile() throws IOException{
		File f = new File("d:\\a.txt");
		FileReader fr = new FileReader(f);
		while (fr.read() != -1) {

		}
		fr.close();

	}

}
