public class Aplicacao1 {

    public static void main(String[] args) {

        Cargo gerente = new Cargo();
        gerente.setNome("Gerente");

        Cargo atendente = new Cargo();
        atendente.setNome("Atendente");

        Funcionario f1 = new Funcionario(gerente);

        Funcionario f2 = new Funcionario(atendente);

        gerente.addFuncionario(f1);

        atendente.addFuncionario(f2);

    }


}
