package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Marcelo");
		cliente1.setCpf("123456789");
		
		Conta conta1 = new Conta();
		conta1.setAgencia("234-5");
		conta1.setNumeroConta(321546);
		conta1.setSaldo(100.00);
		conta1.setTitular(cliente1) ;
		
	//###################################
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("José");
		cliente2.setCpf("123457788");
		
		Conta conta2 = new Conta();
		conta2.setAgencia("234-5");
		conta2.setNumeroConta(321546);
		conta2.setSaldo(100.00);
		
	//#################Execução do Programa
		System.out.println("Valor da conta antes do depósito:"+conta1.getAgencia());
		conta1.depositar(30.00);
		
		System.out.println("Saldo atual: R$"+conta1.getAgencia());
		
		//#############Sacar
		System.out.println("Valor da conta antes de sacar:"+conta1.getAgencia());
		conta1.sacar(10.00);
		
		System.out.println("Saldo atual R$"+conta1.getAgencia());
		
		//#############Execução de tranfêrencia
		conta1.transferir(conta2, 27.00);
		System.out.println("Saldo atualizado conta1: " +conta1.getAgencia());
		System.out.println("Saldo atualizado conta2: " +conta2.getAgencia());
		
		//Execução Conta e Cliente
		System.out.println("Nome do cliente conta1:"+conta1.getTitular().getNome());
	}

}
