package trabajo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 *
 * @author  Nicole Andrea Escobar
 *         Daniel Felipe Cleves
 *         Juan Manuel De la Cruz
 *          Samuel Varela Morales
 *             
 */
public class HcnsuP {
    
    // Esta sección se encuentran nuestras variables de entradas
    
    private static int idCli;
    public static String sNamep;
    public static String sApep;
    private static char cGenp;
    private static String sDate;
    public static double dPeso;
    public static float fTall;
    public static String sNameComp = "Hospital Psquiatrico - Create Account";
    
    // Hay un Scanner para las variables tipo cadenas y otra numerico

    public static BufferedReader reader = new BufferedReader(InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        // El paciente ingresa los datos        
        System.out.print("\t\t\t " + sNameComp + "\t\t\t");
        System.out.print("\nIdentificación: ");
        idCli = Integer.parseInt(reader.readLine()); // De esta manera caputramos los Numericos
        
        System.out.print("\nIngrese su nombre: ");
        sNamep = reader.readLine();  // De esta manera caputramos los String
        
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

    private static Reader InputStreamReader(InputStream in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'InputStreamReader'");
    }
}
