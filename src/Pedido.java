class Pedido {
    String cliente;
    double precioUnitario;
    int cantidad;

    public Pedido(String cliente, double precioUnitario, int cantidad) {
        this.cliente = cliente;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
