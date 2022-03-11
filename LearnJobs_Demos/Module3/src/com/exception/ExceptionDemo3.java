package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 * try-catch-finally
 * try-catch
 * try-finally
 * 
 * valid combinations
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		File f = new File("d:\\a.txt");
		//FileReader fr=null;
		//try with resources / Automatic Resource Manager : Autocloseable Resources 
		try(FileReader fr=new FileReader(f)) {
			

			while (fr.read() != -1) {
				/*
				 * Business logic to read and process the file
				 */
			}
			
		} catch (IOException e) {
			System.out.println("Some exception occured !!");
			
		}
		

	}

}
