package GestorConsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestorMenu {
    public static void main(String[] args) throws IOException {

        GestorMenu gestorMenu = new GestorMenu();
        String opcionSeleccionada = gestorMenu.showMenu("Menú Principal",
                new String[] { "Opción 1", "Opción 2", "Opción 3" });
        System.out.println("Opción seleccionada: " + opcionSeleccionada);

    }

    public String showMenu(String menu, String[] opciones) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Obtener la longitud máxima de las opciones
        int maxLongitudOpcion = 0;
        for (String opcion : opciones) {
            maxLongitudOpcion = Math.max(maxLongitudOpcion, opcion.length());
        }

        // Obtener la longitud máxima entre el menú y las opciones
        int longitudTitulo = Math.max(maxLongitudOpcion + 20, menu.length() + 20);

        // Imprimir línea decorativa superior
        System.out.print("╔");
        for (int j = 0; j < longitudTitulo - 4; j++) {
            System.out.print("═");
        }
        System.out.println("╗");

        // Imprimir el título
        System.out.printf("║%-" + (longitudTitulo - 2) + "s║\n", menu);

        // Imprimir línea decorativa entre encabezados y datos
        System.out.print("╠");
        for (int j = 0; j < longitudTitulo - 4; j++) {
            System.out.print("═");
        }
        System.out.println("╣");

        // Imprimir opciones verticalmente
        for (String encabezado : opciones) {
            System.out.printf("║ %-" + (longitudTitulo - 4) + "s ║\n", encabezado);
        }

        // Imprimir línea decorativa debajo de los encabezados
        System.out.print("╠");
        for (int j = 0; j < longitudTitulo - 4; j++) {
            System.out.print("═");
        }
        System.out.println("╣");

        // Opción para salir
        System.out.printf("║ %-" + (longitudTitulo - 5) + "s ║\n", (opciones.length + 1) + ") Salir");

        // Imprimir línea decorativa inferior
        System.out.print("╚");
        for (int j = 0; j < longitudTitulo - 4; j++) {
            System.out.print("═");
        }
        System.out.println("╝");

        System.out.print("Opción: ");

        String opcionSeleccionada = reader.readLine();

        // Verificar si la opción seleccionada es válida
        if (opcionSeleccionada.equalsIgnoreCase("q")) {
            System.out.println("Saliendo...");
            System.exit(0); // Salir del programa
        }

        int opcion = Integer.parseInt(opcionSeleccionada);
        if (opcion < 1 || opcion > opciones.length + 1) {
            System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            return showMenu(menu, opciones); // Volver a mostrar el menú
        }

        return (opcion == opciones.length + 1) ? "Salir" : opciones[opcion - 1];
    }
}
