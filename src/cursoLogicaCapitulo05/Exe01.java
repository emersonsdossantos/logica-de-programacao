package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer notaMinima = 60;
		
		System.out.println("Informe a nota de Portugues: ");
		Double notaPortugues = scan.nextDouble();
		
		System.out.println("Informe a nota de Matematica: ");
		Double notaMatematica = scan.nextDouble();
		
		if (!(notaPortugues >= notaMinima && notaMatematica >= notaMinima)) {
			System.out.println("Não atingiu a notas minimas, Reprovado");
		} else if((notaPortugues + notaMatematica) >= 150) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado!!");
		}
		
		
		scan.close();

	}

}
