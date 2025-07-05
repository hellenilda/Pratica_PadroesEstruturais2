package org.example.exercicioFacade2.model.service;

import org.example.exercicioFacade2.model.entity.Usuario;

public class ValidadorDados {

    public boolean validar(Usuario usuario){
    System.out.println("Validando dados do usuário... ");
    return usuario.getNome() != null && usuario.getCpf().length() == 11 && usuario.getEmail().contains("@");
    }
}
