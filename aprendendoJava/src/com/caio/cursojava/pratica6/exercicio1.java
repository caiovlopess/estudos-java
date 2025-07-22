package com.caio.cursojava.pratica6;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] vetores = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for(int i=0; i < vetores.length; i++) {
			for(int j=0; j < vetores[i].length; j++) {
				vetores[i][j] = numeroRandom.nextInt(9);

			}	
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i=0; i < vetores.length; i++) {
			for(int j=0; j < vetores[i].length; j++) {
				if(vetores[i][j] > maior) {
					maior = vetores[i][j];
					linha = i;
					col = j;
				}	
			}	
		}
		for(int i=0; i < vetores.length; i++) {
			for(int j=0; j < vetores[i].length; j++) {
				System.out.print(vetores[i][j] + " ");
			}	
			System.out.println();
		}
		System.out.print("Maior número: " + maior + " | " + "Linha: " + linha + " | " + "Coluna: " + col);
	}
}
