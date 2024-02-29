package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.codigo = 001;
		pedido.subtotal = 100.00;
		pedido.desconto = 20.00;
//		pedido.total = 80.00;
		
		System.out.println("Codigo: " + pedido.getCodigo());
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Total: " +  pedido.getTotal());

	}

}
