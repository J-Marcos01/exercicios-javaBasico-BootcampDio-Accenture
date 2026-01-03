package herança_polimorfismo.loja;

public class ColaboradorFactory {
    public static Colaborador criar(TipoColaborador tipo, 
                                               String nome, 
                                               String email, 
                                               String senha) {
        switch (tipo) {
            case GERENTE:
                return new Gerente(nome, email, senha);
            case VENDEDOR:
                return new Vendedor(nome, email, senha,0);
            case ATENDENTE:
                return new Atendente(nome, email, senha,0.0);
            default:
                throw new IllegalArgumentException("Tipo de colaborador inválido");
        }
    }
}
