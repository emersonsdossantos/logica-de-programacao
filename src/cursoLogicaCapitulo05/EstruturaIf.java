package cursoLogicaCapitulo05;

public class EstruturaIf {

	public static void main(String[] args) {
		
		Double emprestimo = 4001.0;
		Double movimentacaoConta = 2000.0;
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoConta * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if (((movimentacaoConta * 2) >= emprestimo) 
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar empréstimo");
		}else {
			System.out.println("Não! Empréstimo reprovado.");
		}

	}

}
