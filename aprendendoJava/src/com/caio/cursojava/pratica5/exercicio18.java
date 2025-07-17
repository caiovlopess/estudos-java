package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] alunos = new int[10];
		double[] nota1 = new double[alunos.length];
		double[] nota2 = new double[alunos.length];
		double[] Result = new double[alunos.length];
		
		for(int i = 0 ; i < alunos.length; i++) {
			System.out.println("Digite a Nota 1, do aluno " + (i+1) + ": ");
			nota1[i] = scan.nextDouble();
		}
		for(int i = 0 ; i < alunos.length; i++) {
			System.out.println("Digite a Nota 2, do aluno " + (i+1) + ": ");
			nota2[i] = scan.nextDouble();
		}
		
		double mediaAluno = 0;
		for(int i =0; i <alunos.length; i++) {
			mediaAluno = (nota1[i] + nota2[i]) / 20;
			Result[i] = mediaAluno;
		}
		System.out.println("Média: " + mediaAluno);
		
		for(int i=0 ; i < alunos.length; i++) {
			System.out.println("Aluno " + (i+1) + "Notas: "+ nota1[i] + ", " + nota2[i]);
		}

	}

}
