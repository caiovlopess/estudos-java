package com.caio.cursojava.pratica04;

import java.util.Scanner;

public class exercicio3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double A;
		Double B;
		Double taxaA;
		Double taxaB;
		
		int i = 0;
		
		Boolean validacao = false;
		do {
			System.out.println("Digite o tamanho da população A: ");
			A = scan.nextDouble();
			
			if( A > 0) {
				validacao = true;
			}else {
				System.out.println("ERR! Digite um valor maior que 0.");
			}
		}while(!validacao);
		
		validacao = false;
		do {
			System.out.println("Digite a taxa da população A: ");
			taxaA = scan.nextDouble();
			
			if( taxaA > 0) {
				validacao = true;
			}else {
				System.out.println("ERR! Digite um valor maior que 0.");
			}
		}while(!validacao);
		
		validacao = false;
		do {
			System.out.println("Digite a tamanho da população B: ");
			B = scan.nextDouble();
			
			if( B > 0) {
				validacao = true;
			}else {
				System.out.println("ERR! Digite um valor maior que 0.");
			}
		}while(!validacao);
		
		validacao = false;
		do {
			System.out.println("Digite a taxa da população B: ");
			taxaB = scan.nextDouble();
			
			if( taxaB > 0) {
				validacao = true;
			}else {
				System.out.println("ERR! Digite um valor maior que 0.");
			}
		}while(!validacao);
		
		while(A < B) {
			A += (A/100)*taxaA;
			B += (B/100)*taxaB;
			i++;
		}

		System.out.println("Tamanho da população de A: " + A);
		System.out.println("Tamanho da população de A: " + B);
		System.out.println("Anos: " + i);
	}

}
