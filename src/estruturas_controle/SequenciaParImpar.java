package estruturas_controle;

import java.util.Scanner;

public class SequenciaParImpar {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        var PrimeiroNumero = scanner.nextInt();

        var SegundoNumero = 0;
        System.out.println("Digite outro número inteiro maior que o primeiro:");
        while (true) {
            var temp = scanner.nextInt();
            if (temp > PrimeiroNumero) {
                SegundoNumero = temp;
                break;
            } else {
                System.out.println("Número inválido. Digite um número maior que " + PrimeiroNumero + ":");
            }
        }

        System.out.println("Digite P para ver a sequência de números pares ou I para ímpares:");
        var escolha = scanner.next().toUpperCase();

        switch (escolha) {
            case "P" -> {
                System.out.printf("Sequência de números pares entre %d e %d:%n", PrimeiroNumero, SegundoNumero);
                for (var i = PrimeiroNumero; i <= SegundoNumero; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
            case "I" -> {
                System.out.printf("Sequência de números ímpares entre %d e %d:%n", PrimeiroNumero, SegundoNumero);
                for (var i = PrimeiroNumero; i <= SegundoNumero; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }
        scanner.close();
    }
}
