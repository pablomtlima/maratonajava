package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
