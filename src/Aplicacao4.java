public class Aplicacao4 {

    public static void main(String[] args) {

        Cliente c3 = new Cliente();
        c3.setNome("Kate");
        c3.setCpf("70067856334");
        c3.setTelefone("32991367845");

        ContaCorrente cc2 = new ContaCorrente();
        cc2.setNumero("002");
        cc2.setCliente(c3);
        cc2.setLimite(100.00);

        c3.addConta(cc2);

        cc2.depositar(1000.00);

        Cliente c4 = new Cliente();
        c3.setNome("Pedro");
        c3.setCpf("90067845623");
        c3.setTelefone("32993456789");

        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setNumero("100");
        cp1.setCliente(c4);
        cp1.setRentabilidadeMensal(1.0);

        cp1.depositar(1000.0);

        cc2.transferir(cp1, 500.0 );

        System.out.println(cp1.saldoCP());
        System.out.println(cc2.saldoCC());


    }
}
