package com.sistemas.examenes3.ec3_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.examenes3.ec3_2023.models.Rol;

//Heredara de Rol
public interface RolRepository extends JpaRepository<Rol, Long> {
    //Esta tabla no tendra un metodo
}
