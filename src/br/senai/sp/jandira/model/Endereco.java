package br.senai.sp.jandira.model;

public class Endereco {

	private String cep;
	private String cidade;
	private String logradouro;
	private String bairro;
	private String pontoDeReferencia;
	private String numeroFundos;
	private String tipo;
	private Estados estado;
	private String complemento;

	// Métodos de acesso
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}

	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}

	public String getNumeroFundos() {
		return numeroFundos;
	}

	public void setNumeroFundos(String numeroFundos) {
		this.numeroFundos = numeroFundos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
