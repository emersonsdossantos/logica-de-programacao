package cursoLogicaCapitulo03;

import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*****Cauculando o quadrado de um numero*****");
		System.out.print("Informe o numero: ");
		Double numero =  scan.nextDouble();
		
		int resultado = (int) Math.pow(numero, 2);
		
		System.out.println("O resultado é: " + resultado);
		
		scan.close();

	}

}
