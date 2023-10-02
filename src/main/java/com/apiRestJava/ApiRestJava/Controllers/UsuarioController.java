package com.apiRestJava.ApiRestJava.Controllers;


import com.apiRestJava.ApiRestJava.DAO.UsuarioDao;
import com.apiRestJava.ApiRestJava.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "api/usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("David");
        usuario.setApellido("Montenegro");
        usuario.setEmail("diablicho@gmail.com");
        usuario.setTelefono("0998880808");
        usuario.setPassword("1012105");

        return usuario;
    }
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }
    @RequestMapping(value = "editar/{id}")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Montenegro");
        usuario.setEmail("diablicho@gmail.com");
        usuario.setTelefono("0998880808");
        usuario.setPassword("1012105");

        return usuario;
    }
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }
    @RequestMapping(value = "buscar")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Montenegro");
        usuario.setEmail("diablicho@gmail.com");
        usuario.setTelefono("0998880808");
        usuario.setPassword("1012105");

        return usuario;
    }
}
