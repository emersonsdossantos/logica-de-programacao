package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer multiplicador = 0;
		imprimirMensagem("Informe o numero da tabuada desejada: ");
		Integer multiplicando = scanner.nextInt();
		
		imprimirTabuada(multiplicando, multiplicador);
		
		scanner.close();
		
	}
	
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		if (multiplicador <= 10) {
			System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
			imprimirTabuada(multiplicando, ++multiplicador); 
		}
	}
	
	static void imprimirMensagem(String texto) {
		System.out.print(texto);
	}
	
	

}
