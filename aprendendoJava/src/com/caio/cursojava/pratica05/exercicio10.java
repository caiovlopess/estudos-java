package com.caio.cursojava.pratica05;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i =0; i < A.length; i++) {
			System.out.println("Digite o valor do vetor A, posição " + (i+1) + ": ");
			A[i] = scan.nextInt();
		}
		
		int qntPares = 0;
		for(int i =0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				qntPares++;
			}
		}
		
		System.out.print("Vetor A:");
		for(int i = 0; i< A.length; i++) {
			System.out.print(" " + A[i]);
		}
		
		System.out.println(" ");
		System.out.print("Quantidade de número pares: " + qntPares);
		System.out.println(" ");
		
		System.out.print("Números pares:");
		for(int i =0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				System.out.print(" " + A[i]);
			}
		}
			
	}

}
