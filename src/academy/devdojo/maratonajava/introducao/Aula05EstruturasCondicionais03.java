package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000.00;
        String mensagem = "Eu vou doar 500 pro Dev";
        String mensagemSeNao = "Ainda não tenho condições";
        String resultado = salario > 5000 ? mensagem : mensagemSeNao;

        System.out.println(resultado);

    }
}
