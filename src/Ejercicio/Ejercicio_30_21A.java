/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Ejercicio_30_21A {

    static String texto;
    static int numeroDeVeces = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine().toLowerCase();

        } while (texto.isEmpty());

        char[] letras = new char[texto.length()];
        String[] sLetras = new String[texto.length()];

        letras = texto.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            sLetras[i] = String.valueOf(letras[i]);
        }
        for (int i = 0; i < sLetras.length; i++) {

            for (int j = 0; j < sLetras.length - 1; j++) {

                if (i != j) {
                    if (sLetras[i].equals(sLetras[j])) {
                        sLetras[i] = "";

                    }
                }
            }
        }

        int n = sLetras.length;

        System.out.println("");
        System.out.println("----caracter----|--- repeticiones---+");
        System.out.println("-----------------|------------------");
        for (int k = 0; k <= n - 1; k++) {

            if (sLetras[k] != "") {
                System.out.println("+-       " + sLetras[k] + "       -+-       " + numeroDeVeces + "       -+");
                numeroDeVeces = cuentaCaract(texto, sLetras[k]);
                //        System.out.println("El caracter " + strLetras[k] + " aparece " + numeroDeVeces + " veces");

            }
        }
        System.out.println("+---------------|----------------+");
    }

    public static int cuentaCaract(String cadena, String caracter) {
        int posicion, cont = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            cont++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return cont;
    }

}
