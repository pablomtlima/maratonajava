package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.age = 35;
        professor.sex = 'F';
        professor.name = "Fernanda";

        System.out.println("Nome: " + professor.name + " Idade: " + professor.age + " do sexo: " + professor.sex);
    }
}
