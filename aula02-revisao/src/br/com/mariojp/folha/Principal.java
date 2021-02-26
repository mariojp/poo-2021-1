package br.com.mariojp.folha;

import java.util.Iterator;
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
		//[[null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null]]
		String[][] funcionarios = new String[5][3];
//		String[] cargos = new String[5];
//		String[] salarios = new String[5];

		//Leitor do console
		Scanner terminal = new Scanner(System.in);
		
		//ler
		String linha = terminal.nextLine();
		//imprimir
		System.out.println("LINHA: "+linha);
		
		
		String nome ="";
		String cargo ="";
		String salario ="";

		int index = 0;
		while(!nome.equals("SAIR")) {
			System.out.print("NOME: ");
			nome = terminal.nextLine();
			if(!nome.equals("SAIR")) {
				funcionarios[index][0] = nome;
				System.out.print("CARGO: ");
				cargo = terminal.nextLine();
				funcionarios[index][1] = cargo;
				System.out.print("SALARIO: ");
				salario = terminal.nextLine();
				funcionarios[index][2] = salario;
				index = index + 1; //index++
			}
		}
		
		
		//IMPRIMIR
		//TODO REESCREVA ESSE FOR PARA WHILE
		System.out.println("LISTA FUNCIONARIOS");
		System.out.println("NOME | CARGO | SALARIO");
		for (int i = 0; funcionarios[i][0]!=null; i++) {
			for (int j = 0; j < funcionarios[i].length ; j++) { //j < 3
				System.out.print(funcionarios[i][j] +"  ");
			}
			System.out.println();
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
