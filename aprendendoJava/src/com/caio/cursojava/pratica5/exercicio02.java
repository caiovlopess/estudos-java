package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++ ) {
			System.out.println("Digite o valor do vetor de posição " + (i+1) + ": ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i]*2;
			
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Vetor B: ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
