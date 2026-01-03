package herança_polimorfismo.cinema;

public class ImpressoraDeIngresso {
    public static void imprimirDetalhes(Ingresso ingresso) {
        System.out.printf("Filme: %s (%s)%n", 
            ingresso.getNomeFilme(), 
            ingresso.isDublado() ? "Dublado" : "Legendado");

       if (ingresso instanceof IngressoFamilia f) {
            System.out.println("Tipo: Pacote Família (" + f.getNumeroPessoas() + " pessoas)");
            System.out.println("Nota: Ingresso família é instância de Ingresso? Sim.");
        } 
        else if (ingresso instanceof MeiaEntrada m) {
            System.out.println("Tipo: Meia Entrada");
            System.out.println("Nota: Meia entrada é instância de Ingresso? Sim.");
        } 
        else {
            System.out.println("Tipo: Inteira");
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", ingresso.valorReal());
        System.out.println("--------------------------------");
    }
}
