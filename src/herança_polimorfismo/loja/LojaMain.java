package herança_polimorfismo.loja;

import java.util.List;

public class LojaMain {
    public static void main(String[] args) {
        
        var gerente = ColaboradorFactory.criar(TipoColaborador.GERENTE, "Alice", "alice@loja.com", "123");
        var vendedor = ColaboradorFactory.criar(TipoColaborador.VENDEDOR, "Bob", "bob@loja.com", "123");
        var atendente = ColaboradorFactory.criar(TipoColaborador.ATENDENTE, "Carol", "carol@loja.com", "123");

        
        var equipe = List.of(gerente, vendedor, atendente);

        System.out.println("--- Sistema Iniciado ---");

        
        equipe.forEach(colaborador -> {
            System.out.println("\nColaborador: " + colaborador.getNome() + " [" + colaborador.getClass().getSimpleName() + "]");
            colaborador.realizarLogin(colaborador.getEmail(), colaborador.getSenha());
            
            
            if (colaborador instanceof Vendedor v) {
                v.realizarVenda();
                v.consultarVendas();
            } else if (colaborador instanceof Atendente a) {
                a.receberPagamento(100.0);
                a.fecharCaixa();
            } else if (colaborador instanceof Gerente g) {
                g.gerarRelatorioFinanceiro();
            }
        });
    }
}