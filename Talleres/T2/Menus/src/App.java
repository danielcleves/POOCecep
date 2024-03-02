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
        String[][][] menus = { { { "Caracteres" }, { "Mayúsculas", "Minúsculas" } }, { { "Numéricos" } },
                { { "Comodines" } } };
        int iSelec, iSubSelec; // opción, subopción seleccionada
        String sSelec; // Guarda la opción selecionada, si es una sub opción se guarda como
                       // "opción > subopción"

        int i = 1;
        for (String[][] menu : menus) {
            System.out.println(i + ") " + menu[0][0]);
            i++;
        }
        System.out.print("Q) Salir\nEscribe la opción: ");
        iSelec = Integer.parseInt(reader.readLine()) - 1;
        sSelec = menus[iSelec][0][0];

        // Aquí se validará si la respuesta es una respuesta final y si lo es se
        // ejecutará lo pedido

        i = 1;
        for (String option : menus[iSelec][1]) {
            System.out.println(i + ") " + option);
            i++;
        }
        System.out.print("Q) Salir\nEscribe la opción: ");
        iSubSelec = Integer.parseInt(reader.readLine()) - 1;
        sSelec += " > " + menus[iSelec][1][iSubSelec];

        System.out.println(sSelec);

        // Aquí se validará si la respuesta es una respuesta final y si lo es se
        // ejecutará lo pedido
    }
}
