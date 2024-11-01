public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria", "Rua A, 123", "111.222.333-44");
        Cliente cliente2 = new Cliente("José", "Rua B, 456", "555.666.777-88");


        PessoaJuridica empresa = new PessoaJuridica("Airsoft Esporte", "Av. Central, 789", "12.345.678/0001-90", "Airsoft Esporte Ltda");
        Vendedor vendedor1 = new Vendedor("Carlos", "Rua C, 101", "123.456.789-00", 0.05);
        Vendedor vendedor2 = new Vendedor("Ana", "Rua D, 202", "987.654.321-00", 0.06);
        GerenteDeVendas gerente = new GerenteDeVendas("Rafael", "Rua E, 303", "111.222.333-00", 0.10);


        gerente.adicionarVendedor(vendedor1);
        gerente.adicionarVendedor(vendedor2);

        cliente1.registrarCompra(1000, vendedor1);
        cliente1.registrarCompra(500, vendedor2);
        cliente2.registrarCompra(2000, vendedor1);
        cliente2.registrarCompra(1500, vendedor2);


        System.out.println("Aqui estão os clientes:");
        System.out.println(cliente1.getInformacoes());
        System.out.println(cliente2.getInformacoes());


        System.out.println("\nAqui está a empresa:");
        System.out.println(empresa.getInformacoes());


        System.out.println("\n" + gerente.gerarRelatorioEquipe());


        System.out.printf("Total de Vendas da Equipe: R$%.2f\n", gerente.calcularTotalVendasEquipe());


        System.out.println("\nDetalhamento de Compras dos Clientes:");
        for (Compra compra : cliente1.getCompras()) {
            System.out.println(compra.toString());
        }
        for (Compra compra : cliente2.getCompras()) {
            System.out.println(compra.toString());
        }
    }
}