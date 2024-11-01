import java.util.ArrayList;
import java.util.List;

class Cliente extends PessoaFisica {
    private List<Compra> compras = new ArrayList<>();
    private double totalGasto;

    public Cliente(String nome, String endereco, String cpf) {
        super(nome, endereco, cpf);
    }

    public void registrarCompra(double valor, Vendedor vendedor) {
        Compra compra = new Compra(valor, this, vendedor);
        compras.add(compra);
        totalGasto += valor;
        vendedor.registrarVenda(compra);
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + ", Total Gasto: R$" + String.format("%.2f", totalGasto);
    }
}