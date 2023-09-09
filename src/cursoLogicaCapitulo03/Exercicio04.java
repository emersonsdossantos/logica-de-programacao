package cursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		System.out.print("Informe a quantidade do produto: ");
		Integer quantidadeProduto = scan.nextInt();
		
		
		Double valorSubTotal = valorProduto * quantidadeProduto;
		
		Double percentualDesconto = 0.0;
		
		Boolean quantidadeMaiorOuIgualDez = quantidadeProduto >= 10;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = valorSubTotal * percentualDesconto /100;
		
		System.out.println("Valor Total: R$" + (valorSubTotal - desconto));
		
		scan.close();
	}

}
