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

}
