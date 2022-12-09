import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

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


    public void listarEnderecos() {
        for (Endereco e: this.listaEnderecos) {
        System.out.println("CEP do cliente "+ this.getNome() + ": " + e.getCep());
        System.out.println("Logradouro do cliente "+ this.getNome() + ": " + e.getLogradouro());
        System.out.println("Numero do cliente "+ this.getNome() + ": " + e.getNumero());
        System.out.println("Complemento do cliente "+ this.getNome() + ": " + e.getComplemento());
        System.out.println("Cidade do cliente "+ this.getNome() + ": " + e.getCidade());
        System.out.println("UF do cliente "+ this.getNome() + ": " + e.getUf());
        System.out.println("-----------------------------------------------------------------");
    }



    }





}
