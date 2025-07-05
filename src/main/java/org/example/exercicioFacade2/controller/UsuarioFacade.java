package org.example.exercicioFacade2.controller;

import org.example.exercicioFacade2.model.dao.UsuarioDaoImpl;
import org.example.exercicioFacade2.model.entity.Usuario;
import org.example.exercicioFacade2.model.service.EmailService;
import org.example.exercicioFacade2.model.service.LogService;
import org.example.exercicioFacade2.model.service.UsuarioService;
import org.example.exercicioFacade2.model.service.ValidadorDados;

public class UsuarioFacade {

    private Usuario nomeUsuario;
    private UsuarioService usuarioService;
    private EmailService emailService;
    private ValidadorDados validadorDados;
    private LogService logService;
    private UsuarioDaoImpl usuarioDaoImpl;


    public UsuarioFacade(UsuarioService usuarioService, EmailService emailService, ValidadorDados validadorDados, LogService logService, UsuarioDaoImpl usuarioDaoImpl) {
        this.usuarioService = usuarioService;
        this.emailService = emailService;
        this.validadorDados = validadorDados;
        this.logService = logService;
        this.usuarioDaoImpl = usuarioDaoImpl;
    }

    public void validaUsuarios(Usuario usuario){
        validadorDados.validar(usuario);
        this.usuarioService.cpfExiste(usuario.getCpf());
        this.emailService.enviarBoasVindas(usuario.getEmail());
        this.validadorDados.validar(usuario);
        this.logService.registrar("Usuário registrado: "+ usuario.getNome());
    }

    public void inserirUsuario(Usuario usuario){
        this.usuarioDaoImpl.adiciona(usuario);
    }

    public void procurarUsuario(Usuario usuario){
        this.usuarioDaoImpl.removePorCPf(usuario.getCpf());
    }

    public void removerUsuario(Usuario usuario){
        this.usuarioDaoImpl.removePorCPf(usuario.getCpf());
    }

    public void listarUsuarios(){
        this.usuarioDaoImpl.listaTodos();
    }

}
