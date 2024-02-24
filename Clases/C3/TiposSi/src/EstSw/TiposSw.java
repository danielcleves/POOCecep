package EstSw;

import java.util.Scanner;

public class TiposSw {
    public static char cOpc;
    public Scanner cLea = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Menu Principal");
        System.out.println("\nA.Selectivas");
        System.out.println("\nB.Iterativas");
        System.out.println("\nQ.Salir");
        System.out.print("\nDigite la opción: ");
        switch (cOpc) {
            case 'A':
            case 'a':
                System.out.println("1.if");
                System.out.println("2.sw");
                System.out.println("Q.salir");
                break;
            case 'B':
            case 'b':
                System.out.println("for");
                System.out.println("foreach");
                System.out.println("while");
                System.out.println("do...while");
                break;
            case 'Q':
            case 'q':
                System.out.println("Hasta la vista");
                if (cOpc == 'Q' || cOpc == 'q') {
                    System.exit(0);
                }
                break;

            default:
                System.out.println("Digite los valores dentro del rango");
                break;
        }
    }
}
