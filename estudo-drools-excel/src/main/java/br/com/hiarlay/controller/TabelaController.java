package br.com.hiarlay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hiarlay.service.TabelaService;

@RestController
public class TabelaController {
	
	@Autowired
	private TabelaService tabelaService;
	
	@GetMapping("verificar")
	public void verificarOsCabaOk() {
		tabelaService.verificarTabela();
	}

}
