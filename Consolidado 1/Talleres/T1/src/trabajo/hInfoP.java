package trabajo;

/**
 *
 * @author   Nicole Andrea Escobar
 *         Daniel Felipe Cleves
 *         Juan Manuel De la Cruz
 *          Samuel Varela Morales
 */
public class hInfoP {
    
    // Esta sección se encuentran nuestras variables ya nombradas
    
    private static int idCli = 8967;
    public static String sNamep = "Kevin";
    public static String sApep = "Gomez";
    private static char cGenp = 'M';                
    private static String sDate = "01/02/2005";
    public static double dPeso = 56.5;
    public static float fTall = 1.55f;

    public static String sNameComp = "Hospital Psquiatrico - Usuario";

    public static void main(String[] args) {
        
        // Aquí imprimimos nuestras variables ya nombradas
        
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
