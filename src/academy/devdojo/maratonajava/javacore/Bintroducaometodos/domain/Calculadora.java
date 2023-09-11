package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 != 0 || num2 != 0) {
            return (int) num1 / num2;

        } else {
            return 0;
        }
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("possui zeros na equação");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }
}
