import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Nicole Andrea Escobar
 *         Daniel Felipe Cleves
 *         Juan Manuel De la Cruz
 *         Samuel Varela Morales
 */

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[][][] menus = {
                { { "Caracteres" }, { "Mayúsculas", "Minúsculas" } },
                { { "Numéricos" }, {} },
                { { "Comodines" }, { "Vocales con acento", "Vocales con diéresis", "Símbolos matemáticos",
                        "Símbolos comerciales", "Comillas, llaves y paréntesis" } }
                // { { "tituloMenuPrincipal" }, {"submenu", "submenu"} }
        };
        int iSelec, iSubSelec; // selección, subselección seleccionada
        String sSelec, rSelec, rSubSelec;
        boolean exit = false, haveSub = false;
        int[][] comodines = {
                { 225, 233, 237, 243, 250, 193, 201, 205, 211, 218 },
                { 228, 235, 239, 246, 252, 196, 203, 207, 214, 220 },
                { 43, 45, 42, 47, 61, 62, 60, 37 },
                { 36, 163, 165, 162, 174 },
                { 34, 39, 123, 125, 40, 41, 91, 93 }
        };

        // Muestra repetidamente el menú principal
        // y procesar la entrada del usuario hasta que el indicador `exit` se establezca
        // en verdadero.
        // Esto permite que el programa siga ejecutándose e interactuando con el usuario
        // hasta que el
        // usuario elija salir ingresando 'Q' o una entrada no válida.
        while (!exit) {
            int i = 1;
            System.out.println("Menu principal:");
            for (String[][] menu : menus) {
                System.out.println("\t" + i + ") " + menu[0][0]);
                i++;
            }
            System.out.print("\tQ) Salir\nEscribe la opción: ");
            rSelec = reader.readLine();
            try {
                iSelec = Integer.parseInt(rSelec) - 1;
            } catch (Exception e) {
                exit = true;
                break;
            }
            sSelec = menus[iSelec][0][0];

            // Menú principal
            switch (sSelec.toLowerCase()) {
                case "numéricos":
                    System.out.println("\n┌-------------------┐");
                    System.out.println("| Valores numéricos |");
                    System.out.println("├-------------------┤");
                    for (int j = 0; j < 10; j++) {
                        System.out.println("|         " + j + "         |");
                    }
                    System.out.println("└-------------------┘");
                    break;
                // El caso "predeterminado" en la declaración "switch" es establecer la variable
                // "haveSub" en "verdadero" y luego salir de la declaración "switch". Esto
                // significa que si la selección del usuario en el menú principal no coincide
                // con ninguno de los casos específicos (p. ej., "numéricos"), el programa
                // considerará que existen submenús disponibles para la opción seleccionada.
                // Esto prepara el programa para manejar submenús si existen para la opción del
                // menú principal seleccionada.
                default:
                    haveSub = true;
                    break;
            }

            if (haveSub) {
                haveSub = false;
                if ((menus[iSelec][1].length >= 1)) {
                    // Esta parte del código es responsable de manejar los submenús dentro de la
                    // selección del menú principal. Crea un bucle que muestra las opciones del
                    // submenú según la selección del usuario en el menú principal. Solicita al
                    // usuario que elija una opción de submenú y procesa esa entrada para determinar
                    // la acción correspondiente a realizar.
                    while (!exit) {
                        System.out.println("\nMenú " + sSelec);
                        i = 1;
                        for (String option : menus[iSelec][1]) {
                            System.out.println("\t" + i + ") " + option);
                            i++;
                        }
                        System.out.print("\tQ) Salir\nEscribe la opción: ");
                        rSubSelec = reader.readLine();
                        try {
                            iSubSelec = Integer.parseInt(rSubSelec) - 1;
                        } catch (Exception e) {
                            exit = true;
                            break;
                        }
                        System.out.println(sSelec.toLowerCase());

                        // Se utiliza para determinar la acción a realizar en función de la cadena
                        // concatenada de la selección del menú principal y la selección del submenú.
                        switch ((sSelec + " > " + menus[iSelec][1][iSubSelec]).toLowerCase()) {
                            case "caracteres > mayúsculas":
                                System.out.println("\n┌-----------------------┐");
                                System.out.println("| Caracteres mayúsculas |");
                                System.out.println("├-----------------------┤");
                                for (int j = 65; j <= 90; j++) {
                                    System.out.println("|           " + (char) j + "           |");
                                }
                                System.out.println("└-----------------------┘");
                                break;
                            case "caracteres > minúsculas":
                                System.out.println("\n┌---------------------┐");
                                System.out.println("| Caracteres minúsculas |");
                                System.out.println("├---------------------┤");
                                for (int j = 97; j <= 122; j++) {
                                    System.out.println("|          " + (char) j + "          |");
                                }
                                System.out.println("└---------------------┘");
                                break;
                            case "comodines > vocales con acento":
                                for (int comodin : comodines[0]) {
                                    System.out.println((char) comodin);
                                }
                                break;
                            case "comodines > vocales con diéresis":
                                for (int comodin : comodines[1]) {
                                    System.out.println((char) comodin);
                                }
                                break;
                            case "comodines > símbolos matemáticos":
                                for (int comodin : comodines[2]) {
                                    System.out.println((char) comodin);
                                }
                                break;
                            case "comodines > símbolos comerciales":
                                for (int comodin : comodines[3]) {
                                    System.out.println((char) comodin);
                                }
                                break;
                            case "comodines > comillas, llaves y paréntesis":
                                for (int comodin : comodines[4]) {
                                    System.out.println((char) comodin);
                                }
                                break;
                        }
                    }
                    exit = false;
                } else {
                    System.out.println("\n┌---------------------------------------------------------┐");
                    System.out.println("| Los submenús que buscas todavía no han sido codificados |");
                    System.out.println("└---------------------------------------------------------┘");
                }
            }
        }
        System.out.println("\nGracias por usar nuestros menús!!!\n");
    }
}
