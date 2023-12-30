package cursoLogicaCapitulo07;

public class Vetores2Dimensoes {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1800.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {2800.0, 2500.0, 3700.0};
		
		Double[][]faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
//		System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0] [0]);
//		System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1] [2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i+1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}
		System.out.println("fim");
	}

}
