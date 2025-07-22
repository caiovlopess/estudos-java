package com.caio.cursojava.pratica7;

public class testeContato {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		
		contato1.nome = "Caio Victor";
		contato1.endereco = "Rua, Bairro, Número 00";
		contato1.email = "example@hotmail.com";
		
		contato1.telefones = new String[2];
		contato1.telefones[0] = "(88)999999999";
		contato1.telefones[1] = "(88)888888888";
		
		System.out.println("Agenda: ");
		System.out.println("Contato: " + contato1.nome + " | " + contato1.endereco);
		System.out.println("Email: " + contato1.email);
		for(int i = 0; i < contato1.telefones.length ; i++) {
			System.out.println("Número de telefone " + (i+1) + ": " + contato1.telefones[i]);
		}
		

	}

}
