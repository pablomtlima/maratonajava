package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudanteId01 = new Estudante();
        Estudante estudanteId02 = new Estudante();

        estudanteId01.sex = 'F';
        estudanteId01.name = "Samara";
        estudanteId01.age = 19;

        estudanteId02.sex = 'F';
        estudanteId02.name = "Fabiana";
        estudanteId02.age = 21;

        estudanteId01.imprime();
        estudanteId02.imprime();


    }
}
