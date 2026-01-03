package herança_polimorfismo.loja;

/*
Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele
é administrador, esse último deve ser sempre verdadeiro;

A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas,
 Realizar login, Realizar logff, alterar dados, alterar senha;

 */
public final class Gerente extends Colaborador {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String gerarRelatorioFinanceiro() {
       return "Gerando relatório financeiro...";
    }
    public String consultarVendas() {
       return "Consultando vendas...";
    }
    
}
