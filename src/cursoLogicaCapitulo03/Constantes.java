package cursoLogicaCapitulo03;

import java.util.Scanner;


public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
		Integer idade = scan.nextInt();
		
		if (idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA) {
			System.out.println("Parabens voce pode tirar a Habilitação");
		} else {
			System.out.println("Menor de idade!!");
		}
		
		scan.close();

	}

}
