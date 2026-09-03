package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    boolean autenticado = false;
    int intentos = 0;


    Scanner sc = new Scanner(System.in);
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Producto> inventario = new ArrayList<>();


// Se usa el constructor completo (8 params) porque conocemos todos los datos del trabajador: cargo, horas, salario y contraseña.
        Trabajador t1 = new Trabajador("ana", 101, 3150001234L, true, "claveA", 'F', 40, 2500000.0);
        listaUsuarios.add(t1);

// Se usa el constructor corto (3 params) porque solo conocemos nombre, id y cargo; el resto toma valores por defecto.
        Trabajador t2 = new Trabajador("luis", 102, 'C');
        listaUsuarios.add(t2);

// Constructor completo porque conocemos el presupuesto y metodo de pago del comprador.
        Comprador c1 = new Comprador("maria", 201, 3160005678L, true, "claveM", 'E', 5, 500000.0);
        listaUsuarios.add(c1);

// Constructor corto: solo nombre, id y metodo de pago.
        Comprador c2 = new Comprador("jose", 202, 'T');
        listaUsuarios.add(c2);

// Constructor completo del proveedor.
        Proveedor p1 = new Proveedor("proveedor", 301, 3170009012L, true, "claveP", 'G', 900123456L, 3);
        listaUsuarios.add(p1);

// Constructor corto del proveedor.
        Proveedor p2 = new Proveedor("surtidor", 302, 'D');
        listaUsuarios.add(p2);

// Constructor completo de la superclase Usuario (objeto invitado).
        Usuario u1 = new Usuario("invitado", 999, 0L, true);
        listaUsuarios.add(u1);

// Constructor intermedio de Producto (enStock = true por defecto).
        Producto prod1 = new Producto(1001, "Acetaminofen", 1500.0);
        inventario.add(prod1);

// Constructor completo de Medicamento.
        Medicamento med1 = new Medicamento(2001, "Ibuprofeno", 3200.0, true, false, "400mg", 'B', 0);
        inventario.add(med1);

// Constructor completo de Cosmetico.
        Cosmetico cos1 = new Cosmetico(3001, "Crema", 25000.0, true, "seca", 50.0, false, 'N');
        inventario.add(cos1);

// Constructor completo de ProductoHigiene.
        ProductoHigiene ph1 = new ProductoHigiene(4001, "Jabon", 4500.0, "personal", 100.0, true, 24);
        inventario.add(ph1);

        System.out.println("=== OBJETOS INSTANCIADOS ===");
        for (Usuario u : listaUsuarios) {
            System.out.println(u);
        }
        for (Producto prod : inventario) {
            System.out.println(prod);
        }

        HashMap<String, String> credenciales = new HashMap<>();
        credenciales.put("ana", "claveA");
        credenciales.put("luis", "default");
        credenciales.put("maria", "claveM");
        credenciales.put("jose", "default");
        credenciales.put("proveedor", "claveP");
        credenciales.put("surtidor", "default");
        credenciales.put("invitado", "1234");


        Usuario usuarioLogueado = null;

        // Menu inicial: iniciar sesion o salir
        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== B I E N V E N I D O ===");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Salir");
            System.out.print("Elija una opcion: ");
            int opcionInicial = sc.nextInt();
            sc.nextLine();

            if (opcionInicial == 2) {
                System.out.println("Programa cerrado. Hasta luego.");
                salir = true;
                break;
            } else if (opcionInicial != 1) {
                System.out.println("Error: Opcion no valida. Elija 1 o 2.");
                continue;
            }

            // Inicio de sesion con 3 intentos
            while (intentos < 3 && !autenticado) {
                System.out.print("Ingrese nombre de usuario: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese contrasena: ");
                String pass = sc.nextLine();

                Usuario usuarioActivo = null;
                for (Usuario u : listaUsuarios) {
                    if (u.getNombreUsuario().equals(nombre)) {
                        usuarioActivo = u;
                        break;
                    }
                }

                if (usuarioActivo == null) {
                    System.out.println("Error: El usuario \"" + nombre + "\" no esta registrado en el sistema.");
                } else if (!usuarioActivo.isActivo()) {
                    System.out.println("Error: El usuario \"" + nombre + "\" no esta activo.");
                } else if (credenciales.get(nombre) == null || !credenciales.get(nombre).equals(pass)) {
                    System.out.println("Error: Contrasena incorrecta.");
                } else {
                    autenticado = true;
                    usuarioLogueado = usuarioActivo;
                    System.out.println("Bienvenido, " + nombre);
                }
                intentos++;
            }

            if (!autenticado) {
                System.out.println("Se agotaron los intentos. Programa cerrado.");
                sc.close();
                return;
            }

            // Redireccion al menu segun el rol
            if (usuarioLogueado instanceof Trabajador) {
                menuTrabajador(sc, inventario);
            } else if (usuarioLogueado instanceof Comprador) {
                menuComprador(sc, inventario);
            } else if (usuarioLogueado instanceof Proveedor) {
                menuProveedor(sc, inventario);
            } else {
                System.out.println("El perfil invitado no tiene menu de gestion.");
            }

            // Al salir del perfil, se vuelve al inicio de sesion
            System.out.println("\nCerrando sesion...");
            autenticado = false;
            intentos = 0;
        }
    }

    // MENU DEL TRABAJADOR: ver inventario, agregar producto
    static void menuTrabajador(Scanner sc, ArrayList<Producto> inventario) {
        int opcion;
        do {
            System.out.println("\n=== MENU TRABAJADOR ===");
            System.out.println("1. Ver inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verInventario(inventario);
                    break;
                case 2:
                    agregarProducto(sc, inventario);
                    break;
                case 3:
                    System.out.println("Saliendo del menu trabajador...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);
    }

    // MENU DEL COMPRADOR: ver productos, comprar
    static void menuComprador(Scanner sc, ArrayList<Producto> inventario) {
        int opcion;
        do {
            System.out.println("\n=== MENU COMPRADOR ===");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Comprar producto");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verDisponibles(inventario);
                    break;
                case 2:
                    comprarProducto(sc, inventario);
                    break;
                case 3:
                    System.out.println("Saliendo del menu comprador...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);
    }

    // MENU DEL PROVEEDOR: ver catalogo, agregar stock
    static void menuProveedor(Scanner sc, ArrayList<Producto> inventario) {
        int opcion;
        do {
            System.out.println("\n=== MENU PROVEEDOR ===");
            System.out.println("1. Ver catalogo");
            System.out.println("2. Agregar stock (marcar como disponible)");
            System.out.println("3. Registrar producto");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verInventario(inventario);
                    break;
                case 2:
                    reponerStock(sc, inventario);
                    break;
                case 3:
                    registrarProducto(sc, inventario);
                    break;
                case 4:
                    System.out.println("Saliendo del menu proveedor...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    // Muestra todo el inventario
    static void verInventario(ArrayList<Producto> inventario) {
        System.out.println("\n--- INVENTARIO ---");
        for (Producto p : inventario) {
            System.out.println(p);
        }
    }

    // Muestra solo los productos en stock
    static void verDisponibles(ArrayList<Producto> inventario) {
        System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
        for (Producto p : inventario) {
            if (p.isEnStock()) {
                System.out.println(p);
            }
        }
    }

    // Agrega un producto nuevo al inventario
    static void agregarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        Producto nuevo = new Producto(codigo, nombre, precio);
        inventario.add(nuevo);
        System.out.println("Producto agregado correctamente.");
    }

    // Comprador: busca por codigo y marca el producto como sin stock
    static void comprarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Codigo del producto a comprar: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        for (Producto p : inventario) {
            if (p.getCodigo() == codigo && p.isEnStock()) {
                p.setEnStock(false);
                System.out.println("Compra realizada de: " + p.getNombre());
                return;
            }
        }
        System.out.println("Producto no encontrado o sin stock.");
    }

    // Proveedor: marca un producto como disponible (reponer stock)
    static void reponerStock(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Codigo del producto a reponer: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        for (Producto p : inventario) {
            if (p.getCodigo() == codigo) {
                p.setEnStock(true);
                System.out.println("Stock repuesto de: " + p.getNombre());
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Proveedor: registra un producto nuevo en el catalogo
    static void registrarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        Producto nuevo = new Producto(codigo, nombre, precio);
        inventario.add(nuevo);
        System.out.println("Producto registrado en el catalogo.");
    }
}
