package com.sesha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/*
		Behind the scenes, SpringBootApplication is equivalent to
			Configuration, EnableAUtoConfiguration and ComponentScan together
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
