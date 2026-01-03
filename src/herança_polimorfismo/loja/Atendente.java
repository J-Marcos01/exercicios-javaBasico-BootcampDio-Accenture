package herança_polimorfismo.loja;

/*
Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa 
e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.

A classe Atendente deve ter os métodos Receber pagamentos 
(onde o método recebe um valor que deve ser incrementado no valor em caixa), 
Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;

 */
public final class Atendente extends Colaborador {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido: R$ " + valor + ". Valor em caixa agora: R$ " + valorEmCaixa);
    }
    public void fecharCaixa() {
        System.out.println("Fechando caixa. Valor total em caixa: R$ " + valorEmCaixa);
        valorEmCaixa = 0;
    }
}
