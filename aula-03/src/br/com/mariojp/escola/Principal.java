package br.com.mariojp.escola;

import java.util.Scanner;

public class Principal {

	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o semestre: ");
		String semestre = scanner.nextLine();
		int sem = Integer.parseInt(semestre);
		Aluno aluno = new Aluno(nome);
		aluno.defineSemestre(sem);
		
		
		System.out.println(aluno);
		System.out.println(aluno.getNome());
		System.out.println(aluno.obterSemestre());

		
		
		
		
		//Classe variavel = new Criando uma instacia de Aluno (a)
		Aluno karen = new Aluno("Karen");
		//karen.setNome("Karen"); //(Aluno nome=""; semestre=0)
		karen.defineSemestre(2);
		
		int rsposta = karen.obterSemestre();
		System.out.println("Semestre: "+rsposta);
		
	
		
		Aluno bruno = new Aluno("Bruno");
		bruno.setNome("Bruno");;
		bruno.defineSemestre(1);
		// karen -> instacia a
		//x ->      instacia b
		//bruno ->  instacia b
		Aluno x = bruno;
		x.setNome("Bruno 2");
		
		//x ->      instacia b
		//bruno ->  null
		//bruno = null;
		
		Disciplina logica = new Disciplina();
		logica.setNome("Logica de Programacao");
		logica.setSemestre(1);
		
		Disciplina poo = new Disciplina();
		poo.setNome("Programacao Orientada a Objetos");
		poo.setSemestre(2);
		
		//Principal.matricula(karen, logica, 0); 
		karen.adcionarDisciplina(logica);
		//Principal.matricula(karen, poo, 1); 
		karen.adcionarDisciplina(poo);

		//Principal.matricula(bruno, logica, 0);
		bruno.adcionarDisciplina(logica);
		//Principal.matricula(bruno, poo, 1);
		bruno.adcionarDisciplina(poo);

		System.out.println(karen.getNome());
		System.out.println(karen.obterSemestre());

		for (Disciplina d : karen.getMatricula()) {
			if(d != null)
				System.out.println(d.getNome());
		}
		
		Disciplina[] matricula = karen.getMatricula();
		for (int i = 0; i < matricula.length ; i++) {
			Disciplina d = matricula[i];
			if(d != null)
				System.out.println(d.getNome());
		}
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.obterSemestre());

		for (Disciplina d : bruno.getMatricula()) {
			if(d != null)
				System.out.println(d.getNome());
		}

		
		

	}
	
	
	//static - significa que ele esta associado a classe
	public static void matricula(Aluno a, Disciplina d, int i) {
		if(a.obterSemestre() >= d.getSemestre()) {
			a.adcionarDisciplina(d);
		}else {
			System.out.println("Não conseguiu");
		}
	}
	
}
