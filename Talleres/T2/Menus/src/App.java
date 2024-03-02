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
                { { "Comodines" }, {} }
        };
        int iSelec, iSubSelec; // opción, subopción seleccionada
        String sSelec, rSelec, rSubSelec;
        boolean exit = false, haveSec = false;

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
                default:
                    haveSec = true;
                    break;
            }

            if (haveSec) {
                haveSec = false;
                if ((menus[iSelec][1].length >= 1)) {
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
