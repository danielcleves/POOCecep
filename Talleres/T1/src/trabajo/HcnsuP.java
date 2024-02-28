package trabajo;

import java.util.Scanner;

/**
 *
 * @author Samuel Varela 
 *     Juan Manuel De La Cruz 
 *      Daniel Felipe Cleves
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

    public static Scanner sLea = new Scanner(System.in);
    public static Scanner xLea = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Aqui empezamos a preguntarle los datos al paciente
        
        System.out.print("\t\t\t " + sNameComp + "\t\t\t");
        System.out.print("\nIdentificación: ");
        idCli = xLea.nextInt();  // De esta manera caputramos los Numericos
        
        System.out.print("\nIngrese su nombre: ");
        sNamep = sLea.next();   // De esta manera caputramos los String
        
        System.out.print("\nIngrese su apellido: ");
        sApep = sLea.next();
        
        System.out.print("\nIngrese su genero: ");
        cGenp = sLea.next().charAt(0);
        
        System.out.print("\nIngrese su fecha de nacimiento: " );
        sDate = sLea.next();
        
        System.out.print("\nIngrese su peso en Kg: ");
        dPeso = xLea.nextDouble();
        
        System.out.print("\nIngrese su altura en cm: ");
        fTall = xLea.nextFloat();
        
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
