package org.example.exercicioProxy2;

public class ServicoSmsProxy implements ServicoSms {
    private ServicoSmsReal servicoReal = new ServicoSmsReal();
    private int mensagensEnviadas;

    public ServicoSmsProxy() {
        this.mensagensEnviadas = 0;
    }

    @Override
    public void enviarMensagem(String destino, String mensagem) {
        if (mensagensEnviadas < 3) {
            servicoReal.enviarMensagem(destino, mensagem);
            mensagensEnviadas++;
        } else {
            System.out.println("Limite de mensagens atingido.");
        }
    }
}
