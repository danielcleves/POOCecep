import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[][][] menus = { { { "Caracteres" }, { "Mayúsculas", "Minúsculas" } }, { { "Numéricos" } },
                { { "Comodines" } } };
        int iSelec, iSubSelec;
        String sSelec;

        int i = 1;
        for (String[][] menu : menus) {
            System.out.println(i + ") " + menu[0][0]);
            i++;
        }
        System.out.print("Q) Salir\nEscribe la opción: ");
        iSelec = Integer.parseInt(reader.readLine()) - 1;
        sSelec = menus[iSelec][0][0];

        // Aquí se validará si la respuesta es una respuesta final

        i = 1;
        for (String option : menus[iSelec][1]) {
            System.out.println(i + ") " + option);
            i++;
        }
        System.out.print("Q) Salir\nEscribe la opción: ");
        iSubSelec = Integer.parseInt(reader.readLine()) - 1;
        sSelec += " > " + menus[iSelec][1][iSubSelec];

        System.out.println(sSelec);
    }
}
