package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		int somaElementos = 0;
		for (int i =0 ; i < vetorA.length; i++ ) {
			if (vetorA[i] < 15) {
				somaElementos += vetorA[i];
			}
		}
		
		int contaElementos = 0;
		for (int i =0 ; i < vetorA.length; i++ ) {
			if (vetorA[i] == 15) {
				contaElementos++;
			}
		}
		
		int mediaElementos = 0;
		int counter = 0;
		for (int i =0 ; i < vetorA.length; i++ ) {
			if (vetorA[i] > 15) {
				mediaElementos += vetorA[i];
				counter++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		System.out.print("Soma de elementos inferiores a 15 = " + somaElementos);
		System.out.println(" ");
		System.out.print("Quantidade de elementos iguais a 15 = " + contaElementos);
		System.out.println(" ");
		System.out.print("Média dos elemetos superiores a 15 = " + (mediaElementos/counter));

	}

}
