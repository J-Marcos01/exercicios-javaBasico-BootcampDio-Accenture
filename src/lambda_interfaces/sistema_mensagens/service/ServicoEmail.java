package lambda_interfaces.sistema_mensagens.service;

import lambda_interfaces.sistema_mensagens.model.Mensagem;

public final class ServicoEmail implements CanalNotificacao {

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        
        System.out.printf("[E-MAIL] Para: %s | Assunto: %s | Corpo: %s%n",
                mensagem.destinatario(), mensagem.assunto(), mensagem.conteudo());
    }
}
