package com.caio.cursojava.pratica04;

import java.util.Scanner;

public class Loops_For_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean notaValida = false;
		
		
		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			Double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <=10) {
				notaValida = true;
				System.out.println("Nota registrada com sucesso! ; Nota: " + nota);
			}else {
				notaValida = false;
				System.out.println("Nota invalida, digite uma nota entre 0 e 10.");
			}
			
		}while(!notaValida);

	}

}
