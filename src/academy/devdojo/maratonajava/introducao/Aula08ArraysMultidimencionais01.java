package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        String[][] comidas = new String[3][3];

        comidas[0][0] = "banana";
        comidas[0][1] = "abacaxi";
        comidas[0][2] = "pera";

        comidas[1][0] = "batata";
        comidas[1][1] = "cenoura";
        comidas[1][2] = "xuxu";

        comidas[2][0] = "frango";
        comidas[2][1] = "peixe";
        comidas[2][2] = "carne";

        for (String[] comida : comidas) {

            for (int i = 0; i < comida.length; i++) {
                System.out.print(comida[i] + " ");
            }
            System.out.println("");
        }


    }
}
