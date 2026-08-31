package org.example;

public class Usuario {

    protected String nombreUsuario;
    protected int id;
    protected long telefono;
    protected boolean activo;

    public Usuario(String nombreUsuario, int id, long telefono, boolean activo){

        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.telefono = telefono;
        this.activo = activo;


    }

}
