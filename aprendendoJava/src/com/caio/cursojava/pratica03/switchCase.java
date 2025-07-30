package com.caio.cursojava.pratica03;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o número correspondente ao dia da semana (1 ao 7): ");
		int day = scan.nextInt();
		switch(day) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Número Inválido");
		} */
		
		/*char tipoUsuario = 'G';
		switch(tipoUsuario) {
		case 'A': System.out.println("Olá, administrador!"); break;
		case'U': System.out.println("Olá, usuário!"); break;
		case 'G': System.out.println("Olá, convidado!"); break;
		default: System.out.println("Tipo de usuário desconhecido.");
		}*/
		
		/*double num1 = 10;
		double num2 = 30;
		char operador = '/';
		switch (operador) {
		case '+': System.out.println("A soma do operação é: " + (num1 + num2)); break;
		case '-': System.out.println("A subtração do operação é: " + (num1 - num2)); break;
		case '*': System.out.println("A multiplicação do operação é: " + (num1 * num2)); break;
		case '/': if (num2 == 0) {
			System.out.println("o número não pode ser igual a zero");
		}else {
			System.out.println("A divisão do operação é: " + (num1 / num2)); break;
		}
		default: System.out.println("Operação inválida");;
		}*/
		
		String mes = "Junho";
		
		System.out.println("Digite o nome de um mês: ");
		mes = scan.nextLine();		
		switch(mes) {
		case "Dezembro": 
		case "Janeiro": 
		case "Fevereiro": System.out.println("É verão!"); break; 
		case "Março": 
		case "Abril": 
		case "Maio": System.out.println("É outono!"); break; 
		case "Junho": 
		case "Julho": 
		case "Agosto": System.out.println("É inverno!"); break;
		case "Setembro": 
		case "Outubro": 
		case "Novembro": System.out.println("É primavera!"); break; 
		default: System.out.println("Mês inválido.");
		}
		
		
		}
	}


