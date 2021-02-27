package br.com.mariojp.folha;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("INICIO");

		Funcionario[] funcionarios = new Funcionario[5];

		//Leitor do console
		Scanner terminal = new Scanner(System.in);
		
		String nome ="";
		String cargo ="";
		String salario ="";

		int index = 0;
		while(!nome.equals("SAIR")) {
			System.out.print("NOME: ");
			nome = terminal.nextLine();
			if(!nome.equals("SAIR")) {
				funcionarios[index] = new Funcionario();
				funcionarios[index].nome = nome;
				System.out.print("CARGO: ");
				cargo = terminal.nextLine();
				funcionarios[index].cargo = cargo;
				System.out.print("SALARIO: ");
				salario = terminal.nextLine();
				funcionarios[index].salario = Double.parseDouble(salario);
				index = index + 1; //index++
			}
		}
		
		//Processamento aqui
		
		
		//IMPRIMIR
		//TODO REESCREVA ESSE FOR PARA WHILE
		System.out.println("LISTA FUNCIONARIOS");
		System.out.println("NOME | CARGO | SALARIO");
		for (int i = 0; funcionarios[i]!=null; i++) {
			System.out.println(funcionarios[i].nome +" "+funcionarios[i].cargo+" "+funcionarios[i].salario);
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
