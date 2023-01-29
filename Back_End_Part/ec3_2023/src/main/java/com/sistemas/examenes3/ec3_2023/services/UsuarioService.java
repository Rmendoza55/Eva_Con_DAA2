package com.sistemas.examenes3.ec3_2023.services;

import java.util.Set;

import com.sistemas.examenes3.ec3_2023.models.Usuario;
import com.sistemas.examenes3.ec3_2023.models.UsuarioRol;

//Interfaces que obtendran diferentes servicios
public interface UsuarioService {

    //Metodo guardar
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol>usuarioRoles) throws Exception;

    //Metodo obtener
    public Usuario obtenerUsuario(String username);

    //Metodo eliminar
    public void eliminarUsuario (Long usuarioId);

}
