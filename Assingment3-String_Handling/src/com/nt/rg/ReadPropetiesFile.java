package com.nt.rg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ReadPropetiesFile {

	public static void main(String[] args) throws IOException {
		//locate properties file from specified path
		FileReader reader=new FileReader("src\\com\\nt\\commonce\\data.properties");
		
		//create Properties objecr
		Properties prop=new Properties();
		//get System properties
		//Properties prop2=System.getProperties();
		//loads properties file from reader object
		prop.load(reader);
		
		//displaying properties file
		System.out.println(prop.getProperty("101"));
		//reading system all propeties
		
		//System.out.println(prop2);
	//	System.out.println(prop.entrySet());
		/*
		Set<Entry<Object, Object>> set = prop.entrySet();
		set.forEach(sets->{
			System.out.println(sets);
		});*/
	}

}
