package cursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota do aluno de 0 a 100: ");
		Double nota = scan.nextDouble();
		
		
		Boolean aprovado = nota > 70;
		if (aprovado) {
			System.out.println("O aluno passou!!!");
		} else {
			System.out.println("O aluno nao passou!");
		}
		
		scan.close();

	}

}
