public class Factura {
    public static double precioTotal = 0.0;
    public static double calcularPrecioTotal(double precio, int cantidad) {
        precioTotal = precio * cantidad;
        if (cantidad > 10) {
            precioTotal = aplicarDescuento(precioTotal);
        }
        return precioTotal;
    }
//Prueba para Git Branch 
    public static double aplicarDescuento(double precioTotal){
        double descuento = precioTotal - (precioTotal *0.1);
        return descuento;

    }
    public static void imprimirFactura(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Cantidad: " + pedido.getCantidad());
        System.out.println("Precio unitario: " + pedido.getPrecioUnitario());
        System.out.println("Total a pagar: " + precioTotal);
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido ("Juan", 15.76, 10);
    calcularPrecioTotal(pedido.getPrecioUnitario(), pedido.getCantidad());
    imprimirFactura(pedido);
    }
}
 