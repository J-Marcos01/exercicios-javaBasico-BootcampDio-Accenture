package fundamentos_java;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite a idade de duas pessoas:");
        var idadeUsuario1 = scanner.nextInt();
        var idadeUsuario2 = scanner.nextInt();

        var diferencaIdade = Math.abs(idadeUsuario1 - idadeUsuario2);

        System.out.printf("A diferença de idade entre elas é: %d anos %n", diferencaIdade);

        scanner.close();
    }
}
