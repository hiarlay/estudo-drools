package br.com.hiarlay.service;

import java.math.BigDecimal;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hiarlay.model.SimulacaoAposentadoria;

@Service
public class TabelaService {
	
	@Autowired
    private KieSession kieSession;
 
    public void verificarTabela() {
    	SimulacaoAposentadoria simulacao = new SimulacaoAposentadoria();
    	simulacao.setCodigoTipoAposentadoria(536);
    	simulacao.setTempoContribuicao(11000.0);
    	simulacao.setSexo("M");
    	simulacao.setCargo("PROFESSOR");
    	simulacao.setValorSalario(3400.00);
    	simulacao.setValorSalariosMedia(2400.00);
    	kieSession.insert(simulacao);
    	 
    	kieSession.fireAllRules();
    	System.out.println(simulacao.getTempoContribuicaoNecessaria());
    	System.out.println(simulacao.getCalculoProporcao());
    	System.out.println(simulacao.getValorBeneficioCalculado());
    }
    

}
