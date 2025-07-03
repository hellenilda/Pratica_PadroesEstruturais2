package org.example.exercicioFacade2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao{

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adiciona(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario buscaPorCpf(String cpf) {
        for (Usuario u: usuarios){
            if(u.getCpf().equals(cpf))
                return u;
        }
        return null;
    }

    @Override
    public List<Usuario> listaTodos() {
        return new ArrayList<>(usuarios);
    }

    @Override
    public boolean removePorCPf(String cpf) {
        Usuario u = buscaPorCpf(cpf);
        if(u != null){
            usuarios.remove(u);
        }
        return false;
    }
}
