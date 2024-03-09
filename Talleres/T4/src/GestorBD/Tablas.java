package GestorBD;

import java.util.ArrayList;

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
    String[][][] registrosQuemados = {
            {
                    { "1", "Daniel", "Cleves" }
            },

            {
                    { "1", "2" }
            }
    };

    ArrayList<ArrayList<String[]>> tablas = new ArrayList<ArrayList<String[]>>();

    public Tablas() {
        // Se añaden los registros quemados
        int i = 0;
        for (String[][] tabla : registrosQuemados) {
            tablas.add(new ArrayList<String[]>());
            for (String[] registro : tabla) {
                tablas.get(i).add(registro);
            }
            i++;
        }
    }

    public int getTableIndex(String tabla) {
        int i = 0;
        while (i < modeloTablas.length) {
            if (modeloTablas[i][0][0] == tabla) {
                break;
            }
            i++;
        }
        return i;
    }

    public String[] getTables() {
        ArrayList<String> result = new ArrayList<>();

        for (String[][] tabla : modeloTablas) {
            result.add(tabla[0][0]);
        }
        return result.toArray(new String[0]);
    }

    public String[] getAttributes(String tabla) {
        return modeloTablas[getTableIndex(tabla)][1];
    }

    public String[][] getRegisters(String tabla) {
        ArrayList<String[]> preResult = tablas.get(getTableIndex(tabla));
        int longitud = preResult.size();
        String[][] result = new String[longitud][];
        for (int i = 0; i < longitud; i++) {
            result[i] = preResult.get(i);
        }
        return result;
    };

    public void addRegister(String tabla, String[] registro) {
        ArrayList<String[]> targetTable = tablas.get(getTableIndex(tabla));
        targetTable.add(registro);
    }

}
