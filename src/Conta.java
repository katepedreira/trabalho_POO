import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {

    private String numero;
    private Cliente cliente;

    public Collection<Credito> listaCredito = new ArrayList<Credito>();

    public Collection<Debito> listaDebito = new ArrayList<Debito>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addCredito(Credito credito) {
        this.listaCredito.add(credito);

    }

    public void addDebito(Debito debito) {
        this.listaDebito.add(debito);

    }

    public void depositar(Double valor) {
        Credito credito = new Credito(this);
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        Debito debito = new Debito(this);
        debito.setValor(valor);
        this.addDebito(debito);
    }


}
