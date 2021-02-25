package br.com.mariojp.folha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("INICIO");

		//Funcionario(Nome, Cargo, Salario);
		//Nome
		// [[ , , ],
		//  [ , , , ],
		//  [ , ],
		//    ...[]]
		
		//String funcionario1 = "";
		//String funcionario2 = "";
		//[null, null, null, null, null]
		String[] funcionarios = new String[5];
		
		//Leitor do console
		Scanner terminal = new Scanner(System.in);
		
		//ler
		String linha = terminal.nextLine();
		//imprimir
		System.out.println("LINHA: "+linha);
		
		
		//LER INFORMAÇÕES E GUARDAR
//		for (int i = 0; i < funcionarios.length; i++) {
//			System.out.print("NOME: ");
//			String nome = terminal.nextLine();
//			funcionarios[i] = nome;
//		}
		
		String nome ="";
		int index = 0;
		while(!nome.equals("SAIR")) {
			System.out.print("NOME: ");
			nome = terminal.nextLine();
			if(!nome.equals("SAIR")) {
				funcionarios[index] = nome;
				index = index + 1; //index++
			}
		}
		
		
		//IMPRIMIR
		System.out.println("LISTA FUNCIONARIOS");
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i]);
		}
		
		
//		while(!linha.equals("Q")) { 
//			//Lendo a linha
//			linha = terminal.nextLine();
//			funcionarios[0][0] = linha;
//			//Imprime a linha
//			System.out.println(linha);
//		}
		
//		for (String[] funcionario : funcionarios) {
//			System.out.println(funcionario[0]);
//		}
		
		terminal.close();
		System.out.println("FIM");
	
	}

}
