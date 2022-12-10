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



}
