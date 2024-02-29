package exercicio02;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	String nome;
	Integer quantiadeEstoque;
	
	Boolean verificarNecessidadeDeReporEstoque() {
		if(quantiadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		return false;
	}
}
