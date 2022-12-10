public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double totalCreditosCP() {
        Double total = 0.0;
        for (Credito c : this.listaCredito) {
            total += c.getValor();
        }
        return total;
    }

    public Double totalDebitosCP() {
        Double total = 0.0;
        for (Debito d : this.listaDebito) {
            total += d.getValor();
        }
        return total;
    }

    public Double saldoCP() {
        return (this.totalCreditosCP() - this.totalDebitosCP());
    }

    public void sacarCP(Double valor) {
        if (saldoCP() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            super.sacar(valor);
        }
    }



}
