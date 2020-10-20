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
public class E_30_17OtrosMetodosChar {

    public static void main(String args[]) {
        Character c1 = 'A';
        Character c2 = 'a';

        System.out.printf(
                "c1 = %s\nc2 = %s\n\n", c1.charValue(), c2.toString());

        if (c1.equals(c2)) {
            System.out.println("c1 y c2 son iguales\n");
        } else {
            System.out.println("c1 y c2 no son iguales\n");
        }
    } // fin de main
} // fin de la clase OtrosMetodosChar

