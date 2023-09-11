package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio04B {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idade = scan.nextInt();
		
		System.out.print("Tempo de Contribuição: ");
		Integer contribuicao = scan.nextInt();
		
		Boolean idadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean contribuicaoParaAposentar = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar = idadeParaAposentar && contribuicaoParaAposentar;
		
		if (podeAposentar) {
			System.out.println("Sim! pode aposentar.");
		} else {
			System.out.println("Não será possivel aposentar agora.");
		}
		
		scan.close();
	}

}
