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


        Funcionario f = new Funcionario();
        f.addCargo(m);
        f.addCargo(a);

        f.imprimeListaCargos();



    }


}
