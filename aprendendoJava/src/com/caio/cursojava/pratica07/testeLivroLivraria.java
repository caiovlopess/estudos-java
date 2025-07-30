package com.caio.cursojava.pratica07;

public class testeLivroLivraria {

	public static void main(String[] args) {
		LivroLivraria livro1 = new LivroLivraria();
		
		livro1.nome = "Use a Cabeça Java";
		livro1.preço = 109.40;
		livro1.editora = "Alta Books";
		livro1.edicao = 3;
		livro1.idioma = "Português";
		livro1.numeroPag = 736;
		livro1.peso = 980;
		livro1.idadeLeitura = 00;
		
		System.out.println("Informações do livro " + livro1.nome);
		System.out.println("Preço: R$" + livro1.preço);
		System.out.println("Editora: " + livro1.editora);
		System.out.println("Edição: " + livro1.edicao + "º");
		System.out.println("Idioma: " + livro1.idioma);
		System.out.println("Páginas: " + livro1.numeroPag);
		System.out.println("Peso: " + livro1.peso + "g");
		System.out.println("Idade de leitura: " + livro1.idadeLeitura + " e acima.");

	}

}
