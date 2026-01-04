package lambda_interfaces.sistema_mensagens;

import java.util.List;
import lambda_interfaces.sistema_mensagens.model.Mensagem;
import lambda_interfaces.sistema_mensagens.service.ServicoEmail;
import lambda_interfaces.sistema_mensagens.service.ServicoRedesSociais;
import lambda_interfaces.sistema_mensagens.service.ServicoSms;
import lambda_interfaces.sistema_mensagens.service.ServicoWhatsapp;

/*
1 - Escreva um código para enviar mensagens de marketing, 
para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes,
esses serviços devem ter um método para receber a mensagem como parâmetro, 
os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp;

 */
public class MarketingApp {
    public static void main(String[] args) {

        var mensagemBlackFriday = new Mensagem(
                "cliente@email.com",
                "Ofertas Black Friday",
                "Descontos de 50% hoje!");

        var canaisNotificacao = List.of(
                new ServicoSms(),
                new ServicoEmail(),
                new ServicoWhatsapp(),
                new ServicoRedesSociais());

        var gerenciadorMensagens = new GerenciadorMensagens(canaisNotificacao);

        gerenciadorMensagens.dispararMensagens(mensagemBlackFriday);

    }
}
