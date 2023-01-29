package com.sistemas.examenes3.ec3_2023.models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//Indicara que es una Entidad
@Entity
public class UsuarioRol {
    
    //Indicar que este metodo sera el id
    @Id
    //Sera autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    //Muchos roles perteneceran a usuario
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne()
    private Rol rol;

    //Generamos el Constructor
    public UsuarioRol() {
    }

    //Generamos los metodos Getter and Setter
    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
    
}
