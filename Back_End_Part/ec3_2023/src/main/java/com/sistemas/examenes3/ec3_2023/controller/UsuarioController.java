package com.sistemas.examenes3.ec3_2023.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemas.examenes3.ec3_2023.models.Rol;
import com.sistemas.examenes3.ec3_2023.models.Usuario;
import com.sistemas.examenes3.ec3_2023.models.UsuarioRol;
import com.sistemas.examenes3.ec3_2023.services.UsuarioService;

//Etiqueta q convertira los controladores en rest apis
@RestController
//Etiqueta q indicara q solo funcionara el url con el /usuarios
@RequestMapping("/usuarios")
public class UsuarioController {
    //Inyecta los Servicios
    @Autowired
    private UsuarioService usuarioService;
    //Paticion Post con el metodo guardar usuario
    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody /*Manda objetos */ Usuario usuario)throws Exception{

        Set<UsuarioRol> roles = new HashSet<>();

        Rol rol=new Rol();
        rol.setRolId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol =  new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario, roles);
    }
    //Metodo Get
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }
    //Metodo Delete
    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }
}
