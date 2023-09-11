package cursoLogicaCapitulo04;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorQueTres = 3 < 3;
		System.out.println("3 < 3? " + tresMenorQueTres);
		
		Boolean tresMenorOuIgualQueTres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualQueTres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgialQueQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro? " + quatroMaiorOuIgialQueQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)?" + cincoIgualASeis);
		
		Integer centoVinteOito = 127;
		Integer centoVinteOito02 = 127;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);
		
		Boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito == centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito02);

	}

}
