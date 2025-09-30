import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Determina o menor e o maior número
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Gera número aleatório entre menor e maior (inclusive)
        int numeroSorteado = ThreadLocalRandom.current().nextInt(menor, maior + 1);

        // Verifica se é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " (par)");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " (ímpar)");
        }

        scanner.close();
    }
}
