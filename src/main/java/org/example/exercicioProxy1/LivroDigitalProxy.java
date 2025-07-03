package org.example.exercicioProxy1;

import org.example.exercicioProxy1.Usuario;

public class LivroDigitalProxy implements LivroDigital {
    private LivroDigitalPadrao livroDigitalPadrao;
    private String titulo;
    private String conteudo;

    public LivroDigitalProxy(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void ler(Usuario usuario) {
        if (usuario.isPremium()) {
            // Lazy initialization do objeto real
            if (livroDigitalPadrao == null) {
                livroDigitalPadrao = new LivroDigitalPadrao(titulo, conteudo);
            }
            livroDigitalPadrao.ler(usuario);
        } else {
            System.out.println("Título: " + titulo);
            System.out.println("Assine o plano Premium para acessar o conteúdo completo.");
        }
    }
}