package edu.learn.oauth2client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan(basePackages = {"edu.learn.web","edu.learn.config"})
@SpringBootApplication
public class Oauth2ClientApplication {

	/**
	 * File | Settings | Build, Execution, Deployment | Compiler | Annotation Processors
	 * Enable it in order to resolve lombok annotation
	 */
	public static void main(String[] args) {
	    log.info("My security application");
		SpringApplication.run(Oauth2ClientApplication.class, args);
	}
}
