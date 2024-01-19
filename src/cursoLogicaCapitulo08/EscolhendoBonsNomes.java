package cursoLogicaCapitulo08;

import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();

		String cursoEscolhido = receberCursoDoUsuario(scanner);
		
		imprimirTraco();
		
		String pagamentoEscolhido = receberFormaPagamentoDoUsuario(scanner);
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi " + pagamentoEscolhido);
		
		scanner.close();

	}
	
	static  String receberFormaPagamentoDoUsuario(Scanner scanner) {
		String[] formaPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir("Escolha a forma de Pagamento abaixo:");
		
		iterarEExibirPosicoesDoVetorString(formaPagamento);
			
		Integer formaPagamentoEscolhida = receberIndiceValidoDoUsuario(formaPagamento, "Sua forma de pagamento escolhida: ", scanner);
		
		return formaPagamento[formaPagamentoEscolhida];
		
	}
	
	static String receberCursoDoUsuario(Scanner scanner) {

		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avan�ado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que voce deseja � o: ", scanner);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhido = receberNumeroInteiroDoUsuario(texto, scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhido, vetor);
	
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		return posicaoEscolhido;
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
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String [] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i] );
		
		if(++i < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
	}
	
	static void imprimirTraco() {
		imprimir("---------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posi��o invalida");
		System.exit(1);
	}	
}
