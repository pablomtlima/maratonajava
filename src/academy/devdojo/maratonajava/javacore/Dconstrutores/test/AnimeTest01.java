package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Kurto","TV", 15, "Ação");
        Anime anime02 = new Anime();

        anime01.imprime();
        anime02.imprime();
    }
}
