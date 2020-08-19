package br.com.arthurdias;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	
	public ContaCorrente(double saldo, String numeroDoCliente, double chequeEspecial) {
		super(saldo, numeroDoCliente);
		this.setChequeEspecial(chequeEspecial);
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public double depositar(double valor) {
		double novoSaldo = this.getSaldo() + valor;
		this.setSaldo(this.getSaldo() + valor);
		return novoSaldo;
	}
	
	public double depositar(double valor, String bancoEmissor, String dataDePagamento) {
		double novoSaldo = this.getSaldo() + valor;
		this.setSaldo(this.getSaldo() + valor);
		System.out.printf("Cheque do %s no valor de R$ %6.2f para pagamento em %s foi depositado\n", bancoEmissor, valor, dataDePagamento);
		return novoSaldo;
	}

	@Override
	public double sacar(double valor) {
		double saldo = this.getSaldo();
		double novoSaldo;
		if (saldo >= valor) {
			novoSaldo = saldo - valor;
			this.setSaldo(novoSaldo);
		} else if (saldo + chequeEspecial >= valor) {
			this.setSaldo(0);
			novoSaldo = 0;
			this.chequeEspecial -= valor - saldo;
		} else {
			System.out.println("Saldo insuficiente.");
			novoSaldo = saldo;
		}
		return novoSaldo;
	}

}
