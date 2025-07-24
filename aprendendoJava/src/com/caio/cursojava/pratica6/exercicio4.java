package com.caio.cursojava.pratica6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] agendaMensal = new int[30][24];
		String[][][] tarefas = new String[agendaMensal.length][][];
		
		System.out.println("AGENDA PESSOAL");
		System.out.println("----------------------------");
		System.out.println("Digite o DIA que deseja adicionar uma tarefa: ");
		int dia = scan.nextInt();
		System.out.println("Digite a HORA do dia que deseja adicionar uma tarefa: ");
		int hora = scan.nextInt();
		System.out.println("Digite uma tarefa: ");
		String tarefa = scan.nextLine();
		
		for(int i = 0; i < agendaMensal.length; i++) {
			for(int j = 0; j < agendaMensal[i].length; j++) {
				agendaMensal[i][j] = agendaMensal[dia][hora];
			}
		}
		
		
		
		

	}

}
