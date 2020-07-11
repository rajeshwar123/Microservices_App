package com.rg.log4jex;

import org.apache.log4j.Logger;

public class LogApp2 {
	
	//create Logger Object
	private static Logger log=Logger.getLogger(LogApp2.class);
	
	public static void main(String[] args) {
		
		//print messages
    	log.debug("FROM DEBUG");
    	log.info("FROM INFO");
    	log.warn("FROM WARN");
    	log.error("FROM ERROR");
    	log.fatal("FROM FATAL");
    	//System.out.println("Done");
	}

}
