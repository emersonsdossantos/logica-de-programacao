package cursoLogicaCapitulo03;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira =  true;
		Boolean variavelFalsa =  false;
		
		System.out.println("Valor verdadeiro:" + variavelVerdadeira);
		System.out.println("Valor falso:" + variavelFalsa);
		
		System.out.println("-------------------------------------------------------------");
		
		Integer idade = 19;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Pode tirar a habilitação");
		} else {
			System.out.println("Não! Menor de idade");
		}

	}

}
