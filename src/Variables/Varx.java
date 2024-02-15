/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

//estoy debajo del paquete

/**
 *
 * @author estudiantes
 */
public class Varx {

  private static int idCli = 4510;
  public static String sNompac = "Elvira";
  public static String sApapac = "Millan";
  private static char cGenpac = 'F';
  private static String dFecNac = "01/01/2001";
  public static final double dPesopac = 135.5;
  private static float fEstapac = 1.75f;

  private static String sPalabra = "Hospital Pacientes Cronicos";

  public static void main(String[] args) {
    System.out.println("\t\t\t" + sPalabra + "\t\t\t");
    System.out.print("\nIdentificacion: " + idCli + "\nNombre: " + sNompac);
  }
}
