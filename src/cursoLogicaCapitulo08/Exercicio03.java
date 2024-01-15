package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();
		
		System.out.print("Informe a operaçao: Adicao, Subtracao, multiplicacao, divisao: ");
		String operacao = scanner.next();
		
		if (operacao.equalsIgnoreCase("adicao")) {	
			Double resultado = calcularAdicao(primeiroNumero, segundoNumero);
			System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado );
		} else if (operacao.equalsIgnoreCase("Subtracao")) {
			Double resultado = calcularSubtracao(primeiroNumero, segundoNumero);
			System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultado );			
		} else if (operacao.equalsIgnoreCase("Multiplicacao")) {
			Double resultado = calcularMultiplicacao(primeiroNumero, segundoNumero);
			System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultado );			
		} else if(operacao.equalsIgnoreCase("Divisao")) {
			Double resultado = calcularDivisao(primeiroNumero, segundoNumero);
			System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultado );			
		} else {
			mensagem("Operação Invalida!!!");
		}
		
		scanner.close();		
	}
	
	static Double calcularAdicao( Double numero1, Double numero2 ) {		
		Double soma = numero1 + numero2;
		return soma;
	}
	static Double calcularSubtracao(Double numero1, Double numero2) {
		Double subtrair = numero1 - numero2;
		return subtrair;
	}
	static Double calcularMultiplicacao(Double numero1, Double numero2) {
		Double multiplicar = numero1 * numero2;
		return multiplicar;
	}
	static Double calcularDivisao(Double numero1, Double numero2) {
		Double dividir = numero1 / numero2;
		return dividir;
	}
	
	static void mensagem(String texto) {
		System.out.print(texto);
	}

}
