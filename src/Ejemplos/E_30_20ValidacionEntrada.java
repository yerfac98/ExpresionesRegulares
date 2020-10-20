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
public class E_30_20ValidacionEntrada {
    // valida el primer nombre
 public static boolean validarPrimerNombre( String primerNombre )
 {
 return primerNombre.matches( "[A-Z][a-zA-Z]*" );
 } // fin del método validarPrimerNombre

 // valida el apellido
 public static boolean validarApellidoPaterno( String apellidoPaterno )
 {
 return apellidoPaterno.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
 } // fin del método validarApellidoPaterno

 // valida la dirección
 public static boolean validarDireccion( String direccion )
 {
 return direccion.matches(
 "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
 } // fin del método validarDireccion

 // valida la ciudad
 public static boolean validarCiudad( String ciudad )
 {
 return ciudad.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
 } // fin del método validarCiudad
    // valida el estado
 public static boolean validarEstado( String estado )
 {
 return estado.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
 } // fin del método validarEstado

 // valida el código postal
 public static boolean validarCP( String cp )
 {
 return cp.matches( "\\d{5}" );
 } // fin del método validarCP

 // valida el teléfono
 public static boolean validarTelefono( String telefono )
 {
 return telefono.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
 } // fin del método validarTelefono
 } // fin de la clase ValidacionEntrada

