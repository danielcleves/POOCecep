package EstSi;

/* Estudiantes  Nicole Andrea Escobar
 *               Daniel Felipe Cleves
 *              Juan Manuel De la Cruz
 *              Samuel Varela Morales
 */

public class TiposSi {
    public static int nIdcli = 4168;
    private static char cGencli = 'F';
    public static String sColor = "naranja";

    public static void main(String[] args) {
        System.out.println("\t\t\tEstructura Selectiva si");
        System.out.println("\t\t\tSi Simple\t\t\t");
        if (nIdcli == 4568)
            System.out.println("Acceso Concedido");
        if (nIdcli != 4568)
            System.out.println("Negado");
        System.out.println("\t\t\tSi compuesta \t\t\t");
        if (cGencli == 'F' || cGencli == 'f') {
            System.out.println("Femenino");
        } else {
            System.out.println("Masculino");
        }
        System.out.println("\t\t Si anidadas\t\t");
        if (sColor == "BLANCO" || sColor == "Blanco" || sColor == "blanco") {
            System.out.println("Dia");
        } else if (sColor == "NARANJA" || sColor == "Naranja" || sColor == "naranja") {
            System.out.println("1/2 Dia");
        } else {
            System.out.println("Otra Jornada");
        }
    }

}
