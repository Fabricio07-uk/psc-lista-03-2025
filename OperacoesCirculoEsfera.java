import java.util.Scanner;

public class OperacoesCirculoEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        // Lê o código da operação
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = scanner.nextInt();

        // Lê o raio
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Realiza a operação de acordo com o código
        switch (operacao) {
            case 1: // Perímetro do círculo
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2: // Área do círculo
                double area = PI * raio * raio;
                System.out.println("Área do círculo: " + area);
                break;
            case 3: // Volume da esfera
                double volume = (4.0 / 3.0) * PI * raio * raio * raio;
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Erro: Código da operação inválido.");
                break;
        }

        scanner.close();
    }
}
