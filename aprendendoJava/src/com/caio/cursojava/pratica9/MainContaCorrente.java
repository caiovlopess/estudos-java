package com.caio.cursojava.pratica9;

public class MainContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setAgencia("1111");
		conta.setNumero("123456");
		conta.setSaldo(1000);
		conta.setEspecial(true);
		conta.setLimiteEspecial(3000);
		
		System.out.println("Saldo inicial na conta: R$" + conta.getSaldo());
		
		conta.sacar(300);
		
		conta.consultarSaldo();
		
		conta.sacar(4000);
		
		conta.verificarEspecial();
		
		conta.consultarSaldo();

	}

}
