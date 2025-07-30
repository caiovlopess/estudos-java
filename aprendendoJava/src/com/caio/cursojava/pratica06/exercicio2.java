package com.caio.cursojava.pratica06;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] vetor = new int[10][10];
		Random numeroAleatorio = new Random();
		
		for(int i= 0; i < vetor.length; i++) {
			for(int j =0; j < vetor[i].length; j++) {
				vetor[i][j] = numeroAleatorio.nextInt(9);
			}
		}
		
		for(int i= 0; i < vetor.length; i++) {
			for(int j =0; j < vetor[i].length; j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println();
		}
		
		int maiorQuintaLinha = 0;
		int menorQuintaLinha = 100;
		int L5 = 5;
		for(int i= 0; i < vetor[L5].length; i++) {
			if (vetor[L5][i] > maiorQuintaLinha) {
				maiorQuintaLinha = vetor[L5][i];
			}
			if (vetor[L5][i] < menorQuintaLinha) {
				menorQuintaLinha = vetor[L5][i];
			}
		}
		
		int maiorSetimaLinha = 0;
		int menorSetimaLinha = 100;
		int L7 = 7;
		for(int i= 0; i < vetor[L7].length; i++) {
			if (vetor[L7][i] > maiorSetimaLinha) {
				maiorSetimaLinha = vetor[L7][i];
			}
			if (vetor[L7][i] < menorSetimaLinha) {
				menorSetimaLinha = vetor[L7][i];
			}
		}
		
		System.out.println("Maior valor da linha 5: " + maiorQuintaLinha);
		System.out.println("Menor valor da linha 5: " + menorQuintaLinha);
		System.out.println();
		System.out.println("Maior valor da linha 7: " + maiorSetimaLinha);
		System.out.println("Menor valor da linha 7: " + menorSetimaLinha);
			}
	
	}


