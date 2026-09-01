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

}
