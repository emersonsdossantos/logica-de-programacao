package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio03B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double primeiroNumero = informeNumero(scanner);
		
		Integer operacao = escolhaAOperacao(scanner);
		
		Double segundoNumero = informeNumero(scanner);
		
		Double resultado = realizarOperacao(operacao, primeiroNumero,segundoNumero);
		
		System.out.println("O resultado � " + resultado );
		
		scanner.close();

	}
	
	static Double realizarOperacao(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		
		Double resultado = null;
		
		switch(operacao){
			case 0:
				resultado = adicao(primeiroNumero, segundoNumero);
				break;
			case 1:
				resultado = subtracao(primeiroNumero, segundoNumero);
				break;
			case 2:
				resultado = multiplicacao(primeiroNumero, segundoNumero);
				break;
			case 3:
				resultado = divisao(primeiroNumero, segundoNumero);
				break;
			default:
				System.out.println("Escolha uma opera��o valida");
				System.exit(0);
		}
		
		return resultado;
	}
	
	static Double adicao(Double numero1, Double numero2) {
		return numero1 + numero2;
	}
	
	static Double subtracao(Double numero1, Double numero2) {
		return numero1 - numero2;
	}
	
	static Double multiplicacao(Double numero1, Double numero2) {
		return numero1 * numero2;
	}
	
	static Double divisao(Double numero1, Double numero2) {
		return numero1 / numero2;
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informe um numero:  ");
		return scanner.nextDouble();
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("Escolha a opera��o: ");
		
		String[] operacoes = new String[] {"Adi��o", "Subtra��o", "multiplicacao", "divisao"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "]" + operacoes[i]);
		}
		
		System.out.print("Digite a Operacao: ");
		return scanner.nextInt();
	}

}
