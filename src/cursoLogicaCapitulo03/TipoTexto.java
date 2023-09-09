package cursoLogicaCapitulo03;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Olá " + nome + "!");
		
		scan.close();

	}

}
