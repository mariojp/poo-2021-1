package br.com.mariojp.escola;

public class Disciplina {

	private String nome;
	
	private int semestre;
	

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	
}
