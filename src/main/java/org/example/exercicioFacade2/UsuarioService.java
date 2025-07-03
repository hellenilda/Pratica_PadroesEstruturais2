package org.example.exercicioFacade2;

public class UsuarioService {

    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public void salvar(Usuario usuario){
        usuarioDao.adiciona(usuario);
        System.out.println("Usuário adicionado :" + usuario.getNome());
    }

    public boolean cpfExiste(String cpf){
        System.out.println("Verificando se CPF " + cpf + " já está cadastrado...");
        if (usuarioDao.buscaPorCpf(cpf) != null )
            return true;
        return false;
    }
}
