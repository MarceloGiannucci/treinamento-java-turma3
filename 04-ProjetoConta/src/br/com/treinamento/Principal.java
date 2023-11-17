package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Marcelo";
		cliente1.cpf = "123456789";
		
		Conta conta1 = new Conta();
		conta1.agencia = "234-5";
		conta1.numeroConta = 321546;
		conta1.saldo = 100.00;
		conta1.titular = cliente1;
		
	//###################################
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "José";
		cliente2.cpf = "123457788";
		
		Conta conta2 = new Conta();
		conta2.agencia = "234-5";
		conta2.numeroConta = 321546;
		conta2.saldo = 100.00;
		
	//#################Execução do Programa
		System.out.println("Valor da conta antes do depósito:"+conta1.saldo);
		conta1.depositar(30.00);
		
		System.out.println("Saldo atual: R$"+conta1.saldo);
		
		//#############Sacar
		System.out.println("Valor da conta antes de sacar:"+conta1.saldo);
		conta1.sacar(10.00);
		
		System.out.println("Saldo atual R$"+conta1.saldo);
		
		//#############Execução de tranfêrencia
		conta1.transferir(conta2, 27.00);
		System.out.println("Saldo atualizado conta1: " +conta1.saldo);
		System.out.println("Saldo atualizado conta2: " +conta2.saldo);
		
		//Execução Conta e Cliente
		System.out.println("Nome do cliente conta1"+conta1.titular.nome);
	}

}
