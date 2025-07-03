package org.example.exercicioProxy1;

public class LivroDigital {

    private String titulo;
    private String conteudo;

    public LivroDigital(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void ler() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }
}
