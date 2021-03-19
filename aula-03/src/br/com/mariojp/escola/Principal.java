package br.com.mariojp.escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.mariojp.escola.modelo.Aluno;
import br.com.mariojp.escola.modelo.Disciplina;

public class Principal {

	public static void main(String[] args) {

		// Tipo responsavel por ler do console
		Scanner scanner = new Scanner(System.in);

		// Lista de Alunos
		//Aluno[] lista = new Aluno[99];
		//ArrayList
		ArrayList<Aluno> lista = new ArrayList<>();
		
		
		ArrayList<Disciplina> disciplinas = new ArrayList<>();


		// opção do menu
		String opcao = "";

		do {
			// Menu
			System.out.println("1 - Adicionar Aluno");
			System.out.println("2 - Listar Alunos");
			System.out.println("3 - Cadastrar Disciplina");
			System.out.println("S - SAIR ");
			System.out.print("Digite sua opcao: ");
			// Lendo opção
			opcao = scanner.nextLine();

			switch (opcao) {
				case "1":
					System.out.print("Digite o nome: ");
					String nome = scanner.nextLine();
					System.out.print("Digite o semestre: ");
					String semestre = scanner.nextLine();
					int sem = Integer.parseInt(semestre);
					// Crio uma instancia do aluno
					Aluno aluno = new Aluno(nome);
					aluno.defineSemestre(sem);
					Disciplina disciplina = new Disciplina("Logica de Programacao", 1);
					aluno.adicionarDisciplina(disciplina);
					// adciono instacia a lista
					lista.add(aluno);
					break;
				case "2":
					for (Aluno a : lista) {
						System.out.println(a);
						System.out.println(a.getNome());
						System.out.println(a.obterSemestre());
						for (Disciplina d : a.getMatricula()) {
							if (d != null)
								System.out.println(d.getNome());
						}
					}
					break;
				case "3":

					//disciplinas.add(disciplina);
					break;
	
				default:
					break;
			}

		} while (!opcao.equalsIgnoreCase("S"));


	}

}
