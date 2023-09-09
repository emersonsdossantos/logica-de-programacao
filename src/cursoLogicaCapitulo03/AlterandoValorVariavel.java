package cursoLogicaCapitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		System.out.print("Digite o tipo de pagamento, 1 - a vista / 2 - a prazo: ");
		Integer tipoPagamento = scan.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = valorProduto + acrescimo;
		
		System.out.println("Valor total: " + valorTotal);
		scan.close();
	}

}
