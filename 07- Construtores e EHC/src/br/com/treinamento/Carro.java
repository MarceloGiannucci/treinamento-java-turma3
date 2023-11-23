package br.com.treinamento;

public class Carro {
	
	private String marca;
	private String nome;
	private Integer anoFabricacao;
	
	// crt + 3 -> Constructor
	
	public Carro(String marca, String nome, Integer anoFabricacao) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
	}

	public Carro(Integer anoFabricacao) {
		super();
		this.anoFabricacao = anoFabricacao;
	}
	
	public Integer idadeCarro() {
		return(2023-this.anoFabricacao);
	}

	public String getMarca() {
		return marca;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	 // Atalho: CRTL + 3 toString

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", nome=" + nome + ", anoFabricacao=" + anoFabricacao + "]";
	}
	

	
	//Getters e Setters
	
	
	
	
	
	
	
	
	
	
	
	

}
