package herança_polimorfismo.cinema;

public final class MeiaEntrada extends Ingresso {
    
    public MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    public double valorReal() {
        return this.valor / 2;
    }

}
