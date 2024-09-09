package academy.devdojo.maratonajava.introducao;
// isso é um comentario
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int[][] arrayInt = new int[4][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = array;
        arrayInt[3] = new int[]{1, 2, 3, 5, 6};

        int[][] arrayInt2 = {{0,2}, {9,7,6}, {21,3,4,1}};

        for (int[] baseArr : arrayInt2) {
            System.out.println("\n------");
            for (int num : baseArr) {
                System.out.println(num + "");
            }
        }
    }
}
