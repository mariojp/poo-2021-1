package br.com.mariojp.revisao;

import java.util.Iterator;

/**
 * Classe Principal do Meu 1 projeto
 * 
 * @author mariojp
 *
 */
public class Principal {
	
	// args array de Strings que são passadas
	// pela execução do java pelo terminal
	// exemplo:
	// java Principal arg1 arg2 
		
	public static void main(String[] args) {
		
		//Imprimir
		System.out.println(args.length);//A
		if (args.length == 1) {
			System.out.println("Olá, "+args[0]); //B
		} else if (args.length == 0){
			System.out.println("Voce não passou nenhum argumento"); //C
			System.out.println("Passe algum argumento");//D
		} else {
			System.out.println("Mais de um argumento");//D
		}
		int x = executaAteFim(args);
		System.out.println(x);		
		imprimeComFor(args);

	}

	private static void imprimeComFor(String[] args) {
		
		//Tamanho do array
		// declaração ; condição de parada; incremento
		//condição de parada indice menor que o tamanho do array
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

	private static int executaAteFim(String[] args) {
		int index = 0;
		String nome = "";
		//execute enquanto condição de parada
		//enquanto for diferente de FIM
		while(!nome.equals("FIM")) {
			nome = args[index++]; 
			System.out.println(nome);
		}
		return index;
	}

}
