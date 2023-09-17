package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01    {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite seu nome abaixo");
//        String name = input.nextLine();
//        System.out.println("Digite sua idade");
//        int age = input.nextInt();
//        System.out.println("Digite M ou F para seu sexo");
//        char sex = input.next().charAt(0);
//
//        System.out.println("----------------");
//        System.out.println("Nome: "+name);
//        System.out.println("Idade: "+ age);
//        System.out.println("Sexo: "+ sex);

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra ");
        String word = input.next();
        System.out.println("Digite a posição da letra que deseja visualizar");
        int position = input.nextInt();
        System.out.println(word.charAt(position));
    }
}
