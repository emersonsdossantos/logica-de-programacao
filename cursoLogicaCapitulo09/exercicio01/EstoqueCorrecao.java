package exercicio01;

public class EstoqueCorrecao {

	public static void main(String[] args) {
		
		ProdutoCorrecao produto = new ProdutoCorrecao();
		produto.nome = "caneta";
		produto.quantiadeEstoque = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + ": " + verificarNecessidadeDeReporEstoque(produto));
	}
	
	static Boolean verificarNecessidadeDeReporEstoque(ProdutoCorrecao produto) {
		if(produto.quantiadeEstoque < ProdutoCorrecao.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		return false;
	}

}
