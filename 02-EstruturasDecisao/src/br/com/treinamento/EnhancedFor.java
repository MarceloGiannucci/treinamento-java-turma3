package br.com.treinamento;
    // crt + A seleciona tudo
    // crt + shift + F organiza toda as dentações
public class EnhancedFor {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 60, 70 };

		int contador = 0;
		System.out.println("Lista de números:");
		for (int i : array) {
			System.out.println(i); // syso+espaço
			contador++;
		}

		System.out.println("Quantidade de registros" + contador);

	}

}
