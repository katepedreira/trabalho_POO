public class ContaCorrente extends Conta {

    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }


    public Double totalCreditosCC() {
        Double total = 0.0;
        for (Credito c : this.listaCredito) {
            total += c.getValor();
        }
        return total;
    }

    public Double totalDebitosCC() {
        Double total = 0.0;
        for (Debito d : this.listaDebito) {
            total += d.getValor();
        }
        return total;
    }

    public Double saldoCC() {
        return (this.totalCreditosCC() - this.totalDebitosCC() + this.limite);
    }

    public void sacar(Double valor) {
        if (saldoCC() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            super.sacar(valor);
        }
    }

    public void transferir(ContaCorrente contaCorrente , Double valor) {
        if (this.saldoCC() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.sacar(valor);
            contaCorrente.depositar(valor);
        }
    }


}
