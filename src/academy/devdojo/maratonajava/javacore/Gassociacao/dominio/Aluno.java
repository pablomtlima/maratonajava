package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String name;
    private int age;

    private Seminario seminario;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void imprime () {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
