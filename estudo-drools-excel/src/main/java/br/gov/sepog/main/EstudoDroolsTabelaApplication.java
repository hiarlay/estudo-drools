package br.gov.sepog.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"br.gov.sepog"})
public class EstudoDroolsTabelaApplication extends SpringBootServletInitializer {
	
	 
	
	private static Class<EstudoDroolsTabelaApplication> applicationClass = EstudoDroolsTabelaApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	 
		
}
