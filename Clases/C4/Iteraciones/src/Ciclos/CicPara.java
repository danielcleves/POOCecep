package Ciclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author estudiantes
 */
public class CicPara {

    // Declaración del vector nMando y el objeto Scanner nLea
    public static int[] nMando;
    public static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        // Imprime números del 0 al 10
        System.out.println("Impresion de Numeros");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Numero: " + i);//CAST - CASTING - CASTEO

        }
        // Imprime caracteres ASCII de 'a' a 'z' junto con sus valores numéricos
        System.out.println("Impresion de Codigo Ascii");
        for (int i = 97; i >= 97 && i < 123; i++) {
            System.out.println("Ascii: " + (int) (char) i + " Numeros: " + (char) i);

        }
        // Muestra la longitud de la cadena 'sPalabra' y los valores ASCII de sus caracteres
        System.out.println("Manejon de Cadena Ciclo Para");
        String sPalabra = "M47C13L@g0";
        System.out.println("Longitud Cadena: "+sPalabra.length());
        for (int i = 0; i < sPalabra.length(); i++) {
            System.out.println("Letra: " + sPalabra.charAt(i) + " = " + (int) sPalabra.charAt(i));

        }

        // Solicita al usuario la longitud del vector y lo llena con valores ingresados por el usuario
        System.out.println("Manejo de Vectores");
        
        System.out.println("Digite la Longitud del Vector: ");
        int nLongitud= Integer.parseInt(reader.readLine());
        nMando= new int[nLongitud];
        System.out.println("Longitud nMando:"+nMando.length);
        System.out.println("Adicionando Valores");
        try {
            for (int i = 0; i < nMando.length; i++) {
                System.out.println("Digite Valor: ");
                nMando[i] = Integer.parseInt(reader.readLine());
            }
             // Imprime el vector con posiciones utilizando un ciclo for natural
            System.out.println("Imprimiendo Vector con posiciones con ciclo Para");
            for (int j = 0; j < nMando.length; j++) {
                System.out.println("Pos[" + j + "]=" + nMando[j]);

            }
            // Imprime el vector con posiciones utilizando un ciclo for extendido
            System.out.println("Imprimiendo Vector con posiciones con ciclo ParaExt");
            int c=0;
            for (int x : nMando) {
                System.out.println("Pos["+c+"]= "+ x);   
            ++c;
            }
 
        } catch (Exception e) {
            System.out.println("Error de Desbordamiento!!!" + e);
        }

    }
}
