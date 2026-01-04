package lambda_interfaces.sistema_mensagens.service;

import lambda_interfaces.sistema_mensagens.model.Mensagem;

public final class ServicoRedesSociais implements CanalNotificacao {
    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.printf("[INSTAGRAM/LINKEDIN] Postando para %s: #%s%n",
                mensagem.destinatario(), mensagem.conteudo());
    }
}