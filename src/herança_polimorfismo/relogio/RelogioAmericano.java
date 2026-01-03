package herança_polimorfismo.relogio;

public final class RelogioAmericano extends Relogio {

    
    private String periodo = "AM";

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
                
    }

    
    @Override
    public void setHora(int hora) {
        if (hora < 0 || hora > 12) {
            throw new IllegalArgumentException("Relógio Americano aceita apenas horas entre 0 e 12.");
        }
        super.setHora(hora);
    }

    @Override
    public void ajustarHorario(Relogio outroRelogio) {
        
        int hora24 = outroRelogio.getHora();
        
        
        if (hora24 >= 12) {
            this.periodo = "PM";
        } else {
            this.periodo = "AM";
        }
    
        int hora12 = hora24 % 12;
                
        if (hora12 == 0) {
            hora12 = 12;
        }

        
        this.setHora(hora12);
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

    @Override
    public String getHoraFormatada() {
        
        
        return "%02d:%02d:%02d %s".formatted(getHora(), getMinuto(), getSegundo(), periodo);
    }
}