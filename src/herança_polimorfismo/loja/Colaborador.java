package herança_polimorfismo.loja;

public sealed class Colaborador permits Gerente, Vendedor, Atendente {

    protected String nome;
    protected String email;
    protected String senha;
    protected final boolean administrador;

    public Colaborador(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean ehAdministrador() {
        return administrador;
    }
    public String realizarLogin(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            return "Login realizado com sucesso.";
        } else {
            return "Falha no login. Email ou senha incorretos.";
        }
    }
    public String realizarLogoff() {
        return "Logoff realizado com sucesso.";
    }
    public String alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        return "Dados alterados com sucesso.";     
    }
    public String alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        return "Senha alterada com sucesso.";
    }
    

}
