package metodoinstancia;

public class Cliente {
	
	String nome;
	String ultimoNome;
	String telefone;
	String email;
	
	String obterNomeCompleto() {
		String nomeCompleto = nome + " " + ultimoNome;
		return nomeCompleto;		
	}
	
	String obterDDD() {
		String ddd = telefone.substring(0,2);
		return ddd;
	}

}
