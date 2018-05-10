package edu.learn.oauth2client;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Log4j2
@ComponentScan(basePackages = {"edu.learn.web","edu.learn.config"})
@SpringBootApplication
public class Oauth2ClientApplication {

	public static void main(String[] args) {
	    log.info("My security application");
		SpringApplication.run(Oauth2ClientApplication.class, args);
	}
}
