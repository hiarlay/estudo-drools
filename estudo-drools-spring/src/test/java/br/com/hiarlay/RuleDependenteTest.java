package br.com.hiarlay;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;

import br.com.hiarlay.model.Pessoa;

@DroolsFiles(ruleFiles = { "META-INF/rules/RULES_DEPENDENTE.drl" })
@RunWith(DroolsJUnitRunner.class)
public class RuleDependenteTest {

	@StatefulDroolsSession
	private DroolsSession<?> session;
	
	private Pessoa caba;
	
	@Test
	@SuppressWarnings("deprecation")
	public void deveCriarUmCaba(){
		caba = new Pessoa();
		caba.setDataNascimento(new Date("14/09/2009"));
	}
	
	@Test
	public void deveRetornarIsDependenteTrue(){
		deveCriarUmCaba();
		session.insert(caba);
		session.fireAllRules();
		assertEquals(true, caba.isDependente());
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void deveRetornarIsDependenteFalse(){
		caba = new Pessoa();
		caba.setDataNascimento(new Date("14/09/1994"));
		session.insert(caba);
		session.fireAllRules();
		assertEquals(false, caba.isDependente());
	}


}
