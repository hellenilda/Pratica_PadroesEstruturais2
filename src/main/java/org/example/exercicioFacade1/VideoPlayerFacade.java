package org.example.exercicioFacade1;

public class VideoPlayerFacade {
    private CarregadorDeArquivo carregador;
    private DecodificadorDeVideo videoDecoder;
    private DecodificadorDeAudio audioDecoder;
    private Reprodutor reprodutor;

    public VideoPlayerFacade() {
        this.carregador = new CarregadorDeArquivo();
        this.videoDecoder = new DecodificadorDeVideo();
        this.audioDecoder = new DecodificadorDeAudio();
        this.reprodutor = new Reprodutor();
    }

    public void reproduzirVideo(String nomeArquivo) {
        System.out.println("Iniciando reprodução do vídeo: " + nomeArquivo);
        carregador.carregar(nomeArquivo);
        videoDecoder.decodificar();
        audioDecoder.decodificar();
        reprodutor.reproduzir();
        System.out.println("Reprodução iniciada com sucesso!");
    }
}