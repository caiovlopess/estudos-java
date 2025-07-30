package com.caio.cursojava.pratica10;

public class MainConversaoUnidadesDeTempo {

	public static void main(String[] args) {
		imprimirTela(ConversaoUnidadesDeTempo.dayToHours(5));
		imprimirTela(ConversaoUnidadesDeTempo.hourToMinutes(5));
		imprimirTela(ConversaoUnidadesDeTempo.minutesToSeconds(5));
		imprimirTela(ConversaoUnidadesDeTempo.monthToDays(5));
		imprimirTela(ConversaoUnidadesDeTempo.weeksToDays(5));
		imprimirTela(ConversaoUnidadesDeTempo.yearsToDays(5));

	}
	public static void imprimirTela(double num) {
		System.out.println(num);
	}
}
