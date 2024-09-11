package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        float salary = 60000F;

        if (salary > 0 && salary <= 34712) {
            double taxes = 9.7;
            double total = salary * (taxes / 100);
            System.out.println("Imposto a pagar: " + total);
        } else if (salary > 34712 && salary <= 68507) {
            double taxes = 37.35;
            double total = salary * (taxes / 100);
            System.out.println("Imposto a pagar: " + total);

        } else if (salary > 68507) {
            double taxes = 49.50;
            double total = salary * (taxes / 100);
            System.out.println("Imposto a pagar: " + total);
        }
    }
}
