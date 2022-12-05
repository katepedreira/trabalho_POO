public class Principal {

    public static void main(String[] args) {

        Debito d = new Debito();
        d.setValor(100.0);

        ContaCorrente cc = new ContaCorrente();
        cc.setDebito(d);
        System.out.println(cc.getDebito().getValor());

        Cargo m = new Cargo();
        m.setNome("Motorista");

        Cargo a = new Cargo();
        a.setNome("Atendente");

        Endereco e = new Endereco();
        e.setCep("00000000");
        e.setLogradouro("Rua A");
        e.setNumero("500");
        e.setCidade("Juiz de Fora");
        e.setUf("MG");

        Endereco e2 = new Endereco();
        e2.setCep("11111111");
        e2.setLogradouro("Rua B");
        e2.setNumero("600");
        e2.setCidade("Rio de Janeiro");
        e2.setUf("RJ");


        Cliente c = new Cliente();
        c.setNome("Kate");
        c.addEndereco(e);
        c.addEndereco(e2);


        Funcionario f = new Funcionario();
        f.addCargo(m);
        f.addCargo(a);

        f.imprimeListaCargos();

        c.listarEnderecos();




    }


}
