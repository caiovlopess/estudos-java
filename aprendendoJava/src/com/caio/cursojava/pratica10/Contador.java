package com.caio.cursojava.pratica10;

public class Contador {
	private static int counter;
	
	public static void incrementar() {
		counter++;
	}
	
	public static void zerar() {
		counter = 0;
	}
	
	public static int mostrarContador() {
		return counter;
	}
}
