package org.example.exercicioProxy1;

import org.example.exercicioProxy1.Usuario;

public class LivroDigitalPadrao implements LivroDigital {

    private String titulo;
    private String conteudo;

    public LivroDigitalPadrao(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void ler(Usuario usuario) {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }
}