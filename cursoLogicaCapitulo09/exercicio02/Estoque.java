package exercicio02;

public class Estoque {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "caneta";
		produto.quantiadeEstoque = 11;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + ": " + produto.verificarNecessidadeDeReporEstoque());
	}
	
//	static Boolean verificarNecessidadeDeReporEstoque(Produto produto) {
//		if(produto.quantiadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
//			return true;
//		}
//		return false;
//	}

}
