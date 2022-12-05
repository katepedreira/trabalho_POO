import java.util.ArrayList;
import java.util.Collection;
public class Cliente extends Pessoa {

    private boolean vip;

    private Collection<Endereco> listaEnderecos = new ArrayList<>();

    private Collection<Conta> listaContas = new ArrayList<>();

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean autenticar() {
        return true;
    }

    public void addEndereco(Endereco endereco) {
        this.listaEnderecos.add(endereco);
    }

    public void addConta(Conta conta) {
        this.listaContas.add(conta);
    }

}
