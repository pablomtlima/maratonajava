package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int age = 22;
        boolean autorization = age <= 18;

        if (!autorization) {
            System.out.println("pode vender bebida alcolica");
        } else {
            System.out.println("não pode vender bebida ");
        }

        int option = 2;
        if (1 == 1) {
            System.out.println(option);
        } else if (option == 2) {
            System.out.println(option + " 2");

        } else if (option == 3) {
            System.out.println(option);
        }


    }
}
