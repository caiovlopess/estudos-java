package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor do vetor B, posição " + (i+1) + ": ");
			vetorB[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		
		System.out.print("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}
		
		System.out.println(" ");
		
		System.out.print("Vetor C:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(" " + vetorC[i]);
		}

	}

}
