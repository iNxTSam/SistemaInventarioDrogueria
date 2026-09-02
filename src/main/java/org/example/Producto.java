package org.example;

public class Producto {

    protected int codigo;
    protected String nombre;
    protected double precio;
    protected boolean enStock;

    // Constructor completo
    public Producto(int codigo, String nombre, double precio, boolean enStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.enStock = enStock;
    }

    // Constructor intermedio: enStock = true por defecto
    public Producto(int codigo, String nombre, double precio) {
        this(codigo, nombre, precio, true);
    }

    // Constructor corto: codigo = 0, enStock = true
    public Producto(String nombre, double precio) {
        this(0, nombre, precio, true);
    }

    // Getters
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public boolean isEnStock() { return enStock; }

    // Setters
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setEnStock(boolean enStock) { this.enStock = enStock; }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre
                + ", precio=" + precio + ", enStock=" + enStock + "]";
    }
}
