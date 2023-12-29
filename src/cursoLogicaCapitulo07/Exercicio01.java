package cursoLogicaCapitulo07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer quantidadeDeTarefas = 5;
		
		String[] tarefas = new String[quantidadeDeTarefas];
		
		for(int i = 0; i < quantidadeDeTarefas; i++) {
			System.out.println("Informe a tarefa " + (i + 1) + " de " + quantidadeDeTarefas + " tarefas do dia: " );
			tarefas[i] = scanner.next();			
		}
		
			for(String tarefa : tarefas)
			System.out.println("tarefas: " + tarefa);
			
		scanner.close();

	}

}
