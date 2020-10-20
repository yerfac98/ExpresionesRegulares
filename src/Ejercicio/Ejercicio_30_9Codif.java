/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo Fac
 */
public class Ejercicio_30_9Codif {

    static String cadena;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0, totalLetras;
        String[] palabras;
        String[] traduc;
        System.out.println("Escriba su enunciado: ");
        String enunciado = scanner.nextLine();

        StringTokenizer tokens = new StringTokenizer(enunciado);
        int datos = tokens.countTokens();
        palabras = new String[datos];
        traduc = new String[datos];

        while (tokens.hasMoreElements()) {
            palabras[contador] = tokens.nextToken();
            contador++;
        }
        char pal[];
        for (int i = 0; i < datos; i++) {
            cadena = palabras[i];
            pal = cadena.toCharArray();
            totalLetras = cadena.length() - 1;

            String s4 = new String(pal, 1, totalLetras);
            String s5 = s4 + pal[0] + "ae";
            traduc[i] = s5;
        }

        System.out.println();
        System.out.println("Traduccion al latin cerdo: ");
        for (int j = 0; j < datos; j++) {
            System.out.print(traduc[j] + " ");
        }
        System.out.println();
    }
}
