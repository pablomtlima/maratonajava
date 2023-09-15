package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    public String nome;
    public static int[] episodios;

    static {
        System.out.println("Bloco de inicialização 1");
        episodios = new int[10];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco de inicialização 2");
    }

    {
        System.out.println("Bloco de inicialização não estatico");
    }

    static {
        System.out.println("Bloco de inicialização 3");
    }



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
