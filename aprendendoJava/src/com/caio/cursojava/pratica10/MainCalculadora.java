package com.caio.cursojava.pratica10;

public class MainCalculadora {

	public static void main(String[] args) {
		imprimirValor(Calculadora.somar(10, 5));
		imprimirValor(Calculadora.subtrair(10, 5));
		imprimirValor(Calculadora.multiplicar(10, 5));
		imprimirValor(Calculadora.dividir(10, 5));
		imprimirValor(Calculadora.potencializar(10, 5));
		imprimirValorFa(Calculadora.fatorial(0));

	}
	
	static void imprimirValor(int num) {
		System.out.println(num);
	}
	static void imprimirValorFa(long num) {
		System.out.println(num);
	}

}
