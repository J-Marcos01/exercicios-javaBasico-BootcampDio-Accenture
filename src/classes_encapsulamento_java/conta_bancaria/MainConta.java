package classes_encapsulamento_java.conta_bancaria;

import java.util.ArrayList; 
import java.util.Scanner;

public class MainConta {

    private static ArrayList<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("=== Sistema Bancário ===");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Consultar limite cheque especial");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("6. Pagar Boleto");
            System.out.println("7. Sair");
            

            var opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor do depósito inicial: ");
                    var deposito = scanner.nextDouble();
                    var novaConta = new ContaBancaria(deposito);
                    contas.add(novaConta); 
                    System.out.printf("Conta criada! Número: %d | Saldo: %.2f%n",
                            novaConta.getNumeroConta(), novaConta.getSaldo());
                }

                case 2 -> {
                    var conta = buscarConta(scanner); 
                    if (conta != null) {
                        System.out.printf("Conta: %d | Saldo: R$ %.2f%n", conta.getNumeroConta(), conta.getSaldo());
                    }
                }
                case 3 -> {
                    var conta = buscarConta(scanner);
                    if (conta != null) {
                        System.out.printf("Limite Cheque Especial: R$ %.2f%n", conta.getLimiteChequeEspecial());
                    }
                }
                case 4 -> {
                    var conta = buscarConta(scanner);
                    if (conta != null) {
                        System.out.print("Valor do depósito: ");
                        conta.depositar(scanner.nextDouble());
                        System.out.println("Depósito realizado!");
                    }
                }
                case 5 -> {
                    var conta = buscarConta(scanner);
                    if (conta != null) {
                        System.out.print("Valor do saque: ");
                        var valor = scanner.nextDouble();
                        if (conta.sacar(valor)) {
                            System.out.println("Saque realizado.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                }
                case 6 -> {
                    var conta = buscarConta(scanner);
                    if (conta != null) {
                        System.out.print("Digite o valor do boleto: ");
                        var valor = scanner.nextDouble();
                        conta.pagarBoleto(valor);
                    }
                }
                case 7 -> {
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static ContaBancaria buscarConta(Scanner scanner) {
        
        System.out.print("Digite o número da conta: ");
        int numeroBusca = scanner.nextInt();

        for (ContaBancaria c : contas) {
            if (c.getNumeroConta() == numeroBusca) {
                return c;
            }
        }

        System.out.println("Conta não encontrada!");
        return null;
    }
}