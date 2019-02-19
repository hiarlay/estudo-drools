package br.com.hiarlay.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"br.com.hiarlay"})
public class EstudoDroolsTabelaApplication extends SpringBootServletInitializer {
	
	 
	
	private static Class<EstudoDroolsTabelaApplication> applicationClass = EstudoDroolsTabelaApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	 
		
}
