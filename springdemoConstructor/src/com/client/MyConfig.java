package com.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com")
@ImportResource("classpath:beans.xml") // We can use regex to import multiple xmls. 
public class MyConfig {

}
