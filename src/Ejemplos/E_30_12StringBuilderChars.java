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
public class E_30_12StringBuilderChars {

    public static void main(String[] args) {
        StringBuilder bufer = new StringBuilder("Hola a todos");

        System.out.printf("bufer = %s\n", bufer.toString());
        System.out.printf("Caracter en 0: %s\nCaracter en 3: %s\n\n", bufer.charAt(0), bufer.charAt(3));

        char[] arregloChars = new char[bufer.length()];
        bufer.getChars(0, bufer.length(), arregloChars, 0);
        System.out.print("Los caracteres son: ");

        for (char character : arregloChars) {
            System.out.print(character);
        }

        bufer.setCharAt(0, 'H');
        bufer.setCharAt(7, 'T');
        System.out.printf("\n\nbufer = %s", bufer.toString());

        bufer.reverse();
        System.out.printf("\n\nbufer = %s\n", bufer.toString());
    }
}
