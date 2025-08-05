package com.caio.cursojava.pratica12.labs;

import java.util.Scanner;

public class MainCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
				System.out.println("Escreva o nome do curso: ");
				String nomeCurso = scan.nextLine();
				
				System.out.println("Digite o horário do curso: ");
				String horario = scan.nextLine();
				
				
				System.out.println("Digite o nome do professor: ");
				String nomeProf = scan.nextLine();
				
				System.out.println("Digite o departamento do professor: ");
				String depProf = scan.nextLine();
				
				System.out.println("Digite o email do professor: ");
				String emailProf = scan.nextLine();
				
				Curso curso = new Curso(nomeCurso);
				curso.setHorario(horario);
				
				Professor professor = new Professor();
				professor.setNome(nomeProf);
				professor.setDepartamento(depProf);
				professor.setEmail(emailProf);
				curso.setProfessor(professor);
				
				System.out.println("-----Alunos-----");
				Aluno[] alunos = new Aluno[5];
				
			for(int i = 0; i < 5; i++) {
				scan.nextLine();
				
				System.out.println("Digite o nome do Aluno " + (i+1) + ": ");
				String nome = scan.nextLine();
				
				System.out.println("Digite o número de matrícula:");
				String matricula = scan.nextLine();
				
				double[] notas = new double[4];
				
				for(int j =0; j < 4; j++) {
					System.out.println("Digite a " + (j+1) + "º nota: ");
					notas[j] = scan.nextInt();
				}
				
				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setMatricula(matricula);
				aluno.setNotas(notas);
				
				alunos[i] = aluno;
				
		}
			
			curso.setAlunos(alunos);
			
			System.out.println(curso.obterInfo());
	}

}
