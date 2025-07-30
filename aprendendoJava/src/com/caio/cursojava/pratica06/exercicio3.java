package com.caio.cursojava.pratica06;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] vetores = new int[3][3];
		
		for(int i =0; i < vetores.length; i++) {
			System.out.println("COLUNA " + (i+1));
			for(int j =0; j < vetores[i].length; j++) {
				System.out.println("Digite o " + (j+1) + "º número: ");
				vetores[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i < vetores.length; i++) {
			for(int j =0; j < vetores[i].length; j++) {
				System.out.print(vetores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Numeros pares: ");
		for(int i =0; i < vetores.length; i++) {
			for(int j =0; j < vetores[i].length; j++) {
				
				if(vetores[i][j] % 2 == 0) {
					System.out.print(vetores[i][j] + " ");
				}
			}
		}
		System.out.print("Numeros ímpares: ");
		for(int i =0; i < vetores.length; i++) {
			for(int j =0; j < vetores[i].length; j++) {
				
				if(vetores[i][j] % 2 != 0) {
					System.out.print(vetores[i][j] + " ");
				}
			}
		}
		
		
		
		
		
		

	}

}
