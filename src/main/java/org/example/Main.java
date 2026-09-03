package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Producto> inventario = new ArrayList<>();


        Trabajador t1 = new Trabajador("ana", 101, 3150001234L, true, "claveA", 'F', 40, 2500000.0);
        listaUsuarios.add(t1);

        Trabajador t2 = new Trabajador("luis", 102, 'C');
        listaUsuarios.add(t2);

        Comprador c1 = new Comprador("maria", 201, 3160005678L, true, "claveM", 'E', 5, 500000.0);
        listaUsuarios.add(c1);

        Comprador c2 = new Comprador("jose", 202, 'T');
        listaUsuarios.add(c2);

        Proveedor p1 = new Proveedor("proveedor", 301, 3170009012L, true, "claveP", 'G', 900123456L, 3);
        listaUsuarios.add(p1);

        Proveedor p2 = new Proveedor("surtidor", 302, 'D');
        listaUsuarios.add(p2);

        Usuario u1 = new Usuario("invitado", 999, 0L, true);
        listaUsuarios.add(u1);

        Producto prod1 = new Producto(1001, "Acetaminofen", 1500.0);
        inventario.add(prod1);

        Medicamento med1 = new Medicamento(2001, "Ibuprofeno", 3200.0, true, false, "400mg", 'B', 0);
        inventario.add(med1);

        Cosmetico cos1 = new Cosmetico(3001, "Crema", 25000.0, true, "seca", 50.0, false, 'N');
        inventario.add(cos1);

        ProductoHigiene ph1 = new ProductoHigiene(4001, "Jabon", 4500.0, "personal", 100.0, true, 24);
        inventario.add(ph1);

    }
}
