package org.example.exercicioProxy2;

public class Main {
    /*
     * 1. Originalmente usava-se diretamente a classe ServicoSms
     * 2. Criamos:
     *    - Interface ServicoSms (contrato comum)
     *    - ServicoSmsReal (implementação concreta do serviço)
     *    - ServicoSmsProxy (controla acesso com limite de 3 envios/dia)
     *
     * 3. Agora instanciamos o Proxy (que encapsula o serviço real)
     * 4. O Proxy:
     *    - Conta envios por dia
     *    - Aplica o limite (3 mensagens)
     *    - Delega ao ServicoSmsReal quando permitido
     *    - Bloqueia e notifica quando excede
     *
     * Benefício: O cliente (Main) não precisa saber da lógica de limite,
     * apenas usa a interface normalmente.
     *
     * OBS.: A IDE ainda está reclamando de algo nas classes ServicoSmsReal e ServicoSmsProxy,
     * porém ao exercutar o código ele está funcinando como deveria (permitindo o envio de apenas
     * 3 mensagens/dia.). Não sei o que houve, mas ainda está funcionando!
     */
    public static void main(String[] args) {
        ServicoSms sms = new ServicoSmsProxy();

        sms.enviarMensagem("123456789", "Olá!");
        sms.enviarMensagem("987654321", "Tudo bem?");
        sms.enviarMensagem("456789123", "Até logo!");
        sms.enviarMensagem("111222333", "Esta não deve ser enviada.");
    }
}
