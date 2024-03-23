
package trabajo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author  Nicole Andrea Escobar
 *         Daniel Felipe Cleves
 *         Juan Manuel De la Cruz
 *          Samuel Varela Morales
 */
public class hBuff {
    
    // Esta sección se encuentran nuestras variables de entradas
    
    private static int idCli;
    public static String sNamep;
    public static String sApep;
    private static char cGenp;
    private static String sDate;
    public static double dPeso;
    public static float fTall;
    public static String sNameComp = "Hospital Psquiatrico - Create Account";
    
    // BufferedReader para la entrada de datos
    
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    /**El IOException sirve para proporcionar posibilidades de 
                manejo de errores para sus programas**/
    
    public static void main(String[] args) throws IOException {  
        
        // Aqui empezamos a preguntarle los datos al paciente
        
        System.out.print("\t\t\t " + sNameComp + "\t\t\t");
        System.out.print("\nIdentificación: ");
        idCli = Integer.parseInt(reader.readLine());  // De esta manera capturamos los Numéricos
        
        System.out.print("\nIngrese su nombre: ");
        sNamep = reader.readLine();   // De esta manera capturamos los String
        
        System.out.print("\nIngrese su apellido: ");
        sApep = reader.readLine();
        
        System.out.print("\nIngrese su genero: ");
        cGenp = reader.readLine().charAt(0);
        
        System.out.print("\nIngrese su fecha de nacimiento: " );
        sDate = reader.readLine();
        
        System.out.print("\nIngrese su peso en Kg: ");
        dPeso = Double.parseDouble(reader.readLine());
        
        System.out.print("\nIngrese su altura en cm: ");
        fTall = Float.parseFloat(reader.readLine());
        
        // Esta sección se encuentra lo que queremos imprimir
        
        System.out.print("\t\t\t" + sNameComp + "\t\t\t");
        System.out.println("\nIdentificación: " + idCli
                + "\nNombre del paciente: " + sNamep
                + "\nApellido del paciente: " + sApep
                + "\nEl genero de " + sNamep + " " + sApep + " es: " + cGenp 
                + "\nLa fecha de nacimiento es: " + sDate 
                + "\nEl peso del paciente es: " + dPeso
                + "\nLa altura del paciente es: " + fTall);
        
    }
}

