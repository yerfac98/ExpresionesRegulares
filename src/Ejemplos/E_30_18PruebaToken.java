/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo Fac
 */
public class E_30_18PruebaToken {

    public static void main(String[] args) {
        // obtiene el enunciado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un enunciado y oprima Intro");
        String enunciado = scanner.nextLine();
        // procesa el enunciado del usuario
        StringTokenizer tokens = new StringTokenizer(enunciado);
        System.out.printf("Numero de elementos: %d\nLos tokens son:\n",
                tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
