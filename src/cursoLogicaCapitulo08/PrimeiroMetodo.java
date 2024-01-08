package cursoLogicaCapitulo08;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i] );
		}
		
		System.out.print("O curso que voce deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			System.err.println("Posição invalida");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formaPagamento = new String[] {"Cartão", "Boleto"};
		System.out.println("Escolha a forma de Pagamento abaixo:");
		for (int i = 0; i < formaPagamento.length; i++ ) {
			System.out.println("[" + i + "]" + formaPagamento[i]);
		}
			
		System.out.print("Sua forma de pagamento escolhida: ");
		Integer formaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = formaPagamentoEscolhida >= 0 && formaPagamentoEscolhida < formaPagamento.length;
		
		if (!posicaoValida) {
			System.err.println("Posição invalida");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String pagamentoEscolhido = formaPagamento[formaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi " + pagamentoEscolhido);
		
		scanner.close();

	}
	
	static void imprimirTraco() {
		System.out.println();
		System.out.println("---------------------------------------------------");
		
	}

}
