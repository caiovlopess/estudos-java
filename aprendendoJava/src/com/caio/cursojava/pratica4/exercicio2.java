package com.caio.cursojava.pratica4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean sucessoForm = false;
		Boolean sucessoNome = false;
		Boolean sucessoIdade = false;
		Boolean sucessoSalario = false;
		Boolean sucessoSexo = false;
		Boolean sucessoEstadoC = false;
		
		do {
			
			do {
				System.out.println("Digite o seu nome: ");
				String nome = scan.nextLine();
				
				if(nome.length() >= 3) {
					sucessoNome = true;
				} else {
					sucessoNome= false;
					System.out.println("Erro! Campo nome precisa ter no minimo 3 letras.");
				}
			}while(!sucessoNome);
			
			do {
				System.out.println("Digite a sua idade: ");
				int idade = scan.nextInt();
				
				if(idade > 0 && idade <= 150) {
					sucessoIdade = true;
				} else {
					sucessoIdade= false;
					System.out.println("Erro! Idade inválida!");
				}
			}while(!sucessoIdade);
			
			do {
				System.out.println("Digite o seu salário: ");
				int salario = scan.nextInt();
				scan.nextLine();
				
				if(salario > 0) {
					sucessoSalario = true;
				} else {
					sucessoSalario= false;
					System.out.println("Erro! Salario precisa ser maior que 0!");
				}
			}while(!sucessoSalario);
			
			do {
				System.out.println("Digite o seu sexo(f ou m): ");
				String sexo = scan.nextLine();
				
				if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
					sucessoSexo = true;
				} else {
					sucessoSexo = false;
					System.out.println("Erro! Sexo precisa ser m ou f!");
				}
			}while(!sucessoSexo);
			
			do {
				System.out.println("Digite o seu estado civil(s, c, v ou d): ");
				String ec = scan.nextLine();
				
				if(ec.equalsIgnoreCase("s") || ec.equalsIgnoreCase("c") || ec.equalsIgnoreCase("v") || ec.equalsIgnoreCase("d")) {
					sucessoEstadoC = true;
				} else {
					sucessoEstadoC = false;
					System.out.println("Erro! Estado civil precisa ser s, c, v ou d!");
				}
			}while(!sucessoEstadoC);
			
			
			
		}while(sucessoForm);

	}

}
