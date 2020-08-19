package br.com.arthurdias;

public class ContaPoupanca extends Conta {

	private double juros;
	
	public ContaPoupanca(double saldo, String numeroDoCliente, double juros) {
		super(saldo, numeroDoCliente);
		this.juros = juros;
	}
	
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	@Override
	public double depositar(double valor) {
		double novoSaldo = this.getSaldo() + valor;
		this.setSaldo(this.getSaldo() + valor);
		return novoSaldo;
	}

	@Override
	public double sacar(double valor) {
		double novoSaldo = this.getSaldo() - valor;
		if (novoSaldo >= 0) {
			this.setSaldo(novoSaldo);
			return novoSaldo;
		} else {
			System.out.println("Saldo insuficiente.");
			return this.getSaldo();
		}
	}
	
	public double recolherJuros(int meses) {
		double saldo = this.getSaldo();
		do {
			saldo += saldo*juros;
			meses--;
		} while (meses > 0);
		
		return (saldo - this.getSaldo());
	}
	
}
