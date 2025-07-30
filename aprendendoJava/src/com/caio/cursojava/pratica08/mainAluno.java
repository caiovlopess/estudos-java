package com.caio.cursojava.pratica08;

import java.util.Scanner;

public class mainAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno1.nome = scan.next();
		scan.nextLine();
		
		System.out.println("Digite o número da matrícula do aluno: ");
		aluno1.matricula = scan.next();
		
		System.out.println("Digite o curso do aluno: ");
		aluno1.curso = scan.next();
		scan.nextLine();
		
		for(int i =0 ; i < aluno1.disciplinas.length; i++) {
			System.out.println("Digite o nome disciplina " + (i+1));
			aluno1.disciplinas[i] = scan.nextLine();
		}
		
		for(int i =0 ; i < aluno1.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno1.disciplinas[i]);
			System.out.println();
			for(int j = 0; j < aluno1.notasDisciplinas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1) + " da disciplina " + aluno1.disciplinas[i] + ": ");
				aluno1.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno1.infoAluno();

		for(int i = 0; i < aluno1.disciplinas.length; i++) {
			if (aluno1.aprovarAluno(i)) {
				System.out.println("Matéria: " + aluno1.disciplinas[i]+ ": APROVADO.");
			}else {
				System.out.println("Matéria: " + aluno1.disciplinas[i]+ ": REPROVADO.");
			}
		}

	}

}
