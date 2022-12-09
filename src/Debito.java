public class Debito {

    private Double valor;

    private Conta conta;

    public Debito(Conta conta) {
        this.conta = conta;

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
