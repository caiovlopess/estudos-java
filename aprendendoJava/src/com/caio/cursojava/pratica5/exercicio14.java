package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		int percentPar = 0;
		for(int i =0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				percentPar += 10;
			}
		}
		int percentImpar = 0;
		for(int i =0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				percentImpar += 10;
			}
		}
		
		System.out.print("Vetor A:");
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		System.out.print("Números pares fazem parte de: " + percentPar + "%");
		System.out.println(" ");
		System.out.print("Números ìmpares fazem parte de: " + percentImpar + "%");
		

	}

}
