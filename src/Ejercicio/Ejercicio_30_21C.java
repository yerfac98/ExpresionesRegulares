/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo Fac
 */
public class Ejercicio_30_21C {

    static String texto;
    static int numeroDeVeces = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine().toLowerCase();

        } while (texto.isEmpty());
        // procesa el enunciado del usuario
        StringTokenizer tokens = new StringTokenizer(texto);
        int nDatos = tokens.countTokens();
        String[] palabras = new String[nDatos];
        int contador = 0;

        System.out.println("\n Salida=");
        while (tokens.hasMoreElements()) {
            palabras[contador] = tokens.nextToken();
            contador++;
        }

        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras.length - 1; j++) {
                if (i != j) {
                    if (palabras[i].equals(palabras[j])) {
                        palabras[i] = "";
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("----Longitud de palabra----|--- ocurrencias---+");
        System.out.println("-----------------|------------------");
        // mostramos unicamente los que tienen valor
        int n = palabras.length;
        for (int k = 0; k <= n - 1; k++) {
            if (palabras[k] != "") {

                numeroDeVeces = cuentaCaract(texto, palabras[k]);
                System.out.println("+-           " + palabras[k] + "                  " + numeroDeVeces + "        ");

            }
        }
        System.out.println("+------------------------|-------------------+");
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
