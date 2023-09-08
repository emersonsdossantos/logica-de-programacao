package cursoLogicaCapitulo02;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		System.out.print("Informe o valor passado pelo cliente: ");
		Double valorCliente = scan.nextDouble();
		
		Double troco = valorCliente - valorProduto;
		
		System.out.println("Troco: " + troco);
		
		
		scan.close();

	}

}
