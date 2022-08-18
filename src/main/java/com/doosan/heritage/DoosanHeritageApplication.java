package com.doosan.heritage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
public class DoosanHeritageApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DoosanHeritageApplication.class, args);
	}
}