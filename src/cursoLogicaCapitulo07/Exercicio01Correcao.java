package cursoLogicaCapitulo07;

import java.util.Scanner;

public class Exercicio01Correcao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Informe a terefa " +(i + 1) + ": ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Tarefa " +(i + 1) + ": " + tarefas[i] );
		}
		scanner.close();

	}

}
