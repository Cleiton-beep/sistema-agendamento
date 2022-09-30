package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private static int contador = 100;
	private Integer codigo;
	private String operadora;
	private String TipoDoPlano;
	
	// Construtores da classe
	
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		atualizarCodigo();
	}
	
	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.TipoDoPlano = tipoDoPlano;
		atualizarCodigo();
	}
	public PlanoDeSaude() {
		atualizarCodigo();
	}
	
	private void atualizarCodigo() {
		this.codigo = contador;
		contador++;
	}
	
	//Métodos de acesso
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setTipoDoPlano(String TipoDoPlano) {
		this.TipoDoPlano = TipoDoPlano;
	}
	
	public String getTipoDoPlano() {
		return this.TipoDoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.TipoDoPlano;
	}
	
	public static int getContador() {
		return contador;
	}
}
