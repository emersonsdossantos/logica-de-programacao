package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double valorTotal = 0.0;
		
		System.out.print("Informe o valor da conte de luz: ");
		Double contaDeLuz = scan.nextDouble();		
		valorTotal += contaDeLuz;
		
		System.out.print("Informe o valor da conte de água: ");
		Double contaDeAgua = scan.nextDouble();
		valorTotal += contaDeAgua;
		
		System.out.print("Informe o valor da conte de telefone: ");
		Double contaDeTelefone = scan.nextDouble();
		valorTotal += contaDeTelefone;
		
		System.out.print("Informe o valor da escola do filho: ");
		Double contaDaEscola = scan.nextDouble();
		valorTotal += contaDaEscola;
		
		System.out.print("Informe o valor da fatura do cartao: ");
		Double faturaDoCartao = scan.nextDouble();
		valorTotal += faturaDoCartao;
		
		System.out.print("Informe o valor da conte dos gastos com supermercado: ");
		Double gastosSupermercado = scan.nextDouble();
		valorTotal += gastosSupermercado;
		
		System.out.println("Valor total gasto no mês: " + valorTotal);
		
		scan.close();
	}

}
