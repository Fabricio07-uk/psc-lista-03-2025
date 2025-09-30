import java.util.Scanner;

public class MaquinaVendaAutomatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        // Lê o valor pago
        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        // Verifica se o valor pago é suficiente
        if (valorPago < valorCompra) {
            System.out.println("Quantia insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            // Notas disponíveis
            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            int restante = troco;

            // Calcula o número de notas
            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = restante / notas[i];
                restante = restante % notas[i];
            }

            // Mostra a quantidade de cada nota
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Notas de R$ " + notas[i] + ",00: " + quantidadeNotas[i]);
            }
        }

        scanner.close();
    }
}
