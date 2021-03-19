package br.com.mariojp.escola.modelo;

public class Aluno /*extends Object*/ {

	//Modificadores
	// - default ou package
	// - public consigo acessar de qualque classe 
	// - protected - Herda dessa tera acesso ao atributo
	// - private - Só consigo acesso de dentro da propria classe
	
	// Atributos
	private String nome; 
	
	private int semestre;
	
	private Disciplina[] matricula = new Disciplina[4];
	
	private int index = 0;
	
	//Contrutor padrão
	//public Aluno() {}
	
	
	//Metodo especial onde o retorno é uma instacia da Class
	//modificaro Nome == Nome da Classe
	public Aluno(String nome) {
		this.nome = nome;
		this.semestre = 1;
	}
	
	public Aluno(String nome, int semestre) {
		this.nome = nome;
		this.semestre = semestre;
	}
	
	
	// assinatura do metodo
	// modificador retorno nome ( parametros do metodo)
	public void defineSemestre(int s) {
		if(s <= 8 && s >= 1) {
			semestre = s;
		}
	}
	
	public int obterSemestre() {
		return semestre;
	}
	
	/**
	 * Acessador
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo modificador
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Disciplina[] getMatricula() {
		return matricula;
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		if( semestre >= disciplina.getSemestre()) {
			matricula[index] = disciplina;
			index++;
		}
	}
	
}
