package estruturas_controle;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg):");
        var peso = scanner.nextDouble();
        System.out.println("Digite sua altura (m):");
        var altura = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC é %.2f e você está abaixo do peso.%n", imc);
        } else if (imc < 25) {
            System.out.printf("Seu IMC é %.2f e você está com o peso ideal.%n", imc);
        } else if (imc < 30) {
            System.out.printf("Seu IMC é %.2f e você está levemente acima do peso.%n", imc);
        } else if (imc < 35) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau I.%n", imc);
        } else if (imc < 40) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau II.%n", imc);
        } else {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau III.%n", imc);
        }
        scanner.close();
    }

}
