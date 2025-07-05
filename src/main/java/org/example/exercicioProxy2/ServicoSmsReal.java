package org.example.exercicioProxy2;

public class ServicoSmsReal implements ServicoSms {

    @Override
    public void enviarMensagem(String destino, String mensagem) {
        System.out.println("Enviando mensagem para " + destino + ": " + mensagem);
    }
}

