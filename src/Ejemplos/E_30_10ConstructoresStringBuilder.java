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
public class E_30_10ConstructoresStringBuilder {

    public static void main(String[] args) {
        StringBuilder bufer1 = new StringBuilder();
        StringBuilder bufer2 = new StringBuilder(10);
        StringBuilder bufer3 = new StringBuilder("hola");

        System.out.printf("bufer1 = \"%s\"\n", bufer1.toString());
        System.out.printf("bufer2 = \"%s\"\n", bufer2.toString());
        System.out.printf("bufer3 = \"%s\"\n", bufer3.toString());
    }
}
