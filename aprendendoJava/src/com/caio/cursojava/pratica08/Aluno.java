package com.caio.cursojava.pratica08;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	Double[][] notasDisciplinas = new Double[3][4];
	
	void infoAluno() {
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Número de matrícula: " + matricula);
		System.out.println("Curso: " + curso);
		
		System.out.println("Disciplinas matrículadas: ");
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println(disciplinas[i] + " ");
		}
		
		for(int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplinas[i]);
			for(int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	boolean aprovarAluno(int indice) {
		double notas = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++) {
			notas += notasDisciplinas[indice][i];
		}
		
		double media = notas/4;
		
		if(media >=7) {
			return true;
		} 
		return false;
	}
}
