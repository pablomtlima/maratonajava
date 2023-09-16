package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Pelé");
        jogador01.imprime();

        Time time = new Time("Seleção Brasileira");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}
