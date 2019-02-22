package br.com.hiarlay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;

import br.com.hiarlay.model.Pessoa;

@DroolsFiles(ruleFiles = { "META-INF/rules/RULES_PESSOA.drl" })
@RunWith(DroolsJUnitRunner.class)
public class RulePessoaTest {

	@StatefulDroolsSession
	private DroolsSession session;

	@Test
	public void deveRetornarNervosoParaPA() {
		Pessoa caba = new Pessoa();
		caba.setNome("Paulo André");
		session.insert(caba);
		session.fireAllRules();
		assertEquals("Ta nervoso",caba.getSituacao());
	}
	
	@Test
	public void deveRetornarCoisadoParaManel() {
		Pessoa caba = new Pessoa();
		caba.setNome("Emanuel");
		session.insert(caba);
		session.fireAllRules();
		assertEquals("Ta coisado",caba.getSituacao());
	}


}
