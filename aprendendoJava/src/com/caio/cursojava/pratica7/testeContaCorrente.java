package com.caio.cursojava.pratica7;

public class testeContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numeroConta = 01;
		conta.saldoEmReais = 1250.90;
		conta.especial = true;
		conta.limite = 100000;
		
		System.out.println("Número da conta: " + conta.numeroConta);
		System.out.println("Saldo R$: " + conta.saldoEmReais);
		System.out.println("Conta Especial: " + conta.especial);
		System.out.println("Limite: R$" + conta.limite);
	}	
}
