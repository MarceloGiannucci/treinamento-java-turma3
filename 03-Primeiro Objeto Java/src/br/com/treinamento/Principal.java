package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome ="Marcelo Giannucci";
		pessoa.idade = 52;
		pessoa.altura = 1.80;
		pessoa.peso = 73.00;
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println(pessoa2.nome);
		
		pessoa2.nome = "Moisés da Silva";
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa2.nome);
	}

}
