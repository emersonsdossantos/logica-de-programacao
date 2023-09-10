package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio02B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if (precisaCobrarFrete) {
			valorFinal += 15.0;
		}
		
		System.out.println("Valor total: " + valorFinal);
		scanner.close();
	}

}
