package org.example;

public class Cosmetico extends Producto {

    private String tipoPiel;
    private double volumen;
    private boolean esImportado;
    private char fabricante;

    // Constructor completo
    public Cosmetico(int codigo, String nombre, double precio, boolean enStock,
                     String tipoPiel, double volumen, boolean esImportado, char fabricante) {
        super(codigo, nombre, precio, enStock);
        this.tipoPiel = tipoPiel;
        this.volumen = volumen;
        this.esImportado = esImportado;
        this.fabricante = fabricante;
    }

    // Constructor intermedio: enStock = true
    public Cosmetico(int codigo, String nombre, double precio,
                     String tipoPiel, double volumen, boolean esImportado, char fabricante) {
        super(codigo, nombre, precio);
        this.tipoPiel = tipoPiel;
        this.volumen = volumen;
        this.esImportado = esImportado;
        this.fabricante = fabricante;
    }

    // Constructor corto
    public Cosmetico(String nombre, double precio, String tipoPiel) {
        super(nombre, precio);
        this.tipoPiel = tipoPiel;
        this.volumen = 0.0;
        this.esImportado = false;
        this.fabricante = ' ';
    }

    // Getters
    public String getTipoPiel() { return tipoPiel; }
    public double getVolumen() { return volumen; }
    public boolean isEsImportado() { return esImportado; }
    public char getFabricante() { return fabricante; }

    // Setters
    public void setTipoPiel(String tipoPiel) { this.tipoPiel = tipoPiel; }
    public void setVolumen(double volumen) { this.volumen = volumen; }
    public void setEsImportado(boolean esImportado) { this.esImportado = esImportado; }
    public void setFabricante(char fabricante) { this.fabricante = fabricante; }

    @Override
    public String toString() {
        return "Cosmetico [nombre=" + nombre + ", codigo=" + codigo
                + ", precio=" + precio + ", tipoPiel=" + tipoPiel
                + ", volumen=" + volumen + ", esImportado=" + esImportado
                + ", fabricante=" + fabricante + "]";
    }
}
