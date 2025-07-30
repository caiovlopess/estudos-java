package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Escreva o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A:");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		
		int somaValores = 0;
		for(int i = 0; i < vetorA.length; i++) {
			somaValores += vetorA[i];
		}
		System.out.print("Soma dos valores do Vetor A: " + somaValores);
		

	}

}
