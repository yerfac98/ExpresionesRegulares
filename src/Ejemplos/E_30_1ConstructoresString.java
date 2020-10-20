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
public class E_30_1ConstructoresString {

    public static void main(String[] args) {
        char[] arregloChar = {'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'n', 'i', 'o', 's'};
        String s = new String("hola");

        // usa los constructores de String
        String s1 = "";
        String s2 = new String(s);
        String s3 = new String(arregloChar);
        String s4 = new String(arregloChar, 7, 5);

        // mostrar las cadenas
        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4);
    }
}
