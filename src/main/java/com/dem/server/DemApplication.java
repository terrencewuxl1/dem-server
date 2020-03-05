package com.dem.server;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemApplication {

    private final static Logger LOGGER= LoggerFactory.getLogger(DemApplication.class);

    public static void main(String[] args){

        SpringApplication.run(DemApplication.class,args);
        LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
    }
}
