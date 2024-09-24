package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula08ArraysMultidimencionais01Ex {
    public static void main(String[] args) {

        //  Exercício 1: Criação de uma Matriz
        //  Crie um programa que inicialize uma matriz 3x3 de inteiros. Em seguida, preencha essa matriz com números de 1 a 9 e imprima o conteúdo da matriz no formato:
        //  1 2 3
        //  4 5 6
        //  7 8 9

        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

//        for (int i = 0; i < matriz.length; i++) {
//            System.out.println(matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2]);
//        }


        //    Exercício 2: Soma de Elementos de uma Matriz
        //    Crie um programa que receba uma matriz 3x3 de números inteiros digitados pelo usuário. O programa deve calcular e exibir a soma de todos os elementos da matriz.

        Scanner scanner = new Scanner(System.in);
        int[][] matrizUser = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matrizUser.length; i++) {
            System.out.println("Digite outro número");
            matrizUser[i][0] = scanner.nextInt();
            System.out.println("Digite outro número");
            matrizUser[i][1] = scanner.nextInt();
            System.out.println("Digite outro número");
            matrizUser[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < matrizUser.length; i++) {
            System.out.println(matrizUser[i][0] + " " + matrizUser[i][1] + " " + matrizUser[i][2]);

            for (int j = 0; j < 3; j++) {
                soma += matrizUser[i][j];
            }
        }
        System.out.println(soma);


    }
}
