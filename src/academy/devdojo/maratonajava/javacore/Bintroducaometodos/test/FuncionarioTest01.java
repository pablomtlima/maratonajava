package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Pedro");
        funcionario01.setIdade(36);
        funcionario01.setSalarios(new double[]{1250.89, 1200, 2000});
        funcionario01.imprime();

        System.out.println("Média " + funcionario01.getMedia());
    }

}
