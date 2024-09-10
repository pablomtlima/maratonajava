package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int resultado = number1 + number2;

        System.out.println("valor" + number1 + number2);
        System.out.println(resultado);

        double resultado2 = number1 / number2;
        System.out.println(resultado2);

        int resto = 21 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        int age = 45;
        float salary = 3500F;
        boolean isDentroDaLei = age > 30 && salary > 3400;
        System.out.println(isDentroDaLei);

        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;

        System.out.println(bonus);

        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        ++contador;
        System.out.println(contador);
        --contador;
        System.out.println(contador);
        System.out.println(++contador);

    }
}
