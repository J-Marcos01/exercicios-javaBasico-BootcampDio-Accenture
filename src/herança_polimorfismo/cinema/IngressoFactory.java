package herança_polimorfismo.cinema;

public class IngressoFactory {
    public static Ingresso criar(TipoIngresso tipo,
                                String nomeFilme, 
                                double valor, 
                                boolean dublado, 
                                int... numeroPessoas) {
        return switch (tipo) {
            case NORMAL -> new Ingresso(valor, nomeFilme, dublado);
            case MEIA -> new MeiaEntrada(valor, nomeFilme, dublado);
            case FAMILIA -> {int pessoas = (numeroPessoas.length > 0) ? numeroPessoas[0] : 1;
                yield new IngressoFamilia(valor, nomeFilme, dublado, pessoas);
           }  };
    }   
}
