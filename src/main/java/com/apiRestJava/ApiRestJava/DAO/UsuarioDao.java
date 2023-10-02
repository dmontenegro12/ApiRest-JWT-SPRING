package com.apiRestJava.ApiRestJava.DAO;

import com.apiRestJava.ApiRestJava.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);
}
