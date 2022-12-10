public class Principal2 {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setLimite(50.0);
        cc.depositar(100.0);
        cc.depositar(150.0);
        cc.sacar(50.0);
        System.out.println(cc.saldoCC());

        ContaPoupanca cp = new ContaPoupanca();

        cp.depositar(200.0);
        cp.sacar(100.0);
        cp.depositar(20.0);
        System.out.println(cp.saldoCP());
        cp.sacarCP(20.0);
        System.out.println(cp.saldoCP());

        ContaCorrente cc2 = new ContaCorrente();

        cc2.setLimite(30.0);
        cc2.depositar(150.0);
        cc2.depositar(60.0);
        cc2.sacar(40.0);
        System.out.println(cc2.saldoCC());
        cc2.sacarCC(250.0);;


    }
}
