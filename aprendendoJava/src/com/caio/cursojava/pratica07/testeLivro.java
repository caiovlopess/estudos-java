package com.caio.cursojava.pratica07;

public class testeLivro {

	public static void main(String[] args) {
		Livro vadeMecum = new Livro();
		
		vadeMecum.editora = "Saraiva";
		vadeMecum.edicao = 39;
		vadeMecum.idioma = "português";
		vadeMecum.numeroPag = 1952;
		vadeMecum.peso = 2.89;
		vadeMecum.idadeLeitura = 18;
		
		System.out.println("Informações do livro Vade Mecum Saraiva Tradicional: ");
		System.out.println("Editora " + vadeMecum.editora);
		System.out.println("Edição: " + vadeMecum.edicao + "º");
		System.out.println("Idioma: " + vadeMecum.idioma);
		System.out.println("Páginas: " + vadeMecum.numeroPag);
		System.out.println("Peso: " + vadeMecum.peso + "kg");
		System.out.println("Idade de leitura: " + vadeMecum.idadeLeitura + " e acima.");
		
		

	}

}
