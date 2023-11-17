package br.com.treinamento;

public class SwitCase {

	public static void main(String[] args) {
		
		int diaSemana = 1;
		
		String diaSemanaTexto = "";
		
		switch (diaSemana) {
		
		case 1:
			diaSemanaTexto = "Segunda-feira";
			break;
			
		case 2:
			diaSemanaTexto = "Terça-feira";
			
		case 3:
			diaSemanaTexto = "Quarta-feira";
			break;
			
		case 4:
			diaSemanaTexto = "Quinta-feira";
			break;
			
		case 5:
			diaSemanaTexto = "Sexta-feira";
			break;
			
		case 6:
			diaSemanaTexto = "Sábado";
			break;
			
		case 7:
			diaSemanaTexto = "Domingo";
			break;

		default:
			diaSemanaTexto = "Dia Inválido";
			break;
		}
		
		
		System.out.println(diaSemanaTexto);

	}

}
