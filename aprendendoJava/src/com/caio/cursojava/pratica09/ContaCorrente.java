package com.caio.cursojava.pratica09;

public class ContaCorrente {
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}

	ContaCorrente() {} 
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public boolean getEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é de: R$" + saldo);
	}
	
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		}else if(valor > 0 && valor > saldo && valor <= limiteEspecial){
			especial = true;
			saldo-= valor;
		} else {
			System.out.println("Erro! Digite um valor válido para sacar.");
		}
	}

	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso.");
		}else {
			System.out.println("Valor de depósito precisa ser maior que R$0,00");
		}
	}
	
	public void verificarEspecial() {
		if(especial) {
			especial = true;
			System.out.println("Está usando especial");
		} else {
			especial = false;
			System.out.println("Não está usando especial");
		}
	}
}
