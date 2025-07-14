package com.caio.cursojava.pratica2;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade!");
		} else {
			System.out.println("É menor de idade!");
		}
	}

}
