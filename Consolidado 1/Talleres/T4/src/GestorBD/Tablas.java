package GestorBD;

import java.util.ArrayList;

public class Tablas {
        public static void main(String[] args) {
                // Sección creada para pruebas
        }

        String[][][] modeloTablas = {
                        {
                                        { "Cliente" },
                                        { "Id cliente", "Nombre", "Apellido", "Tipo de documento de identificacion",
                                                        "Numero de documento de identificacion",
                                                        "Lugar de expedicion del documento",
                                                        "Direccion de recidencia",
                                                        "Telefono", "Email", "Genero", "Fecha de nacimiento" }
                        },
                        {
                                        { "Empleado" },
                                        { "Id Empleado", "Id Almacen", "Nombre", "Apellidos",
                                                        "Tipo de documento de identificacion",
                                                        "Numero de documento de identificacion",
                                                        "Direccion de recidencia", "Telefono", "Email",
                                                        "Genero", "Fecha de nacimiento", "Info seguro",
                                                        "Tipo de contrato", "Duracion de contrato",
                                                        "Fondo de pensiones", "Sueldo", "Inicio de trabajo" }
                        },
                        {
                                        { "Producto" },
                                        { "Id producto", "Marca", "Nombre del producto", "Codigo del producto",
                                                        "Descripcion del producto",
                                                        "Stock", "Precio",
                                                        "Fecha de ingreso", "Numero de factura", "Categoría", "Marca" }
                        },
                        {
                                        { "Ubicacion" },
                                        { "Id producto", "Id almacen" }
                        },
                        {
                                        { "Factura cliente" },
                                        { "Id factura cliente", "Id cliente", "Fecha" }
                        },
                        {
                                        { "Compra cliente" },
                                        { "Id compra cliente", "Id producto", "Id factura cliente", "Precio",
                                                        "Cantidad" }
                        },
                        {
                                        { "Almacen" },
                                        { "Id almacen", "Nombre almacen", "Dimensiones" }
                        },
        };
        String[][][] registrosQuemados = {
                        // Registros para la tabla "Cliente"
                        {
                                        { "1", "Daniel", "Cleves", "CC", "123456789", "Cali", "Ciudad Cordoba",
                                                        "3223777777",
                                                        "daniel.cleves.rueda@gmail.com", "M", "15/7/2005" },
                                        { "2", "Juan", "DLC", "CC", "123456789", "Cali", "Ciudad Cordoba", "3223777777",
                                                        "daniel.cleves.rueda@gmail.com", "M", "15/7/2005" },
                                        { "3", "Samuel", "Var", "CC", "123456789", "Cali", "Ciudad Cordoba",
                                                        "3223777777",
                                                        "daniel.cleves.rueda@gmail.com", "M", "15/7/2005" },
                                        { "4", "Andrea", "Esc", "CC", "123456789", "Cali", "Ciudad Cordoba",
                                                        "3223777777",
                                                        "daniel.cleves.rueda@gmail.com", "M", "15/7/2005" }
                        },
                        // Registros para la tabla "Empleado"
                        {
                                        { "1", "1", "Juan", "Perez", "CC", "987654321", "Cali", "3223334444",
                                                        "juan.perez@example.com",
                                                        "M", "10/5/1990", "Seguro XYZ", "Tiempo Completo", "Indefinido",
                                                        "Colpensiones", "5000000",
                                                        "01/01/2020" },
                                        { "2", "1", "Maria", "Lopez", "CC", "123123123", "Bogota", "3112223333",
                                                        "maria.lopez@example.com",
                                                        "F", "15/8/1995", "Seguro ABC", "Medio Tiempo", "1 año",
                                                        "Porvenir", "3500000",
                                                        "01/03/2021" }
                        },
                        // Registros para la tabla "Producto"
                        {
                                        { "1", "Samsung", "Galaxy S20", "SAMSUNG001",
                                                        "Smartphone Samsung Galaxy S20 5G", "100", "1000000",
                                                        "01/01/2024", "123456", "Smartphones", "Samsung" },
                                        { "2", "Apple", "iPad Pro", "APPLE001", "Tablet iPad Pro de 11 pulgadas", "50",
                                                        "2000000",
                                                        "01/02/2024", "789012", "Tablets", "Apple" },
                                        { "3", "Sony", "PlayStation 5", "SONY001", "Consola PlayStation 5", "30",
                                                        "1500000",
                                                        "01/03/2024", "456789", "Consolas", "Sony" }
                        },
                        // Registros para la tabla "Ubicacion"
                        {
                                        { "1", "1" },
                                        { "2", "1" }
                        },
                        // Registros para la tabla "Factura cliente"
                        {
                                        { "1", "1", "10/01/2024" },
                                        { "2", "2", "15/01/2024" }
                        },
                        // Registros para la tabla "Compra cliente"
                        {
                                        { "1", "1", "1", "1000000", "2" },
                                        { "2", "2", "2", "1500000", "1" }
                        },
                        // Registros para la tabla "Almacen"
                        {
                                        { "1", "Almacen Principal", "10x10x10" },
                                        { "2", "Almacen Secundario", "8x8x8" }
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

        // Revisar el funcionamiento de este metodo
        public String[] getAttribute(int index, String tabla) {
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
        // existente en una tabla específica con un nuevo registro.
        public void replaceRegister(String tabla, String[] registroViejo, String[] registroNuevo) {
                tablas.get(getTableIndex(tabla)).remove(registroViejo);
                addRegister(tabla, registroNuevo);
        }
}
