package br.gov.sepog.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"br.gov.sepog"})
public class EstudoDroolsSpringApplication extends SpringBootServletInitializer {
	
	 
	
	private static Class<EstudoDroolsSpringApplication> applicationClass = EstudoDroolsSpringApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	 
		
}
