package com.caio.cursojava.pratica6;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] vetor = new int[10][10];
		
		for(int i= 0; i < vetor.length; i++) {
			for(int j =0; j < vetor[i].length; j++) {
				Random numeroAleatorio = new Random(9);
			}
		}
		
		int maiorQuintaLinha = 0;
		int menorQuintaLinha = 0;
		int maiorSetimaLinha = 0;
		int menorSetimaLinha = 0;
		for(int i= 0; i < vetor[5].length; i++) {
			if (vetor[5][i] > maiorQuintaLinha) {
				maiorQuintaLinha = vetor[5].length;
			}
		for(int j= 0; j < vetor[7].length; j++) {
			if (vetor[7][i] > maiorSetimaLinha) {
				maiorSetimaLinha = vetor[7][i];
			}
				
			}
		}
		
		

	}

}
