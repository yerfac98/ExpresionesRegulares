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
public class E_30_3CompararCadenas {

    public static void main(String[] args) {

        String s1 = new String("hola"); // s1 es una copia de "hola"
        String s2 = "adios";
        String s3 = "Feliz cumpleanios";
        String s4 = "feliz cumpleanios";

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4);
        // Probar la igualdad
        if (s1.equals("hola")) { //true
            System.out.println("s1 es igual a \"hola\"");
        } else {
            System.out.println("s1 no es igual a \"hola\"");
        }
        // Probar la igualdad con ==
        if (s1 == "hola") // false; no son el mismo objeto
        {
            System.out.println("s1 es el mismo objeto que \"hola\"");
        } else {
            System.out.println("s1 no es el mismo objeto que \"hola\"");
        }
        // Probar la igualdad (ignora el uso de mayúsculas/minúsculas)
        if (s3.equalsIgnoreCase(s4)) {
            System.out.printf("s3 es igual a s4 si se ignora el uso de mayusculas/minusuclas \n" + s3, s4);
        } else {
            System.out.println("s3 no es igual a s4");
        }
        // prueba con compareTo
        System.out.printf(
                "\ns1.compareTo( s2 ) es %d", s1.compareTo(s2));
        System.out.printf(
                "\ns2.compareTo( s1 ) es %d", s2.compareTo(s1));
        System.out.printf(
                "\ns1.compareTo( s1 ) es %d", s1.compareTo(s1));
        System.out.printf(
                "\ns3.compareTo( s4 ) es %d", s3.compareTo(s4));
        System.out.printf(
                "\ns4.compareTo( s3 ) es %d\n\n", s4.compareTo(s3));
        // Probar con regionMatches (sensible a mayúsculas/minúsculas)
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("Los primeros 5 caracteres de s3 y s4 coinciden");
        } else {
            System.out.println(
                    "Los primeros 5 caracteres de s3 y s4 no coinciden");
        }
        // Probar con regionMatches (ignora el uso de mayúsculas/minúsculas)
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("Los primeros 5 caracteres de s3 y s4 coinciden");
        } else {
            System.out.println(
                    "Los primeros 5 caracteres de s3 y s4 no coinciden");
        }
    }
}
