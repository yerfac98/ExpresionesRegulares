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
public class E_30_6SubString {

    public static void main(String[] args) {
        String letras = "ggnjknjkskmahjjjjhjheeñsdmdsyhvvbdreqwasdcscx";
        // prueba los métodos substring
        System.out.printf("La subcadena desde el índice 20 hasta el final es \"%s\"\n",
                letras.substring(20));
        System.out.printf("%s \"%s\"\n",
                "La subcadena desde el índice 3 hasta, pero sin incluir al 6 es",
                letras.substring(3, 6));
    }
}
