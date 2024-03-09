import GestorConsola.GestorMenu;
import GestorBD.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] menu = { "Inserción de datos", "Modificación de datos", "Eliminación de datos", "Recuperación de datos" };
        String seleccion;
        GestorMenu gestorMenu = new GestorMenu();
        GestorBD.Tablas gestorBD = new Tablas();

        do {
            seleccion = gestorMenu.showMenu("Menú Principal", menu);
            System.out.println(seleccion);
            switch (seleccion) {
                case "Inserción de datos":
                    addRegister(gestorMenu, gestorBD, "Seleccione una tabla para inserción de datos:");
                    break;
                case "Modificación de datos":
                    replaceRegister(gestorMenu, gestorBD, "Seleccione una tabla para modificación de datos:");
                    break;
                case "Eliminación de datos":
                    deleteRegister(gestorMenu, gestorBD, "Seleccione una tabla para eliminación de datos:");
                    break;
                case "Recuperación de datos":
                    getRegisters(gestorMenu, gestorBD, "Seleccione una tabla para recuperación de datos:");
                    break;
                case "Q":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!seleccion.equals("Q"));
    }

    private static void getRegisters(GestorMenu gestorMenu, Tablas gestorBD, String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getRegisters'");
    }

    private static void deleteRegister(GestorMenu gestorMenu, Tablas gestorBD, String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'deleteRegister'");
    }

    private static void replaceRegister(GestorMenu gestorMenu, Tablas gestorBD, String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'replaceRegister'");
    }

    private static void addRegister(GestorMenu gestorMenu, Tablas gestorBD, String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'addRegister'");
    }   
        
}

