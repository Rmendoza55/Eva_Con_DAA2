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

    //Un Usuario Podra tener muchos Roles
    //Cascada de tipo all, Cualquier cambio afectara a las entidades hijas
    //Fetch sera la busqueda perezosa de la tabla, osea que hay q indicarle 
    //MappedBy propietario sera rol
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    //Generamos un Constructor
    public Rol() {
    }

    //Generamos los metodos Getter and Setter
    public long getRolId() {
        return rolId;
    }

    public void setRolId(long rolId) {
        this.rolId = rolId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }


    
    
    
}
