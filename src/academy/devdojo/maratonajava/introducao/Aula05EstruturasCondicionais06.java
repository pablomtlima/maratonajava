package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 2;
        String diaUtil = "dia util";
        String finalDeSemana = "Final de semana";

        switch (dia) {
            case 1:
                System.out.println(finalDeSemana);
                break;
            case 2:
                System.out.println(diaUtil);
                break;
            case 3:
                System.out.println(diaUtil);
                break;
            case 4:
                System.out.println(diaUtil);
                break;
            case 5:
                System.out.println(diaUtil);
                break;
            case 6:
                System.out.println(diaUtil);
                break;
            case 7:
                System.out.println(finalDeSemana);
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }
}
