/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo Fac
 */
public class Ejercicio_30_21B {

    static String texto;
    static int numeroDeVeces = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine().toLowerCase();

        } while (texto.isEmpty());
        StringTokenizer tokens = new StringTokenizer(texto);
        int nDatos = tokens.countTokens();
        String[] palabras = new String[nDatos];
        int digitos[] = new int[nDatos];
        int contador = 0;

        while (tokens.hasMoreElements()) {
            palabras[contador] = tokens.nextToken();
            digitos[contador] = palabras[contador].length();
            contador++;
        }
        for (int i = 0; i < digitos.length; i++) {
            if (max < digitos[i]) {
                max = digitos[i];
            }
        }
        Arrays.sort(digitos);
        System.out.println("");
        System.out.println("----Longitud de palabra----|--- ocurrencias---+");
        System.out.println("-----------------|------------------");

        for (int a = 1; a <= max; a++) {
            int cantidad = 0;
            for (int i = 0; i < digitos.length; i++) {
                if (a == digitos[i]) {
                    cantidad++;
                }
            }

            System.out.println("+-           " + a + "          -+-        " + cantidad + "        -+");
        }
        System.out.println("+------------------------|-------------------+");
    }
}
