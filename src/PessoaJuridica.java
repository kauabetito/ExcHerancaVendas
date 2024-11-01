import java.util.ArrayList;
import java.util.List;

class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private List<PessoaFisica> funcionarios;

    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void adicionarFuncionario(PessoaFisica funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public String getInformacoes() {
        return "Pessoa Jurídica: " + nome + ", CNPJ: " + cnpj + ", Razão Social: " + razaoSocial + ", Endereço: " + endereco;
    }
}