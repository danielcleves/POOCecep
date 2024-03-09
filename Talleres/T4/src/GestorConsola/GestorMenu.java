package GestorConsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class GestorMenu {
    public static void main(String[] args) throws IOException {

        GestorMenu gestorMenu = new GestorMenu();
        String opcionSeleccionada = gestorMenu.showMenu("Menú Principal",
                new String[] { "Opción 1", "Opción 2", "Opción 3" });
        System.out.println("Opción seleccionada: " + opcionSeleccionada);

    }

    public String showMenu(String menu, String[] opciones) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Obtener la longitud máxima de cada columna
        int maxLongitudTitulo = centrarTexto(menu, 0).length();
        int[] maxLongitudesColumnas = new int[opciones.length];

        for (int i = 0; i < opciones.length; i++) {
            maxLongitudesColumnas[i] = centrarTexto(opciones[i], 0).length();
        }

        int longitudTitulo = Math.max(maxLongitudTitulo + 4, Arrays.stream(maxLongitudesColumnas).max().orElse(0) + 4);

        // Imprimir línea decorativa superior
        System.out.print("╔");
        printLineaHorizontal(longitudTitulo);
        System.out.println("╗");

        // Imprimir el título
        System.out.printf("║%-" + (longitudTitulo - 4) + "s║\n", centrarTexto(menu, longitudTitulo - 4));

        // Imprimir línea decorativa entre encabezados y datos
        System.out.print("╠");
        printLineaHorizontal(longitudTitulo);
        System.out.println("╣");

        // Imprimir opciones verticalmente
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("║%-" + (longitudTitulo - 4) + "s║\n", centrarTexto(opciones[i], longitudTitulo - 4));
        }

        // Imprimir línea decorativa debajo de los encabezados
        System.out.print("╠");
        printLineaHorizontal(longitudTitulo);
        System.out.println("╣");

        // Opción para salir
        System.out.printf("║%-" + (longitudTitulo - 4) + "s║\n", centrarTexto(" Q)Salir", longitudTitulo - 6));

        // Imprimir línea decorativa inferior
        System.out.print("╚");
        printLineaHorizontal(longitudTitulo);
        System.out.println("╝");

        System.out.print("Opción: ");

        String opcionSeleccionada = reader.readLine();

        // Verificar si la opción seleccionada es válida
        if (opcionSeleccionada.equalsIgnoreCase("q")) {
            System.out.println("Saliendo...");
            System.exit(0); // Salir del programa
        }

        int opcion = Integer.parseInt(opcionSeleccionada);
        if (opcion < 1 || opcion > opciones.length) {
            System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            return showMenu(menu, opciones); // Volver a mostrar el menú
        }

        return opciones[opcion - 1];
    }
        
    private void printLineaHorizontal(int longitud) {
        int longitudMaxima = Math.max(longitud, 80); // Establece un límite máximo de longitud (por ejemplo, 80 caracteres)
        for (int j = 0; j < longitudMaxima; j++) {
            System.out.print("═");
        }
    }

    private static String centrarTexto(String texto, int espacios) {
        int longitudTexto = texto.length();
        int espaciosEnCadaLado = Math.max(0, (espacios - longitudTexto) / 2);

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < espaciosEnCadaLado; i++) {
            resultado.append(" ");
        }
        resultado.append(texto);
        for (int i = 0; i < espaciosEnCadaLado; i++) {
            resultado.append(" ");
        }

        return resultado.toString();
    }

    public String recibirPregunta(String pregunta) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(pregunta + " ");
        return reader.readLine();
    }
    
    public void showTable(String nombreTabla, String[] atributos, String[][] registros) throws IOException {
        System.out.println(nombreTabla);
        System.out.println("--------------------");
        for (String atributo : atributos) {
            System.out.print(atributo + "\t");
        }
        System.out.println("--------------------");
        for (String[] registro : registros) {
            for (String atributo : registro) {
                System.out.print(atributo + "\t");
            }
            System.out.println("- - - - - - - - - - -");
        }
    }
    
}
