package classes_encapsulamento_java.funcoes_carro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var carro = new Carro();

        while (true) {

            System.out.println("=== Sistema de direção ===");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Ligar Carro");
            System.out.println("2. Desligar Carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir Velocidade");
            System.out.println("5. Virar");
            System.out.println("6. Verificar Velocidade");
            System.out.println("7. Mudar Marcha");
            System.out.println("8. Sair");

            var opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Ligando carro... \n");
                    carro.ligarMotor();
                }
                case 2 -> carro.desligarMotor();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> {
                    System.out.print("Digite a direção para virar (e para esquerda/d para direita): ");
                    String direcao = scanner.next();
                    if (direcao.equals("e")) {
                        direcao = "esquerda";
                    } else if (direcao.equals("d")) {
                        direcao = "direita";
                    }
                    carro.virar(direcao);
                }
                case 6 -> {
                    System.out.print("Digite a nova marcha: ");
                    int novaMarcha = scanner.nextInt();
                    carro.mudarMarcha(novaMarcha);
                }
                case 7 -> {
                    System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
                }
                case 8 -> {
                    System.out.println("Encerrando...");    
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

}
