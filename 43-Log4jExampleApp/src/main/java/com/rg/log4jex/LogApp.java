package com.rg.log4jex;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

/**
 * Simple Log4j Example
 *
 */
public class LogApp 
{
	//create logger object
	private static Logger log=Logger.getLogger(LogApp.class);
	
    public static void main( String[] args ) throws IOException
    {
    	//create Layout
        	//Layout layout=new SimpleLayout();
    	//Layout layout=new HTMLLayout();
    	//Layout layout=new XMLLayout();
    	Layout layout=new PatternLayout("%p, %d,  %M,  %C, %m %n");
    	//create Appender and link to Layout
    	//Appender app=new ConsoleAppender(layout);
    	
    	
    	Appender app=new FileAppender(layout,"G:\\Spring Boot and Microservices By Raghu Sir\\logMsg\\logData.txt");    	
    	
    	//link appender with logger
    	log.addAppender(app);
    	
    	//print messages
    	log.debug("FROM DEBUG");
    	log.info("FROM INFO");
    	log.warn("FROM WARN");
    	log.error("FROM ERROR");
    	log.fatal("FROM FATAL");
    }
}
