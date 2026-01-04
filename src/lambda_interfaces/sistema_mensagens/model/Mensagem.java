package lambda_interfaces.sistema_mensagens.model;

public record Mensagem(String destinatario, String assunto, String conteudo) {

    public Mensagem {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("Destinatário não pode ser nulo ou vazio");
        }
        if (conteudo == null || conteudo.isBlank()) {
            throw new IllegalArgumentException("Conteúdo da mensagem não pode ser nulo ou vazio");
        }

    }
}
