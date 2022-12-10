public class Aplicacao3 {

    public static void main(String[] args) {

        Cliente c2 = new Cliente();
        c2.setNome("Joao");
        c2.setCpf("9006785645");
        c2.setTelefone("3278967854");

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNumero("001");
        cc1.setCliente(c2);
        cc1.setLimite(0.00);

        c2.addConta(cc1);

        cc1.depositar(100.00);
        cc1.depositar(100.00);
        cc1.depositar(100.00);
        cc1.sacar(50.0);
        System.out.println(cc1.saldoCC());


    }
}
