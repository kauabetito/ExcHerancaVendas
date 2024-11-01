class Compra {
    private double valor;
    private Cliente cliente;
    private Vendedor vendedor;

    public Compra(double valor, Cliente cliente, Vendedor vendedor) {
        this.valor = valor;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public double getValor() {
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public String toString() {
        return String.format("Compra de R$%.2f realizada por %s, atendido por %s", valor, cliente.getNome(), vendedor.getNome());
    }
}