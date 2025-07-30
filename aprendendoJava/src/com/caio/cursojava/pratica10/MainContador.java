package com.caio.cursojava.pratica10;

public class MainContador {
	
	static void imprimirValor() {
		System.out.println(Contador.mostrarContador());
	}

	public static void main(String[] args) {
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
		
		Contador.zerar();
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
	}

}
