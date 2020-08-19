package br.com.arthurdias;

public abstract class Conta {
	
	private double saldo;
	private String numeroDoCliente;
	
	public Conta(double saldo, String numeroDoCliente) {
		this.saldo = saldo;
		this.numeroDoCliente = numeroDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroDoCliente() {
		return numeroDoCliente;
	}

	public void setNumeroDoCliente(String numeroDoCliente) {
		this.numeroDoCliente = numeroDoCliente;
	}
	
	public abstract double depositar(double valor); 
	
	public abstract double sacar(double valor);
	
}
