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

    public Comprador(String nombreUsuario, int id, long telefono, String contrasena, char metodoPago, int comprasRealizadas, double presupuesto){
        super(nombreUsuario, id, telefono);
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
        this.contrasena = "default";

    }

    public String getContrasena() {
        return contrasena;
    }

    public char getMetodoPago() {
        return metodoPago;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override

    public String toString(){
        return "Usuario [nombre=" + nombreUsuario + ", id=" + id
                + ", metodoPago=" + metodoPago + ", comprasRealizadas=" + comprasRealizadas + ", presupuesto=" + presupuesto + "]";
    }
}
