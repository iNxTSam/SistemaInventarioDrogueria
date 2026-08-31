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

    public Usuario(String nombreUsuario, int id, long telefono){

        this(nombreUsuario, id, telefono, true);

    }

    public  Usuario(String nombreUsuario, int id){

        this(nombreUsuario, id, 0L, true);

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public long getTelefono() {
        return telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override

    public String toString(){
        return "Usuario [nombre=" + nombreUsuario + ", id=" + id
                + ", telefono=" + telefono + ", activo=" + activo + "]";
    }

}