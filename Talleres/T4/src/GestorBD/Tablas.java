package GestorBD;

import java.util.ArrayList;
import java.util.Arrays;

public class Tablas {
    String[][][] modeloTablas = {
            {
                    { "Cliente" },
                    { "Id cliente", "Nombre", "Apellido" }
            },
            {
                    { "Empleado" },
                    { "Id Empleado", "Id Almacen" }
            }
    };
    ArrayList<String[]> tablas = new ArrayList<String[]>();

    public String[] getTables() {
        ArrayList<String> result = new ArrayList<>();

        for (String[][] tabla : modeloTablas) {
            result.add(tabla[0][0]);
        }
        return result.toArray(new String[0]);
    }

    public void addRegister(String tabla, String[] registro) {
        int i = 0;
        while (i < modeloTablas.length) {
            if (modeloTablas[i][0][0] == tabla) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
