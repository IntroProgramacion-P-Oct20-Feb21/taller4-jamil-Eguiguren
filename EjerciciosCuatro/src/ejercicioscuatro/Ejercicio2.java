/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    public static void main(String[] args) {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
     // declaro las variables
     double hijo1;
     double hijo2;
     double hijo3;
     double suma;
     
  // pido datos por teclado - entradas
  
  System.out.println("Ingresar de gasto por hijo 1");
  hijo1 = entrada.nextDouble();
  
  System.out.println("Ingresar de gasto por hijo 2");
  hijo2 = entrada.nextDouble();
  
  System.out.println("Ingresar de gasto por hijo 3");
  hijo3 = entrada.nextDouble();
  
  // proceso
  suma = hijo1 +hijo2 +hijo3;
  
  // salida
  System.out.printf("Su valor a pagar por los tres hijos es:" + suma);
    } 
}
