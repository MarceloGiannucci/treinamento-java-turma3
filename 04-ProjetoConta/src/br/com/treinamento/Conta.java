package br.com.treinamento;

public class Conta {
	//Atributos
	String agencia;
	int numeroConta;
	double saldo;
	Cliente titular;
	
	//
	void transferir(Conta contaDestino, double valor ) {
		 if(saldo<valor) {
			 System.out.println("Saldo insuficiente");
		 }else {
			 saldo = saldo - valor;
			 contaDestino.saldo = contaDestino.saldo + valor;
			 
			 System.out.println("Valor tranferido de R$" + valor + " com sucesso!");
		 }
		
	}
	
	void sacar(double valor) {
		saldo = saldo-valor;
		
		System.out.println("Saque realizado com sucesso!");
		
		System.out.println("Valor sacado de R$" + valor + " efetuado com sucesso!");
	}
	
	void depositar(double valor) { // assinatura o que determina que é
		saldo = saldo+valor;
		
		System.out.println("Depósito de R$" + valor + "efetuado com sucesso!");
	}
	

}
