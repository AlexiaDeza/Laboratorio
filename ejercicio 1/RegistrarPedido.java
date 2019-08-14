public class RegistrarPedido{
	
	private Arraylist<Pedido> cuadernosPedidos;

	public void setCuadernosPedidos(Arraylist<Pedido> cantidad){
		this.cuadernosPedidos=cantidad;
	}
	public int CalcularPago(Arraylist<Pedido> pedidos){
		int precioFinal
		for(int i=o,i<pedidos.size();i++){
		 precioFinal= precioFinal+ pedidos(i).getCuaderno().getPrecio() * pedidos(i).getcantidad();
		}
		System.out.println(precioFinal);
		return precioFinal;
		
	}
 }