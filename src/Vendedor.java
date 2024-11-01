import java.util.ArrayList;
import java.util.List;

class Vendedor extends PessoaFisica {
    private double comissao;
    private double totalComissao;
    private double totalVendas;
    private List<Compra> vendasRealizadas = new ArrayList<>();

    public Vendedor(String nome, String endereco, String cpf, double comissao) {
        super(nome, endereco, cpf);
        this.comissao = comissao;
    }

    public void registrarVenda(Compra compra) {
        vendasRealizadas.add(compra);
        totalVendas += compra.getValor();
        totalComissao += compra.getValor() * comissao;
    }

    public double getTotalComissao() {
        return totalComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public List<Compra> getVendasRealizadas() {
        return vendasRealizadas;
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + ", Total de Vendas: R$" + String.format("%.2f", totalVendas) + ", Comissão: " + comissao + ", Total de Comissões: " + totalComissao;
    }
}