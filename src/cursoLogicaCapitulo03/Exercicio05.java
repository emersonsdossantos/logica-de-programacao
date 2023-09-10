package cursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_MINIMA = 70;
	
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota do aluno de 0 a 100: ");
		Double nota = scan.nextDouble();
		
		
		Boolean aprovado = nota >= NOTA_MINIMA;
		if (aprovado) {
			System.out.println("O aluno passou!!!");
		} else {
			System.out.println("O aluno nao passou!");
		}
		
		scan.close();

	}

}
