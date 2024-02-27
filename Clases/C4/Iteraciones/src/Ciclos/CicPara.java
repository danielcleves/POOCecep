/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class CicPara {

    public static int[] nMando;
    public static Scanner nLea = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Impresion de Numeros");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Numero: " + i);//CAST - CASTING - CASTEO

        }
        System.out.println("Impresion de Codigo Ascii");
        for (int i = 97; i >= 97 && i < 123; i++) {
            System.out.println("Ascii: " + (int) (char) i + " Numeros: " + (char) i);

        }
        System.out.println("Manejon de Cadena Ciclo Para");
        String sPalabra = "M47C13L@g0";
        System.out.println("Longitud Cadena: "+sPalabra.length());
        for (int i = 0; i < sPalabra.length(); i++) {
            System.out.println("Letra: " + sPalabra.charAt(i) + " = " + (int) sPalabra.charAt(i));

        }

        System.out.println("Manejo de Vectores");
        
        System.out.println("Digite la Longitud del Vector: ");
        int nLongitud=nLea.nextInt();
        nMando= new int[nLongitud];
        System.out.println("Longitud nMando:"+nMando.length);
        System.out.println("Adicionando Valores");
        try {
            for (int i = 0; i < nMando.length; i++) {
                System.out.println("Digite Valor: ");
                nMando[i] = nLea.nextInt();
            }
            System.out.println("Imprimiendo Vector con posiciones con ciclo Para");
            for (int j = 0; j < nMando.length; j++) {
                System.out.println("Pos[" + j + "]=" + nMando[j]);

            }
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
