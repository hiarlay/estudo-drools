package br.com.hiarlay.main;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.com.hiarlay.service")
public class EstudoDroolsSpringConfiguration {
	
	private static final String drlFile = "RULES_CABAS.drl";
	private static final String drlDependenteFile = "RULES_DEPENDENTE.drl";
	 
    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
 
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlDependenteFile));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();
 
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

}
