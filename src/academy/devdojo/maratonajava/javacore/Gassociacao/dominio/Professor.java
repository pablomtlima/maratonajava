package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String specialty;

    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String specialty) {
        this.nome = nome;
        this.specialty = specialty;
    }

    public Professor(String nome, String specialty, Seminario[] seminarios) {
        this.nome = nome;
        this.specialty = specialty;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------------");
        System.out.println("Professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println("Seminario: " + seminario.getTitle());
            System.out.println(seminario.getLocal().getAddress());
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName() + " " + aluno.getAge() + " anos.");
            }

        System.out.println("------------");
        }


    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
