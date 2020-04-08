package com.lihongkun.labs.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.core.util.StatusPrinter;

import ch.qos.logback.classic.LoggerContext;

/**
 * Hello world!
 *
 */
public class Application 
{

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main( String[] args ){
        printLoggerContext();
        LOGGER.info("Hello World");
   }


    private static void printLoggerContext(){
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
