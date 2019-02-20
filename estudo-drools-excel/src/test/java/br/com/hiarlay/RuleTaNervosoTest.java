package br.com.hiarlay;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;

import br.com.hiarlay.model.SimulacaoAposentadoria;

@DroolsFiles(ruleFiles = { "Aposentadoria.xls" })
@RunWith(DroolsJUnitRunner.class)
public class RuleTaNervosoTest {

	@StatefulDroolsSession
	private DroolsSession session;
	
//	private SimulacaoAposentadoria simulacaoAtual;
//	private SimulacaoAposentadoria simulacaoEsperada;
//	
//	@Before
//	private void setUp() {
//		simulacaoAtual = new SimulacaoAposentadoria();
//		simulacaoEsperada = new SimulacaoAposentadoria();
//	}

	@Test
	public void deveRetornarSucessoParaTipo536() {
		SimulacaoAposentadoria simulacao = new SimulacaoAposentadoria();
		simulacao.setCodigoTipoAposentadoria(536);
		simulacao.setTempoContribuicao(11000.0);
		simulacao.setSexo("M");
		simulacao.setCargo("PROFESSOR");
		simulacao.setValorSalario(3400.00);
		simulacao.setValorSalariosMedia(2400.00);
		session.insert(simulacao);
		session.fireAllRules();
		assertEquals(12775.0, 0, simulacao.getTempoContribuicaoNecessaria());
		assertEquals(0.8610567514677103, 0, simulacao.getCalculoProporcao());
		assertEquals(2066.536203522505, 0, simulacao.getValorBeneficioCalculado());
	}

}
