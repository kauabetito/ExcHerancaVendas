class Fornecedor extends PessoaJuridica {
    protected String produtoFornecido;
    protected String prazoEntrega;

    public Fornecedor(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco, cnpj, razaoSocial);
    }

    public void fornecerProduto() {
        System.out.println("Produto fornecido pelo fornecedor " + getRazaoSocial());
    }
}