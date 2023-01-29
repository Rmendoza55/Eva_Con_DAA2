package com.sistemas.examenes3.ec3_2023.services.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.examenes3.ec3_2023.models.Usuario;
import com.sistemas.examenes3.ec3_2023.models.UsuarioRol;
import com.sistemas.examenes3.ec3_2023.repository.RolRepository;
import com.sistemas.examenes3.ec3_2023.repository.UsuarioRepository;
import com.sistemas.examenes3.ec3_2023.services.UsuarioService;

//Etiqueta que indicara q esta clase sera un servicio
@Service
public class UsuarioServicesImpl implements UsuarioService{
    
    //Inyectara el usuariorepository
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Inyeccion de rolrepository
    @Autowired
    private RolRepository rolRepository;

    //Llama al metodo guardar usuario
    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        //Se crea la variable usuariolocal que contendra el metodo findbyusername de usuario repository
        //que buscara lo que se ingrese como username
        Usuario usuariolocal = usuarioRepository.findByUsername(usuario.getUsername());
        //condicional: si usuariolocal es distinto a nulo
        if(usuariolocal != null){
            //Botara un mensaje en consola como se observa en el println
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        } else{ //Si no, creara un bucle que recorrera la lista de usuarioroles
            for(UsuarioRol usuarioRol: usuarioRoles){
                //y guardara los roles
                rolRepository.save(usuarioRol.getRol());
            }
            //Ingresara todos los usuarios roles
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            //Y los guardara en usuariolocal
            usuariolocal = usuarioRepository.save(usuario);
        }
        return usuariolocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
        
    }


}
