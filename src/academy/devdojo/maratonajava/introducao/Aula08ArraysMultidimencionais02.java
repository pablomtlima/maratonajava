package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{}, {1, 1, 2, 3,}, {1, 4, 241, 1, 414, 12, 421, 4, 21}};
        System.out.println(arrayInt[2].length);

        for (int[] arrayBs : arrayInt) {
            System.out.println("\n  b ------");
            for (int num : arrayBs) {

                System.out.print(num);
            }
        }

    }
}
