package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		System.out.println("Lista de idades: ");
		for (int i =0 ; i < vetorA.length; i++ ) {
			if (vetorA[i] > 18) {
				System.out.println(vetorA[i] + "anos, é maior de idade e ocupa a posição: " + i);
			} else {
				System.out.println(vetorA[i] + "anos, é menor de idade e ocupa a posição: " + i);
			}
		}
		

	}

}
