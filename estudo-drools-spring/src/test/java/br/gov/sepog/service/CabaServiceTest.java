package br.gov.sepog.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.gov.sepog.model.Caba;

public class CabaServiceTest   {
	
	@Autowired
	private CabaService cabaService;
	
//	private KieSession kSession;
	 
//	    @Before
//	    public void setup() {
//	        Resource dt 
//	          = ResourceFactory
//	            .newClassPathResource("com/baeldung/drools/rules/Discount.xls",
//	              getClass());
//	        kSession = new DroolsBeanFactory().getKieSession(dt);
//	    }
	
	@Test
	public void verificarOsCabaOk() {
		Caba cab1 = new Caba();
		Caba cab2 = new Caba();
		cab1.setNome("PA");
		cab2.setNome("manel");
	    List<Caba> cabas = new ArrayList<Caba>();
	    cabas.add(cab1);
	    cabas.add(cab2);
	    cabaService.verificarOsCaba(cabas);
	    assertEquals("nervoso",cab1.getSituacao());
	    assertEquals("coisado",cab2.getSituacao());
	}

}
