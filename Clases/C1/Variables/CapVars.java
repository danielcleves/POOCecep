package Variables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nicole Andrea Escobar
 *         Daniel Felipe Cleves
 *         Juan Manuel De la Cruz
 *          Samuel Varela Morales
 */
public class CapVars {
public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int idCli;
    public static String sNompac;
    public static String sApapac;
    private static char cGenpac;
    private static String dFecNac;
    public static double dPesopac;
    private static float fEstapac;

    private static String sPalabra = "Hospital Pacientes Cronicos";

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("\t\t\t" + sPalabra + "\t\t\t");
        System.out.print("\nIdentificacion: ");
        idCli=Integer.parseInt(reader.readLine());
        
        System.out.print("\nNombre: ");
        sNompac=reader.readLine();
        
        
        System.out.print("\nIdentificacion: " + idCli
                + "\nNombre: " + sNompac);
    }
    
}
