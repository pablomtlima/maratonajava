package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("\n----------------------");

        System.out.println(estudante);

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
