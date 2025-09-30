import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Caso a e b sejam zero e c diferente de zero
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        // Caso seja equação de primeiro grau
        else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz da equação: " + raiz);
        }
        // Caso seja equação de segundo grau
        else if (a != 0) {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + raiz);
            } else { // delta > 0
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        // Caso todos os coeficientes sejam zero
        else if (a == 0 && b == 0 && c == 0) {
            System.out.println("Equação indefinida, todos os coeficientes são zero.");
        }

        scanner.close();
    }
}
