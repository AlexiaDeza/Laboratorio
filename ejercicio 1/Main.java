public class Main{


	public static void main(String[] args){

		Pedido p1 = new Pedido(Cuadernos.CUADERNO_A, 45);
		Pedido p2 = new Pedido(Cuadernos.CUADERNO_B, 15);
		Pedido p3 = new Pedido(Cuadernos.CUADERNO_C, 15);

		ArrayList<Pedido> pedidos = new ArrayList<>();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);

		RegistrarPedido registro = new RegistrarPedido()
		registro.setCuadernosPedidos(pedidos);

		



	}
}