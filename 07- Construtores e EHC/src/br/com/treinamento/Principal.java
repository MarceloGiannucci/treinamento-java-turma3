package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Marcelo");
		pessoaA.setIdade(52);
		
		
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Marcelo");
		pessoaB.setIdade(52);
		
		System.err.println("Pessoa A é igual a Pessoa B" + (pessoaA == pessoaB));// false
	    System.out.println("Pessoa A é igual a Pessoa B" + pessoaA.equals(pessoaB));//true
	    
	    System.out.println("Hash pessoa A: "+ pessoaA.hashCode());//1961199145
	    System.out.println("Hash pessoa B" + pessoaB.hashCode());//1961199145
	}

}
