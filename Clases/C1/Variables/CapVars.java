/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class CapVars {
public static Scanner sLea=new Scanner(System.in);
public static Scanner xLea=new Scanner(System.in);
    private static int idCli;
    public static String sNompac;
    public static String sApapac;
    private static char cGenpac;
    private static String dFecNac;
    public static double dPesopac;
    private static float fEstapac;

    private static String sPalabra = "Hospital Pacientes Cronicos";

    public static void main(String[] args) {
        System.out.println("\t\t\t" + sPalabra + "\t\t\t");
        System.out.print("\nIdentificacion: ");
        idCli=xLea.nextInt();
        
        System.out.print("\nNombre: ");
        sNompac=sLea.nextLine();
        
        
        System.out.print("\nIdentificacion: " + idCli
                + "\nNombre: " + sNompac);

    }

}
