package com.rest.robert.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author Robert Jenifer Vilbert
 * Mar 27, 2017 12:07:35 AM 12:07:35 AM 
 * Application.java
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.rest.robert.web.*")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
