package cursoLogicaCapitulo02;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Informe o peso: ");
		Double peso = scan.nextDouble();
		
		System.out.print("Informe a altura: ");
		Double altura = scan.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.printf("O valor o IMC é: %.2f", imc);
		scan.close();

	}

}
