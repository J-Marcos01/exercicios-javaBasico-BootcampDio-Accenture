package lambda_interfaces.sistema_mensagens.service;

import lambda_interfaces.sistema_mensagens.model.Mensagem;

public final class ServicoSms implements CanalNotificacao {
    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.printf("[SMS] Para: %s | Texto: %s%n",
                mensagem.destinatario(), mensagem.conteudo());
    }
}
