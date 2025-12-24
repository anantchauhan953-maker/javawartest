package com.TestJenkinsWar.demoWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoWarApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoWarApplication.class);
    }
	public static void main(String[] args) {

        SpringApplication.run(DemoWarApplication.class, args);
        System.out.println("TestJenkinsApplication War started testing 1");
        System.out.println("TestJenkinsApplication War started testing 3");
	}

}
