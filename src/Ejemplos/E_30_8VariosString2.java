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
public class E_30_8VariosString2 {

    public static void main(String[] args) {
        String s1 = new String("hola");
        String s2 = new String("ADIOS");
        String s3 = new String(" espacios ");

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\n\n", s1, s2, s3);
        // Probar del método replace
        System.out.printf(
                "Remplazar 'l' con 'L' en s1: %s\n\n", s1.replace('l', 'L'));

        // Probar de toLowerCase y toUpperCase
        System.out.printf("s1.toUpperCase() = %s\n", s1.toUpperCase());

        System.out.printf("s2.toLowerCase() = %s\n\n", s2.toLowerCase());
        // Probar del método trim
        System.out.printf("s3 despues de trim = \"%s\"\n\n", s3.trim());

        // Probar del método toCharArray
        char[] arregloChar = s1.toCharArray();
        System.out.print("s1 como arreglo de caracteres = ");

        for (char caracter : arregloChar) {
            System.out.print(caracter);
        }

        System.out.println();
    }
}
