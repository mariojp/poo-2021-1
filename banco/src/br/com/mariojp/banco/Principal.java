package br.com.mariojp.banco;

public class Principal {

	
	public static void main(String[] args) {
		// Criem 2 contas
		Conta conta1 = new Conta("Bruno",123456,1234);
		
		Conta conta2 = new Conta("Bruno",123456,1234);
		
		//depositar
		conta1.deposito(30.00);
		conta2.deposito(60.00);
		//saque
		conta1.saque(40.00);
		conta2.saque(20.00);
		//Tranferencia de R$10,00
		conta2.tranferenciaPara(conta1, 10.00);

		System.out.println(conta1);
		System.out.println(conta2);

		

		
	}
	
}
