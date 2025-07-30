package com.caio.cursojava.pratica04;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean sucessoLogin = false;
		
		do {
			System.out.println("Digite seu nome de usuario: ");
			String nomeUsuario = scan.nextLine();
			
			System.out.println("Digite sua senha: ");
			String senhaUsuario = scan.nextLine();
			
			if(nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
				sucessoLogin = false;
				System.out.println("Erro! Senha e nome de usuário se coincidem.");
			}else {
				sucessoLogin = true;
				System.out.println("Sucesso!");
			}
		}while(!sucessoLogin);

	}

}
