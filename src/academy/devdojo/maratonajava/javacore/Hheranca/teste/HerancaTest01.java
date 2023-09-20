package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01  {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("714542");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pablo");
        pessoa.setCpf("012521163");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Chines maluco");
        funcionario.setCpf("0787985612");
        funcionario.setSalario(7000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();

    }
}
