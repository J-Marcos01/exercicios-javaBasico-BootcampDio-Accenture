package fundamentos_java;

import java.util.Scanner;

public class SaudacaoUsuario {  
    public static void main(String[] args) {
    
        var scanner= new Scanner(System.in);
        
        var nomeUsuario= scanner.nextLine();
        var idadeUsuario= scanner.nextInt();

        System.out.printf("Olá %s , Você tem %d anos %n",nomeUsuario,idadeUsuario);

        scanner.close();
    }
    
}
