package com.iooperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadOperation {
	public static void main(String[] args) throws IOException {
		File f=new File("d:\\a.txt");
		//FileReader fr=new FileReader(f);
		
//		BufferedReader br=new BufferedReader(new FileReader(new File("d:\\a.txt")));
//		String data;
//		
//		while((data=br.readLine())!=null)
//		{
//			System.out.println(data);
//		}

		FileInputStream fis=new FileInputStream(f);
		
		char x=(char)fis.read();
		System.out.println(x);
		
	}

}
