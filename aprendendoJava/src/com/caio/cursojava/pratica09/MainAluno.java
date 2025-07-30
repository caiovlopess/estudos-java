package com.caio.cursojava.pratica09;

import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(scan.next());
		
		System.out.println("Digite o número de matrícula do aluno: ");
		aluno.setMatricula(scan.next());
		scan.nextLine();
		
		System.out.println("Digite o nome do curso do aluno: ");
		aluno.setNomeCurso(scan.nextLine());
		
		System.out.println("Digite o nome das diciplinas do aluno: ");
		for(int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.print("Disciplina " + (i + 1) + ": ");
			aluno.setNomeDisciplinasPos(i, scan.nextLine());
		}
		System.out.println();
		
		for(int i = 0; i < aluno.getNotaDisciplinas().length; i++) {
			System.out.println("Nome da disciplina: " + aluno.getNomeDisciplinas()[i]);
			for(int j = 0; j < aluno.getNotaDisciplinas()[i].length; j++) {
				System.out.println("Digite a " + (j+1) + "º nota: ");
				aluno.setNotaDisciplinasPos(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		System.out.println(aluno.obterMedia(0));
		System.out.println(aluno.obterMedia(1));
		System.out.println(aluno.obterMedia(2));

	}

}
