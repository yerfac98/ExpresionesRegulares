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
public class E_30_21Validacion {

    public static void main(String[] args) {
        // obtiene la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer nombre:");
        String primerNombre = scanner.nextLine();
        System.out.println("Escriba el apellido paterno:");
        String apellidoPaterno = scanner.nextLine();
        System.out.println("Escriba la direccion:");
        String direccion = scanner.nextLine();
        System.out.println("Escriba la ciudad:");
        String ciudad = scanner.nextLine();
        System.out.println("Escriba el estado:");
        String estado = scanner.nextLine();
        System.out.println("Escriba el codigo postal:");
        String cp = scanner.nextLine();
        System.out.println("Escriba el telefono:");
        String telefono = scanner.nextLine();

        // valida la entrada del usuario y muestra mensaje de error
        System.out.println("\nValidar resultado:");

        if (!E_30_20ValidacionEntrada.validarPrimerNombre(primerNombre)) {
            System.out.println("Primer nombre invalido");
        } else if (!E_30_20ValidacionEntrada.validarApellidoPaterno(apellidoPaterno)) {
            System.out.println("Apellido paterno invalido");
        } else if (!E_30_20ValidacionEntrada.validarDireccion(direccion)) {
            System.out.println("Direccion invalida");
        } else if (!E_30_20ValidacionEntrada.validarCiudad(ciudad)) {
            System.out.println("Ciudad invalida");
        } else if (!E_30_20ValidacionEntrada.validarEstado(estado)) {
            System.out.println("Estado invalido");
        } else if (!E_30_20ValidacionEntrada.validarCP(cp)) {
            System.out.println("Codigo postal invalido");
        } else if (!E_30_20ValidacionEntrada.validarTelefono(telefono)) {
            System.out.println("Numero telefonico invalido");
        } else {
            System.out.println("La entrada es valida. Gracias.");
        }
    }
}
