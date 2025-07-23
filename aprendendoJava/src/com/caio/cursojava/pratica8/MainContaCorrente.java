package com.caio.cursojava.pratica8;

public class MainContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.nome = "Caio";
		conta.numeroConta = "0001";
		conta.especial = false;
		conta.saldoConta = 1000.0;
		conta.limiteConta = 3500.0;
		
		conta.depositar(1000.0);
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cehque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.sacar(2000.0);
		
		conta.consultarSaldo();

	}

}
