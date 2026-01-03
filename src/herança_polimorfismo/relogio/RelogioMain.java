package herança_polimorfismo.relogio;

public class RelogioMain {
    
    public static void main(String[] args) {
        
        var relogioBrasileiro = new RelogioBrasileiro(21, 30, 45);
        var relogioAmericano = new RelogioAmericano(5, 30, 45);

        System.out.println("Relógio Brasileiro: " + relogioBrasileiro.getHoraFormatada());
        System.out.println("Relógio Americano: " + relogioAmericano.getHoraFormatada());

        System.out.println("--- Sincronizando ---");
        
        
        relogioAmericano.ajustarHorario(relogioBrasileiro);
        
        System.out.println("Relógio Americano após ajuste (Esperado 02:30:45): " + relogioAmericano.getHoraFormatada());

        
        try {
            relogioAmericano.setHora(20); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado capturado: " + e.getMessage());
        }
    }
}