package com.nt.atps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("src/main/resources/email.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			String s1 = sc.nextLine();
			s1=s1.replace("{FIRSTNAME}", "fdfd");
			s1=s1.replace("{LASTNAME}", "godwe");
			s1=s1.replace("{password}", "24121");
			System.out.println(s1);
		}
	}

}
