package br.com.arthurdias;

public class Cliente {
	
	private String numeroDoCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	
	public Cliente(String numeroDoCliente, String sobrenome, String rg, String cpf) {
		this.numeroDoCliente = numeroDoCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getNumeroDoCliente() {
		return numeroDoCliente;
	}
	
	public void setNumeroDoCliente(String novoNumero) {
		this.numeroDoCliente = novoNumero;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
