package org.example.exercicioProxy1;

/* TODO:  BIBLIOTECA DIGITAL
    O sistema disponibiliza o acesso a livros digitais, porém esse acesso está aberto para qualquer usuário.
    É necessário algumas adequações para que o acesso aos conteúdos dependa do tipo de usuário, onde:
    .
    1 - Usuários comuns: podem apenas ler o título de um livro;
        Exibir mensagem: "Assine o plano Premium para acessar o conteúdo completo."
    2 - Usuários premium: podem ler o conteúdo completo.
    ...
    ...
    Aplique o padrão de Projeto Proxy neste contexto para controle de acesso.

 */
public class Main {

    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Padrões de projeto", "Conteúdo completo do livro...");

        livro.ler();
    }
}
