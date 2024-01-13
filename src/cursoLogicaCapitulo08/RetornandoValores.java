package cursoLogicaCapitulo08;

import java.util.Scanner;

public class RetornandoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);
		
		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voce deseja é o: ", scanner);
		
//		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formaPagamento = new String[] {"Cartão", "Boleto"};
		imprimir("Escolha a forma de Pagamento abaixo:");
		iterarEExibirPosicoesDoVetorString(formaPagamento);
			
		
		Integer formaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida: ", scanner);
		
//		posicaoValida = formaPagamentoEscolhida >= 0 && formaPagamentoEscolhida < formaPagamento.length;
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(formaPagamentoEscolhida, formaPagamento);
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String pagamentoEscolhido = formaPagamento[formaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi " + pagamentoEscolhido);
		
		scanner.close();

	}
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i] );
		}
	}
	
	static void imprimirTraco() {
		imprimir("---------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição invalida");
		System.exit(1);
	}
}
