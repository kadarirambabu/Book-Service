package com.booksInfo.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private static final Logger logger= LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		logger.info("application stared succesfully");
		logger.debug("this is debug message");
		logger.warn("this is warning");
		logger.error("this is error messge");
	}


}
