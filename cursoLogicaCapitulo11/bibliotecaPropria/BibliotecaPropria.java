package bibliotecaPropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero inteiro: ");
		interacao.imprimir("NUmero: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um numero decimal: ");
		interacao.imprimir("Numero: " + decimal);
		
		interacao.erro("Essa é uma mensagem de erro!!!");
		
		interacao.fechar();

	}

}
