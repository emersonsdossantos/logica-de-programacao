package cursoLogicaCapitulo08;

import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"};
		
		imprimirTexto("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		imprimirTexto("O curso que voce deseja foi o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
//		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		validarETratarPosiçao(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String[] formaPagamento = new String[] {"Cartãoo", "Boleto"};
		
		imprimirTexto("Escolha a forma de Pagamento abaixo:");
		
		iterarEExibirPosicoesDoVetorString(formaPagamento);
			
		imprimirTexto("Sua forma de pagamento escolhida: ");
		Integer formaPagamentoEscolhida = scanner.nextInt();
		
//		posicaoValida = formaPagamentoEscolhida >= 0 && formaPagamentoEscolhida < formaPagamento.length;
		validarETratarPosiçao(posicaoCursoEscolhido, formaPagamento);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String pagamentoEscolhido = formaPagamento[formaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi " + pagamentoEscolhido);
		
		scanner.close();

	}
	
	static void imprimirTexto(String texto) {
		System.out.println(texto);
	}
	
	static void validarETratarPosiçao( Integer posicao, String[] vetor ) {
		boolean posicaoValida =  posicao >= 0 && posicao < vetor.length;
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}		
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
		System.err.println("Posiçao invalida");
		System.exit(1);
	}

}
