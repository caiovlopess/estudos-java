package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length ; i++) {
			System.out.println(i + ")" + "Digite um número:");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Valor do vetor A, posição: " + (i+1) + "º" + " " + vetorA[i]);
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Valor do vetor B, posição: " + (i+1) + "º" + " " + vetorB[i]);
		}

	}

}
