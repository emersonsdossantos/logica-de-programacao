package cursoLogicaCapitulo06;

public class IteracaoWhile {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + ": Qualquer coisa");
//		}
		
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i + ": Qualquer coisa");
//			i++;
//		}
//		System.out.println("Fim");
		
		int i = 0;
		while(i < 10) {
			if(i == 5) {
				System.out.println("Vai parar");
				break;
			}
			System.out.println(i + ": Qualquer coisa");
			i++;
		}
		System.out.println("Fim");
	}

}
