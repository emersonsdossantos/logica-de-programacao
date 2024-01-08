package cursoLogicaCapitulo08;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avan�ado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);
		
		System.out.print("O curso que voce deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formaPagamento = new String[] {"Cart�o", "Boleto"};
		System.out.println("Escolha a forma de Pagamento abaixo:");
		iterarEExibirPosicoesDoVetorString(formaPagamento);
			
		System.out.print("Sua forma de pagamento escolhida: ");
		Integer formaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = formaPagamentoEscolhida >= 0 && formaPagamentoEscolhida < formaPagamento.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String pagamentoEscolhido = formaPagamento[formaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi " + pagamentoEscolhido);
		
		scanner.close();

	}
	
	static void iterarEExibirPosicoesDoVetorString(String [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i] );
		}
	}
	
	static void imprimirTraco() {
		System.out.println();
		System.out.println("---------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posi��o invalida");
		System.exit(1);
	}

}
