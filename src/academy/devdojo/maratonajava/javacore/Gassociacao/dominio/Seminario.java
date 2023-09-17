package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String title;
    private Local local;

    private Aluno[] alunos;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Aluno[] alunos) {
        this.title = title;
        this.alunos = alunos;
    }

    public Seminario(String title, Local local, Aluno[] alunos) {
        this.title = title;
        this.local = local;
        this.alunos = alunos;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}
