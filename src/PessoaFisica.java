import java.util.ArrayList;
import java.util.List;

class PessoaFisica extends Pessoa {
    private String cpf;
    private List<PessoaFisica> dependentes;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dependentes = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public List<PessoaFisica> getDependentes() {
        return dependentes;
    }

    public void adicionarDependente(PessoaFisica dependente) {
        dependentes.add(dependente);
    }

    @Override
    public String getInformacoes() {
        return "Pessoa Física: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco;
    }
}
