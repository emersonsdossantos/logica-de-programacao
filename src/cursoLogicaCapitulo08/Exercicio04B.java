package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio04B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		Integer multiplicando = scanner.nextInt();
		
		imprimirTabuada(multiplicando, 0);
		
		scanner.close();

	}
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		if(++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
}
