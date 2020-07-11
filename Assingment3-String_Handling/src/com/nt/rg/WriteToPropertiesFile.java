package com.nt.rg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException{
		
		//locate file path to write
		Writer writer =new FileWriter("src\\com\\nt\\commonce\\user_details.properties",true);
		
		
		//create properties class obj
		Properties prop =new Properties();
		
		//set values
		prop.setProperty("username", "rajeshwar");
		//set values
		prop.setProperty("password", "raj123");
		
		//writing to file
		prop.store(writer, "..............................................................");
		
		
	}

}
