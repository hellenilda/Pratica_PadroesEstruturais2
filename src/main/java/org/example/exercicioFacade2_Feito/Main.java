package org.example.exercicioFacade2;

import org.example.exercicioFacade2.controller.UsuarioFacade;
import org.example.exercicioFacade2.model.dao.UsuarioDaoImpl;
import org.example.exercicioFacade2.model.entity.Usuario;
import org.example.exercicioFacade2.model.service.EmailService;
import org.example.exercicioFacade2.model.service.LogService;
import org.example.exercicioFacade2.model.service.UsuarioService;
import org.example.exercicioFacade2.model.service.ValidadorDados;

/* TODO: SISTEMA DE CADASTRO DE USUÁRIO:
    O sistema executa várias etapas para que o usuário possa ser cadastrado:
    1 - Valida os dados pessoais do usuário;
    2 - Verifica se o CPF já consta na base de dados;
    3 - Salva oss dados no banco;
    4 - Envia e-mail de boas vindas ao uuário;
    5 - Registra o log da operação;
    ...
    ...
    Aplique o padrão de Projeto Facade neste contexto.

 */
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Maria", "11111111111", "maria@email.com");
        Usuario usuario2 = new Usuario("José", "22222222222", "jose@gmail.com");

        ValidadorDados validadorDados = new ValidadorDados();
        UsuarioService service = new UsuarioService();
        EmailService emailService = new EmailService();
        LogService logService = new LogService();
        UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();


        validadorDados.validar(usuario1);
        validadorDados.validar(usuario2);

        service.cpfExiste(usuario1.getCpf());
        service.cpfExiste(usuario2.getCpf());
        service.salvar(usuario1);
        service.salvar(usuario2);

        emailService.enviarBoasVindas(usuario1.getEmail());
        emailService.enviarBoasVindas(usuario2.getEmail());

        logService.registrar("Usuário registrado: "+ usuario1.getNome());
        logService.registrar("Usuario registrado: "+ usuario2.getNome());

        UsuarioFacade usuarioFacade = new UsuarioFacade(service, emailService, validadorDados, logService, usuarioDaoImpl);
        usuarioFacade.validaUsuarios(usuario1);
        usuarioFacade.inserirUsuario(usuario1);

        usuarioFacade.validaUsuarios(usuario2);
        usuarioFacade.inserirUsuario(usuario2);

        usuarioFacade.listarUsuarios();

    }


}