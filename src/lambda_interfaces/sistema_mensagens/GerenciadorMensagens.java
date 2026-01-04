package lambda_interfaces.sistema_mensagens;

import java.util.List;
import lambda_interfaces.sistema_mensagens.model.Mensagem;
import lambda_interfaces.sistema_mensagens.service.CanalNotificacao;

public class GerenciadorMensagens {

    private final List<CanalNotificacao> canais;

    public GerenciadorMensagens(List<CanalNotificacao> canais) {
        this.canais = canais;
    }

    public void dispararMensagens(Mensagem mensagem) {

        System.out.println("--- Iniciando envio de mensagem ---");

        canais.forEach(canal -> canal.enviarMensagem(mensagem));

        System.out.println("--- Mensagem enviada via todos os canais ---");

    }

}
