package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			vetorA[i]= scan.nextInt();	
		}
		
		int somaMultiploCinco= 0;
		
		for(int i=0; i < vetorA.length; i++) {
			if(vetorA[i] % 5 ==0) {
				somaMultiploCinco += vetorA[i];
			}
		}
		
		System.out.print("Vetor A:");
		for(int i =0 ; i < vetorA.length ; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		
		System.out.print("Soma dos múltiplos de 5 do vetor A:");
		System.out.print(" " + somaMultiploCinco);
		

	}

}
