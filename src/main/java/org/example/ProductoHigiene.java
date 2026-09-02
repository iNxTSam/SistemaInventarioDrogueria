package org.example;

public class ProductoHigiene extends Producto {

    private String categoria;
    private double pesoNeto;
    private boolean esBiodegradable;
    private int vidaUtilMeses;

    // Constructor completo
    public ProductoHigiene(int codigo, String nombre, double precio, boolean enStock,
                           String categoria, double pesoNeto, boolean esBiodegradable, int vidaUtilMeses) {
        super(codigo, nombre, precio, enStock);
        this.categoria = categoria;
        this.pesoNeto = pesoNeto;
        this.esBiodegradable = esBiodegradable;
        this.vidaUtilMeses = vidaUtilMeses;
    }

    // Constructor intermedio: enStock = true
    public ProductoHigiene(int codigo, String nombre, double precio,
                           String categoria, double pesoNeto, boolean esBiodegradable, int vidaUtilMeses) {
        super(codigo, nombre, precio);
        this.categoria = categoria;
        this.pesoNeto = pesoNeto;
        this.esBiodegradable = esBiodegradable;
        this.vidaUtilMeses = vidaUtilMeses;
    }

    // Constructor corto
    public ProductoHigiene(String nombre, double precio, String categoria) {
        super(nombre, precio);
        this.categoria = categoria;
        this.pesoNeto = 0.0;
        this.esBiodegradable = false;
        this.vidaUtilMeses = 0;
    }

    // Getters
    public String getCategoria() { return categoria; }
    public double getPesoNeto() { return pesoNeto; }
    public boolean isEsBiodegradable() { return esBiodegradable; }
    public int getVidaUtilMeses() { return vidaUtilMeses; }

    // Setters
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPesoNeto(double pesoNeto) { this.pesoNeto = pesoNeto; }
    public void setEsBiodegradable(boolean esBiodegradable) { this.esBiodegradable = esBiodegradable; }
    public void setVidaUtilMeses(int vidaUtilMeses) { this.vidaUtilMeses = vidaUtilMeses; }

    @Override
    public String toString() {
        return "ProductoHigiene [nombre=" + nombre + ", codigo=" + codigo
                + ", precio=" + precio + ", categoria=" + categoria
                + ", pesoNeto=" + pesoNeto + ", esBiodegradable=" + esBiodegradable
                + ", vidaUtilMeses=" + vidaUtilMeses + "]";
    }
}
