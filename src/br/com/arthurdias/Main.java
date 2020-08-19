package br.com.arthurdias;

public class Main {

	public static void main(String[] args) {

		ContaPoupanca minhaPoupanca = new ContaPoupanca(1000, "123456", 0.03);
		
		ContaCorrente minhaCC = new ContaCorrente(2000, "123456", 1000);
		
		System.out.println(minhaPoupanca.recolherJuros(5));
		
		System.out.println(minhaCC.depositar(500, "Santander", "20/20/2020"));
		
		System.out.println(minhaCC.sacar(2800));
		
		System.out.println(minhaCC.getChequeEspecial());

	}

}
