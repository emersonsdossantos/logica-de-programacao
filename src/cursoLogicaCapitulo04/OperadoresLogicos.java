package cursoLogicaCapitulo04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao; 
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplicar desconto");
		} else {
			System.out.println("Não aplicar desconto!");
		}

	}

}
