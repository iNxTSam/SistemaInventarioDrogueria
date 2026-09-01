package org.example;

public class Proveedor extends Usuario{

    private String contrasena;
    private char empresa;
    private long nit;
    private int plazoEntrega;

   public Proveedor(String nombreUsuario, int id, long telefono, boolean activo, String contrasena, char empresa, long nit, int plazoEntrega){
    super(nombreUsuario, id, telefono, activo);
    this.contrasena = contrasena;
    this.empresa = empresa;
    this.nit = nit;
    this.plazoEntrega = plazoEntrega;

   }

   public Proveedor(String nombreUsuario, int id, long telefono, String contrasena, char empresa, long nit, int plazoEntrega){
       super(nombreUsuario, id, telefono);
       this.contrasena = contrasena;
       this.empresa = empresa;
       this.nit = nit;
       this.plazoEntrega= plazoEntrega;

   }

   public Proveedor(String nombreUsuario, int id, char empresa){
       super(nombreUsuario, id);
       this.empresa = empresa;
       this.nit = 0L;
       this.plazoEntrega = 0;
       this.contrasena = "default";

   }

    public String getContrasena() {
        return contrasena;
    }

    public char getEmpresa() {
        return empresa;
    }

    public long getNit() {
        return nit;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEmpresa(char empresa) {
        this.empresa = empresa;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    @Override

    public String toString(){
        return "Usuario [nombre=" + nombreUsuario + ", id=" + id
                + ", empresa=" + empresa + ", nit=" + nit + ", plazoEntrega=" + plazoEntrega + "]";
    }
}
