package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    public String nome;
    public int[] episodios;

    public Anime() {
        episodios= new int[100];

        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;


        }
        for (int episodio : this.episodios) {
            System.out.print(episodio + ", ");
        }
    }
}
