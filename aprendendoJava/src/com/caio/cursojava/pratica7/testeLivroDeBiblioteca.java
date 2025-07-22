package com.caio.cursojava.pratica7;

import java.util.Date;

public class testeLivroDeBiblioteca {

	public static void main(String[] args) {
		LivroDeBiblioteca livro1 = new LivroDeBiblioteca();
		
		livro1.nome = "Use a Cabeça Java";
		livro1.preco = 109.40;
		livro1.editora = "Alta Books";
		livro1.edicao = 3;
		livro1.idioma = "Português";
		livro1.numeroPag = 736;
		livro1.peso = 980;
		
		livro1.emprestado = true;
		livro1.emprestadoPara = "Caio";
		livro1.dataEntrega = new Date();
		
		System.out.println("Informações do livro " + livro1.nome);
		System.out.println("Preço: R$" + livro1.preco);
		System.out.println("Editora: " + livro1.editora);
		System.out.println("Edição: " + livro1.edicao + "º");
		System.out.println("Idioma: " + livro1.idioma);
		System.out.println("Páginas: " + livro1.numeroPag);
		System.out.println("Peso: " + livro1.peso + "g");
		System.out.println("------------------------------------");
		System.out.println("Livro emprestado: " + livro1.emprestado);
		System.out.println("Livro emprestado para: " + livro1.emprestadoPara);
		System.out.println("Data de Entrega: " + livro1.dataEntrega);

	}

}
