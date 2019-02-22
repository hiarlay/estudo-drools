package br.com.hiarlay.service;

import java.util.List;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hiarlay.model.Pessoa;

@Service
public class PessoaService {
	
	@Autowired
    private KieSession kieSession;
 
    public void verificarOsCaba(List<Pessoa> cabas) {
        for(Pessoa caba: cabas) {
        	kieSession.insert(caba);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
    }
    

}
