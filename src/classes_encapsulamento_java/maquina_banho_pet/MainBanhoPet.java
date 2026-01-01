package classes_encapsulamento_java.maquina_banho_pet;

import java.util.Scanner;

public class MainBanhoPet {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var maquina = new MaquinaBanho();

        while (true) {

            System.out.println("\n--- Máquina de Banho para Pets ---");
            System.out.println("1. Colocar Pet na Máquina");
            System.out.println("2. Retirar Pet da Máquina");
            System.out.println("3. Dar Banho no Pet");
            System.out.println("4. Limpar Máquina");
            System.out.println("5. Verificar nível de água");
            System.out.println("6. Verificar nível de shampoo");
            System.out.println("7. Reabastecer Shampoo");
            System.out.println("8. Reabastecer Água");
            System.out.println("9. Verificar Status da Máquina");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do pet: ");
                    String nomePet = scanner.nextLine();
                    var pet1 = new Pet(nomePet);
                    maquina.colocarPet(pet1);
                }
                case 2 -> maquina.retirarPet();
                case 3 -> maquina.darBanho();
                case 4 -> maquina.limparMaquina();
                case 5 -> System.out.println("Nível de água: " + maquina.getNivelAgua());
                case 6 -> System.out.println("Nível de shampoo: " + maquina.getNivelShampoo());
                case 7 -> maquina.abastecerShampoo();
                case 8 -> maquina.abastecerAgua();
                case 9 ->{
                    var ocupada = maquina.temPetNoBanho();
                    System.out.println("Tem pet na máquina? " + (ocupada ? "Sim" : "Não"));    
                }
                case 10 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        }

    }

}
