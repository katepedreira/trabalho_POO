public class Credito {

    private Double valor;

    private Conta conta;

    public Credito(Conta conta) {
        this.conta = conta;

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
