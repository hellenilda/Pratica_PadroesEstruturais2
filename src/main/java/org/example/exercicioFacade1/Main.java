package org.example.exercicioFacade1;

/* TODO: SISTEMA DE REPRODUÇÃO DE VÍDEO:
    O sistema tem várias etapas para poder iniciar a reprodução de um vídeo.
    AS etapas são carregar o arquivo, decodificar o áudio, decodificar o vídeo e só depois iniciar a reprodução.

    Aplique o padrão de Projeto Facade neste contexto.

 */

public class Main {

    public static void main(String[] args) {

        CarregadorDeArquivo carredor = new CarregadorDeArquivo();
        DecodificadorDeVideo video = new DecodificadorDeVideo();
        DecodificadorDeAudio audio = new DecodificadorDeAudio();
        Reprodutor reprodutor = new Reprodutor();

        carredor.carregar("video.mp4");
        video.decodificar();
        audio.decodificar();
        reprodutor.reproduzir();

    }
}
