package com.sistemas.examenes3.ec3_2023.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Indicara que es una Entidad
@Entity
//Indicara que sera una Tabla en Base de Datos
@Table(name = "roles")
public class Rol {
    
    //Indicar que este metodo sera el id
    @Id
    private long rolId;
    
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();
}
