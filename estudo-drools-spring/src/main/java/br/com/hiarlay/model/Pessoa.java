package br.com.hiarlay.model;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Pessoa {
	
	@Getter 
	private String nome;
	@Getter 
	private String situacao;
	@Getter 
	private Date dataNascimento;
	@Getter 
	private boolean isDependente;
	private int idade;
	
	@SuppressWarnings("deprecation")
	public int getIdade(){
		return (new Date().getYear() - dataNascimento.getYear());
	}

}
