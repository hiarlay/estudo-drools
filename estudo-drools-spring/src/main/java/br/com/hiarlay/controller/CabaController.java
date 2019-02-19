package br.com.hiarlay.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hiarlay.model.Caba;
import br.com.hiarlay.service.CabaService;

@RestController
public class CabaController {
	
	@Autowired
	private CabaService cabaService;
	
	@GetMapping("verificar")
	public void verificarOsCabaOk() {
		Caba cab1 = new Caba();
		Caba cab2 = new Caba();
		cab1.setNome("PA");
		cab2.setNome("manel");
	    List<Caba> cabas = new ArrayList<Caba>();
	    cabas.add(cab1);
	    cabas.add(cab2);
	    cabaService.verificarOsCaba(cabas);
	    for(Caba caba : cabas) {
			System.out.println("O " + caba.getNome()
			+ " ta " + caba.getSituacao());
			
		}
	}

}
