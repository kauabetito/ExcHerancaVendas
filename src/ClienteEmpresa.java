class ClienteEmpresa extends PessoaJuridica {
    protected double limiteCredito;
    protected String historicoComprasEmpresa;

    public ClienteEmpresa(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco, cnpj, razaoSocial);
    }

    public void realizarCompra() {
        System.out.println("Compra empresarial realizada pela empresa " + getRazaoSocial());
    }
}