package estruturas_controle;

import java.util.Scanner;

public class ValidadorMultiplos {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Digite o número inicial (divisor):");
        var numeroInicial = scanner.nextInt();

        int numeroAtual;

        do {
            System.out.println("Digite um número (maior ou igual a " + numeroInicial + "):");
            numeroAtual = scanner.nextInt();

            while (numeroAtual < numeroInicial) {
                System.out.println("Número ignorado. Digite um valor válido (>= " + numeroInicial + "):");
                numeroAtual = scanner.nextInt();
            }

            if (numeroAtual % numeroInicial == 0) {
                System.out.println("O número " + numeroAtual + " é múltiplo. Continue...");
            } else {
                System.out.println("Resto diferente de zero! Encerrando execução...");
            }

        } while (numeroAtual % numeroInicial == 0);

        scanner.close();
    }
}