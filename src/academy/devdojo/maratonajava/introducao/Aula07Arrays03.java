package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 72, 32, 34, 14512, 43, 21, 3};
        String[] nomes = {"pablo", "sofia"};

//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);
//        }

        for (String i : nomes) {
            System.out.println(i.length());
        }

    }
}
