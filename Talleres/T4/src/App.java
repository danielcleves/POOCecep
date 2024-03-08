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
        switch (seleccion) {
            case "Insercion de datos":
                gestorMenu.showMenu(seleccion, gestorBD.getTables());
                break;
            default:
                System.out.println("Esta opción todavía no está codificada");
                break;
        }
    }
}
