package org.example;

public class Trabajador extends Usuario{

    private String contrasena;
    private char cargo;
    private int horasSemanales;
    private double salario;

    public Trabajador(String nombreUsuario, int id, long telefono, boolean activo, String contrasena, char cargo, int horasSemanales, double salario) {
        super(nombreUsuario, id, telefono, activo);
        this.contrasena = contrasena;
        this.cargo = cargo;
        this.horasSemanales = horasSemanales;
        this.salario = salario;
    }

    public Trabajador(String nombreUsuario, int id, long telefono, String contrasena, char cargo, int horasSemanales, double salario){
        super(nombreUsuario,id,telefono);
        this.contrasena = contrasena;
        this.cargo = cargo;
        this.horasSemanales = horasSemanales;
        this.salario = salario;
    }

    public Trabajador(String nombreUsuario, int id, char cargo){
        super(nombreUsuario,id);
        this.cargo = cargo;
        this.horasSemanales = 0;
        this.salario = 0.0;
        this.contrasena = "default";
    }

    public String getContrasena() {
        return contrasena;
    }

    public char getCargo() {
        return cargo;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public double getSalario() {
        return salario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Usuario [nombre=" + nombreUsuario + ", id=" + id
                + ", cargo=" + cargo + ", horasSemanales=" + horasSemanales + ", salario=" + salario + "]";
    }
}
