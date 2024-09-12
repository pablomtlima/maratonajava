package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        // somente objs de referencia podem ser inicializados com null
        int[] ages = new int[3];

        ages[0] = 20;
        ages[1] = 21;
        ages[2] = 22;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
