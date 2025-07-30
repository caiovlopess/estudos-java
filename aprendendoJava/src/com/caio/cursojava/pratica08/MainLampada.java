package com.caio.cursojava.pratica08;

public class MainLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.marca = "Consul Electrolux";
		lampada.corLuz = "Branco-quente";
		lampada.forma = "Tubular";
		lampada.tecnologiaIluminacao = "Incandescente";
		
		lampada.ligarLampada();
		lampada.desligarLampada();

	}

}
