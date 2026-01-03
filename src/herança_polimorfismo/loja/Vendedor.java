package herança_polimorfismo.loja;

/*
Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas 
e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;

A classe Vendedor deve ter os métodos Realizar venda 
( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login,
  Realizar logoff, alterar dados, alterar senha;
*/
public final class Vendedor extends Colaborador {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    public String realizarVenda() {
        quantidadeVendas++;
        return "Venda realizada. Total de vendas: " + quantidadeVendas;
    }
    public String consultarVendas() {
        return "Consultando vendas... Total de vendas: " + quantidadeVendas;
    }
    
}
