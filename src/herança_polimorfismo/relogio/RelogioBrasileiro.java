package herança_polimorfismo.relogio;

public final class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }
    
    

    @Override
    public void ajustarHorario(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }
}