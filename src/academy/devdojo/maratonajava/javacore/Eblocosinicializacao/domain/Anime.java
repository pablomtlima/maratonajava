package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    public String nome;
    public int[] episodios;
//    1 - Alocado um espaço de memória para o objeto
//    2 - Cada atributo de classe é criado e inicializado com valores default ou o valor que for passdo
//    3 - Bloco de inicialização é executado
//    4 - Construtor é executado

    {
        System.out.println("Bloco de inicialização ");
        episodios = new int[10];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + ", ");
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
