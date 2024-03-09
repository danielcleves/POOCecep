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
                    { "1", "Daniel", "Cleves" },
                    { "2", "Juan", "DLC" },
                    { "3", "Samuel", "Var" },
                    { "4", "Andrea", "Esc" }
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

    /**
     * `getTables` recupera los nombres de las tablas y los devuelve como una matriz
     * de cadenas.
     * 
     * @param tabla El parámetro "tabla" es un String que representa el nombre de
     *              una tabla en la base de datos.
     * @return Una matriz de cadenas que contienen los nombres de las tablas de la
     *         matriz `modeloTablas`.
     */
    public String[] getTables() {
        ArrayList<String> result = new ArrayList<>();

        for (String[][] tabla : modeloTablas) {
            result.add(tabla[0][0]);
        }
        return result.toArray(new String[0]);
    }

    /**
     * `getAttributes` devuelve una matriz de atributos para un nombre de
     * tabla determinado.
     * 
     * @param tabla El parámetro "tabla" es un String que representa el nombre de
     *              una tabla en la base de datos.
     * @return Una matriz de atributos para la tabla especificada.
     */
    public String[] getAttributes(String tabla) {
        return modeloTablas[getTableIndex(tabla)][1];
    }

    // El método `getRegisters` en la clase `Tablas` recupera los registros de una
    // tabla específica.
    public String[][] getRegisters(String tabla) {
        ArrayList<String[]> preResult = tablas.get(getTableIndex(tabla));
        int longitud = preResult.size();
        String[][] result = new String[longitud][];
        for (int i = 0; i < longitud; i++) {
            result[i] = preResult.get(i);
        }
        return result;
    };

    /**
     * `addRegister` agrega un nuevo registro a una tabla especificada.
     * 
     * @param tabla    El parámetro "tabla" en el método addRegister representa el
     *                 nombre de la tabla
     *                 donde se agregará el registro.
     * @param registro El parámetro `registro` es una matriz de cadenas que
     *                 representan un único
     *                 registro o fila de datos que desea agregar a una tabla
     *                 específica en su base de datos. Cada
     *                 elemento de la matriz corresponde a un valor de columna en la
     *                 tabla.
     */
    public void addRegister(String tabla, String[] registro) {
        ArrayList<String[]> targetTable = tablas.get(getTableIndex(tabla));
        targetTable.add(registro);
    }

    /**
     * `deleteRegister` elimina un registro específico de una tabla en una base de
     * datos.
     * 
     * @param tabla    El parámetro "tabla" representa el nombre de la tabla de la
     *                 cual desea eliminar un
     *                 registro específico.
     * @param registro El parámetro `registro` es una matriz de cadenas que
     *                 representan los datos de un
     *                 registro que desea eliminar de una tabla específica en una
     *                 base de datos.
     */
    public void deleteRegister(String tabla, String[] registro) {
        tablas.get(getTableIndex(tabla)).remove(registro);
    }

    // El método `replaceRegister` en la clase `Tablas` reemplaza un registro
    // existente en una tabla
    // específica con un nuevo registro.
    public void replaceRegister(String tabla, String[] registroViejo, String[] registroNuevo) {
        tablas.get(getTableIndex(tabla)).remove(registroViejo);
        addRegister(tabla, registroNuevo);
    }
}
