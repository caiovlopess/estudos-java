package com.caio.cursojava.pratica08;

public class ContaCorrente {
	String nome;
	String numeroConta;
	Double saldoConta;
	Boolean especial;
	Double limiteConta;
	
	void sacar(double valor) {
		if(valor > 0 && valor <= saldoConta) {
			saldoConta -= valor;
			System.out.println("Saque realizado com sucesso! Saldo Atual: R$" + saldoConta);
		} else {
			System.out.println("Tentativa de saque falhou.");
		}
	}
	
	void depositar(double valor) {
		if(valor > 0) {
			saldoConta += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso! Saldo Atual: R$" + saldoConta);
		} else {
			System.out.println("Tentativa de depósito falhou. Depósito precisa ser maior que 0.");
		}
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldoConta);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldoConta < 0;
	}
	
}
