import GestorConsola.GestorMenu;
import GestorBD.*;

public class App {
    public static void main(String[] args) throws Exception {

        String[] menu = { "Insercion de datos", "Modificacion de datos", "Eliminacion de datos",
                "Recuperacion de datos" };
        String seleccion;
        GestorMenu gestorMenu = new GestorMenu();
        Tablas gestorBD = new Tablas();// Aquí cambiamos el tipo de la instancia a Tablas
        String tablaActual;
        do {
            seleccion = gestorMenu.showMenu("Menú Principal", menu);
            System.out.println(seleccion + "------------");

            switch (seleccion) {
                case "Insercion de datos":
                    tablaActual = gestorMenu.showMenu("Inserción de datos", gestorBD.getTables());
                    String[] campos = gestorBD.getAttributes(tablaActual);
                    String[] nuevoRegistro = new String[campos.length];
                    int i = 0;
                    for (String campo : campos) {
                        nuevoRegistro[i] = gestorMenu.recibirPregunta("Que desea agregar en el campo " + campo + ": ");

                        i++;
                    }
                    gestorBD.addRegister(tablaActual, nuevoRegistro);
                    System.out.println("Ya se guardo");
                    break;
                case "Modificacion de datos":
                    break;
                case "Eliminacion de datos":
                    tablaActual = gestorMenu.showMenu("Eliminación de datos", gestorBD.getTables());
                    gestorMenu.showTable(tablaActual, gestorBD.getAttributes(tablaActual),
                            gestorBD.getRegisters(tablaActual));
                    int indexRegistro = Integer.parseInt(
                            gestorMenu.recibirPregunta("En que posición está el registro que deseas guardar?"));
                    gestorBD.deleteRegister(tablaActual, nuevoRegistro);
                    break;
                case "Recuperacion de datos":
                    tablaActual = gestorMenu.showMenu("Recuperación de datos", gestorBD.getTables());
                    gestorMenu.showTable(tablaActual, gestorBD.getAttributes(tablaActual),
                            gestorBD.getRegisters(tablaActual));
                    break;

                /*
                 * gestorBD.addRegister(gestorMenu, gestorBD);
                 * break;
                 * case "Modificación de datos":
                 * gestorBD.replaceRegister(gestorMenu, gestorBD);
                 * break;
                 * case "Eliminación de datos":
                 * gestorBD.deleteRegister(gestorMenu, gestorBD);
                 * break;
                 * case "Recuperación de datos":
                 * gestorBD.getRegisters(gestorMenu, gestorBD);
                 * break;
                 * case "Q":
                 * System.out.println("Saliendo...");
                 * break;
                 * default:
                 * System.out.println("Opción no válida.");
                 * break;/*
                 */
            }
        } while (!seleccion.equals("Q"));
    }

}
