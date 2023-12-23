package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero referente ao dia da semana: ");
		Integer dia = scanner.nextInt();
		
		String diaDaSemana = "";
		
		switch (dia) {
		case 1: diaDaSemana = "Domingo";
			break;
		case 2: diaDaSemana = "Segunda";
			break;
		case 3: diaDaSemana = "Terça";
			break;
		case 4: diaDaSemana = "Quarta";
			break;
		case 5: diaDaSemana = "Quinta";
			break;
		case 6: diaDaSemana = "Sexta";
			break;
		case 7: diaDaSemana = "Sabado";
			break;
		default:
			System.out.println("Informe um numero da dia da semana valido");
			break;
		}
		System.out.println(diaDaSemana);
		
		scanner.close();
	}

}
