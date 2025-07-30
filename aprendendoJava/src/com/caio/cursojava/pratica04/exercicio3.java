package com.caio.cursojava.pratica04;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quando a população A alcançará a B?");
		
		System.out.println("Digite o tamanho da população A: ");
		int A = scan.nextInt();
		System.out.println("Digite o taxa de crescimento da população A: ");
		Double taxaA = scan.nextDouble();
		
		System.out.println("Digite o tamanho da população B: ");
		int B = scan.nextInt();
		System.out.println("Digite o taxa de crescimento da população: ");
		Double taxaB = scan.nextDouble();
		
		int i = 0;
		
		while (A < B) {
			
			if(A > B) {
				System.out.println("A já é maior que B!");
			} else {
				A += (A/100) * taxaA;
				B += (B/100) * taxaB;
				i++;
			}
			
		}
		
		System.out.println("População A: " + A);
		System.out.println("População B: " + B);
		System.out.println("Anos para A alcançar B: " + i);
	}

}
