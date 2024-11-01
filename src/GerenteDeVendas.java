import java.util.ArrayList;
import java.util.List;

class GerenteDeVendas extends PessoaFisica {
    private double comissao;
    private List<Vendedor> equipeDeVendas = new ArrayList<>();

    public GerenteDeVendas(String nome, String endereco, String cpf, double comissao) {
        super(nome, endereco, cpf);
        this.comissao = comissao;
    }

    public void adicionarVendedor(Vendedor vendedor) {
        equipeDeVendas.add(vendedor);
    }

    public String gerarRelatorioEquipe() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório da Equipe de Vendas para o Gerente ").append(nome).append(":\n");

        for (Vendedor vendedor : equipeDeVendas) {
            relatorio.append(vendedor.getInformacoes()).append("\n");
            for (Compra venda : vendedor.getVendasRealizadas()) {
                relatorio.append("  - ").append(venda.toString()).append("\n");
            }
        }

        return relatorio.toString();
    }

    public double calcularTotalVendasEquipe() {
        double totalVendasEquipe = 0;
        for (Vendedor vendedor : equipeDeVendas) {
            totalVendasEquipe += vendedor.getTotalVendas();
        }
        return totalVendasEquipe;
    }
}
