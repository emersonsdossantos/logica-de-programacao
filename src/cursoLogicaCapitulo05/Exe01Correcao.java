package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exe01Correcao {
	
	static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		
		System.out.println("Verificando de possui nota minima para classificação.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota de Portugues: ");
		Double notaPortugues = scan.nextDouble();
		
		System.out.print("Informe a nota de Matematica: ");
		Double notaMatematica = scan.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean estaAcimaDoMinimoEmMatematica = notaMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaPortugues + notaMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;
		
		if (passou) {
			System.out.println("Parabens, vc foi aprovado!!!!");
		}else {
			System.out.println("Infelizmente vc nao foi aprovado.");
		}
		
		scan.close();

	}

}
