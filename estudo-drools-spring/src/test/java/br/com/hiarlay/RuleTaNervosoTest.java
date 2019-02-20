package br.com.hiarlay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;

import br.com.hiarlay.model.Caba;

@DroolsFiles(ruleFiles = { "RULES_CABAS.drl" })
@RunWith(DroolsJUnitRunner.class)
public class RuleTaNervosoTest {

	@StatefulDroolsSession
	private DroolsSession session;

	@Test
	public void deveRetornarNervosoParaPA() {
		Caba caba = new Caba();
		caba.setNome("PA");
		session.insert(caba);
		session.fireAllRules();
		assertEquals("nervoso",caba.getSituacao());
	}
	
	@Test
	public void deveRetornarCoisadoParaManel() {
		Caba caba = new Caba();
		caba.setNome("manel");
		session.insert(caba);
		session.fireAllRules();
		assertEquals("coisado",caba.getSituacao());
	}


}
