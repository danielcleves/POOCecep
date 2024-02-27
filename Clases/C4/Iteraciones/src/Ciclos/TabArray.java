/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

/**
 *
 * @author estudiantes
 */
public class TabArray {

    private static int[] nProductos = new int[10];
    public static int[] nMando = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] nMador = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    public static void main(String[] args) {
        for (int i = 0; i < nProductos.length; i++) {
            nProductos[i]=nMando[i]*nMador[i];
            System.out.println(nMando[i]+ " * "+nMador[i]+" = "+nProductos[i]);
        }
    }
}
