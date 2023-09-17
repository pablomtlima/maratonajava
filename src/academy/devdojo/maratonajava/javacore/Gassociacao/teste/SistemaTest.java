package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class SistemaTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pablo", 26);
        Aluno aluno2 = new Aluno("Pedro", 21);
        Professor professor = new Professor("Girafales", "Matematica");
        Local local = new Local("Rua xyz");

        Aluno[] alunos = {aluno1, aluno2};

        Seminario seminario1 = new Seminario("Como ficar rico", local, alunos);
        Seminario seminario2 = new Seminario("Como ficar pobre", local, alunos);

        Seminario[] seminarios = {seminario1, seminario2};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
