/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import sun.nio.cs.StreamDecoder;

/**
 *
 * @author estudiantes
 */
public class ParaExt {

    public static int[] nMando = {7, 11, 12, 1, 3};
    public static int[] nMador = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] nProducto=new int[nMando.length];

    public static void main(String[] args) {

        for (int i = 0; i < nMando.length; i++) {
            nProducto[i] = nMando[i] * nMador[i];
        }
        System.out.println("*******Para Natural***********");
         for (int i = 0; i < nMando.length; i++) {
             nProducto[i] = nMando[i] * nMador[i];
             System.out.println(nMando[i]+" * "+nMador[i]+" = "+nProducto[i]);
        }
        System.out.println("********Para Extendido**");
        for (int pro : nProducto) {
            System.out.println(pro);
        }
    }
}
