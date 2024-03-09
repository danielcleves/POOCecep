package GestorConsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestorMenu {

        public static void main(String[] args) throws IOException {
       
            GestorMenu gestorMenu = new GestorMenu(); 
            String opcionSeleccionada = gestorMenu.showMenu("Menú Principal", new String[]{"Opción 1", "Opción 2", "Opción 3"});
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
            
        }
       
       public String showMenu(String titulo, String[] opciones) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("--------" + titulo + "--------");
                for (int i = 0; i < opciones.length; i++) {
                    System.out.println((i + 1) + ") " + opciones[i]);
                }
                System.out.println("Q) Salir");
                System.out.print("Opción: ");
                return reader.readLine(); 
        }
}
