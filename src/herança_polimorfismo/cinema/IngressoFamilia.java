package herança_polimorfismo.cinema;

public final class IngressoFamilia extends Ingresso {
    
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
    
    @Override
    public double valorReal() {
        double valorTotal = this.valor * this.numeroPessoas;
        if (this.numeroPessoas > 3) {
            valorTotal *= 0.95; 
        }
        return valorTotal;
    }
}
