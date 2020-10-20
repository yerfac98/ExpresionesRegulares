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
public class E_30_2VariosString {

    public static void main(String args[]) {
        String s1 = "hola a todos";
        char arregloChar[] = new char[5];

        System.out.printf("s1: %s", s1);

// prueba el método length
        System.out.printf("\nLongitud de s1: %d", s1.length());
        // itera a través de los caracteres en s1 con charAt y muestra la cadena invertida
        System.out.print("\nLa cadena invertida es: ");

        for (int cuenta = s1.length() - 1; cuenta >= 0; cuenta--) {
            System.out.printf("%s ", s1.charAt(cuenta));
        }

        // copia los caracteres de la cadena a arregloChar
        s1.getChars(0, 4, arregloChar, 0);
        System.out.print("\nEl arreglo de caracteres es: ");

        for (char caracter : arregloChar) {
            System.out.print(caracter);
        }

        System.out.println();
    } // fin de main
} // fin de la clase VariosString



