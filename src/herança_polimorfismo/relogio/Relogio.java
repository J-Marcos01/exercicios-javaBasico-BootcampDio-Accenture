package herança_polimorfismo.relogio;


public abstract sealed class Relogio permits RelogioAmericano, RelogioBrasileiro {

    
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    
    public int getHora() { return hora; }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: deve estar entre 0 e 23.");
        }
        this.hora = hora;
    }

    public int getMinuto() { return minuto; }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: deve estar entre 0 e 59.");
        }
        this.minuto = minuto;
    }

    public int getSegundo() { return segundo; }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido: deve estar entre 0 e 59.");
        }
        this.segundo = segundo;
    }

    
    public String getHoraFormatada() {
        return "%02d:%02d:%02d".formatted(hora, minuto, segundo);
    }

    public abstract void ajustarHorario(Relogio outroRelogio);
}