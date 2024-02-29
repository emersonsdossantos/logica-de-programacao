package leituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class leituraArquivos {

	public static void main(String[] args) throws IOException {
		
		
		Path arquivo = Paths.get("C:\\\\Users\\\\emers\\\\Documents\\\\workspaces\\\\algaworks\\\\logica-de-programacao\\\\cursoLogicaCapitulo10/arquivo.txt");
		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas.size();i++) {
			String tarefa = linhas.get(i);
			System.out.println("Nome jogador " + (i+1) + ": " + tarefa);
		}
	}

}
