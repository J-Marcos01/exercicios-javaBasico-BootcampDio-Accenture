package estruturas_controle;

import java.util.Scanner;

public record Tabuada() {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        var numero = scanner.nextInt();

        for (var i = 1; i <= 10; i++) {
            var resultado = numero * i;
            System.out.printf("%d x %d = %d %n", numero, i, resultado);
        }

        scanner.close();

    }
}
