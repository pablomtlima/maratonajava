package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    public static void main(String[] args) {
        int maxValue = 50;


        for (int i = 0; i <= 1000000; i++) {
            if (i == 25) break;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
