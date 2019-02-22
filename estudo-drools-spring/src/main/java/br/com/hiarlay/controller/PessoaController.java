package br.com.hiarlay.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hiarlay.model.Pessoa;
import br.com.hiarlay.service.PessoaService;

@RestController
public class PessoaController {
	
	@Autowired
	private PessoaService cabaService;
	
	@GetMapping("verificar")
	@SuppressWarnings("deprecation")
	public void verificarOsCabaOk() {
		Pessoa cab1 = new Pessoa();
		Pessoa cab2 = new Pessoa();
		cab1.setNome("PA");
		cab1.setDataNascimento(new Date("14/09/1994"));
		cab2.setNome("manel");
		cab2.setDataNascimento(new Date("14/09/2009"));
	    List<Pessoa> cabas = new ArrayList<Pessoa>();
	    cabas.add(cab1);
	    cabas.add(cab2);
	    cabaService.verificarOsCaba(cabas);
	    for(Pessoa caba : cabas) {
			System.out.println("O " + caba.getNome()
			+ " ta " + caba.getSituacao());
			System.out.println("É dependente ? " +caba.isDependente());
			
		}
	}

}
