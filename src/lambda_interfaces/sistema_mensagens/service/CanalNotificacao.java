package lambda_interfaces.sistema_mensagens.service;

import lambda_interfaces.sistema_mensagens.model.Mensagem;

public sealed interface CanalNotificacao
        permits ServicoSms, ServicoEmail, ServicoWhatsapp, ServicoRedesSociais {

    void enviarMensagem(Mensagem mensagem);

}
