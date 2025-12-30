package fundamentos_java;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main (String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado:");
        
        var lado = scanner.nextDouble();

        var area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f %n", area);

        
    }
}