package org.example.exercicioFacade2.model.dao;

import org.example.exercicioFacade2.model.entity.Usuario;

import java.util.List;

public interface UsuarioDao {

    void adiciona(Usuario usuario);
    Usuario buscaPorCpf(String cpf);
    List<Usuario> listaTodos();
    boolean removePorCPf(String cpf);

}
