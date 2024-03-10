package bibliotecaPropria;

import console.Interacao;

public class CalcularValorTrocoBiblioteca {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Informe o valor do produto: ");
		
		Double valorCliente = interacao.lerDecimal("Informe o valor passado pelo cliente: ");
		
		Double troco = valorCliente - valorProduto;
		
		interacao.imprimir("Troco: " + troco);

		interacao.fechar();


	}

}
