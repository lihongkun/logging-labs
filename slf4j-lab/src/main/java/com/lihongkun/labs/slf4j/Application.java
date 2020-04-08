package com.lihongkun.labs.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(Application.class);
        logger.info("Hello World");
    }
}
