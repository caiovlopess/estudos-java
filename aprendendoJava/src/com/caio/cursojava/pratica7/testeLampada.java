package com.caio.cursojava.pratica7;

public class testeLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.frequencia = 60;
		lampada.marca = "G-Light";
		lampada.potenciaEmW = 60;
		lampada.preco = 33.90;
		lampada.quantidade = 300;
		lampada.temp_cor = "Branco Frio 6500k";
		
		System.out.println("Características da lampada: ");
		System.out.println("Frequência: " + lampada.frequencia);
		System.out.println("Marca: " + lampada.marca);
		System.out.println("Potência: " + lampada.potenciaEmW + "W");
		System.out.println("Preço: R$" + lampada.preco);
		System.out.println("Quantidade: " + lampada.quantidade);
		System.out.println("Temperatura da Cor: " + lampada.temp_cor);

	}

}
