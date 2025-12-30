package fundamentos_java;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base e da altura do retângulo:");
        var base = scanner.nextDouble();
        var altura = scanner.nextDouble();
        var area = base * altura;

        System.out.printf("A área do retângulo é: %.2f %n", area);

        scanner.close();
    }

}
