package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		int somaNumImpar= 0;
		int impar = 0;
		for(int i=0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 !=0) {
				somaNumImpar += vetorA[i];
				impar++;
			}
		}
		
		System.out.print("Vetor A:");
		for(int i =0 ; i < vetorA.length ; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		System.out.print("Soma dos múltiplos de 5 do vetor A: " + somaNumImpar);
		System.out.println(" ");
		System.out.print("Media aritmética: " + (somaNumImpar/impar));
	}

}
