package cursoLogicaCapitulo07;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		
//		System.out.println("********Cardapio*********\n");
//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		for(int i = 0; i < cardapio.length; i++) {
//			System.out.println("["+ i +"] " + cardapio[i]);
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Digite o numero referente ao sabor do Cardapio: ");
//		Integer saborEscolhido = scanner.nextInt();
//		
//		System.out.println("Voc� escolheu o sabor " + cardapio[saborEscolhido]);
//		
//		scanner.close();
		
//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		cardapio[3] = "Frango";
//		for(int i = 0; i < cardapio.length; i++) {
//			System.out.println("["+ i +"] " + cardapio[i]);
//		}
		
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";
		
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}

	}

}
