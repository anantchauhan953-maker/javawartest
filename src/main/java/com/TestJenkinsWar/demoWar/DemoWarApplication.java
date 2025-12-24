package com.TestJenkinsWar.demoWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWarApplication {

	public static void main(String[] args) {

        SpringApplication.run(DemoWarApplication.class, args);
        System.out.println("TestJenkinsApplication War started testing 1");
        System.out.println("TestJenkinsApplication War started testing 3");
	}

}
