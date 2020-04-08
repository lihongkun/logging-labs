package com.lihongkun.labs.logback.logger;

import org.slf4j.*;

public class LoggerLab{

    public static void main(String[] args){
        testGetLogger();
        testLoggerLevel();
    }

    private static void testGetLogger(){
        Logger loggerByClazz = LoggerFactory.getLogger(LoggerLab.class);
        Logger loggerByName = LoggerFactory.getLogger("com.lihongkun.labs.logback.logger.LoggerLab");

        loggerByClazz.info("by class");
        loggerByName.info("by name");

        System.out.println("loggerByClazz == loggerByName : " + (loggerByClazz == loggerByName));
    }

    private static void testLoggerLevel(){

        Logger logger = LoggerFactory.getLogger(LoggerLab.class);
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");

    }

}