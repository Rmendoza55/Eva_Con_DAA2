package com.sistemas.examenes3.ec3_2023.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Indicara que es una Entidad
@Entity
//Indicara que sera una Tabla en Base de Datos
@Table(name = "usuarios")
public class Usuario {
    
    //Indicar que este metodo sera el id
    @Id
    //Sera autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Resto de Atributos de las tablas
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private boolean enable = true;
    private String perfil;

    //Un Usuario Podra tener muchos Roles
    //Cascada de tipo all, Cualquier cambio afectara a las entidades hijas
    //Fetch sera la busqueda anciosa de la tabla
    //MappedBy Indica quien es el propietario de la tabla relacionada
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();
}
