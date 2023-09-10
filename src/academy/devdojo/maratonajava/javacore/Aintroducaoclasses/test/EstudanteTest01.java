package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.age = 26;
        estudante.sex = 'M';
        estudante.name = "Pedro";

        System.out.println(" ");
        System.out.println(estudante.name);
        System.out.println(" ");
        System.out.println(estudante2.sex);
    }
}
