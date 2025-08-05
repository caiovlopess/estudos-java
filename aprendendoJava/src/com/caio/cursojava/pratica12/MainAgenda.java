package com.caio.cursojava.pratica12;

import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda: ");
		String nomeAgenda = scan.nextLine();
		
		Agenda agenda = new Agenda(nomeAgenda);
		
		Contato[] contato = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do contato" + (i+1) + ": ");
			Contato c = new Contato();
			
			String nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o telefone do contato" + (i+1) + ": ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o email do contato" + (i+1) + ": ");
			String email = scan.nextLine();
			c.setEmail(email);;
			
			
			contato[i] = c;
		}
		
		agenda.setContatos(contato);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
