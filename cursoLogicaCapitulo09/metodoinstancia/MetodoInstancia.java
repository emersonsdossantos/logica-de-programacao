package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Emerson";
		cliente.ultimoNome = "Santos";
		cliente.telefone = "11 - 99999-0000";
		cliente.email = "emerson@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Agatha";
		cliente2.ultimoNome = "Ramires";
		cliente2.telefone = "11976767702";
		cliente2.email = "agatha@gmail.com";
		
//		System.out.println("Nome do cliente: " + Cliente.obterNomeCompleto(cliente)); Esse é o metodo estatic0
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + " / DDD: " + cliente.obterDDD());
		System.out.println("Nome do cliente: " + cliente2.obterNomeCompleto() + " / DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompleto(Cliente cliente) {
//		String nomeCompleto = cliente.nome + " " + cliente.ultimoNome;
//		return nomeCompleto;		
//	}

}
