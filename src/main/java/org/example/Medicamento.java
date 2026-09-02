package org.example;

public class Medicamento extends Producto {

    private boolean requiereReceta;
    private String dosis;
    private char laboratorio;
    private int unidadesVendidas;

    // Constructor completo
    public Medicamento(int codigo, String nombre, double precio, boolean enStock,
                       boolean requiereReceta, String dosis, char laboratorio, int unidadesVendidas) {
        super(codigo, nombre, precio, enStock);
        this.requiereReceta = requiereReceta;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.unidadesVendidas = unidadesVendidas;
    }

    // Constructor intermedio: enStock = true
    public Medicamento(int codigo, String nombre, double precio,
                       boolean requiereReceta, String dosis, char laboratorio, int unidadesVendidas) {
        super(codigo, nombre, precio);
        this.requiereReceta = requiereReceta;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.unidadesVendidas = unidadesVendidas;
    }

    // Constructor corto
    public Medicamento(String nombre, double precio, char laboratorio) {
        super(nombre, precio);
        this.requiereReceta = false;
        this.dosis = "";
        this.laboratorio = laboratorio;
        this.unidadesVendidas = 0;
    }

    // Getters
    public boolean isRequiereReceta() { return requiereReceta; }
    public String getDosis() { return dosis; }
    public char getLaboratorio() { return laboratorio; }
    public int getUnidadesVendidas() { return unidadesVendidas; }

    // Setters
    public void setRequiereReceta(boolean requiereReceta) { this.requiereReceta = requiereReceta; }
    public void setDosis(String dosis) { this.dosis = dosis; }
    public void setLaboratorio(char laboratorio) { this.laboratorio = laboratorio; }
    public void setUnidadesVendidas(int unidadesVendidas) { this.unidadesVendidas = unidadesVendidas; }

    @Override
    public String toString() {
        return "Medicamento [nombre=" + nombre + ", codigo=" + codigo
                + ", precio=" + precio + ", laboratorio=" + laboratorio
                + ", dosis=" + dosis + ", requiereReceta=" + requiereReceta
                + ", unidadesVendidas=" + unidadesVendidas + "]";
    }
}
