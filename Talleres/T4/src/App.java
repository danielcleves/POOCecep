import GestorConsola.GestorMenu;
import GestorBD.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] menu = { "Insercion de datos", "Modificacion de datos", "Eliminacion de datos",
                "Recuperacion de datos" };
        String seleccion;

        GestorMenu gestorMenu = new GestorMenu();
        GestorBD.Tablas gestorBD = new Tablas();

        seleccion = gestorMenu.showMenu("Menu principal", menu);
        System.out.println(seleccion);

        gestorMenu.showMenu(seleccion, gestorBD.getTables());
        switch (seleccion) {
            case "Insercion de datos":
                String insD = gestorMenu.showMenu // Insercion de datos
                ("Seleccione una tabla para insertar datos:", menu);
                String[] tablaIn = gestorBD.getTables();
                break;

            case "Modificacion de datos":
                String modiDa = gestorMenu.showMenu // Modificacion de datos
                ("Seleccione una tabla para Modificar datos:", menu);
                String[] tablaMod = gestorBD.getTables();
                break;

            case "Eliminacion de datos":
                String eliDa = gestorMenu.showMenu // Modificacion de datos
                ("Seleccione una tabla para eliminar datos:", menu);
                String[] tablaEli = gestorBD.getTables();
                break;

            case "Recuperacion de datos": // Recuperador de datos
                String recuDa = gestorMenu.showMenu("Seleccione una tabla para recuperacion de datos:", menu);
                String[] tablaD = gestorBD.getTables();
                break;

            case "Q":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
}
