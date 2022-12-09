import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa {

    private Double salario;

    private ArrayList<Cargo> listaCargos = new ArrayList<>();



    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean autenticar() {
        return true;
    }

    public void addCargo(Cargo cargo) {
        this.listaCargos.add(cargo);
    }


}
