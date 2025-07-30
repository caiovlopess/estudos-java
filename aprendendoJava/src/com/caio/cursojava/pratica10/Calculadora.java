package com.caio.cursojava.pratica10;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencializar(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static long fatorial(int num1) {
		long fact = 1;
		for(int i = 2; i <= num1; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
