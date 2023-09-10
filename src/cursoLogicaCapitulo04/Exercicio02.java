package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		Double frete = 15.00;
		
		if (valorProduto >= 100) {
			frete = 0.0;
		}
		Double valorDaCompra = valorProduto + frete;
		
		System.out.println("Valor Total: " + valorDaCompra);
		
		scan.close();
	}

}
