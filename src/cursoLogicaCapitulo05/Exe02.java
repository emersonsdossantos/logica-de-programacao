package cursoLogicaCapitulo05;

public class Exe02 {

	public static void main(String[] args) {
		
		Double metaFaturamento = 100000.00;
		Double faturamentoReal = 50000.00;
		Double mediaSalarial = 3000.00;
		Double premioFuncionario = 0.0;
		
		if (faturamentoReal >= metaFaturamento) {
			premioFuncionario = mediaSalarial + mediaSalarial;
			System.out.println("O funcionario receberá o premio de: R$" + premioFuncionario);
		} else if ((faturamentoReal < metaFaturamento) && (faturamentoReal >= (metaFaturamento * 0.8))) {
			premioFuncionario += mediaSalarial * 0.8; 
			System.out.println("O funcionario receberá o premio de: R$" + premioFuncionario);
		} else {
			System.out.println("Infelizmente o funcionario nao bateu a meta");
		}
	}

}
