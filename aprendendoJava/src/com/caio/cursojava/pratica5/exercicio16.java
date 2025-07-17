package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		int idadeSuperior = 0;
		for (int i =0 ; i < vetorA.length; i++ ) {
			if (vetorA[i] > 35) {
				idadeSuperior++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println(" ");
		System.out.print("Quantidade de pessoas com a idade superior a 35: " + idadeSuperior);

	}

}
