package com.albertocolella.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	
    public static void main(String[] args) {
    	SpringApplicationBuilder app = new SpringApplicationBuilder();
    	app.bannerMode(Banner.Mode.CONSOLE)
        	.sources(Application.class)
        	.run(args);
    }
}
