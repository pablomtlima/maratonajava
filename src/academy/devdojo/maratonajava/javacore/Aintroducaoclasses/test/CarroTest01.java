package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2015;
        carro1.novo = true;
        carro1.modelo = "City";
        carro1.tipo = "sedan";

        carro2.ano = 2020;
        carro2.novo = true;
        carro2.modelo = "Mustang";
        carro2.tipo = "sedan";

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
        System.out.println(carro1.tipo);
        System.out.println(carro1.novo);

        System.out.println("\nCarro 2");
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
        System.out.println(carro2.tipo);
        System.out.println(carro2.novo);

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
