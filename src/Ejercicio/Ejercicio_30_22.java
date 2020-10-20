/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Ejercicio_30_22 {

    static Date fecha = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fehca y oprima Intro");
        String strfecha = scanner.nextLine();
        formatDate(strfecha);
    }
    public static String formatDate(String oldDate) {
        SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat formateador = new SimpleDateFormat("MM-yyyy-dd");
        
        try {
            fecha = parseador.parse(oldDate);
            System.out.println(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formateador.format(fecha);
    }
}
