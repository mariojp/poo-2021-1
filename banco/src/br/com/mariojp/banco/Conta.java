package br.com.mariojp.banco;

public class Conta {

	private String nome;
	
	private int numero;
	
	private int agencia;
	
	private double saldo;

	
	public Conta(String nome, int numero, int agencia) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 0d;
	}

	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return this.nome.equals(conta.nome);
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		this.saldo = this.saldo - valor;
	}

	public void tranferenciaPara(Conta outraConta, double valor) {
		this.saldo = this.saldo - valor;
		outraConta.saldo = outraConta.saldo + valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [nome=");
		builder.append(nome);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

	

}
