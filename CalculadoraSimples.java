import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Lê o símbolo da operação
        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        // Verifica o operador e realiza a operação
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Erro: Símbolo da operação inválido.");
                break;
        }

        scanner.close();
    }
}
