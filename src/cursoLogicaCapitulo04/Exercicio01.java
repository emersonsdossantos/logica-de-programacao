package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		Double primeiroNumero = scan.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		Double segundoNumero = scan.nextDouble();
		
		System.out.print("Informe a operacao: sendo 1 = adi��o, 2 = subtra��o, 3 = multiplica��o,  4 = divis�o: ");
		Character operacao = scan.next().charAt(0);
		
		Double resultado = null;
		if (operacao.equals('1')) {
			resultado = primeiroNumero + segundoNumero;
		} else if (operacao.equals('2')) {
			resultado = primeiroNumero - segundoNumero;
		} else if (operacao.equals('3')) {
			resultado = primeiroNumero * segundoNumero;
		} else if (operacao.equals('4')) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Resultado: " + resultado);
		scan.close();
	}

}
