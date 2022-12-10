import java.util.ArrayList;

public class Cargo {

    private String nome;

    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.getListaFuncionarios().add(funcionario);

    }


    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
}
