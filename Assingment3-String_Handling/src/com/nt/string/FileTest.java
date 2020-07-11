package com.nt.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		/*File file = new File("email.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			// System.out.println(sc.nextLine());
			String s1 = sc.nextLine();
			System.out.println(s1);
		}*/

		File file = new File("src/com/nt/string/email.txt");
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
	}

}
