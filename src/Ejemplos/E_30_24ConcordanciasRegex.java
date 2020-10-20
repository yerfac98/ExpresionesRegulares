/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gerardo Fac
 */
public class E_30_24ConcordanciasRegex {

    public static void main(String[] args) {
        // crea la expresión regular
        Pattern expresion = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        String cadena1 = "Jane nacio el 05-12-75\n"
                + "Dave nacio el 11-04-68\n"
                + "John nacio el 04-28-73\n"
                + "Joe nacio el 12-17-77";
        // compara la expresión regular con la cadena e imprime las concordancias
        Matcher matcher = expresion.matcher(cadena1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
