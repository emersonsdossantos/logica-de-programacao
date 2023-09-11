package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
		Integer idade = scan.nextInt();
		
		System.out.print("Quantidade de tempo que contribui com a previdencia: ");
		Integer tempoPrevidencia = scan.nextInt();
		
		Boolean idadeMinima = idade >= 55;
		Boolean tempoMinimoPrevidendia = tempoPrevidencia >= 25;
		
		Boolean podeAposentar = idadeMinima && tempoMinimoPrevidendia;
		
		if (podeAposentar) {
			System.out.println("Ok, pode aposentar!!!");
		}else {
			System.out.println("Não poderá se aposentar");
		}
		
		
		
		scan.close();
	}

}
