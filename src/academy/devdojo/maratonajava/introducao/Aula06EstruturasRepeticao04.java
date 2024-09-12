package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao04 {
    public static void main(String[] args) {
        int count = 100;

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
