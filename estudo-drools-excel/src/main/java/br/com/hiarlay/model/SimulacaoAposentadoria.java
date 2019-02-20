package br.com.hiarlay.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimulacaoAposentadoria {

	private String sexo;
	
	private String cargo;

	private int codigoTipoAposentadoria;

	private int idade;

	private Double tempoContribuicao;
	
	private Double tempoContribuicaoNecessaria;

	private Double calculoProporcao;

	private Double valorSalario;

	private Double valorSalariosMedia;

	private Double valorBeneficioCalculado;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCodigoTipoAposentadoria() {
		return codigoTipoAposentadoria;
	}

	public void setCodigoTipoAposentadoria(int codigoTipoAposentadoria) {
		this.codigoTipoAposentadoria = codigoTipoAposentadoria;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getTempoContribuicaoNecessaria() {
		return tempoContribuicaoNecessaria;
	}

	public void setTempoContribuicaoNecessaria(Double tempoContribuicaoNecessaria) {
		this.tempoContribuicaoNecessaria = tempoContribuicaoNecessaria;
	}

	public Double getCalculoProporcao() {
		return calculoProporcao;
	}

	public void setCalculoProporcao(Double calculoProporcao) {
		this.calculoProporcao = calculoProporcao;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public Double getValorSalariosMedia() {
		return valorSalariosMedia;
	}

	public void setValorSalariosMedia(Double valorSalariosMedia) {
		this.valorSalariosMedia = valorSalariosMedia;
	}

	public Double getValorBeneficioCalculado() {
		return valorBeneficioCalculado;
	}

	public void setValorBeneficioCalculado(Double valorBeneficioCalculado) {
		this.valorBeneficioCalculado = valorBeneficioCalculado;
	}

	public Double getTempoContribuicao() {
		return tempoContribuicao;
	}

	public void setTempoContribuicao(Double tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	

}
