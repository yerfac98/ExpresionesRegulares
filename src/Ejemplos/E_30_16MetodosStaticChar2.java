/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class E_30_16MetodosStaticChar2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // obtiene la raíz
        System.out.println("Escriba una raiz:");
        int raiz = scanner.nextInt();
        // obtiene la selección del usuario
        System.out.printf("Seleccione una opcion:\n1 -- %s\n2 -- %s\n",
                "Convertir digito a caracter", "Convertir caracter a digito");
        int opcion = scanner.nextInt();
        // procesa la petición
        switch (opcion) {
            case 1: // convierte dígito a carácter
                System.out.println("Escriba un digito:");
                int digito = scanner.nextInt();
                System.out.printf("Convertir digito a caracter: %s\n",
                        Character.forDigit(digito, raiz));
                break;
            case 2: // convierte carácter a dígito
                System.out.println("Escriba un caracter:");
                char caracter = scanner.next().charAt(0);
                System.out.printf("Convertir caracter a digito: %s\n",
                        Character.digit(caracter, raiz));
                break;
        } // fin de switch
    }
}
