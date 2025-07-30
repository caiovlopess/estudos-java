package com.caio.cursojava.pratica09;

public class Aluno {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3];
	private double[][] notaDisciplinas = new double[3][4];
	
	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notaDisciplinas) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notaDisciplinas = notaDisciplinas;	
	}
	
	public Aluno() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}
	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}
	
	public double[][] getNotaDisciplinas(){
		return notaDisciplinas;
	}
	public void setNotaDisciplinas(double[][] notaDisciplinas) {
		this.notaDisciplinas = notaDisciplinas;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Número de matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		System.out.print("Matérias matrículadas: ");
		for(int i = 0; i < nomeDisciplinas.length; i++) {
			System.out.print(nomeDisciplinas[i] + " | ");
		}
		System.out.println();
		
		System.out.println("Notas das Disciplinas: ");
		for(int i =0; i < notaDisciplinas.length; i++) {
			System.out.print("Disciplina " + nomeDisciplinas[i] + ": ");
			for(int j =0 ; j < notaDisciplinas[i].length; j++) {
				System.out.print(notaDisciplinas[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("-----Situação das Disciplinas-----");
		for(int i =0; i < notaDisciplinas.length; i++) {
			System.out.print("Disciplina " + nomeDisciplinas[i] + ": ");
				if(verificarAprovado(i)) {
					System.out.println("APROVADO!");
				}else {
					System.out.println("NÃO APROVADO!");
				}		
		}
	}
	
	public double obterMedia(int indice) {
		double notas = 0;
		for(int i = 0; i < notaDisciplinas[indice].length; i++) {
			notas += notaDisciplinas[indice][i] ;
		}
		double media = notas/4;
		return media;
	}

	public void setNomeDisciplinasPos(int i, String nomeDisciplina) {
		this.nomeDisciplinas[i] = nomeDisciplina;
	}
	public void setNotaDisciplinasPos(int i, int j, double notaDisciplinas) {
		this.notaDisciplinas[i][j] = notaDisciplinas;
	}
	
	public boolean verificarAprovado(int indice) {
		if(obterMedia(indice) >= 7) {
			return true;
		}
		return false;
	}

}
