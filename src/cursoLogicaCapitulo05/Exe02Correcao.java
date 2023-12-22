package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exe02Correcao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual é a meta do faturamento anual da empresa: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Qual é o faturamento anual da empresa do ultimo ano: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Qual é a media salarial dos funcionarios ");
		Double mediaSarial = scanner.nextDouble();
		
		Boolean metaBatida = faturamento >= meta;
		
		Double oitentaPorCento = (meta * 80) / 100;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCento;
		
		if (metaBatida) {
			Double premio =  mediaSarial + mediaSarial;
			System.out.println("Parabens meta batida! o premio será de 100% R$" + premio );
		} else if(faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSarial * 80) /100;
			System.out.println("Parabens meta batida! o premio será de  80% R$" + oitentaPorCentoDaMediaSalarial );
		} else {
			System.out.println("Infelizmente a meta nâo foi batida");
		}
			
		scanner.close();

	}

}
