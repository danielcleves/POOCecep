package GestorConsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestorMenu {
    // Aquí se ha a recibir un String[] y se debe devolver un String (el
    // seleccionado)
    public String showMenu(String titulo, String[] opcion) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------" + titulo + "--------");
        for (int i = 0; i < opcion.length; i++) {
            System.out.println((i + 1) + ") " + opcion[i]);
        }
        System.out.println("Q) Salir");
        System.out.print("Opción: ");
        return reader.readLine();

    }
}
