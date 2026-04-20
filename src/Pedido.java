/**
 * Clase que representa un pedido de productos.
 * cambio commit
 */

class Pedido {
    /** Nombre del cliente que realiza el pedido. */
    String cliente;
    /** Precio unitario del producto. */
    double precioUnitario;
    /** Cantidad de productos solicitados. */
    int cantidad;
/** Constructor de la clase Pedido. 
 * @param cliente Nombre del cliente que realiza el pedido.
 * @param precioUnitario Precio unitario del producto.
 * @param cantidad Cantidad de productos solicitados. 
*/
    public Pedido(String cliente, double precioUnitario, int cantidad) {
        this.cliente = cliente;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
/** 
 * @return Nombre del cliente que realiza el pedido.
 */
    public String getCliente() {
        return cliente;
    }
/**
 * Establece el nombre del cliente que realiza el pedido.   
 * @param cliente
 */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
/**
 * Obtiene el precio unitario del producto.
 * @return
 */

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    /**
     * Establece el precio unitario del producto.
     * @param precioUnitario
     */

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

/**
 * Obtiene la cantidad de productos solicitados.
 * @return
 */
    public int getCantidad() {
        return cantidad;
    }

/**
 * Establece la cantidad de productos solicitados.
 * @param cantidad
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
