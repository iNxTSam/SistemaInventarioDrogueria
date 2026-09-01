package org.example;

public class Comprador extends Usuario{

    private String contrasena;
    private char metodoPago;
    private int comprasRealizadas;
    private double presupuesto;

    public Comprador(String nombreUsuario, int id, long telefono, boolean activo, String contrasena, char metodoPago, int comprasRealizadas, double presupuesto){
        super(nombreUsuario,id,telefono,activo);
        this.contrasena = contrasena;
        this.metodoPago = metodoPago;
        this.comprasRealizadas = comprasRealizadas;
        this.presupuesto = presupuesto;

    }

    public Comprador(String nombreUsuario, int id, long tel, String contrasena, char metodoPago, int comprasRealizadas, double presupuesto){
        super(nombreUsuario, id, tel);
        this.contrasena = contrasena;
        this.metodoPago = metodoPago;
        this.comprasRealizadas = comprasRealizadas;
        this.presupuesto = presupuesto;

    }

    public Comprador(String nombreUsuario, int id, char metodoPago) {
        super(nombreUsuario, id);
        this.metodoPago = metodoPago;
        this.comprasRealizadas = 0;
        this.presupuesto = 0.0;
        this.contrasena = "Default";

    }


}
