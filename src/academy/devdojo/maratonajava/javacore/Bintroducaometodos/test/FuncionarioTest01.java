package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Pedro";
        funcionario01.idade = 36;
//        funcionario01.salarios = new double[]{1250.89, 1200, 2000};

        funcionario01.imprime();
        funcionario01.mediaSalarios(funcionario01.salarios);
    }

}
