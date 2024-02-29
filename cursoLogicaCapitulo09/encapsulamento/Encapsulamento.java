package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome ="Emerson Santos";
//		cliente.telefone = "998878734";
//		
//		System.out.println("Nome do cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Emerson Santos");
		cliente.setTelefone("11 976645592");
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());

	}

}
