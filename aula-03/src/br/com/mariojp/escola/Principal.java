package br.com.mariojp.escola;

public class Principal {

	
	public static void main(String[] args) {
		
		Aluno karen = new Aluno();
		karen.nome = "Karen";
		karen.semestre = 1;
		
		Aluno bruno = new Aluno();
		bruno.nome = "Bruno";
		bruno.semestre = 2;
		
		Disciplina logica = new Disciplina();
		logica.nome = "Logica de Programacao";
		logica.semestre = 1;
		
		Disciplina poo = new Disciplina();
		poo.nome = "Programacao Orientada a Objetos";
		poo.semestre = 2;
		
		matricula(karen, logica, 0); 
		matricula(karen, poo, 1); 

		matricula(bruno, logica, 0); 
		matricula(bruno, poo, 1); 

		System.out.println(karen.nome);
		for (int i = 0; i < 1 ; i++) {
			Disciplina d = karen.matricula[i];
			System.out.println(d.nome);
		}
		
		System.out.println(bruno.nome);
		for (int i = 0; i < 2 ; i++) {
			Disciplina d = bruno.matricula[i];
			System.out.println(d.nome);
		}
		
		
		/// Aluno - disciplina 
		///
	}
	
	public static void matricula(Aluno a, Disciplina d, int i) {
		if(a.semestre >= d.semestre) {
			a.matricula[i] = d;
		}else {
			System.out.println("Não conseguiu");
		}
	}
	
}
