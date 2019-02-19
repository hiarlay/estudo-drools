package br.com.hiarlay.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hiarlay.model.Caba;

@Service
public class CabaService {
	
	@Autowired
    private KieContainer kieContainer;
 
    public void verificarOsCaba(List<Caba> cabas) {
        KieSession kieSession = kieContainer.newKieSession();
        for(Caba caba: cabas) {
        	kieSession.insert(caba);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
    }
    

}
