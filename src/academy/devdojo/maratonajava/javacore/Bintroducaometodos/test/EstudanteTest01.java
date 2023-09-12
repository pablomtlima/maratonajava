package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.name = "Midorya";
        estudante01.age = 15;
        estudante01.sex = 'F';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.sex = 'F';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println(estudante01.name);
        System.out.println(estudante02.name);


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
