package com.caio.cursojava.pratica5;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i < vetorA.length ; i++) {
			System.out.println("Digite o valor do vetor A da posição " + (i+1) + ":");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.print("Vetor A:");
		for(int i =0; i < vetorA.length ; i++) {
			System.out.print(" " + vetorA[i]);
		}
		
		System.out.println(" ");
		
		System.out.print("Vetor B:");
		for(int i =0; i < vetorA.length ; i++) {
			System.out.print(" " + vetorB[i]);
		}

	}

}
