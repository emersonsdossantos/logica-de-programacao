package cursoLogicaCapitulo05;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = peso < 60;
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado =  peso > 90;
		
		if (pesoLeve) {
			System.out.println("O lutador é peso Leve");
		} else if (pesoMedio){
			System.out.println("O lutador é peso Medio");
		} else if (pesoPesado){
			System.out.println("O lutador é peso Pesado");
		} else {
			System.out.println("O lutador nao se encaixa em categoria alguma.");
		}
		
		scanner.close();

	}

}
