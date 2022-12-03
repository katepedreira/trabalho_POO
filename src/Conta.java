public abstract class Conta {

    private String numero;
    private Debito debito;
    private Credito credito;


    public Conta() {
        this.setDebito(new Debito());
        this.setCredito(new Credito());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Debito getDebito() {
        return debito;
    }

    public void setDebito(Debito debito) {
        this.debito = debito;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}
