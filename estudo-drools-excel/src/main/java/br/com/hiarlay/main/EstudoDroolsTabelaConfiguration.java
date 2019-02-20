package br.com.hiarlay.main;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.gov.sepog.service")
public class EstudoDroolsTabelaConfiguration {
	
	private static final String xlsFile = "Aposentadoria.xls";
	 
    @Bean
    public KieSession kieContainer() {
    	KieServices kieServices = KieServices.Factory.get();
    	
    	Resource dt 
    	  = ResourceFactory
    	    .newClassPathResource(xlsFile,
    	      getClass());
    	KieFileSystem kieFileSystem = kieServices.newKieFileSystem().write(dt);
    	KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
    	kieBuilder.buildAll();
    	
    	KieRepository kieRepository = kieServices.getRepository();
    	
    	ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
    	KieContainer kieContainer 
    	  = kieServices.newKieContainer(krDefaultReleaseId);
    	
    	KieSession kieSession = kieContainer.newKieSession();
 
        return kieSession;
    }

}
