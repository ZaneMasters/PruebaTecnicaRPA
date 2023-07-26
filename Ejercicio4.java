package globaltek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
        Map<String, List<Producto>> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Definir los grupos de inventario
        String[] grupos = {"dairy", "cleaning", "grain"};
        for (String grupo : grupos) {
            inventario.put(grupo, new ArrayList<>());
        }

        while (true) {
            System.out.println("Sistema de inventario. Ingrese una opcion:");
            System.out.println("---------------------------------------------");
            System.out.println("1. Registrar producto entrante");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    registrarProducto(inventario, scanner);
                    break;
                case 2:
                    mostrarInventario(inventario);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    public static void registrarProducto(Map<String, List<Producto>> inventario, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el grupo del producto (dairy, cleaning, grain):");
        String grupo = scanner.nextLine().toLowerCase();

        if (!inventario.containsKey(grupo)) {
            System.out.println("Grupo inválido. El producto no fue registrado.");
            return;
        }

        List<Producto> productosGrupo = inventario.get(grupo);
        boolean encontrado = false;
        for (Producto producto : productosGrupo) {
            if (producto.nombre.equals(nombre)) {
                producto.cantidad += cantidad;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            productosGrupo.add(new Producto(nombre, cantidad, grupo));
        }

        System.out.println("Producto registrado correctamente.");
    }

    public static void mostrarInventario(Map<String, List<Producto>> inventario) {
        for (String grupo : inventario.keySet()) {
            System.out.println("Grupo: " + grupo);
            for (Producto producto : inventario.get(grupo)) {
                System.out.println(producto);
            }
            System.out.println("----------------------");
        }
    }
}


class Producto {
    String nombre;
    int cantidad;
    String grupo;

    public Producto(String nombre, int cantidad, String grupo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad;
    }
}

