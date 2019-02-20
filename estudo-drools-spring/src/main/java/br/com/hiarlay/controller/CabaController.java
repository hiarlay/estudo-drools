package br.com.hiarlay.controller;

import java.util.ArrayList;
import java.util.Date;
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
	@SuppressWarnings("deprecation")
	public void verificarOsCabaOk() {
		Caba cab1 = new Caba();
		Caba cab2 = new Caba();
		cab1.setNome("PA");
		cab1.setDataNascimento(new Date("14/09/1994"));
		cab2.setNome("manel");
		cab2.setDataNascimento(new Date("14/09/2009"));
	    List<Caba> cabas = new ArrayList<Caba>();
	    cabas.add(cab1);
	    cabas.add(cab2);
	    cabaService.verificarOsCaba(cabas);
	    for(Caba caba : cabas) {
			System.out.println("O " + caba.getNome()
			+ " ta " + caba.getSituacao());
			System.out.println("É dependente ? " +caba.isDependente());
			
		}
	}

}
