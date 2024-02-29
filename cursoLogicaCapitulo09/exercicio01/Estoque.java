package exercicio01;

public class Estoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Borracha";
		produto.quantidadeEstoque = 9;
		
		verificarReposicao(produto);
		
		
	}
	
	static void verificarReposicao(Produto produto) {
		if(produto.quantidadeEstoque < 10) {
			System.out.println("Quantidade em estoque do produto " + produto.nome + " � de "  + produto.quantidadeEstoque + " unidades, � necess�rio repor");
		}else {
			System.out.println("Quantidade em estoque do produto " + produto.nome + " � de "  + produto.quantidadeEstoque + " unidades.");
		}
	}
}
