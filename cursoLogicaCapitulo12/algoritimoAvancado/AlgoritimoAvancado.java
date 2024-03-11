package algoritimoAvancado;

public class AlgoritimoAvancado {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Joao";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Maria";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Pedro";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Jose";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Antonio";
		lista.adicionar(aluno);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			System.out.println("aluno: " + a.nome);
			
		}

	}

}
