package com.sistemas.examenes3.ec3_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.examenes3.ec3_2023.models.Usuario;

//Repositorios de Usuario
//JPARepository ya contine metodos predefinidos
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    //Buscar por username
    public Usuario findByUsername(String username);


}
