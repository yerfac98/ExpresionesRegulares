/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author Gerardo Fac
 */
public class E_30_11StringBuilderCapLen {

    public static void main(String[] args) {

        StringBuilder bufer = new StringBuilder("Hola, como estas?");

        System.out.printf("bufer = %s\nlongitud = %d\ncapacidad = %d\n\n",
                bufer.toString(), bufer.length(), bufer.capacity());
        bufer.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d\n\n", bufer.capacity());
        bufer.setLength(10);
        System.out.printf("Nueva longitud = %d\nbufer = %s\n",
                bufer.length(), bufer.toString());
    }
}
