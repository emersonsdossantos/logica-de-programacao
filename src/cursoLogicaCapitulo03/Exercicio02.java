package cursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe o sobrenome: ");
		String sobrenome = scan.nextLine();
		System.out.println("Nome: " + nome + " " +sobrenome);
		
		
		scan.close();

	}

}
