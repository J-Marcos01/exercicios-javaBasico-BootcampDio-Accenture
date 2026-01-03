package herança_polimorfismo.cinema;

public class CinemaMain {
    public static void main(String[] args) {
        System.out.println(">>> Sistema de Cinema Iniciado <<<");

        
        var ingressoComum = IngressoFactory.criar(TipoIngresso.NORMAL, "Avengers", 40.0, true);
        var ingressoMeia = IngressoFactory.criar(TipoIngresso.MEIA, "Avengers", 40.0, true);
        var ingressoFamilia = IngressoFactory.criar(TipoIngresso.FAMILIA, "Avengers", 40.0, false, 4);

        
        ImpressoraDeIngresso.imprimirDetalhes(ingressoComum);
        ImpressoraDeIngresso.imprimirDetalhes(ingressoMeia);
        ImpressoraDeIngresso.imprimirDetalhes(ingressoFamilia);
    }
}