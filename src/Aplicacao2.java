public class Aplicacao2 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Maria");
        c1.setCpf("15679529");
        c1.setTelefone("3240018001");

        Endereco e1 = new Endereco();
        e1.setLogradouro("Rua B");
        e1.setNumero("400");
        e1.setComplemento("Apto 201");
        e1.setCidade("Juiz de Fora");
        e1.setUf("MG");
        e1.setCep("36055678");
        e1.setCliente(c1);

        Endereco e2 = new Endereco();
        e2.setLogradouro("Rua C");
        e2.setNumero("500");
        e2.setComplemento("Apto 301");
        e2.setCidade("Rio de Janeiro");
        e2.setUf("RJ");
        e2.setCep("37078890");
        e2.setCliente(c1);

        Endereco e3 = new Endereco();
        e3.setLogradouro("Rua D");
        e3.setNumero("600");
        e3.setComplemento("Apto 401");
        e3.setCidade("São Paulo");
        e3.setUf("SP");
        e3.setCep("34056235");
        e3.setCliente(c1);

        c1.addEndereco(e1);
        c1.addEndereco(e2);
        c1.addEndereco(e3);

        c1.listarEnderecos();



    }




}
