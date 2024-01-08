package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avan�ado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i] );
		}
		
		System.out.print("O curso que voce deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formaPagamento = new String[] {"Cart�o", "Boleto"};
		System.out.println("Escolha a forma de Pagamento abaixo:");
		for (int i = 0; i < formaPagamento.length; i++ ) {
			System.out.println("[" + i + "]" + formaPagamento[i]);
		}
			
		System.out.print("Sua forma de pagamento escolhida: ");
		Integer formaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = formaPagamentoEscolhida >= 0 && formaPagamentoEscolhida < formaPagamento.length;
		
		if (!posicaoValida) {
			posicaoInvalida();
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
	
	static void posicaoInvalida() {
		System.err.println("Posi��o invalida");
		System.exit(1);
	}

}
