package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio03B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe abaixo todos gastos com...");
		
		Double valorTotal = 0.0;
		
		System.out.print("Agua: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("Luz: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("Telefone: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("Escola: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("Cartao: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("Supermercado: ");
		valorTotal += scan.nextDouble();
		
		System.out.print("O valor total gasto no mês foi: R$" + valorTotal);
		
		scan.close();
	}

}
